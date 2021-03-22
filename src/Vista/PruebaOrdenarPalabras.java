/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Negocio.Tiempo_Ejecucion;
import Negocio.MatrizPalabra;
import ufps.util.varios.ArchivoLeerURL;

/**
 *
 * @author colt
 */
public class PruebaOrdenarPalabras {
    public static void main(String[] args) {
        MatrizPalabra m = new MatrizPalabra();
        
        
        ArchivoLeerURL archivo=new ArchivoLeerURL("https://raw.githubusercontent.com/javierarce/palabras/master/listado-general.txt");
        Object lineas[]=archivo.leerArchivo();
        int n=0;
        for(Object dato:lineas)
        {
            
            System.out.println(n+lineas.length+"="+dato.toString());
        }
//        //Calculo de Tiempo inicial
//        //long inicio = System.currentTimeMillis();
//        
//        Tiempo_Ejecucion t1=new Tiempo_Ejecucion();
//        Object lineas[]=archivo.leerArchivo();
//        t1.stop();
//        //Calculo de Tiempo final
//        //long fin = System.currentTimeMillis();
//        //Conversión a segundos:
//        //double tiempo = (double) ((fin - inicio)/1000);
//         
//        System.out.println(t1.getTiempoTotalSeg() +" segundos para la operación de lectura, para un archivo que contiene "+lineas.length+" líneas");
//        
//        Tiempo_Ejecucion t2=new Tiempo_Ejecucion();
//        for(Object dato:lineas)
//            System.out.println(dato.toString());
//        t2.stop();
//        System.out.println("El tiempo para realizar la impresión del archivo es de:"+t2.getTiempoTotalSeg()+" seg");
    }
    
    public static Object[] matriz()
    {
        ArchivoLeerURL archivo = new ArchivoLeerURL("https://raw.githubusercontent.com/javierarce/palabras/master/listado-general.txt");
        Object lineas[] = archivo.leerArchivo();
        return lineas;
    }
    
    
    
}
