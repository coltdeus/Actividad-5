/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Negocio.MatrizPalabra;
import java.util.logging.Level;
import java.util.logging.Logger;
import ufps.util.varios.ArchivoLeerURL;

/**
 *
 * @author colt
 */
public class Prueba_MatrizPalabras {
    
    public static void main(String[] args) {
        try {
            ArchivoLeerURL archivo=new ArchivoLeerURL("https://raw.githubusercontent.com/javierarce/palabras/master/listado-general.txt");
            
            Object lineas[]=archivo.leerArchivo();
            int canLineas=lineas.length;
            MatrizPalabra m=new MatrizPalabra(lineas,canLineas);
            
            //System.out.println(m.toString());
            int con=m.contarPatron("aa");
            System.out.println("hay de ab:"+con);
            
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
         
    }
}
