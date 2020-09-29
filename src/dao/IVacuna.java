/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Dosis;
import modelo.Vacuna;

/**
 *
 * @author migue
 */
public interface IVacuna {
    
    public void agregarVacuna(Vacuna vacuna);
    public void agregarDosisVacuna(Dosis dosis, Vacuna vacuna);
    public List<Vacuna> obtenerVacunas();
    public Vacuna getVacuna(Integer idVacuna);
}
