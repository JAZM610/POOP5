/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * Clase que representa una Fecha.
 * 
 * @author teran
 */
class Fecha {
    private int dia;
    private int mes; 
    private int anio; 
    
    /**
     * Constructor por defecto de la clase Fecha.
     * Inicializa los atributos con valores predeterminados.
     */
    public Fecha() {
        // Constructor vacío
    }
    
    /**
     * Constructor con parámetros de la clase Fecha.
     * 
     * @param dia Día de la fecha.
     * @param mes Mes de la fecha.
     * @param anio Año de la fecha.
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia; 
        this.mes = mes; 
        this.anio = anio; 
    }

    /**
     * Obtiene el día de la fecha.
     * 
     * @return Día de la fecha.
     */
    public int getDia() {
        return dia;
    }

    /**
     * Establece el día de la fecha.
     * 
     * @param dia Nuevo día de la fecha.
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Obtiene el mes de la fecha.
     * 
     * @return Mes de la fecha.
     */
    public int getMes() {
        return mes;
    }

    /**
     * Establece el mes de la fecha.
     * 
     * @param mes Nuevo mes de la fecha.
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Obtiene el año de la fecha.
     * 
     * @return Año de la fecha.
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Establece el año de la fecha.
     * 
     * @param anio Nuevo año de la fecha.
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    /**
     * Método para imprimir la fecha en formato "Día/Mes/Año".
     * 
     * @return Cadena con la fecha en formato "Día/Mes/Año".
     */
    public String imprimirFecha() {
        System.out.println("Día/Mes/Año");
        return dia + "/" + mes + "/" + anio; 
    }

    /**
     * Método que devuelve una representación en cadena de la fecha.
     * 
     * @return Representación en cadena de la fecha.
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
}
