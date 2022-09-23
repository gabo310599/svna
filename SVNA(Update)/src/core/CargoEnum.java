/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author gabri
 */
public class CargoEnum {
    
    //Atributos
    private String cargoEnum;
    
    //Constructor
    public CargoEnum() {
    }
    
    //Getters
    public String getCargoEnum() {
        return cargoEnum;
    }
    
    //Enumerados
    
    public void jefe(){
        this.cargoEnum = "jefe/a";
    }
    
    public void enfermera(){
        this.cargoEnum = "enfermera/o";
    }
    
    //Verificar
    
    public boolean isJefe(){
        return cargoEnum.equals("jefe/a");
    }
    
    public boolean isEnfermera(){
        return cargoEnum.equals("enfermera/o");
    }
    
}
