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
public class CorreoEmpleado implements IValueObject{

    //Atributos
    private String correo;
    
    //Constructor
    public CorreoEmpleado(String correo) {
        this.correo = correo;
    }
    
    //Getters
    
    public String getValue() {
        return correo;
    }
    
    //Create value object
    public static CorreoEmpleado create(String correo){
        return new CorreoEmpleado(correo);
    }
    
    //Validar sintaxis correo
    public boolean validarSintaxis(){
        if(correo.contains("@") && correo.contains("."))
            return true;
        else
            return false;
    }
    
    @Override
    public IValueObject getValueObject() {
        return this;
    }
    
}
