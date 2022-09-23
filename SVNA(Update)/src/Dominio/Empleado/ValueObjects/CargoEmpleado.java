/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio.Empleado.ValueObjects;

import core.CargoEnum;
import core.IValueObject;

/**
 *
 * @author gabri
 */
public class CargoEmpleado implements IValueObject{
 
    //Atributos
    private CargoEnum cargo;
    
    //Constructor
    public CargoEmpleado(CargoEnum cargo) {
        this.cargo = cargo;
    }
    
    //Getters
    
    public CargoEnum getValue() {
        return cargo;
    }
    
    //Create value object
    public static CargoEmpleado create(CargoEnum cargo){
        return new CargoEmpleado(cargo);
    }

    @Override
    public IValueObject getValueObject() {
        return this;
    }
    
    
}
