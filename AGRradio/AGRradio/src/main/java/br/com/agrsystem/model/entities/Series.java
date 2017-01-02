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
import javax.persistence.UniqueConstraint;

/**
 * Series generated by hbm2java
 */
@Entity
@Table(name="series"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames="series_iuid") 
)
public class Series  implements java.io.Serializable {


     private long pk;
     private Study study;
     private String seriesIuid;
     private String seriesNo;
     private String modality;
     private String bodyPart;
     private String laterality;
     private String seriesDesc;
     private String institution;
     private String stationName;
     private String department;
     private String perfPhysician;
     private String perfPhysFnSx;
     private String perfPhysGnSx;
     private String perfPhysIName;
     private String perfPhysPName;
     private Date ppsStart;
     private String ppsIuid;
     private String seriesCustom1;
     private String seriesCustom2;
     private String seriesCustom3;
     private int numInstances;
     private String srcAet;
     private String extRetrAet;
     private String retrieveAets;
     private String filesetIuid;
     private String filesetId;
     private int availability;
     private int seriesStatus;
     private Date createdTime;
     private Date updatedTime;
     private byte[] seriesAttrs;

    public Series() {
    }

	
    public Series(long pk, String seriesIuid, int numInstances, int availability, int seriesStatus) {
        this.pk = pk;
        this.seriesIuid = seriesIuid;
        this.numInstances = numInstances;
        this.availability = availability;
        this.seriesStatus = seriesStatus;
    }
    public Series(long pk, Study study, String seriesIuid, String seriesNo, String modality, String bodyPart, String laterality, String seriesDesc, String institution, String stationName, String department, String perfPhysician, String perfPhysFnSx, String perfPhysGnSx, String perfPhysIName, String perfPhysPName, Date ppsStart, String ppsIuid, String seriesCustom1, String seriesCustom2, String seriesCustom3, int numInstances, String srcAet, String extRetrAet, String retrieveAets, String filesetIuid, String filesetId, int availability, int seriesStatus, Date createdTime, Date updatedTime, byte[] seriesAttrs) {
       this.pk = pk;
       this.study = study;
       this.seriesIuid = seriesIuid;
       this.seriesNo = seriesNo;
       this.modality = modality;
       this.bodyPart = bodyPart;
       this.laterality = laterality;
       this.seriesDesc = seriesDesc;
       this.institution = institution;
       this.stationName = stationName;
       this.department = department;
       this.perfPhysician = perfPhysician;
       this.perfPhysFnSx = perfPhysFnSx;
       this.perfPhysGnSx = perfPhysGnSx;
       this.perfPhysIName = perfPhysIName;
       this.perfPhysPName = perfPhysPName;
       this.ppsStart = ppsStart;
       this.ppsIuid = ppsIuid;
       this.seriesCustom1 = seriesCustom1;
       this.seriesCustom2 = seriesCustom2;
       this.seriesCustom3 = seriesCustom3;
       this.numInstances = numInstances;
       this.srcAet = srcAet;
       this.extRetrAet = extRetrAet;
       this.retrieveAets = retrieveAets;
       this.filesetIuid = filesetIuid;
       this.filesetId = filesetId;
       this.availability = availability;
       this.seriesStatus = seriesStatus;
       this.createdTime = createdTime;
       this.updatedTime = updatedTime;
       this.seriesAttrs = seriesAttrs;
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
    @JoinColumn(name="study_fk")
    public Study getStudy() {
        return this.study;
    }
    
    public void setStudy(Study study) {
        this.study = study;
    }
   
    @Column(name="series_iuid", unique=true, nullable=false)
    public String getSeriesIuid() {
        return this.seriesIuid;
    }
    
    public void setSeriesIuid(String seriesIuid) {
        this.seriesIuid = seriesIuid;
    }

    
    @Column(name="series_no")
    public String getSeriesNo() {
        return this.seriesNo;
    }
    
    public void setSeriesNo(String seriesNo) {
        this.seriesNo = seriesNo;
    }

    
    @Column(name="modality")
    public String getModality() {
        return this.modality;
    }
    
    public void setModality(String modality) {
        this.modality = modality;
    }

    
    @Column(name="body_part")
    public String getBodyPart() {
        return this.bodyPart;
    }
    
    public void setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    
    @Column(name="laterality")
    public String getLaterality() {
        return this.laterality;
    }
    
    public void setLaterality(String laterality) {
        this.laterality = laterality;
    }

    
    @Column(name="series_desc")
    public String getSeriesDesc() {
        return this.seriesDesc;
    }
    
    public void setSeriesDesc(String seriesDesc) {
        this.seriesDesc = seriesDesc;
    }

    
    @Column(name="institution")
    public String getInstitution() {
        return this.institution;
    }
    
    public void setInstitution(String institution) {
        this.institution = institution;
    }

    
    @Column(name="station_name")
    public String getStationName() {
        return this.stationName;
    }
    
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    
    @Column(name="department")
    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }

    
    @Column(name="perf_physician")
    public String getPerfPhysician() {
        return this.perfPhysician;
    }
    
    public void setPerfPhysician(String perfPhysician) {
        this.perfPhysician = perfPhysician;
    }

    
    @Column(name="perf_phys_fn_sx")
    public String getPerfPhysFnSx() {
        return this.perfPhysFnSx;
    }
    
    public void setPerfPhysFnSx(String perfPhysFnSx) {
        this.perfPhysFnSx = perfPhysFnSx;
    }

    
    @Column(name="perf_phys_gn_sx")
    public String getPerfPhysGnSx() {
        return this.perfPhysGnSx;
    }
    
    public void setPerfPhysGnSx(String perfPhysGnSx) {
        this.perfPhysGnSx = perfPhysGnSx;
    }

    
    @Column(name="perf_phys_i_name")
    public String getPerfPhysIName() {
        return this.perfPhysIName;
    }
    
    public void setPerfPhysIName(String perfPhysIName) {
        this.perfPhysIName = perfPhysIName;
    }

    
    @Column(name="perf_phys_p_name")
    public String getPerfPhysPName() {
        return this.perfPhysPName;
    }
    
    public void setPerfPhysPName(String perfPhysPName) {
        this.perfPhysPName = perfPhysPName;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="pps_start", length=29)
    public Date getPpsStart() {
        return this.ppsStart;
    }
    
    public void setPpsStart(Date ppsStart) {
        this.ppsStart = ppsStart;
    }

    
    @Column(name="pps_iuid")
    public String getPpsIuid() {
        return this.ppsIuid;
    }
    
    public void setPpsIuid(String ppsIuid) {
        this.ppsIuid = ppsIuid;
    }

    
    @Column(name="series_custom1")
    public String getSeriesCustom1() {
        return this.seriesCustom1;
    }
    
    public void setSeriesCustom1(String seriesCustom1) {
        this.seriesCustom1 = seriesCustom1;
    }

    
    @Column(name="series_custom2")
    public String getSeriesCustom2() {
        return this.seriesCustom2;
    }
    
    public void setSeriesCustom2(String seriesCustom2) {
        this.seriesCustom2 = seriesCustom2;
    }

    
    @Column(name="series_custom3")
    public String getSeriesCustom3() {
        return this.seriesCustom3;
    }
    
    public void setSeriesCustom3(String seriesCustom3) {
        this.seriesCustom3 = seriesCustom3;
    }

    
    @Column(name="num_instances", nullable=false)
    public int getNumInstances() {
        return this.numInstances;
    }
    
    public void setNumInstances(int numInstances) {
        this.numInstances = numInstances;
    }

    
    @Column(name="src_aet")
    public String getSrcAet() {
        return this.srcAet;
    }
    
    public void setSrcAet(String srcAet) {
        this.srcAet = srcAet;
    }

    
    @Column(name="ext_retr_aet")
    public String getExtRetrAet() {
        return this.extRetrAet;
    }
    
    public void setExtRetrAet(String extRetrAet) {
        this.extRetrAet = extRetrAet;
    }

    
    @Column(name="retrieve_aets")
    public String getRetrieveAets() {
        return this.retrieveAets;
    }
    
    public void setRetrieveAets(String retrieveAets) {
        this.retrieveAets = retrieveAets;
    }

    
    @Column(name="fileset_iuid")
    public String getFilesetIuid() {
        return this.filesetIuid;
    }
    
    public void setFilesetIuid(String filesetIuid) {
        this.filesetIuid = filesetIuid;
    }

    
    @Column(name="fileset_id")
    public String getFilesetId() {
        return this.filesetId;
    }
    
    public void setFilesetId(String filesetId) {
        this.filesetId = filesetId;
    }

    
    @Column(name="availability", nullable=false)
    public int getAvailability() {
        return this.availability;
    }
    
    public void setAvailability(int availability) {
        this.availability = availability;
    }

    
    @Column(name="series_status", nullable=false)
    public int getSeriesStatus() {
        return this.seriesStatus;
    }
    
    public void setSeriesStatus(int seriesStatus) {
        this.seriesStatus = seriesStatus;
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

    
    @Column(name="series_attrs")
    public byte[] getSeriesAttrs() {
        return this.seriesAttrs;
    }
    
    public void setSeriesAttrs(byte[] seriesAttrs) {
        this.seriesAttrs = seriesAttrs;
    }
}

