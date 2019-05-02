
package BO;

import DTO.Carro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** Classe com a lista de ano de Carros
    */

public class ListaCarro {
    
    private List<Carro> lista = new ArrayList<Carro>();
    /** Metodo para adicionar Carro a lista
     * @param carro Carro - Carro para adicionar 
    */
     public void add (Carro carro){
        lista.add(carro);
    }
     /** Metodo para remover Carro da lista
     * @param carro Carro - Carro para remover
    */
    public void remover (Carro carro){
        lista.remove(carro);
    }

    public List<Carro> getLista() {
        return lista;
    }
    public void setLista(List<Carro> lista) {
        this.lista = lista;
    }
    /** Metodo que retorna o nome do Carro pelo id dele
     * @param id String - id do Carro que se quer
     * @return String - nome do Carro
    */
    public String procurarNomeCarro(String id){
        for (Iterator<Carro> iterator = lista.iterator(); iterator.hasNext();) {
            Carro next = iterator.next();
            System.out.println(next.getName());
            System.out.println(id);
            if(next.getName().equals(id)){
                
                return next.getName();
                
            }
        }
        return "";
    }
    /** Metodo que retorna o ano do Carro pelo id dele
     * @param id String - id do Carro que se quer
     * @return String - ano do Carro
    */
    public String procurarAnoCarro(String id){
        for (Iterator<Carro> iterator = lista.iterator(); iterator.hasNext();) {
            Carro next = iterator.next();
            if(next.getName().equals(id)){
                return next.getAno_modelo();
            }
        }
        return "";
    }
    /** Metodo que retorna o combustivel do Carro pelo id dele
     * @param id String - id do Carro que se quer
     * @return String - combustivel do Carro
    */
    public String procurarCombustivelCarro(String id){
        for (Iterator<Carro> iterator = lista.iterator(); iterator.hasNext();) {
            Carro next = iterator.next();
            if(next.getName().equals(id)){
                return next.getCombustivel();
            }
        }
        return "";
    }
    /** Metodo que retorna o preço do Carro pelo id dele
     * @param id String - id do Carro que se quer
     * @return String - preço do Carro
    */
    public String procurarPrecoCarro(String id){
        for (Iterator<Carro> iterator = lista.iterator(); iterator.hasNext();) {
            Carro next = iterator.next();
            if(next.getName().equals(id)){
                return next.getPreco();
            }
        }
        return "";
    }
    /** Metodo que retorna a marca do Carro pelo id dele
     * @param id String - id do Carro que se quer
     * @return String - marca do Carro
    */
    public String procurarMarcaCarro(String id){
        for (Iterator<Carro> iterator = lista.iterator(); iterator.hasNext();) {
            Carro next = iterator.next();
            if(next.getName().equals(id)){
                return next.getMarca();
            }
        }
        return "";
    }

    @Override
    public String toString() {
        return "ListaCarro{" + "lista=" + lista + '}';
    }
    
}
