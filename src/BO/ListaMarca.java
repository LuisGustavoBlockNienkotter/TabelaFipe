
package BO;

import DTO.Marca;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** Classe que contem a lista de Marcas
 */

public class ListaMarca {
    
    private List<Marca> lista = new ArrayList<Marca>();
    
    /** Metodo para adicionar uma marca a lista
     * @param marca Marca - marca para ser adicionada
    */
    public void add (Marca marca){
        lista.add(marca);
    }
    /** Metodo para remover uma marca da lista
     * @param marca Marca - marca para ser removida
    */
    public void remover (Marca marca){
        lista.remove(marca);
    }

    public List<Marca> getLista() {
        return lista;
    }
    public void setLista(List<Marca> lista) {
        this.lista = lista;
    }
    
    /** Metodo que retorna o id da marca a partir do nome dela
     * @param name String - nome da marca
     * @return String - com o id da marca
    */
    
    public String retornaIdParaModelo(String name){
        for (Iterator<Marca> iterator = lista.iterator(); iterator.hasNext();) {
            Marca next = iterator.next();
            if(name.equalsIgnoreCase(next.getName())){
                return String.valueOf(next.getId());
            }
        }
        return null;
    }
    

    @Override
    public String toString() {
        return "ListaMarca{" + "lista=" + lista + '}';
    }
    
}
