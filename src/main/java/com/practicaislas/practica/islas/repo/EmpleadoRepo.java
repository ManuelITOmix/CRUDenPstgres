/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaislas.practica.islas.repo;

//import com.practicaislas.entity.Empleados;
import com.practicaislas.practica.islas.entity.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author parti
 */
@Repository
public interface EmpleadoRepo extends JpaRepository<Empleados, Integer>{
    
}
