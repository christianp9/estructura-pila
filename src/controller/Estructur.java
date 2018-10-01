package controller;

import java.util.ArrayList;
import java.util.Stack;
import model.examen;
import model.examestudiante;

public class Estructur {

   public static Stack<examestudiante> pilaExaEst = new Stack<>();
   public static ArrayList<examen> examen = new ArrayList<examen>();
   public static ArrayList<examestudiante> listae = new ArrayList<examestudiante>();

   
   
    /**
     * @return the pilaExaEst
     */
    public static Stack<examestudiante> getPilaExaEst() {
        return pilaExaEst;
    }

    /**
     * @param aPilaExaEst the pilaExaEst to set
     */
    public static void setPilaExaEst(Stack<examestudiante> aPilaExaEst) {
        pilaExaEst = aPilaExaEst;
    }
   
    public static void añadirExaEst(examestudiante e){
        
        getPilaExaEst().push(e);
        
    }
    
    public static examestudiante getPila(int i){
        
        examestudiante e ;
        e = getPilaExaEst().get(i);
        return e;
        
    }

    /**
     * @return the examenVista
     */
    public static ArrayList<examen> getExamen() {
        return examen;
    }

    /**
     * @param aExamen the examenVista to set
     */
    public static void setExamen(ArrayList<examen> aExamen) {
        examen = aExamen;
    }
           
    public static void añadirexamen(examen a){
    
    getExamen().add(a);
    
    }

    /**
     * @return the listae
     */
    public static ArrayList<examestudiante> getListae() {
        return listae;
    }

    /**
     * @param aListae the listae to set
     */
    public static void setListae(ArrayList<examestudiante> aListae) {
        listae = aListae;
    }
    

     public static void acalificados(examestudiante j){
    
    getListae().add(j);
    
    }    

}
