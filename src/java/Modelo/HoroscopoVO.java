/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Yeison
 */
public class HoroscopoVO {
    
    /*
    clase que contiene los Getters y Setters para los pronósticos diarios, mensuales y anuales,
    actua como un objeto de trasferencia (Value Object VO)
    permite la comunicación entre el DAO y los Servlets
    */
    private String mensajeDiario, mensajeMensual, mensajeAnual;

    public String getMensajeMensual() {
        return mensajeMensual;
    }

    public void setMensajeMensual(String mensajeMensual) {
        this.mensajeMensual = mensajeMensual;
    }

    public String getMensajeAnual() {
        return mensajeAnual;
    }

    public void setMensajeAnual(String mensajeAnual) {
        this.mensajeAnual = mensajeAnual;
    }

    public String getMensajeDiario() {
        return mensajeDiario;
    }

    public void setMensajeDiario(String mensajeDiario) {
        this.mensajeDiario = mensajeDiario;
    }
    
    
}
