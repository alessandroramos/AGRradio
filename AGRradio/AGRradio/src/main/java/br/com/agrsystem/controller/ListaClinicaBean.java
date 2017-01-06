/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.agrsystem.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "listaClinicaBean")
@RequestScoped
public class ListaClinicaBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String erro = null;
    
    public ListaClinicaBean() {    }

    public String confereSenhaClinica() {
        System.out.println("ConfereSenhaClinica");
        setErro(null);
        return "/clinicas/listaClinica.html";
    }


    public String getErro() {
        return erro;
    }


    public void setErro(String erro) {
        this.erro = erro;
    }
    
        
}