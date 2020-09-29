/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import java.util.Set;
import modelo.Dosis;

/**
 *
 * @author migue
 */
public interface IDosis {
    
    public List<Dosis> obtenerDosis();
    public Set obtenerDosisVacuna(Integer idVacuna);
}
