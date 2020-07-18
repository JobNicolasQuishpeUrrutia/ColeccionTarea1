/*
Proyecto: Diseño e implementación de un algoritmo que le permita Encender las luces direccionales del vehículo:
Implementar los elementos de su proyecto en orden, utilizando el método Collecion
 */
package colecciontarea1;

/**
 * @author Quishpe Urrutia Job Nicolas
 */
import java.util.ArrayList;
import java.util.Collection;
public class ColeccionTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            System.out.println("                                UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("                                            Sede Latacunga\n");
        System.out.println("Alumno: Quishpe Urrutia Job Nicolas");
        System.out.println("Docente: Ing. Luis Alberto Guerra Cruz");
        System.out.println("Asignatura: Programación");
        System.out.println("NRC:7450");
        System.out.println("Tema: Colección");
        System.out.println("Proyecto: Diseño e implementación de un algoritmo"
                + " que le permita Encender las luces direccionales del vehículo:");
        
        Collection listaElementosLucesDireccionales = new ArrayList<String>(); 
        listaElementosLucesDireccionales.add("Tablero de conexiones (protoboard)\n");
        listaElementosLucesDireccionales.add("Bateria\n");
        listaElementosLucesDireccionales.add("Baquelita\n");
        listaElementosLucesDireccionales.add("Broche para conectar bateria\n");
        listaElementosLucesDireccionales.add("Cables de interconexión\n");
        listaElementosLucesDireccionales.add("Cautin\n");
        listaElementosLucesDireccionales.add("Estaño\n");
        listaElementosLucesDireccionales.add("Grasa para soldar\n");
        listaElementosLucesDireccionales.add("Pinzas para cortar cables\n");
        listaElementosLucesDireccionales.add("Cuchilla\n");
        listaElementosLucesDireccionales.add("Pistola de silicona\n");
        listaElementosLucesDireccionales.add("Resistencia\n");
        listaElementosLucesDireccionales.add("Led Tricolor Automático\n");
        listaElementosLucesDireccionales.add("Switch de tres posiciones\n");
        listaElementosLucesDireccionales.add("4 Leds (color amarillo)\n");
        listaElementosLucesDireccionales.add("Carrito pequeño de juguete\n");
        
        System.out.println("Número de elementos que se van a utilizar para realizar las LUCES DIRECCIONALES:"
                +listaElementosLucesDireccionales.size() + "\n");
        System.out.println("LOS ELEMENTOS DE LAS LUCES DIRECCIONALES SON:");
        System.out.println(listaElementosLucesDireccionales.toString());
       
        listaElementosLucesDireccionales.remove("Baquelita\n");
        listaElementosLucesDireccionales.remove("Grasa para soldar\n");
        listaElementosLucesDireccionales.remove("Cuchilla\n");
        
        System.out.println("Número de elementos despúes de ser eliminados"
               + " Baquelita, Grasa para soldar y cuchilla: "+listaElementosLucesDireccionales.size()+ "\n");
        System.out.println("LOS ELEMENTOS QUE PERMANECEN PARA REALIZAR LAS LUCES DIRECCIONALES::");
        System.out.println(listaElementosLucesDireccionales.toString());    
    }   
}