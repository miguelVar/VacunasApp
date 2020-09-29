/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.IDosis;
import java.util.List;
import java.util.Set;
import modelo.Dosis;
import modelo.Vacuna;
import org.hibernate.Session;
import util.SessionManagment;

/**
 *
 * @author migue
 */
public class DosisService implements IDosis{

    @Override
    public List<Dosis> obtenerDosis() {
        Session session = SessionManagment.getSessionHibernate();
         return session.createQuery("from Dosis").list();
    }

    @Override
    public Set obtenerDosisVacuna(Integer idVacuna) {
        Vacuna vacuna = (Vacuna) SessionManagment.getSessionHibernate().get(Vacuna.class, idVacuna);
       return vacuna.getDosises();
    }
    
}
