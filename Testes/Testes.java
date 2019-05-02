
package Testes;

import BO.ListaAnoModelo;
import BO.ListaCarro;
import BO.ListaMarca;
import BO.ListaModelo;
import BO.ManipJSON;
import ConexaoTabelaFipe.Conexao;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;
import TabelaFipe.TabelaFipe;
import ConexaoTabelaFipe.Conexao;
import java.io.InputStream;

public class Testes extends TestCase{

    TabelaFipe tf = new TabelaFipe();
    Conexao c = new Conexao();
    ManipJSON manip = new ManipJSON();
    public void testeLimparLista1(){
        ListaMarca lista = new ListaMarca();
        lista = tf.limparListaMarca();
        assertEquals(null, lista);
    }
    public void testeLimparLista2(){
        ListaModelo lista = new ListaModelo();
        lista = tf.limparListaModelo();
        assertEquals(null, lista);
    }
    public void testeLimparLista3(){
        ListaAnoModelo lista = new ListaAnoModelo();
        lista = tf.limparListaAnoModelo();
        assertEquals(null, lista);
    }
    public void testeLimparLista4(){
        ListaCarro lista = new ListaCarro();
        lista = tf.limparListaCarro();
        assertEquals(null, lista);
    }
    public void testeVerificaConexao1(){
        assertEquals(true, c.verificaMarca("carros"));
    }
    public void testeVerificaConexao2(){
        assertEquals(true, c.verificaModelo("carros", "21"));
    }
    public void testeVerificaConexao3(){
        assertEquals(true, c.verificaAnoModelo("carro", "21", "2013-1"));
    }
    public void testeVerificaConexao4(){
        assertEquals(true, c.verificaCarro("carro", "21", "2013-1", "2013-1"));
    }
    public void testeCarregaLista1(){
        ListaMarca lista = new ListaMarca();
        tf.carregarMarcas("carros");
        lista = manip.ler(lista);
        int size = lista.getLista().size();
        assertNotSame(0, size);
    }
    public void testeCarregaLista2(){
        ListaModelo lista = new ListaModelo();
        c.carregaModelo("carros", "21");
        lista = manip.ler(lista);
        int size = lista.getLista().size();
        assertNotSame(0, size);
    }
    public void testeCarregaLista3(){
        ListaAnoModelo lista = new ListaAnoModelo();
        c.carregaAnoModelo("carros", "21", "4828");
        lista = manip.ler(lista);
        int size = lista.getLista().size();
        assertNotSame(0, size);
    }
    public void testeCarregaLista4(){
        ListaCarro lista3 = new ListaCarro();
        c.carregaCarro("carros", "21", "4828", "2013-1");
        lista3 = manip.ler(lista3);
        int size = lista3.getLista().size();
        assertNotSame(0, size);
    }
    
}
