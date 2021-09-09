/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.List;
import modelo.entidad.CentroEducativo;
import modelo.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author L&C GROUP
 */
public class CeDao {
    
    public List<CentroEducativo> listarCentrosEducativos(){
        List<CentroEducativo> lista = null;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sesion.beginTransaction();
        String sql = "from CentroEducativo";
        
        try{
            lista = sesion.createQuery(sql).list();
            t.commit();
            sesion.close();
        }catch (Exception ex) {
            System.out.println("Mensaje DAG:"+ ex.getMessage());
            t.rollback();
        }
        return lista;
    }
    
    public void agregar(CentroEducativo centro) {
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.save(centro);
            sesion.getTransaction().commit();
        } catch (Exception e) {
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }
    
     public void modificar(CentroEducativo centro) {
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.update(centro);
            sesion.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }
     
     @Cascade({CascadeType.DELETE})
     public void eliminar(CentroEducativo centro) {
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.delete(centro);
            sesion.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }
     
     
    
}
