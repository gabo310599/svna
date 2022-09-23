/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio.Empleado;

import Dominio.Empleado.Events.EmpleadoCreado;
import Dominio.Empleado.ValueObjects.CargoEmpleado;
import Dominio.Empleado.ValueObjects.CorreoEmpleado;
import Dominio.Empleado.ValueObjects.EstadoEmpleado;
import Dominio.Empleado.ValueObjects.FechaNacimientoEmpleado;
import Dominio.Empleado.ValueObjects.IdEmpleado;
import Dominio.Empleado.ValueObjects.NombresEmpleado;
import Dominio.Empleado.ValueObjects.SexoEmpleado;
import Dominio.Empleado.ValueObjects.UsuarioEmpleado;
import core.IAggregateRoot;
import core.IEvent;
import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Empleado implements IAggregateRoot{

    //Atributos
    private IdEmpleado id;
    private UsuarioEmpleado usuario;
    private FechaNacimientoEmpleado fechaNacimiento;
    private EstadoEmpleado estado;
    private NombresEmpleado nombres;
    private CargoEmpleado cargo;
    private SexoEmpleado sexo;
    private CorreoEmpleado correo;
    private IEvent evento;
    
    //Constructor
    public Empleado(IdEmpleado id, UsuarioEmpleado usuario, FechaNacimientoEmpleado fechaNacimiento, EstadoEmpleado estado, NombresEmpleado nombres, CargoEmpleado cargo, SexoEmpleado sexo, CorreoEmpleado correo) {
        evento = EmpleadoCreado.create(id,usuario,fechaNacimiento,estado,nombres,cargo,sexo,correo);
        eventHandler();
    }
    

    //Getters

    public IdEmpleado getId() {
        return id;
    }

    public UsuarioEmpleado getUsuario() {
        return usuario;
    }

    public FechaNacimientoEmpleado getFechaNacimiento() {
        return fechaNacimiento;
    }

    public EstadoEmpleado getEstado() {
        return estado;
    }

    public NombresEmpleado getNombres() {
        return nombres;
    }

    public CargoEmpleado getCargo() {
        return cargo;
    }

    public SexoEmpleado getSexo() {
        return sexo;
    }

    public CorreoEmpleado getCorreo() {
        return correo;
    }
    
    //Metodos
    
    @Override
    public void eventHandler() {
        
        switch(evento.getEventName()){
        
            case "EmpleadoCreado":{
                
                EmpleadoCreado eventoAuxiliar = (EmpleadoCreado) evento;
                this.id = eventoAuxiliar.getId();
                this.usuario = eventoAuxiliar.getUsuario();
                this.fechaNacimiento = eventoAuxiliar.getFechaNacimiento();
                this.estado = eventoAuxiliar.getEstado();
                this.nombres = eventoAuxiliar.getNombres();
                this.cargo = eventoAuxiliar.getCargo();
                this.sexo = eventoAuxiliar.getSexo();
                this.correo = eventoAuxiliar.getCorreo();
                
                break;
            }
            
            default:{
                System.out.println("Evento no registrado");
                break;
            }
            
        }
    }

    @Override
    public IEvent pullEvent() {
        return evento;
    }

    public static Empleado create(IdEmpleado id, UsuarioEmpleado usuario, FechaNacimientoEmpleado fechaNacimiento, EstadoEmpleado estado, NombresEmpleado nombres, CargoEmpleado cargo, SexoEmpleado sexo, CorreoEmpleado correo){
        return new Empleado(id,usuario,fechaNacimiento,estado,nombres,cargo,sexo,correo);
    } 
    
    
}
