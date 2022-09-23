/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio.Empleado.ValueObjects;

import core.IValueObject;
import core.SexoEnum;

/**
 *
 * @author gabri
 */
public class SexoEmpleado implements IValueObject{

    //Atributos
    private SexoEnum sexo;
    
    //Constructor
    public SexoEmpleado(SexoEnum sexo) {
        this.sexo = sexo;
    }
    
    //Getters

    public SexoEnum getValue() {
        return sexo;
    }
    
    //Create value object
    public static SexoEmpleado create(SexoEnum sexo){
        return new SexoEmpleado(sexo);
    }
    
    @Override
    public IValueObject getValueObject() {
        return this;
    }
    
}
