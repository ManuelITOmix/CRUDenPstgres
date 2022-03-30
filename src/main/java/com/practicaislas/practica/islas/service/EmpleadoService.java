/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaislas.practica.islas.service;

import com.practicaislas.practica.islas.entity.Empleados;
import com.practicaislas.practica.islas.repo.EmpleadoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author parti
 */
@Service
public class EmpleadoService {
    
    @Autowired
    private EmpleadoRepo empleadorepo;
    
    public Empleados insertar(Empleados emp){
    return empleadorepo.save(emp);
    }
    public Empleados actualizar(Empleados emp){
    return empleadorepo.save(emp);
    }
    public List<Empleados>listar(){
    return empleadorepo.findAll();
    }
    public void eliminar(Empleados emp){
    empleadorepo.delete(emp);
    }
    
}
