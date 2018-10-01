/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author CHRISTIAN
 */
public class examestudiante implements Serializable{
    private String nombreestudiante;
    private String codigo;
    private int preguntasbuenas;
    private double estado;

    public examestudiante() {
    }

    public examestudiante(String nombreestudiante, String codigo, int preguntasbuenas, double estado) {
        this.nombreestudiante = nombreestudiante;
        this.codigo = codigo;
        this.preguntasbuenas = preguntasbuenas;
        this.estado = estado;
    }

    
    
    /**
     * @return the nombreestudiante
     */
    public String getNombreestudiante() {
        return nombreestudiante;
    }

    /**
     * @param nombreestudiante the nombreestudiante to set
     */
    public void setNombreestudiante(String nombreestudiante) {
        this.nombreestudiante = nombreestudiante;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the preguntasbuenas
     */
    public int getPreguntasbuenas() {
        return preguntasbuenas;
    }

    /**
     * @param preguntasbuenas the preguntasbuenas to set
     */
    public void setPreguntasbuenas(int preguntasbuenas) {
        this.preguntasbuenas = preguntasbuenas;
    }

    /**
     * @return the estado
     */
    public double getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(double estado) {
        this.estado = estado;
    }
    
    

    
}
