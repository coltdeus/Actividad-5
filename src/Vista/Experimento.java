/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Negocio.MatrizPalabra;
import Negocio.Tiempo_Ejecucion;
import ufps.util.varios.ArchivoLeerURL;


/**
 *
 * @author colt
 */
public class Experimento {
    public static void main(String[] args)
    {
        MatrizPalabra m = new MatrizPalabra();
        try
        {
            System.out.println("Experimento 1");
            System.out.println("Metodo burbuja con 1000 datos");
            experimento_burbuja_1000(m);
            System.out.println("Experimento MEJORADO");
            System.out.println("Metodo burbuja Mejorado con 1000 datos");
            experimento_burbuja_mejorado_1000(m);
            
            System.out.println("Experimento 2");
            System.out.println("Metodo burbuja con 5000 datos");
            experimento_burbuja_5000(m);
            System.out.println("Experimento MEJORADO");
            System.out.println("Metodo burbuja Mejorado con 5000 datos");
            experimento_burbuja_mejorado_5000(m);
            
            System.out.println("Experimento 3");
            System.out.println("Metodo burbuja con 10000 datos");
            experimento_burbuja_10000(m);
            System.out.println("Experimento MEJORADO");
            System.out.println("Metodo burbuja Mejorado con 10000 datos");
            experimento_burbuja_mejorado_10000(m);
            
            System.out.println("Experimento 4");
            System.out.println("Metodo burbuja con 20000 datos");
            experimento_burbuja_20000(m);
            System.out.println("Experimento MEJORADO");
            System.out.println("Metodo burbuja Mejorado con 20000 datos");
            experimento_burbuja_mejorado_20000(m);
            
            System.out.println("Experimento 5");
            System.out.println("Metodo burbuja con 30000 datos");
            experimento_burbuja_30000(m);
            System.out.println("Experimento MEJORADO");
            System.out.println("Metodo burbuja Mejorado con 30000 datos");
            experimento_burbuja_mejorado_30000(m);
            
            System.out.println("Experimento 6");
            System.out.println("Metodo burbuja con 80000 datos");
            experimento_burbuja_80000(m);
            System.out.println("Experimento MEJORADO");
            System.out.println("Metodo burbuja Mejorado con 80000 datos");
            experimento_burbuja_mejorado_80000(m);
        } catch (Exception ex)
        {
            System.err.print(ex.getMessage());
        }
    }
    
    public static Object[] matriz()
    {
        ArchivoLeerURL archivo = new ArchivoLeerURL("https://raw.githubusercontent.com/javierarce/palabras/master/listado-general.txt");
        Object lineas[] = archivo.leerArchivo();
        return lineas;
    }
    
//    1 experimento
    public static void experimento_burbuja_1000(MatrizPalabra m) throws Exception
    {
        int size=1000;
        m = new MatrizPalabra(matriz(), size);
        m.burbuja();
//        System.out.println(m.toString());
    }
    
    public static void experimento_burbuja_mejorado_1000(MatrizPalabra m) throws Exception
    {
        int size=1000;
        m = new MatrizPalabra(matriz(), size);
        m.burbujaMejorado();
//        System.out.println(m.toString());
    }
    
////    2 experimento
    public static void experimento_burbuja_5000(MatrizPalabra m) throws Exception
    {
        int size=5000;
        m = new MatrizPalabra(matriz(), size);
        m.burbuja();
//        System.out.println(m.toString());
    }
    
    public static void experimento_burbuja_mejorado_5000(MatrizPalabra m) throws Exception
    {
        int size=5000;
        m = new MatrizPalabra(matriz(), size);
        m.burbujaMejorado();
//        System.out.println(m.toString());
    }
    
////    3 experimento
    public static void experimento_burbuja_10000(MatrizPalabra m) throws Exception
    {
        int size=10000;
        m = new MatrizPalabra(matriz(), size);
        m.burbuja();
//        System.out.println(m.toString());
    }
    
    public static void experimento_burbuja_mejorado_10000(MatrizPalabra m) throws Exception
    {
        int size=10000;
        m = new MatrizPalabra(matriz(), size);
        m.burbujaMejorado();
//        System.out.println(m.toString());
    }
    
////    4 experimento
    public static void experimento_burbuja_20000(MatrizPalabra m) throws Exception
    {
        int size=20000;
        m = new MatrizPalabra(matriz(), size);
        m.burbuja();
//        System.out.println(m.toString());
    }
    
    public static void experimento_burbuja_mejorado_20000(MatrizPalabra m) throws Exception
    {
        int size=20000;
        m = new MatrizPalabra(matriz(), size);
        m.burbujaMejorado();
//        System.out.println(m.toString());
    }
    
////    5 experimento
    public static void experimento_burbuja_30000(MatrizPalabra m) throws Exception
    {
        int size=30000;
        m = new MatrizPalabra(matriz(), size);
        m.burbuja();
//        System.out.println(m.toString());
    }
    
    public static void experimento_burbuja_mejorado_30000(MatrizPalabra m) throws Exception
    {
        int size=30000;
        m = new MatrizPalabra(matriz(), size);
        m.burbujaMejorado();
//        System.out.println(m.toString());
    }
    
////    6 experimento 
    public static void experimento_burbuja_80000(MatrizPalabra m) throws Exception
    {
        int size=80000;
        m = new MatrizPalabra(matriz(), size);
        m.burbuja();
//        System.out.println(m.toString());
    }
    
    public static void experimento_burbuja_mejorado_80000(MatrizPalabra m) throws Exception
    {
        int size=80000;
        m = new MatrizPalabra(matriz(), size);
        m.burbujaMejorado();
//        System.out.println(m.toString());
    }
    
    
}
