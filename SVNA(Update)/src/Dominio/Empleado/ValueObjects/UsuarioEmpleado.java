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
public class UsuarioEmpleado implements IValueObject {
    
    //Atributos
    private String usuario;
    private String password;
    
    //Constructor
    public UsuarioEmpleado(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }
    
    //Getters and setters

    public String getUsuarioValue() {
        return usuario;
    }

    public String getPasswordValue() {
        return password;
    }

    
    //Create value object
    public static UsuarioEmpleado create(String usuario, String password){
        return new UsuarioEmpleado(usuario, password);
    } 

    @Override
    public IValueObject getValueObject() {
        return this;
    }
    
}
