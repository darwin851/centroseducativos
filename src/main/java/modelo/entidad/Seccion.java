package modelo.entidad;
// Generated 3 sep. 2021 19:37:46 by Hibernate Tools 4.3.1



/**
 * Seccion generated by hbm2java
 */
public class Seccion  implements java.io.Serializable {


     private int idSeccion;
     private CentroEducativo centroEducativo;
     private Integer anio;
     private String nivelEducativo;
     private String grado;
     private String seccion;
     private Integer idTurno;
     private String ciclo;
     private Integer idNivelEducativo;
     private String modAtencion;
     private String modEducativa;
     private String opcBachillerato;
     private String orgCurricular;
     private String proEducativo;
     private String secEconomico;
     private Integer pkSeccionSiges;

    public Seccion() {
    }

	
    public Seccion(int idSeccion, CentroEducativo centroEducativo) {
        this.idSeccion = idSeccion;
        this.centroEducativo = centroEducativo;
    }
    public Seccion(int idSeccion, CentroEducativo centroEducativo, Integer anio, String nivelEducativo, String grado, String seccion, Integer idTurno, String ciclo, Integer idNivelEducativo, String modAtencion, String modEducativa, String opcBachillerato, String orgCurricular, String proEducativo, String secEconomico, Integer pkSeccionSiges) {
       this.idSeccion = idSeccion;
       this.centroEducativo = centroEducativo;
       this.anio = anio;
       this.nivelEducativo = nivelEducativo;
       this.grado = grado;
       this.seccion = seccion;
       this.idTurno = idTurno;
       this.ciclo = ciclo;
       this.idNivelEducativo = idNivelEducativo;
       this.modAtencion = modAtencion;
       this.modEducativa = modEducativa;
       this.opcBachillerato = opcBachillerato;
       this.orgCurricular = orgCurricular;
       this.proEducativo = proEducativo;
       this.secEconomico = secEconomico;
       this.pkSeccionSiges = pkSeccionSiges;
    }
   
    public int getIdSeccion() {
        return this.idSeccion;
    }
    
    public void setIdSeccion(int idSeccion) {
        this.idSeccion = idSeccion;
    }
    public CentroEducativo getCentroEducativo() {
        return this.centroEducativo;
    }
    
    public void setCentroEducativo(CentroEducativo centroEducativo) {
        this.centroEducativo = centroEducativo;
    }
    public Integer getAnio() {
        return this.anio;
    }
    
    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    public String getNivelEducativo() {
        return this.nivelEducativo;
    }
    
    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }
    public String getGrado() {
        return this.grado;
    }
    
    public void setGrado(String grado) {
        this.grado = grado;
    }
    public String getSeccion() {
        return this.seccion;
    }
    
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    public Integer getIdTurno() {
        return this.idTurno;
    }
    
    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }
    public String getCiclo() {
        return this.ciclo;
    }
    
    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
    public Integer getIdNivelEducativo() {
        return this.idNivelEducativo;
    }
    
    public void setIdNivelEducativo(Integer idNivelEducativo) {
        this.idNivelEducativo = idNivelEducativo;
    }
    public String getModAtencion() {
        return this.modAtencion;
    }
    
    public void setModAtencion(String modAtencion) {
        this.modAtencion = modAtencion;
    }
    public String getModEducativa() {
        return this.modEducativa;
    }
    
    public void setModEducativa(String modEducativa) {
        this.modEducativa = modEducativa;
    }
    public String getOpcBachillerato() {
        return this.opcBachillerato;
    }
    
    public void setOpcBachillerato(String opcBachillerato) {
        this.opcBachillerato = opcBachillerato;
    }
    public String getOrgCurricular() {
        return this.orgCurricular;
    }
    
    public void setOrgCurricular(String orgCurricular) {
        this.orgCurricular = orgCurricular;
    }
    public String getProEducativo() {
        return this.proEducativo;
    }
    
    public void setProEducativo(String proEducativo) {
        this.proEducativo = proEducativo;
    }
    public String getSecEconomico() {
        return this.secEconomico;
    }
    
    public void setSecEconomico(String secEconomico) {
        this.secEconomico = secEconomico;
    }
    public Integer getPkSeccionSiges() {
        return this.pkSeccionSiges;
    }
    
    public void setPkSeccionSiges(Integer pkSeccionSiges) {
        this.pkSeccionSiges = pkSeccionSiges;
    }




}


