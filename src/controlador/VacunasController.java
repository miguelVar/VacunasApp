/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.impl.DosisService;
import dao.impl.VacunaService;
import java.util.List;
import java.util.Set;
import modelo.Dosis;
import modelo.Vacuna;

/**
 *
 * @author migue
 */
public class VacunasController {
    
    private VacunaService vacunaService;
    private DosisService dosisService;

    public VacunasController() {
        this.vacunaService= new VacunaService();
        this.dosisService = new DosisService();
    }
    
    
    
    public void agregarVacuna(Vacuna vacuna){
        vacunaService.agregarVacuna(vacuna);
    }
    
    public void agregarDosisVacuna(Dosis dosis, Vacuna vacuna){
        vacunaService.agregarDosisVacuna(dosis, vacuna);
    }
    
    public List<Vacuna> obtenerVacunas(){
        return vacunaService.obtenerVacunas();
    }
    
    public List<Dosis> obtenerDosis(){
        return dosisService.obtenerDosis();
    }
    
    public Set obtenerDosisVacuna(Integer idVacuna){
        return dosisService.obtenerDosisVacuna(idVacuna);
    }
    
    public Vacuna getVacuna(Integer idVacuna){
       return vacunaService.getVacuna(idVacuna);
    }
    
}
