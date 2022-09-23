/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio.Empleado.ValueObjects;

import core.IValueObject;

/**
 *
 * @author gabri
 */
public class FechaNacimientoEmpleado implements IValueObject {

    //Atributos
    private String fechaNacimiento;
    
    //Constructor
    public FechaNacimientoEmpleado(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //Getters 
    public String getValue() {
        return fechaNacimiento;
    }
    
    //Create value object
    public static FechaNacimientoEmpleado create(String fechaNacimiento){
        return new FechaNacimientoEmpleado(fechaNacimiento);
    }
    
    @Override
    public IValueObject getValueObject() {
        return this;
    }
    
}
