/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.agrsystem.controller;

import br.com.agrsystem.model.dao.HibernateDAO;
import br.com.agrsystem.model.dao.InterfaceDAO;
import br.com.agrsystem.model.entities.Patient;
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
    private int statusCodigo;

//###################################Entidades##################################
    private StatusLaudo statusLaudo = new StatusLaudo();
    private List<StatusLaudo> statusLaudos;
    private Patient patient = new Patient();
    private List<Patient> patients;
    
//##############################################################################    
    public ListaClinicaBean() {    }
//##############################################################################
    
//##################################Interface###################################    
    private InterfaceDAO<StatusLaudo> statusLaudoDAO() {
        InterfaceDAO<StatusLaudo> statusLaudoDAO = new HibernateDAO<StatusLaudo>(StatusLaudo.class, FacesContextUtil.getRequestSession());
        return statusLaudoDAO;
    }
    private InterfaceDAO<Patient> patientDAO(){
        InterfaceDAO<Patient> patientDAO = new HibernateDAO<Patient>(Patient.class, FacesContextUtil.getRequestSession());
        return patientDAO;
    }
    
    
    
    
//##############################################################################
    
//#############################Controle#########################################
    public void onListaStatusLaudoChange() {
        int cod = statusCodigo;
        System.out.print("Seleciona Lista. AGR   \n " + cod);
        patients = patientDAO().getEntities();
        System.out.println( "\nlista de paciente  " +  patients.get(1).getPatName());
    }

//##############################################################################

    public void displayLocation() {
        FacesMessage msg;        
            msg = new FacesMessage("Selected of " + statusLaudo);             
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }    
//####################################GET SET #############################//
    public String getErro() {
        return erro;
    }


    public void setErro(String erro) {
        this.erro = erro;
    }

    public int getStatusCodigo() {
        return statusCodigo;
    }

    public void setStatusCodigo(int statusCodigo) {
        this.statusCodigo = statusCodigo;
    }

//################################GET SET Entidades#############################//
    
    public StatusLaudo getStatusLaudo() {
        return statusLaudo;
    }

    public void setStatusLaudo(StatusLaudo statusLaudo) {
        this.statusLaudo = statusLaudo;
    }

    public List<StatusLaudo> getStatusLaudos() {
        System.out.println("Get Status Laudos");
        statusLaudos = statusLaudoDAO().getEntities();
        return statusLaudos;
    }

    public void setStatusLaudos(List<StatusLaudo> statusLaudos) {
        this.statusLaudos = statusLaudos;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<Patient> getPatients() {
        System.out.println("Get Patients");
        patients = patientDAO().getEntities();
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }


    
    
    
    
        
}