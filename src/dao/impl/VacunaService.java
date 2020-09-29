/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.IVacuna;
import java.util.List;
import java.util.function.Function;
import modelo.Dosis;
import modelo.Vacuna;
import org.hibernate.Session;
import util.SessionManagment;

/**
 *
 * @author migue
 */
public class VacunaService implements IVacuna{

    @Override
    public void agregarVacuna(Vacuna vacuna) {
        SessionManagment.openSessionHibernate(vacuna);
    }

    @Override
    public void agregarDosisVacuna(Dosis dosis, Vacuna vacuna) {
        dosis.setVacuna(vacuna);
        vacuna.getDosises().add(dosis);
        SessionManagment.openSessionHibernate(vacuna);
    }

    @Override
    public List<Vacuna> obtenerVacunas() {
        Session session = SessionManagment.getSessionHibernate();
        List<Vacuna> response = session.createQuery("from Vacuna").list();
        session.close();
        return response;
    }

    @Override
    public Vacuna getVacuna(Integer idVacuna) {
        Session session= SessionManagment.getSessionHibernate();
        List<Vacuna> response = session.createQuery("from Vacuna where id="+String.valueOf(idVacuna)).list();
        Vacuna vacuna = new Vacuna();
        if (response.size()>0){
           vacuna.setId(response.get(0).getId());
           vacuna.setNombre(response.get(0).getNombre());
           vacuna.setDescripcion(response.get(0).getDescripcion());
           vacuna.setDosises(response.get(0).getDosises()); 
        }
        session.close();
        return vacuna;
    }
    
}
