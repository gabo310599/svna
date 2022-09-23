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
public class NombresEmpleado implements IValueObject{

    //Atributos
    private String nombres;
    private String apellidos;
    
    //Constructor
    public NombresEmpleado(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
    //Getters
    
    public String getNombresValue() {
        return nombres;
    }

    public String getApellidosValue() {
        return apellidos;
    }
    
    //Create value objects
    public static NombresEmpleado create(String nombres,String apellidos){
        return new NombresEmpleado(nombres,apellidos);
    }
    
    @Override
    public IValueObject getValueObject() {
        return this;
    }
    
}
