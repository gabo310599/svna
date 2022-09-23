/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author gabri
 */
public class EstadoEnum {
    
    //Atributos
    private String estadoEnum;
    
    //Constructor
    public EstadoEnum() {
    }
    
    //Metodo get
    public String getEstadoEnum() {
        return estadoEnum;
    }
    
    //Enumerados
    
    public void activar(){
        this.estadoEnum = "activo";
    }
    
    public void suspender(){
        this.estadoEnum = "suspendido";
    }
    
    //Verificar
    
    public boolean isActivo(){
        return estadoEnum.equals("activo");
    }
    
    public boolean isSuspendido(){
        return estadoEnum.equals("suspendido");
    }
}
