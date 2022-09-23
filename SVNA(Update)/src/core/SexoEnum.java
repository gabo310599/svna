/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author gabri
 */
public class SexoEnum {
    
    //Atributos
    private char sexoEnum;
    
    //Constructor
    public SexoEnum() {
    }
    
    //Getters
    public char getSexoEnum() {
        return sexoEnum;
    }
    
    //Enumerados
    
    public void masculino(){
        sexoEnum = 'M';
    }
    
    public void femenino(){
        sexoEnum = 'F';
    }    
    
    public void otro(){
        sexoEnum = 'O';
    }
    
    //Validar
    
    public boolean isMasculino(){
        return sexoEnum == 'M';
    }
    
    public boolean isFemenino(){
        return sexoEnum == 'F';
    }
    
    public boolean isOtro(){
        return sexoEnum == 'O';
    }
            
    
}
