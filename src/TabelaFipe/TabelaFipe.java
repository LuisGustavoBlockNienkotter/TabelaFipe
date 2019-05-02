package TabelaFipe;
import BO.ListaAnoModelo;
import BO.ListaCarro;
import BO.ListaMarca;
import BO.ListaModelo;
import BO.ManipJSON;
import ConexaoTabelaFipe.Conexao;
import DTO.AnoModelo;
import DTO.Marca;
import DTO.Modelo;
import javax.swing.DefaultComboBoxModel;

/** Classe que junta as principais funcionalidades para a utilização do web service que junta os dados da tabela fipe
    */

public class TabelaFipe {
    private String tipo;
    private String idModelo;
    private String idAnoModelo;
    private String idCarro;
    /** Metodo que popula o json com as marcas
     * @param tipo String - tipo de marcas que se quer, pode ser carros, motos ou caminhoes
    */
    public void carregarMarcas(String tipo){
        Conexao c = new Conexao();
        this.tipo = tipo;     
        if (c.verificaMarca(tipo)) {
            c.carregaMarcas(tipo);
        }      
    }
    /** Metodo que popula o json com os modelos
     * @param idModelo String - id da marca que se quer ver os modelos
    */
    public void carregarModelo(String idModelo){
        Conexao c = new Conexao();
        this.idModelo = idModelo;
        if (c.verificaModelo(tipo, idModelo)) {
            c.carregaModelo(tipo, idModelo);
        }
    }
    /** Metodo que popula o json com os modelos e seus anos
     * @param idAnoModelo  String - id do modelo para ver os anos em que esse ano foi lançado
    */
    public void carregarAnoModelo(String idAnoModelo){
        Conexao c = new Conexao();
        this.idAnoModelo = idAnoModelo;
        if (c.verificaAnoModelo(tipo, idModelo, idAnoModelo)) {
            c.carregaAnoModelo(tipo, idModelo,idAnoModelo);
        }
    }
    /** Metodo que popula o json com os carros
     * @param idCarro String - id do carro que se quer visualizar
    */
    public void carregarCarro(String idCarro){
        Conexao c = new Conexao();
        this.idCarro = idCarro;
        if (c.verificaCarro(tipo, idModelo, idAnoModelo, idCarro)) {
            c.carregaCarro(tipo, idModelo,idAnoModelo, idCarro);
        }
    }
    /** Metodo que limpa o json e a lista de Marca
     * @return ListaMarca - retorna a lista vazia
    */
    public ListaMarca limparListaMarca(){
        ListaMarca lista = null;
        ManipJSON manip = new ManipJSON();
        manip.gravar(lista);
        return lista;
    }
    /** Metodo que limpa o json e a lista de Modelo
     * @return ListaModelo - retorna a lista vazia
    */
    public ListaModelo limparListaModelo(){
        ListaModelo lista = null;
        ManipJSON manip = new ManipJSON();
        manip.gravar(lista);
        return lista;
    }
    /** Metodo que limpa o json e a lista de AnoModelo
     * @return ListaAnoModelo - retorna a lista vazia
    */
    public ListaAnoModelo limparListaAnoModelo(){
        ListaAnoModelo lista = null;
        ManipJSON manip = new ManipJSON();
        manip.gravar(lista);
        return lista;
    }
    /** Metodo que limpa o json e a lista de Carro
     * @return ListaCarro - retorna a lista vazia
    */
    public ListaCarro limparListaCarro(){
        ListaCarro lista = null;
        ManipJSON manip = new ManipJSON();
        manip.gravar(lista);
        return lista;
    }
    /** Metodo que monta a lista com o json carregado
     * @return ListaMarca - retorna a lista populada
    */
    public ListaMarca montarListaMarca(){
        ListaMarca lista = new ListaMarca();
        ManipJSON manip = new ManipJSON();
        lista = manip.ler(lista);
        return lista;
    }
    /** Metodo que monta a lista com o json carregado
     * @return ListaModelo - retorna a lista populada
    */
    public ListaModelo montarListaModelo(){
        ListaModelo lista = new ListaModelo();
        ManipJSON manip = new ManipJSON();
        lista = manip.ler(lista);
        return lista;
    }
    /** Metodo que monta a lista com o json carregado
     * @return ListaAnoModelo - retorna a lista populada
    */
    public ListaAnoModelo montarListaAnoModelo(){
        ListaAnoModelo lista = new ListaAnoModelo();
        ManipJSON manip = new ManipJSON();
        lista = manip.ler(lista);
        return lista;
    }
    /** Metodo que monta a lista com o json carregado
     * @return ListaCarro - retorna a lista populada
    */
    public ListaCarro montarListaCarro(){
        ListaCarro lista = new ListaCarro();
        ManipJSON manip = new ManipJSON();
        lista = manip.ler(lista);
        return lista;
    }
    /** Metodo que monta um DefaultComboBoxModel com a lista de Marca
     * @return DefaultComboBoxModel - retorna o modelo populado
    */
    public DefaultComboBoxModel comboBoxListaMarca(){
         DefaultComboBoxModel cbm = new DefaultComboBoxModel();
         ListaMarca lista = new ListaMarca();
         ManipJSON manip = new ManipJSON();
        lista = manip.ler(lista);
        for (Marca m: lista.getLista()) { 
               //Object[] linha = {c.getNome()};
               cbm.addElement(m.getName());
        }    
        return cbm;
    }
    /** Metodo que monta um DefaultComboBoxModel com a lista de Modelo
     * @return DefaultComboBoxModel - retorna o modelo populado
    */
    public DefaultComboBoxModel comboBoxListaModelo(){
         DefaultComboBoxModel cbm = new DefaultComboBoxModel();
         ListaModelo lista = new ListaModelo();
         ManipJSON manip = new ManipJSON();
        lista = manip.ler(lista);
        for (Modelo m: lista.getLista()) { 
               //Object[] linha = {c.getNome()};
               cbm.addElement(m.getName());
        }    
        return cbm;
    }
    /** Metodo que monta um DefaultComboBoxModel com a lista de AnoModelo
     * @return DefaultComboBoxModel - retorna o modelo populado
    */
    public DefaultComboBoxModel comboBoxListaAnoModelo(){
         DefaultComboBoxModel cbm = new DefaultComboBoxModel();
         ListaAnoModelo lista = new ListaAnoModelo();
         ManipJSON manip = new ManipJSON();
        lista = manip.ler(lista);
        for (AnoModelo m: lista.getLista()) { 
               //Object[] linha = {c.getNome()};
               cbm.addElement(m.getName());
        }    
        return cbm;
    }
}
