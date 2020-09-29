/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunasapp;

import controlador.VacunasController;
import java.util.Iterator;
import java.util.List;
import modelo.Dosis;
import modelo.Vacuna;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;
import util.Utilities;

/**
 *
 * @author migue
 */
public class VacunasApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vacuna vacuna = new Vacuna(10, "Vacuna 8", "prueba");
        /*Dosis dosis = new Dosis(1, vacuna,5,"6");
        
         vacuna.getDosises().add(dosis);
         vacuna.getDosises().add(new Dosis(2, vacuna, 2, "2"));
         vacuna.getDosises().add(new Dosis(3, vacuna, 3, "3"));
         vacuna.getDosises().add(new Dosis(4, vacuna, 4, "4"));
         vacuna.getDosises().add(new Dosis(5, vacuna, 5, "5"));*/

        /*
         Session session = NewHibernateUtil.getSessionFactory().openSession();
         Transaction transaction = session.beginTransaction();
         //session.save(vacuna);
         String vacunaId="5";
         List<Vacuna> listVacunas = session.createQuery("from Vacuna where id="+vacunaId).list();
        
         Iterator<Vacuna> iterator = listVacunas.iterator();
        
         while (iterator.hasNext()) {
         Vacuna vacuna2 = iterator.next();
         System.out.println(vacuna2);
         //List<Dosis> dosises = session.createQuery("from Dosis where Vacuna").list();
         }
        
         transaction.commit();
         session.close();*/
        VacunasController controller = new VacunasController();
       // controller.agregarVacuna(vacuna);

        Dosis dosis = new Dosis(10, 2, "5");
        controller.agregarDosisVacuna(dosis, vacuna);

        /*Iterator<Vacuna> iterator = controller.obtenerVacuna(4).iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }*/
        System.out.println(" ############### Vacuna ####################");
        //System.out.println(controller.imprimir(controller.obtenerVacuna(4)));
        
        //System.out.println(controller.obtenerDosis(1));
        //System.out.println(Utilities.imprimir(controller.obtenerDosisVacuna(5)));
        //System.out.println("Onjeto Vacuna");
        
        System.out.println(controller.getVacuna(98));
        System.out.println("Todas las vacunas");
       // System.out.println(controller.obtenerVacunas());
    }

}
