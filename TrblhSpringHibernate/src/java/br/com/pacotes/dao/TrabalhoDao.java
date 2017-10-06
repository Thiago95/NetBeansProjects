/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pacotes.dao;

import br.com.pacotes.entidade.Trabalho;
import br.com.pacotes.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author thiag
 */
public class TrabalhoDao {
    public void cadastrarUsuario(Trabalho trabalho){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        session.save(trabalho);
        
        session.getTransaction().commit();
        
        
    }
}
