package examen;
import jade.core.Agent;
import java.math.BigInteger;
import java.util.HashMap;

public class Oliver extends Agent {

    private HashMap catalogo;

    public Oliver(HashMap catalogo){
        this.catalogo = catalogo;
        System.out.println("Hola soy el agente virtual Oliver tenemos los mejores libros, ¿me podrías indicar el nombre del libro o el autor?.");
    }

    public void encotrarStock(String titulo, int copias){
        catalogo.put(titulo,new BigInteger(String.valueOf(copias)));
    }



}
