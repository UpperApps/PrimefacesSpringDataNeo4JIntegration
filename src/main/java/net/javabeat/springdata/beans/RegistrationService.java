/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.javabeat.springdata.beans;

import net.javabeat.springdata.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Rodrigo
 * Esta classe é responsável por criar instâncias dos repositórios. Ela é escaneada pelo Spring Container 
 * quando o arquivo de configuração (applicationContext.xml) é inicializado.
 */
@Component
public class RegistrationService {
    @Autowired
    private EmployeeRepository repo;

    public EmployeeRepository getRepo() {
        return repo;
    }

    public void setRepo(EmployeeRepository repo) {
        this.repo = repo;
    }
        
}
