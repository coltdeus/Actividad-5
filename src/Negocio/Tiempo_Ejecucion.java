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
public class Tiempo_Ejecucion {
    
    private long inicio, fin;

    public Tiempo_Ejecucion() {
        this.inicio=inicio = System.currentTimeMillis();
    }
    
    public void stop()
    {
        this.fin = System.currentTimeMillis();
    }
    
    
    public double getTiempoTotalSeg()
    {
        return (double) ((fin - inicio)/1000);
    }
    
    public long getTiempoMillis()
    {
        return this.getFin()-this.inicio;
    }

    public long getInicio() {
        return inicio;
    }

    public long getFin() {
        return fin;
    }
    
    
    
}
