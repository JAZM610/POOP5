/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * Clase que representa un Círculo.
 * 
 * @author teran
 */
public class Circulo {
    final float PI = 3.14f; // Es una constante
    private float radio; 
    
    /**
     * Constructor por defecto de la clase Circulo.
     * Inicializa los atributos con valores predeterminados.
     */
    public Circulo() {
        // Constructor vacío
    }
    
    /**
     * Constructor con parámetros de la clase Circulo.
     * 
     * @param radio Radio del círculo.
     */
    public Circulo(float radio) {
        this.radio = radio; 
    }
    
    /**
     * Obtiene el radio del círculo.
     * 
     * @return Radio del círculo.
     */
    public float getRadio() {
        return radio; // No hay argumentos
    }
    
    /**
     * Establece el radio del círculo.
     * 
     * @param radio Nuevo radio del círculo.
     */
    public void setRadio(float radio) {
        this.radio = radio; 
    }
    
    /**
     * Método para calcular el perímetro del círculo.
     */
    public void calcularPerimetro() {
        System.out.println("Perímetro: " + 2 * PI * radio);
    }
    
    /**
     * Método para calcular el área del círculo.
     */
    public void calcularArea() {
        System.out.println("Área: " + PI * (radio * radio));
    }
}
