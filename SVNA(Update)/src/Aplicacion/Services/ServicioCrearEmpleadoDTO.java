/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Aplicacion.Services;

/**
 *
 * @author gabri
 */
public class ServicioCrearEmpleadoDTO {
    
    //Atributos
    private int id;
    private String usuario;
    private String password;
    private String fechaNacimiento;
    private char estado;
    private String nombres;
    private String apellidos;
    private char cargo;
    private char sexo;
    private String correo;
    
    //Constructor
    public ServicioCrearEmpleadoDTO(int id, String usuario, String password, String fechaNacimiento, char estado, String nombres, String apellidos, char cargo, char sexo, String correo) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.sexo = sexo;
        this.correo = correo;
    }
    
    //Getters 

    public int getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public char getEstado() {
        return estado;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public char getCargo() {
        return cargo;
    }

    public char getSexo() {
        return sexo;
    }

    public String getCorreo() {
        return correo;
    }
    
    
}
