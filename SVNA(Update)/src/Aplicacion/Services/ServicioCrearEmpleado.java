/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicacion.Services;

import Aplicacion.Repositorys.EmpleadoRepository;
import Dominio.Empleado.Empleado;
import Dominio.Empleado.ValueObjects.CargoEmpleado;
import Dominio.Empleado.ValueObjects.CorreoEmpleado;
import Dominio.Empleado.ValueObjects.EstadoEmpleado;
import Dominio.Empleado.ValueObjects.FechaNacimientoEmpleado;
import Dominio.Empleado.ValueObjects.IdEmpleado;
import Dominio.Empleado.ValueObjects.NombresEmpleado;
import Dominio.Empleado.ValueObjects.SexoEmpleado;
import Dominio.Empleado.ValueObjects.UsuarioEmpleado;
import core.CargoEnum;
import core.EstadoEnum;
import core.IServiceApplication;
import core.SexoEnum;

/**
 *
 * @author gabri
 */

public class ServicioCrearEmpleado implements IServiceApplication<ServicioCrearEmpleadoDTO>{

    //Atributos
    private EmpleadoRepository repository;
    
    //Constructor
    public ServicioCrearEmpleado() {
    }
    
 
    //Metodos
    @Override
    public String execute(ServicioCrearEmpleadoDTO dto) {
        
        //Verificamos el estado
        CargoEnum cargo = new CargoEnum();
        switch(dto.getCargo()){
            case 'j':
                cargo.jefe();
                break;
            case 'e':
                cargo.enfermera();
                break;
            default:
                break;
        }
        
        //Verificamos el sexo
        SexoEnum sexo = new SexoEnum();
        switch (dto.getSexo()) {
            case 'm':
                sexo.masculino();
                break;
            case 'f':
                sexo.femenino();
                break;
            case 'o':
                sexo.otro();
                break;
            default:
                break;
        }
        
        //Verificamos el estado
        EstadoEnum estado = new EstadoEnum();
        switch(dto.getEstado()){
            case 'a':
                estado.activar();
                break;
            case 's':
                estado.suspender();
                break;
            default:
                break;
        }
        
        //Creamos al empleado
        Empleado empleado = Empleado.create(
                IdEmpleado.create(dto.getId()),
                UsuarioEmpleado.create(dto.getUsuario(),dto.getPassword()),
                FechaNacimientoEmpleado.create(dto.getFechaNacimiento()),
                EstadoEmpleado.create(estado),
                NombresEmpleado.create(dto.getNombres(),dto.getApellidos()),
                CargoEmpleado.create(cargo),
                SexoEmpleado.create(sexo),
                CorreoEmpleado.create(dto.getCorreo())
        );
        
        //Hacemos persistente al empleado
        this.repository.saveAggregate(empleado);
        
        //Publicamos el evento (Revisar este apartado)
        
        return "Servicio ejecutado con exito";
    }

    
    
}
