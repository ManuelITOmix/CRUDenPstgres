/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaislas.practica.islas.controller;

import com.practicaislas.practica.islas.entity.Empleados;
import com.practicaislas.practica.islas.service.EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author parti
 */
@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoservice;
    @GetMapping
    public List<Empleados>listar(){
    return empleadoservice.listar();
    }
    @PostMapping
    public Empleados insertar(@RequestBody Empleados emp){
    return empleadoservice.insertar(emp);
    }
    @PutMapping
    public Empleados actualizar(@RequestBody Empleados emp){
    return empleadoservice.actualizar(emp);
    }
    @DeleteMapping
    public void eliminar(@RequestBody Empleados emp){
    empleadoservice.eliminar(emp);
    }
}
