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
public class examen implements Serializable {
    private String codigo;
    private int numeropreguntas;

    public examen() {
    }

    public examen(String codigo, int numeropreguntas) {
        this.codigo = codigo;
        this.numeropreguntas = numeropreguntas;
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
     * @return the numeropreguntas
     */
    public int getNumeropreguntas() {
        return numeropreguntas;
    }

    /**
     * @param numeropreguntas the numeropreguntas to set
     */
    public void setNumeropreguntas(int numeropreguntas) {
        this.numeropreguntas = numeropreguntas;
    }

   
    
}
