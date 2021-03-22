/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author colt
 */
public class MatrizPalabra {
    
    private char palabras[][];

    public MatrizPalabra() {
    }
    
    public MatrizPalabra(Object lineas[], int cantidad) throws Exception
    {
        if(cantidad >lineas.length)
            throw new Exception("Valores de índices fuera de rango");
        //Cantidad de filas:
        Tiempo_Ejecucion t=new Tiempo_Ejecucion();
        //this.palabras=new char[lineas.length][]; //Se crea una matriz dispersa
        this.palabras=new char[cantidad][]; //Se crea una matriz dispersa
        for(int i=0;i<cantidad;i++) //--> Tiempo: lineas.length
        {
            String cadena=lineas[i].toString();
            //Crear las columnas para la posición i de la matriz palabras
            this.palabras[i]=new char[cadena.length()];
            //Pasar cada caracter de cadena a palabras[i][j]
            for(int j=0;j<cadena.length();j++) // Tiempo: cadena.length
                this.palabras[i][j]=cadena.charAt(j);
        }
        
        t.stop();
        System.out.println("Tiempo de cargar la matriz es de:"+t.getTiempoTotalSeg()+" seg");
        System.out.println("Tiempo de cargar la matriz es de:"+t.getTiempoMillis()+" mseg");
        //APROXIMADAMENTE: TIEMPO: lineas.length * cadena.length --> suponiendo CADENA.LENGHT ES LA PALABRA DE MAYOR TAMAÑO(SUPONGO QUE TIENE 20 CARACTERES)
        //Ejemplo: 80383 *20= 1.607.660 ciclos realizando un análisis de forma EMPIRICA :(
    }
    
    
    @Override
    public String toString()
    {
//        int n=0;
    String msg="";
    Tiempo_Ejecucion t=new Tiempo_Ejecucion();
    for(int i=0;i<this.palabras.length;i++) //Tiempo t1: this.palabras.length
    {
        for(int j=0;j<this.palabras[i].length;j++) //Tiempo t2: this.palabras[i].length
        {
            msg+=this.palabras[i][j]+"\t";
//            n++;
//            System.out.println("dato="+n);

        }
    msg+="\n";
    }
    //Tiempo total es: t1*t2, donde t2 es la cadena de máxima cantidad de char
    t.stop();
    System.out.println("Tiempo de obtener la matriz en un String es de:"+t.getTiempoTotalSeg()+" seg");
    System.out.println("Tiempo de obtener la matriz en un String es de:"+t.getTiempoMillis()+" mseg");
    return msg;
    }
    
    public int contarPatron(String p) throws Exception
    {
        if(p.isEmpty() || this.palabras==null)
            throw new Exception("No se puede realizar la búsqueda patrón o matriz vacías");
        
        int con=0;
        Tiempo_Ejecucion t=new Tiempo_Ejecucion();
        //Fila de la matriz:
        for(int i=0;i<this.palabras.length;i++) //Tiempo t1: this.palabras.length (X)
        {
            int n,m;
            char fila[]=this.palabras[i];
            n=fila.length;
            m=p.length();
            /*
            https://sites.google.com/site/busquedasecuencialdetexto/algoritmo-fuerza-bruta/ejemplo
            */
            //Cada fila
            for(int ii=0;ii<n-m;ii++) //--> Tiempo t2: n-m
            {
                int no=0;
                //De la fila , analizo cuantos patrones existen
                for(int j=0;j<m;j++) // Tiempo t3=m
                {
                    if(p.charAt(j)!=fila[ii+j])
                        no++;
                    
                    if(no>0) //--> Coloque una condición de optimilidad
                        break;
                }
                
                if(no==0)
                con++;
            }
            
            
            
        }
        
         t.stop();
        System.err.println("Tiempo de buscar patrón en la matriz es de:"+t.getTiempoTotalSeg()+" seg");
        System.err.println("Tiempo de buscar patrón en la matriz es de:"+t.getTiempoMillis()+" mseg");
        
        // Aproximadamente es n3 ( X*(n-m)*m)--> realizando la operacionalización de las variables
        return con;
    }
    
    public void burbuja() throws Exception
    {
        Tiempo_Ejecucion t=new Tiempo_Ejecucion();
        //Metodo burbuja:
        char palabraTemp[];
        int ciclo=this.palabras.length;
        for(int j=1; j < ciclo; j++)
        {            
            for (int k = ciclo- 1; k >= j; k--) {
               if(this.palabras[k].length > this.palabras[k-1].length){
                   palabraTemp = this.palabras[k];
                   this.palabras[k] = this.palabras[k-1];
                   this.palabras[k-1]=  palabraTemp;
               }//fin if
           }             
        }
        t.stop();
        System.err.println("Tiempo de buscar patrón burbuja en la matriz es de:"+t.getTiempoTotalSeg()+" seg");
        System.err.println("Tiempo de buscar patrón burbuja en la matriz es de:"+t.getTiempoMillis()+" mseg");
        
    }
       
        public void burbujaMejorado() throws Exception
        {
        Tiempo_Ejecucion t=new Tiempo_Ejecucion();
        //Metodo burbuja:
        char palabraTemp[];
        int ciclo=this.palabras.length;
        int bandera=1;
        for(int j=1; (j < ciclo)&& bandera==1; j++)
        {            
            bandera=0;
            for (int k = ciclo- 1; k >= j; k--) {
               if(this.palabras[k].length > this.palabras[k-1].length){
                   bandera=1;
                   palabraTemp = this.palabras[k];
                   this.palabras[k] = this.palabras[k-1];
                   this.palabras[k-1]=  palabraTemp;
               }//fin if
           }             
        }
        t.stop();
        System.err.println("Tiempo de buscar patrón burbuja en la matriz es de:"+t.getTiempoTotalSeg()+" seg");
        System.err.println("Tiempo de buscar patrón burbuja en la matriz es de:"+t.getTiempoMillis()+" mseg");
        
        }
        
        public void OrdenarBurbuja() {
        Tiempo_Ejecucion tb = new Tiempo_Ejecucion();
        char[] temp;
        int t = palabras.length;
        for (int i = 1; i < t; i++) {
            for (int k = t - 1; k >= i; k--) {
                if (palabras[k].length > palabras[k - 1].length) {
                    temp = palabras[k];
                    palabras[k] = palabras[k - 1];
                    palabras[k - 1] = temp;
                }
            }
        }
        tb.stop();
        System.err.println("Tiempo de ordenar matriz es de:" + tb.getTiempoMillis() + " mseg");
    }
        public void OrdenarBurbujaNormal() {
        Tiempo_Ejecucion tb = new Tiempo_Ejecucion();
        char[] temp;
        int t = palabras.length;
        for (int i = 1; i < t; i++) {
            for (int k = 1; k < t-i-1; k++) {
                if (palabras[k].length > palabras[k - 1].length) {
                    temp = palabras[k];
                    palabras[k] = palabras[k - 1];
                    palabras[k - 1] = temp;
                }
            }
        }
        tb.stop();
        System.err.println("Tiempo de ordenar matriz es de:" + tb.getTiempoMillis() + " mseg");
    }
   }
    //19670 mejorado
    //21253 peor
    //19143 marco

















