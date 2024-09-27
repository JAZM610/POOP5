/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * Clase que representa a una Persona.
 * 
 * @author teran
 */
public class Persona {
    private int edad; 
    private float altura; 
    private String nombre; 
    private Fecha fechaDeNacimiento; 
    private String ocupación; 
    
    /**
     * Constructor por defecto de la clase Persona.
     * Inicializa los atributos con valores predeterminados.
     */
    public Persona() {
        // Constructor vacío
    }
    
    /**
     * Constructor con parámetros de la clase Persona.
     * 
     * @param edad Edad de la persona.
     * @param altura Altura de la persona.
     * @param nombre Nombre de la persona.
     * @param fechaDeNacimiento Fecha de nacimiento de la persona.
     * @param ocupación Ocupación de la persona.
     */
    public Persona(int edad, float altura, String nombre, Fecha fechaDeNacimiento, String ocupación) {
        this.edad = edad; 
        this.altura = altura; 
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.ocupación = ocupación; 
    }
    
    /**
     * Obtiene la edad de la persona.
     * 
     * @return Edad de la persona.
     */
    public int getEdad() {
        return edad; 
    }
    
    /**
     * Establece la edad de la persona.
     * 
     * @param edad Nueva edad de la persona.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * Obtiene la altura de la persona.
     * 
     * @return Altura de la persona.
     */
    public float getAltura() {
        return altura; 
    }
    
    /**
     * Establece la altura de la persona.
     * 
     * @param altura Nueva altura de la persona.
     */
    public void setAltura(float altura) {
        this.altura = altura; 
    }
    
    /**
     * Obtiene el nombre de la persona.
     * 
     * @return Nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Establece el nombre de la persona.
     * 
     * @param nombre Nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    
    /**
     * Obtiene la fecha de nacimiento de la persona.
     * 
     * @return Fecha de nacimiento de la persona.
     */
    public Fecha getFechaDeNacimiento() {
        return fechaDeNacimiento; 
    }
    
    /**
     * Establece la fecha de nacimiento de la persona.
     * 
     * @param fechaDeNacimiento Nueva fecha de nacimiento de la persona.
     */
    public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento; 
    }
    
    /**
     * Obtiene la ocupación de la persona.
     * 
     * @return Ocupación de la persona.
     */
    public String getOcupación() {
        return ocupación; 
    }
    
    /**
     * Establece la ocupación de la persona.
     * 
     * @param ocupación Nueva ocupación de la persona.
     */
    public void setOcupación(String ocupación) {
        this.ocupación = ocupación; 
    }
    
    /**
     * Método que simula que la persona está comiendo.
     * 
     * @return true si la persona está comiendo.
     */
    public boolean comer() {
        return true;
    }
    
    /**
     * Método que simula que la persona está jugando.
     * 
     * @return true si la persona está jugando.
     */
    public boolean jugar() {
        return true;
    }
    
    /**
     * Método que simula que la persona está saludando.
     */
    public void saludar() {
        System.out.println("Hola");
    }
    
    /**
     * Método que simula que la persona está corriendo.
     */
    public void correr() {
        System.out.println("Estoy corriendo");
    }
    
    /**
     * Método que simula que la persona está estudiando.
     */
    public void estudiar() {
        System.out.println("Estoy estudiando");
    }

    /**
     * Método que devuelve una representación en cadena de la persona.
     * 
     * @return Representación en cadena de la persona.
     */
    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", altura=" + altura + ", nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + ", ocupación=" + ocupación + '}';
    }
}
