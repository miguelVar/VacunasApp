package modelo;
// Generated 26/09/2020 10:45:07 AM by Hibernate Tools 4.3.1



/**
 * Dosis generated by hbm2java
 */
public class Dosis  implements java.io.Serializable {


     private int id;
     private Vacuna vacuna;
     private int valorTiempo;
     private String unidadTimepo;

    public Dosis() {
    }

    public Dosis(int id, Vacuna vacuna, int valorTiempo, String unidadTimepo) {
       this.id = id;
       this.vacuna = vacuna;
       this.valorTiempo = valorTiempo;
       this.unidadTimepo = unidadTimepo;
    }

    public Dosis(int id, int valorTiempo, String unidadTimepo) {
        this.id = id;
        this.valorTiempo = valorTiempo;
        this.unidadTimepo = unidadTimepo;
    }
    
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Vacuna getVacuna() {
        return this.vacuna;
    }
    
    public void setVacuna(Vacuna vacuna) {
        this.vacuna = vacuna;
    }
    public int getValorTiempo() {
        return this.valorTiempo;
    }
    
    public void setValorTiempo(int valorTiempo) {
        this.valorTiempo = valorTiempo;
    }
    public String getUnidadTimepo() {
        return this.unidadTimepo;
    }
    
    public void setUnidadTimepo(String unidadTimepo) {
        this.unidadTimepo = unidadTimepo;
    }

    @Override
    public String toString() {
        return "Dosis{" + "id=" + id + ", valorTiempo=" + valorTiempo + ", unidadTimepo=" + unidadTimepo + '}';
    }


    
}


