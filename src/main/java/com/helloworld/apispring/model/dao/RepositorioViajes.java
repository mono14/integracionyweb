/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.model.dao;

import com.helloworld.apispring.hibernateUtil.HibernateUtil;
import com.helloworld.apispring.model.entity.Viajes;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author daniel
 */
@Repository
@Transactional
public class RepositorioViajes {

    public List<Viajes> Lista_viajes(String Fecha, String Origen, String Destino) {

        Session session = null;
        List<Viajes> lista = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("SELECT fechaSalida,origen,destino,ncupos from Viajes "
                    + "where fechaSalida='" + Fecha + "' And origen='" + Origen + "' And destino='" + Destino + "'");
            lista = (List<Viajes>) query.list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return lista;
    }

    public Viajes viaje(long id) {
        Session session = null;
        Viajes lista = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Viajes "
                    + "where idViajes='" + id + "'");
            lista = (Viajes) query.uniqueResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return lista;
    }
}
