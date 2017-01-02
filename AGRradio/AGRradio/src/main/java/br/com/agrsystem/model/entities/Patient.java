package br.com.agrsystem.model.entities;
// Generated 02/01/2017 11:02:59 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Patient generated by hbm2java
 */
@Entity
@Table(name="patient"
    ,schema="public"
)
public class Patient  implements java.io.Serializable {


     private long pk;
     private Patient patient;
     private String patId;
     private String patIdIssuer;
     private String patName;
     private String patFnSx;
     private String patGnSx;
     private String patIName;
     private String patPName;
     private String patBirthdate;
     private String patSex;
     private String patCustom1;
     private String patCustom2;
     private String patCustom3;
     private Date createdTime;
     private Date updatedTime;
     private byte[] patAttrs;

    public Patient() {
    }

	
    public Patient(long pk) {
        this.pk = pk;
    }
    public Patient(long pk, Patient patient, String patId, String patIdIssuer, String patName, String patFnSx, String patGnSx, String patIName, String patPName, String patBirthdate, String patSex, String patCustom1, String patCustom2, String patCustom3, Date createdTime, Date updatedTime, byte[] patAttrs) {
       this.pk = pk;
       this.patient = patient;
       this.patId = patId;
       this.patIdIssuer = patIdIssuer;
       this.patName = patName;
       this.patFnSx = patFnSx;
       this.patGnSx = patGnSx;
       this.patIName = patIName;
       this.patPName = patPName;
       this.patBirthdate = patBirthdate;
       this.patSex = patSex;
       this.patCustom1 = patCustom1;
       this.patCustom2 = patCustom2;
       this.patCustom3 = patCustom3;
       this.createdTime = createdTime;
       this.updatedTime = updatedTime;
       this.patAttrs = patAttrs;
    }
   
     @Id     
    @Column(name="pk", unique=true, nullable=false)
    public long getPk() {
        return this.pk;
    }
    
    public void setPk(long pk) {
        this.pk = pk;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="merge_fk")
    public Patient getPatient() {
        return this.patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    
    @Column(name="pat_id")
    public String getPatId() {
        return this.patId;
    }
    
    public void setPatId(String patId) {
        this.patId = patId;
    }

    
    @Column(name="pat_id_issuer")
    public String getPatIdIssuer() {
        return this.patIdIssuer;
    }
    
    public void setPatIdIssuer(String patIdIssuer) {
        this.patIdIssuer = patIdIssuer;
    }

    
    @Column(name="pat_name")
    public String getPatName() {
        return this.patName;
    }
    
    public void setPatName(String patName) {
        this.patName = patName;
    }

    
    @Column(name="pat_fn_sx")
    public String getPatFnSx() {
        return this.patFnSx;
    }
    
    public void setPatFnSx(String patFnSx) {
        this.patFnSx = patFnSx;
    }

    
    @Column(name="pat_gn_sx")
    public String getPatGnSx() {
        return this.patGnSx;
    }
    
    public void setPatGnSx(String patGnSx) {
        this.patGnSx = patGnSx;
    }

    
    @Column(name="pat_i_name")
    public String getPatIName() {
        return this.patIName;
    }
    
    public void setPatIName(String patIName) {
        this.patIName = patIName;
    }

    
    @Column(name="pat_p_name")
    public String getPatPName() {
        return this.patPName;
    }
    
    public void setPatPName(String patPName) {
        this.patPName = patPName;
    }

    
    @Column(name="pat_birthdate")
    public String getPatBirthdate() {
        return this.patBirthdate;
    }
    
    public void setPatBirthdate(String patBirthdate) {
        this.patBirthdate = patBirthdate;
    }

    
    @Column(name="pat_sex")
    public String getPatSex() {
        return this.patSex;
    }
    
    public void setPatSex(String patSex) {
        this.patSex = patSex;
    }

    
    @Column(name="pat_custom1")
    public String getPatCustom1() {
        return this.patCustom1;
    }
    
    public void setPatCustom1(String patCustom1) {
        this.patCustom1 = patCustom1;
    }

    
    @Column(name="pat_custom2")
    public String getPatCustom2() {
        return this.patCustom2;
    }
    
    public void setPatCustom2(String patCustom2) {
        this.patCustom2 = patCustom2;
    }

    
    @Column(name="pat_custom3")
    public String getPatCustom3() {
        return this.patCustom3;
    }
    
    public void setPatCustom3(String patCustom3) {
        this.patCustom3 = patCustom3;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_time", length=29)
    public Date getCreatedTime() {
        return this.createdTime;
    }
    
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated_time", length=29)
    public Date getUpdatedTime() {
        return this.updatedTime;
    }
    
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    
    @Column(name="pat_attrs")
    public byte[] getPatAttrs() {
        return this.patAttrs;
    }
    
    public void setPatAttrs(byte[] patAttrs) {
        this.patAttrs = patAttrs;
    }
}

