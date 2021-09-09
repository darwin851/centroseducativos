/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.CeDao;
import modelo.entidad.CentroEducativo;

/**
 *
 * @author L&C GROUP
 */
@Named(value = "ceControl")
@Dependent
@ManagedBean
@ViewScoped
public class CeControl {

    /**
     * Creates a new instance of ceControl
     */
    
    private List<CentroEducativo> listaCentrosEducativos;
    private CentroEducativo centros;
    private Integer id_centro_educativo;

    
    @PostConstruct
    public void CategoryController() {
        id_centro_educativo = null;
        centros = new CentroEducativo();
    }
            
    public CeControl() {
        
    }
    
    public List<CentroEducativo> getListaCentros(){
        CeDao add = new CeDao();
        listaCentrosEducativos = add.listarCentrosEducativos();
        return listaCentrosEducativos;
    }
    
    public void setListaCentros(List<CentroEducativo> listaCentros){
        this.listaCentrosEducativos = listaCentros;
    }
    
    public CentroEducativo getCentros(){
        return centros;
    }
    
    public void setCentros(CentroEducativo centros){
        this.centros = centros;
    }
    
    public void limpiarCentros(){
        centros = new CentroEducativo();
    }
    
    public void AgregarCentro(){
        CeDao add = new CeDao();
        add.agregar(centros);
    }
    
    public void modificarCentro(){
        CeDao mod = new CeDao();
        mod.modificar(centros);
    }
    
    public void eliminarCentro(){
        CeDao del = new CeDao();
        del.eliminar(centros);
    }
    
}
