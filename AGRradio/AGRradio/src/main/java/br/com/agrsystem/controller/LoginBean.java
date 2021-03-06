/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.agrsystem.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "loginBean")
@RequestScoped
public class LoginBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String erro = null;
    
    public LoginBean() {    }

    public String confereSenhaClinica() {
        System.out.println("ConfereSenhaClinica");
        setErro(null);
        return "/clinicas/listaClinica.html";
    }

    public String confereSenhaMedico() {
        System.out.println("ConfereSenhaMedico");
        setErro(null);
        return "/medicos/listaMedico.html";
    }


    public String getErro() {
        return erro;
    }


    public void setErro(String erro) {
        this.erro = erro;
    }
    
        
}