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
@ManagedBean(name = "direcionabean")
@SessionScoped
public class DirecionaBean implements Serializable 
{
    private static final long sserialVersionUID = 1L;
    
    public DirecionaBean(){
        
    }

    public String Suporte() {
        System.out.println("Suporte");
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
        System.out.println("Pacs");        
//        URI link;
//        try {
//            link = new URI("http://agrsystem.com.br");
//            Desktop.getDesktop().browse(link);
//        } catch (URISyntaxException ex) {
//            Logger.getLogger(DirecionaBean.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(DirecionaBean.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return "/public/loginClinica.html";
    }
    public String Clinica() {
        System.out.println("Clinica");
        return "/public/loginMedico.html";
    }

    public String Medicos() {
        System.out.println("Medico");
        return "/index.html";
    }

}
