
package BO;

import DTO.Modelo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** Classe com a lista de Modelos
    */

public class ListaModelo {
    private List<Modelo> lista = new ArrayList<Modelo>();
    /** Metodo para adicionar modelos a lista
     * @param modelo Modelo - modelo para adicionar 
    */
     public void add (Modelo modelo){
        lista.add(modelo);
    }
    /** Metodo para remover modelo da lista
     * @param modelo Modelo - modelo para remover
    */
    public void remover (Modelo modelo){
        lista.remove(modelo);
    }

    public List<Modelo> getLista() {
        return lista;
    }
    public void setLista(List<Modelo> lista) {
        this.lista = lista;
    }
    
     /** Metodo que retorna o id do modelo a partir do nome dele
     * @param name String - nome do modelo
     * @return String - com o id do modelo
    */
    public String retornaIdParaAnoModelo(String name){
        for (Iterator<Modelo> iterator = lista.iterator(); iterator.hasNext();) {
            Modelo next = iterator.next();
            if(name.equalsIgnoreCase(next.getName())){
                return String.valueOf(next.getId());
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "ListaModelo{" + "lista=" + lista + '}';
    }
}
