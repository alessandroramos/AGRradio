/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.agrsystem.controller;

import br.com.agrsystem.model.dao.HibernateDAO;
import br.com.agrsystem.model.dao.InterfaceDAO;
import br.com.agrsystem.model.entities.Files;
import br.com.agrsystem.model.entities.Instance;
import br.com.agrsystem.model.entities.Patient;
import br.com.agrsystem.model.entities.Series;
import br.com.agrsystem.model.entities.StatusLaudo;
import br.com.agrsystem.model.entities.Study;
import br.com.agrsystem.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "listaMedicoBean")
@RequestScoped
public class ListaMedicoBean implements Serializable{
    

    private static final long serialVersionUID = 1L;
    private String erro = null;
    private int statusCodigo;
    private Study selecionaLinha;
    private String ediLaudo;
    private String pesNome;
    private String pesCodigo;
    
//###################################Entidades##################################
    private StatusLaudo statusLaudo = new StatusLaudo();
    private List<StatusLaudo> statusLaudos;

    private Study study = new Study();
    private List<Study> studys;
    
    private Series series = new Series();
    private List<Series> seriess;
    private List<Series> seriessM;
    
    private Instance instance = new Instance();
    private List<Instance> instances;
    
    private Files files = new Files();
    private List<Files> filess;
    
//##############################################################################    
    public ListaMedicoBean() {    }
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
    private InterfaceDAO<Study> studyDAO(){
        InterfaceDAO<Study> studyDAO = new HibernateDAO<Study>(Study.class, FacesContextUtil.getRequestSession());
        return studyDAO;
    }
    private InterfaceDAO<Series> seriesDAO(){
        InterfaceDAO<Series> seriesDAO = new HibernateDAO<Series>(Series.class, FacesContextUtil.getRequestSession());
        return seriesDAO;
    }
    private InterfaceDAO<Series> seriesDAOM(){
        InterfaceDAO<Series> seriesDAOM = new HibernateDAO<Series>(Series.class, FacesContextUtil.getRequestSession());
        return seriesDAOM;
    }
    private InterfaceDAO<Instance> instanceDAO(){
        InterfaceDAO<Instance> instanceDAO = new HibernateDAO<Instance>(Instance.class, FacesContextUtil.getRequestSession());
        return instanceDAO;
    }
    private InterfaceDAO<Files> filesDAO(){
        InterfaceDAO<Files> filesDAO = new HibernateDAO<Files>(Files.class, FacesContextUtil.getRequestSession());
        return filesDAO;
    }    
    
//##############################################################################
    
//#############################Controle#########################################
    public void onListaStatusLaudoChange() {
        int cod = statusCodigo;
        System.out.print("Seleciona Lista. AGR   \n " + cod);
//        patients = patientDAO().getEntities();
//        studys = studyDAO().getEntities();
//        instances = instanceDAO().getEntities();
//        filess = filesDAO().getEntities();
        System.out.println( "\nlista de paciente  " + filess.get(1).getInstance().getSeries().getStudy().getPatient().getPatName() +" AGR  ");
    }
    public String quantidadeExame (long studyPk) {
        String retorno = "0";
        
        return retorno;
    }
    public String quantidadeImagens (long studyPk) {
        String retorno = "0";
        
        return retorno;
    }
//##############################################################################
    public void displayLocation() {
        FacesMessage msg;        
            msg = new FacesMessage("Selected of " + statusLaudo);             
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }    
//##################################Convert#####################################
    public String getDataInicioFormatada(String dtConv) {
        String conv = "";
        if(dtConv.equals("") || dtConv == null  )
        {
            conv = "";
        }
        else
        {
            conv = "01/01/2017";
            conv = dtConv.trim().substring(6,8) +"/" +dtConv.trim().substring(4,6) +"/" +dtConv.trim().substring(0,4);
        }
        return conv;
    }
    public String getDataExameFormatada(String dtConv) {
        String conv = "";
        if(dtConv.equals("") || dtConv == null  )
        {
            conv = "";
        }
        else
        {
            conv = "01/01/2017";
            conv = dtConv.trim().substring(8,10) +"/" +dtConv.trim().substring(5,7) +"/" +dtConv.trim().substring(0,4);
        }
        return conv;
    }
    public String getSexo(String sexo) {
        String conv = "";
        if(sexo.equals("F") || sexo == "f"  )
        {
            conv = "Feminino";
        }
        else
            if(sexo.equals("M") || sexo == "m"  )
            {
                conv = "Masculino";
            }
            else
            {
                conv = "";
            }
        return conv;
    }

    
//#########################################################################//
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

    public Study getStudy() {
        return study;
    }

    public void setStudy(Study study) {
        this.study = study;
    }

    public List<Study> getStudys() {
        System.out.println("Get studys");
        studys = studyDAO().getEntities();
        return studys;
    }

    public void setStudys(List<Study> studys) {
        this.studys = studys;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public List<Series> getSeriess() {
        seriess = seriesDAO().getEntities();
        System.out.println("Get Series"  );
        return seriess;
    }

    public void setSeriess(List<Series> seriess) {
        this.seriess = seriess;
    }

    public List<Series> getSeriessM() {
        seriessM = seriesDAOM().getEntities();
        System.out.println("Get Seriesmmm"  );
        return seriessM;
    }

    public void setSeriessM(List<Series> seriessM) {
        this.seriessM = seriessM;
    }    

    public Instance getInstance() {
        return instance;
    }

    public void setInstance(Instance instance) {
        this.instance = instance;
    }

    public List<Instance> getInstances() {
        return instances;
    }

    public void setInstances(List<Instance> instances) {
        this.instances = instances;
    }

    public Files getFiles() {
        return files;
    }

    public void setFiles(Files files) {
        this.files = files;
    }

    public List<Files> getFiless() {
        filess = filesDAO().getEntities();
        return filess;
    }

    public void setFiless(List<Files> filess) {
        
        this.filess = filess;
    }    

    public Study getSelecionaLinha() {
        System.out.println("setSelecionaLinha");
        return selecionaLinha;
    }

    public void setSelecionaLinha(Study selecionaLinha) {
        System.out.println("setSelecionaLinha" + selecionaLinha.getPk());
        this.selecionaLinha = selecionaLinha;
    }

    public String getEdiLaudo() {
        return ediLaudo;
    }

    public void setEdiLaudo(String ediLaudo) {
        this.ediLaudo = ediLaudo;
    }

    public String getPesNome() {
        return pesNome;
    }

    public void setPesNome(String pesNome) {
        this.pesNome = pesNome;
    }

    public String getPesCodigo() {
        return pesCodigo;
    }

    public void setPesCodigo(String pesCodigo) {
        this.pesCodigo = pesCodigo;
    }


        
}
