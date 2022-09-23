/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio.Empleado.ValueObjects;

import core.EstadoEnum;
import core.IValueObject;

/**
 *
 * @author gabri
 */
public class EstadoEmpleado implements IValueObject{

    //Atributos
    private EstadoEnum estado;

    //Constructor
    public EstadoEmpleado(EstadoEnum estado) {
        this.estado = estado;
    }
    
    //Getters
    public EstadoEnum getValue() {
        return estado;
    }
    
    //Create value object
    public static EstadoEmpleado create(EstadoEnum estado){
        return new EstadoEmpleado(estado);
    }
    
    @Override
    public IValueObject getValueObject() {
        return this;
    }
    
}
