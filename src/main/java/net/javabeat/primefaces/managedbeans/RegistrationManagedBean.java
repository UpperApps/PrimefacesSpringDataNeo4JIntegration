/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.javabeat.primefaces.managedbeans;

import com.google.common.collect.Lists;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import net.javabeat.springdata.beans.RegistrationService;
import net.javabeat.springdata.data.Employee;

/**
 *
 * @author Rodrigo
 */
@ManagedBean
@SessionScoped
public class RegistrationManagedBean implements Serializable{

    private Employee employee = new Employee();

    private List<Employee> employees = new ArrayList<Employee>();

//    Objeto responsável por criar as instâncias dos repositórios para acesso aos dados.
    @ManagedProperty(value = "#{registrationService}")
    private RegistrationService service;
    
//    Construtor
    public RegistrationManagedBean() {
    }

//    Getters and Setters

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Employee> getEmployees() {
        this.employees = Lists.newArrayList(this.service.getRepo().findAll());
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public RegistrationService getService() {
        return service;
    }

    public void setService(RegistrationService service) {
        this.service = service;
    }
    
        
//    Método que será chamado pela View para persistir o objeto.
    public String register(){
        this.service.getRepo().save(this.employee);
        this.employee = new Employee();
        return "";
    }
}
