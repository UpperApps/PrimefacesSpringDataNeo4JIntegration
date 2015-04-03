/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.javabeat.springdata.repo;

import net.javabeat.springdata.data.Employee;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rodrigo
 * 
 */
@Repository
public interface EmployeeRepository extends GraphRepository<Employee>{
    
}
