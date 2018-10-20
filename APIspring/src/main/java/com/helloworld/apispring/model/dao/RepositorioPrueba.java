/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.model.dao;

import com.helloworld.apispring.hibernateUtil.HibernateUtil;
import com.helloworld.apispring.model.entity.Usuarios;
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
public class RepositorioPrueba {

    public boolean lista(String password, String Usuario) {

        Session session = null;
        List<Usuarios> lista = null;
        boolean aux = false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Usuarios where nombre = '" + Usuario + "' and password = '" + password + "'");
            lista = (List<Usuarios>) query.list();
            if (lista.size() > 0) {
                aux = true;
            } else {
                aux = false;
            }
        } catch (Exception e) {
            aux = false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return aux;
    }
}
