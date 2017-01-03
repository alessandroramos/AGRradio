/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrsystem.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 



/**
 *
 * @author AGR System
 */
@ManagedBean
@SessionScoped
public class DirecionaBean implements Serializable {

    public String Suporte() {
//        URI link;
//        try {
//            link = new URI("http://agrsystem.com.br");
//            Desktop.getDesktop().browse(link);
//        } catch (URISyntaxException ex) {
//            Logger.getLogger(DirecionaBean.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(DirecionaBean.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return "/index.html";
    }

    public String Pacs() {
//        URI link;
//        try {
//            link = new URI("http://agrsystem.com.br");
//            Desktop.getDesktop().browse(link);
//        } catch (URISyntaxException ex) {
//            Logger.getLogger(DirecionaBean.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(DirecionaBean.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return "/index.html";
    }
    public String Clinica() {
        return "/index.html";
    }

    public String Medicos() {
        return "/index.html";
    }

}
