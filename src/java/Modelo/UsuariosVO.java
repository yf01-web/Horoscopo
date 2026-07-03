/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Yeison
 */
public class UsuariosVO {
    
    /*
    clase que contiene los Getters y Setters para los datos de los usuarios registrados, 
    actua como un objeto de trasferencia (Value Object VO)
    permite la comunicación entre el DAO y los Servlets
    */
    private String usuario, contrasena;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    
}
