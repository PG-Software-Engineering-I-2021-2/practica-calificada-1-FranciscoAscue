package examen;

import java.util.HashMap;

public class Repositorio {
    private HashMap stock;
    private String titulo;
    private int copias;

    public actualizarRepositorio(String titulo, int copias){
        this.stock = new HashMap();
        this.titulo = titulo;
        this.copias = copias;
        stock.put(titulo,copias);
    }

    public HashMap getRepsitorio(){
        return stock;
    }

}
