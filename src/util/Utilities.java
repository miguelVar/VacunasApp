/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Set;

/**
 *
 * @author migue
 */
public class Utilities {
    
    
    public static String imprimir(Set list){
        StringBuffer salida = new StringBuffer();
        for (Object list1 : list) {
            salida.append(list1+"\n");
        }
        return salida.toString();
    }
}
