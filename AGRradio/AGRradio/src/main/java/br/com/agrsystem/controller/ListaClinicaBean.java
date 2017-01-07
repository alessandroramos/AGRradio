/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.agrsystem.controller;

import br.com.agrsystem.model.dao.HibernateDAO;
import br.com.agrsystem.model.dao.InterfaceDAO;
import br.com.agrsystem.model.entities.StatusLaudo;
import br.com.agrsystem.util.FacesContextUtil;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "listaClinicaBean")
@RequestScoped
public class ListaClinicaBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String erro = null;
    
    private String listaStatusLaudo; 
    private Map<String,String> listaStatusLaudos;
  
    private StatusLaudo statusLaudo = new StatusLaudo();
    private List<StatusLaudo> statusLaudos;
    
    
    public ListaClinicaBean() {    }
    
    private InterfaceDAO<StatusLaudo> statusLaudoDAO() {
        InterfaceDAO<StatusLaudo> statusLaudoDAO = new HibernateDAO<StatusLaudo>(StatusLaudo.class, FacesContextUtil.getRequestSession());
        return statusLaudoDAO;
    }
    
    
    
    
    

    public String getErro() {
        return erro;
    }


    public void setErro(String erro) {
        this.erro = erro;
    }
    
    
@PostConstruct
    public void init() {
        setListaStatusLaudos(new HashMap<String, String>());
        getListaStatusLaudos().put("USAggttt", "USA");
        getListaStatusLaudos().put("Germany", "Germany");
        getListaStatusLaudos().put("Brazil ggg", "Brazil");
         
    }  

    public void displayLocation() {
        FacesMessage msg;
        
            msg = new FacesMessage("Selected of " + listaStatusLaudo);
       
             
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }
    
    public void onListaStatusLaudoChange() {
        System.out.print("Seleciona Lista. AGR");
    }

//################################GET SET #############################//
    public String getListaStatusLaudo() {
        return listaStatusLaudo;
    }

    public void setListaStatusLaudo(String listaStatusLaudo) {
        this.listaStatusLaudo = listaStatusLaudo;
    }

    public Map<String, String> getListaStatusLaudos() {
        return listaStatusLaudos;
    }

    public void setListaStatusLaudos(Map<String, String> listaStatusLaudos) {
        this.listaStatusLaudos = listaStatusLaudos;
    }

    
    
//##########################################Laudos    
    public StatusLaudo getStatusLaudo() {
        return statusLaudo;
    }

    public void setStatusLaudo(StatusLaudo statusLaudo) {
        this.statusLaudo = statusLaudo;
    }

    public List<StatusLaudo> getStatusLaudos() {
        statusLaudos = statusLaudoDAO().getEntities();
        return statusLaudos;
    }

    public void setStatusLaudos(List<StatusLaudo> statusLaudos) {
        this.statusLaudos = statusLaudos;
    }
    
    
    
    
        
}