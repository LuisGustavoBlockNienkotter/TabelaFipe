
package BO;

import DTO.AnoModelo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** Classe com a lista de ano de AnoModelos
    */

public class ListaAnoModelo {
     private List<AnoModelo> lista = new ArrayList<AnoModelo>();
     /** Metodo para adicionar AnoModelos a lista
     * @param anomodelo AnoModelo - AnoModelo para adicionar 
    */
     public void add (AnoModelo anomodelo){
        lista.add(anomodelo);
    }
     /** Metodo para remover AnoModelo da lista
     * @param anomodelo AnoModelo - AnoModelo para remover
    */
    public void remover (AnoModelo anomodelo){
        lista.remove(anomodelo);
    }

    public List<AnoModelo> getLista() {
        return lista;
    }
    public void setLista(List<AnoModelo> lista) {
        this.lista = lista;
    }
    /** Metodo que retorna o id do AnoModelo pelo nome 
     * @param name String - nome do AnoModelo que se quer
     * @return String - id do AnoModelo
    */
    public String retornaIdParaCarro(String name){
        for (Iterator<AnoModelo> iterator = lista.iterator(); iterator.hasNext();) {
            AnoModelo next = iterator.next();
            if(name.equalsIgnoreCase(next.getName())){
                return String.valueOf(next.getKey());
            }
        }
        return null;
    }
    
    /** Metodo que verifica se certo nome existe na lista
     * @param name String - nome do AnoModelo que se quer
     * @return String - nome do AnoModelo
    */
    public String retornaNameCarro(String name){
        for (Iterator<AnoModelo> iterator = lista.iterator(); iterator.hasNext();) {
            AnoModelo next = iterator.next();
            if(name.equalsIgnoreCase(next.getName())){
                return String.valueOf(next.getVeiculo());
            }
        }
        return null;
    }
    

    @Override
    public String toString() {
        return "ListaAnoModelo{" + "lista=" + lista + '}';
    }
}
