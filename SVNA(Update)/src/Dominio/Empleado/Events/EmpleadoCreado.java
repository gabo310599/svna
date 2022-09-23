/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio.Empleado.Events;

import Dominio.Empleado.ValueObjects.CargoEmpleado;
import Dominio.Empleado.ValueObjects.CorreoEmpleado;
import Dominio.Empleado.ValueObjects.EstadoEmpleado;
import Dominio.Empleado.ValueObjects.FechaNacimientoEmpleado;
import Dominio.Empleado.ValueObjects.IdEmpleado;
import Dominio.Empleado.ValueObjects.NombresEmpleado;
import Dominio.Empleado.ValueObjects.SexoEmpleado;
import Dominio.Empleado.ValueObjects.UsuarioEmpleado;
import core.IEvent;

/**
 *
 * @author gabri
 */
public class EmpleadoCreado implements IEvent{

    //Atributos
    private IdEmpleado id;
    private UsuarioEmpleado usuario;
    private FechaNacimientoEmpleado fechaNacimiento;
    private EstadoEmpleado estado;
    private NombresEmpleado nombres;
    private CargoEmpleado cargo;
    private SexoEmpleado sexo;
    private CorreoEmpleado correo;
    
    //Constructor
    public EmpleadoCreado() {
    }
        
    public EmpleadoCreado(IdEmpleado id, UsuarioEmpleado usuario, FechaNacimientoEmpleado fechaNacimiento, EstadoEmpleado estado, NombresEmpleado nombres, CargoEmpleado cargo, SexoEmpleado sexo, CorreoEmpleado correo) {
        this.id = id;
        this.usuario = usuario;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.nombres = nombres;
        this.cargo = cargo;
        this.sexo = sexo;
        this.correo = correo;
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
    
    
    //Create event
    public static EmpleadoCreado create(IdEmpleado id, UsuarioEmpleado usuario, FechaNacimientoEmpleado fechaNacimiento, EstadoEmpleado estado, NombresEmpleado nombres, CargoEmpleado cargo, SexoEmpleado sexo, CorreoEmpleado correo){
        return new EmpleadoCreado(id, usuario, fechaNacimiento, estado, nombres, cargo, sexo, correo);
    }
    
    @Override
    public String getEventName() {
        return "EmpleadoCreado";
    }

    @Override
    public IEvent getEvent() {
        return this;
    }
    
}
