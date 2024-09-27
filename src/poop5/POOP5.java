/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 * Clase principal que contiene el método main para ejecutar el programa.
 * 
 * @author teran
 */
public class POOP5 {

    /**
     * Método principal que ejecuta el programa.
     * 
     * @param args los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creación de un objeto Circulo y uso de sus métodos
        Circulo circulo = new Circulo();
        circulo.getRadio();
        System.out.println(circulo.getRadio()); // Investigar porqué se necesita un constructor vacío
        circulo.setRadio(7.77f);
        circulo.calcularArea();
        circulo.calcularPerimetro();
    
        // Creación de un objeto Persona y uso de sus métodos
        Persona Diana = new Persona();
        Diana.setEdad(19);
        Diana.setAltura(1.58f);
        Diana.setNombre("Diana Lizbeth Terán Muñoz");
        
        // Creación de un objeto Fecha y uso de sus métodos
        Fecha fecha = new Fecha();
        fecha.setDia(20);
        fecha.setMes(5);
        fecha.setAnio(2005);
        
        // Asignación de la fecha de nacimiento a la persona
        Diana.setFechaDeNacimiento(fecha);
        Diana.setOcupación("Estudiante de la Facultad de Ingeniería");
        
        // Uso de los métodos de la clase Persona
        Diana.comer();
        Diana.jugar();
        Diana.saludar();
        Diana.correr();
        Diana.estudiar();
        
        // Impresión de los atributos de la persona
        System.out.println("Edad: ");
        System.out.println(Diana.getEdad());
        System.out.println("Altura: ");
        System.out.println(Diana.getAltura());
        System.out.println("Nombre: ");
        System.out.println(Diana.getNombre());
        System.out.println("Fecha de Nacimiento:");
        System.out.println(Diana.getFechaDeNacimiento());
        System.out.println("Ocupación: ");
        System.out.println(Diana.getOcupación());
    }   
}
