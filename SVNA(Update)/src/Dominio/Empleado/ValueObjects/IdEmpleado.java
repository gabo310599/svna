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
public class IdEmpleado implements IValueObject {

    //Atributos
    private int id;

    //Constuctor
    public IdEmpleado(int id) {
        this.id = id;
    }

    //Getters
    public int getValue() {
        return id;
    }

    //Create value object
    public static IdEmpleado create(int id){
        return new IdEmpleado(id);
    }
    
    @Override
    public IValueObject getValueObject() {
        return this;
    }

}
