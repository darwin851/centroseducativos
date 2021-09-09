package modelo.entidad;
// Generated 3 sep. 2021 19:37:46 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * CentroEducativo generated by hbm2java
 */
public class CentroEducativo  implements java.io.Serializable {


     private int idCentroEducativo;
     private String departamento;
     private String municipio;
     private String canton;
     private String codigoCentroEducativo;
     private String centroEducativo;
     private String sector;
     private String zona;
     private String direccion;
     private String telefono;
     private String nombreDirector;
     private String turno;
     private String nivelEducativo;
     private Boolean opcionBtv;
     private Short anioBtv;
     private String btvImplementado;
     private Short numeroSeccionBtv;
     private String nombreAtp;
     private String nombreAtg;
     private String telefonoAtp;
     private String telefonoAtg;
     private Double XGeopos;
     private Double YGeopos;
     private String si;
     private Set<Seccion> seccions = new HashSet<Seccion>(0);
     private Set<Seccion> seccions_1 = new HashSet<Seccion>(0);

    public CentroEducativo() {
    }

	
    public CentroEducativo(int idCentroEducativo) {
        this.idCentroEducativo = idCentroEducativo;
    }
    public CentroEducativo(int idCentroEducativo, String departamento, String municipio, String canton, String codigoCentroEducativo, String centroEducativo, String sector, String zona, String direccion, String telefono, String nombreDirector, String turno, String nivelEducativo, Boolean opcionBtv, Short anioBtv, String btvImplementado, Short numeroSeccionBtv, String nombreAtp, String nombreAtg, String telefonoAtp, String telefonoAtg, Double XGeopos, Double YGeopos, String si, Set<Seccion> seccions, Set<Seccion> seccions_1) {
       this.idCentroEducativo = idCentroEducativo;
       this.departamento = departamento;
       this.municipio = municipio;
       this.canton = canton;
       this.codigoCentroEducativo = codigoCentroEducativo;
       this.centroEducativo = centroEducativo;
       this.sector = sector;
       this.zona = zona;
       this.direccion = direccion;
       this.telefono = telefono;
       this.nombreDirector = nombreDirector;
       this.turno = turno;
       this.nivelEducativo = nivelEducativo;
       this.opcionBtv = opcionBtv;
       this.anioBtv = anioBtv;
       this.btvImplementado = btvImplementado;
       this.numeroSeccionBtv = numeroSeccionBtv;
       this.nombreAtp = nombreAtp;
       this.nombreAtg = nombreAtg;
       this.telefonoAtp = telefonoAtp;
       this.telefonoAtg = telefonoAtg;
       this.XGeopos = XGeopos;
       this.YGeopos = YGeopos;
       this.si = si;
       this.seccions = seccions;
       this.seccions_1 = seccions_1;
    }
   
    public int getIdCentroEducativo() {
        return this.idCentroEducativo;
    }
    
    public void setIdCentroEducativo(int idCentroEducativo) {
        this.idCentroEducativo = idCentroEducativo;
    }
    public String getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getMunicipio() {
        return this.municipio;
    }
    
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public String getCanton() {
        return this.canton;
    }
    
    public void setCanton(String canton) {
        this.canton = canton;
    }
    public String getCodigoCentroEducativo() {
        return this.codigoCentroEducativo;
    }
    
    public void setCodigoCentroEducativo(String codigoCentroEducativo) {
        this.codigoCentroEducativo = codigoCentroEducativo;
    }
    public String getCentroEducativo() {
        return this.centroEducativo;
    }
    
    public void setCentroEducativo(String centroEducativo) {
        this.centroEducativo = centroEducativo;
    }
    public String getSector() {
        return this.sector;
    }
    
    public void setSector(String sector) {
        this.sector = sector;
    }
    public String getZona() {
        return this.zona;
    }
    
    public void setZona(String zona) {
        this.zona = zona;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getNombreDirector() {
        return this.nombreDirector;
    }
    
    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }
    public String getTurno() {
        return this.turno;
    }
    
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public String getNivelEducativo() {
        return this.nivelEducativo;
    }
    
    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }
    public Boolean getOpcionBtv() {
        return this.opcionBtv;
    }
    
    public void setOpcionBtv(Boolean opcionBtv) {
        this.opcionBtv = opcionBtv;
    }
    public Short getAnioBtv() {
        return this.anioBtv;
    }
    
    public void setAnioBtv(Short anioBtv) {
        this.anioBtv = anioBtv;
    }
    public String getBtvImplementado() {
        return this.btvImplementado;
    }
    
    public void setBtvImplementado(String btvImplementado) {
        this.btvImplementado = btvImplementado;
    }
    public Short getNumeroSeccionBtv() {
        return this.numeroSeccionBtv;
    }
    
    public void setNumeroSeccionBtv(Short numeroSeccionBtv) {
        this.numeroSeccionBtv = numeroSeccionBtv;
    }
    public String getNombreAtp() {
        return this.nombreAtp;
    }
    
    public void setNombreAtp(String nombreAtp) {
        this.nombreAtp = nombreAtp;
    }
    public String getNombreAtg() {
        return this.nombreAtg;
    }
    
    public void setNombreAtg(String nombreAtg) {
        this.nombreAtg = nombreAtg;
    }
    public String getTelefonoAtp() {
        return this.telefonoAtp;
    }
    
    public void setTelefonoAtp(String telefonoAtp) {
        this.telefonoAtp = telefonoAtp;
    }
    public String getTelefonoAtg() {
        return this.telefonoAtg;
    }
    
    public void setTelefonoAtg(String telefonoAtg) {
        this.telefonoAtg = telefonoAtg;
    }
    public Double getXGeopos() {
        return this.XGeopos;
    }
    
    public void setXGeopos(Double XGeopos) {
        this.XGeopos = XGeopos;
    }
    public Double getYGeopos() {
        return this.YGeopos;
    }
    
    public void setYGeopos(Double YGeopos) {
        this.YGeopos = YGeopos;
    }
    public String getSi() {
        return this.si;
    }
    
    public void setSi(String si) {
        this.si = si;
    }
    public Set<Seccion> getSeccions() {
        return this.seccions;
    }
    
    public void setSeccions(Set<Seccion> seccions) {
        this.seccions = seccions;
    }
    public Set<Seccion> getSeccions_1() {
        return this.seccions_1;
    }
    
    public void setSeccions_1(Set<Seccion> seccions_1) {
        this.seccions_1 = seccions_1;
    }




}

