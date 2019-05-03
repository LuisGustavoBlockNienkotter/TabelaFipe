# TabelaFipe
package teste;

import BO.ListaAnoModelo;
import BO.ListaCarro;
import BO.ListaMarca;
import BO.ListaModelo;
import BO.ManipJSON;
import TabelaFipe.TabelaFipe;
import ConexaoTabelaFipe.Conexao;

public class test {
    public static void main(String[] args) {
        TabelaFipe tf = new TabelaFipe();
        
        ListaMarca listaMarca = new ListaMarca();
        //Pode ser do tipo carros, caminhoes ou motos
        tf.carregarMarcas("carros");
        listaMarca = tf.montarListaMarca();
        
        //limpa a lista, retorna a lista como null
        //listaMarca = tf.limparListaMarca();
         
        ListaModelo listaModelo = new ListaModelo();
        String idModelo = listaMarca.retornaIdParaModelo("FIAT");
        tf.carregarModelo(idModelo);
        listaModelo = tf.montarListaModelo();
        
        ListaAnoModelo listaAnoModelo = new ListaAnoModelo();
        String idAnoModelo = listaModelo.retornaIdParaAnoModelo("Palio 1.0 ECONOMY Fire Flex 8V 4p");
        tf.carregarAnoModelo(idAnoModelo);
        listaAnoModelo = tf.montarListaAnoModelo();
        
        ListaCarro listaCarro = new ListaCarro();
        String idCarro = listaAnoModelo.retornaIdParaCarro("2013 Gasolina");
        tf.carregarCarro(idCarro);
        listaCarro = tf.montarListaCarro();
              
        System.out.println(listaMarca.toString());
        System.out.println(listaModelo.toString());
        System.out.println(listaAnoModelo.toString());
        System.out.println(listaCarro.toString());

    }
}
