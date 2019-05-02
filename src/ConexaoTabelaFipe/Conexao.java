
package ConexaoTabelaFipe;

import BO.ListaAnoModelo;
import BO.ListaCarro;
import BO.ListaMarca;
import BO.ListaModelo;
import BO.ManipJSON;
import DTO.Marca;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Scanner;

/** Classe que faz a conexão com o web service
    */

public class Conexao {
    private static String URL = "http://fipeapi.appspot.com/api/1/";
    /** Metodo que converte InputStream para String
     * @param inputstream InputStream - InputStream para ser convertido
     * @return String - valor da conversão
    */
    public String convertStreamToString(InputStream inputstream) {
        Scanner s = new Scanner(inputstream).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }
    /** Metodo que verifica se a conexão conseque ser feita
     * @param tipo String - pode ser carros, motos ou caminhoes
     * @return boolean - se a conexão pode ser feita ou não
    */
    public boolean verificaMarca(String tipo) {
        try {
            URL url = new URL(this.URL + tipo+ "/marcas.json");
            URLConnection conn = url.openConnection();
            conn.connect();
            return true;
            
        } catch(IOException e) {
            return false;
        }
    }
    /** Metodo que popula o json com as marcas
     * @param tipo String - pode ser carros, motos ou caminhoes
    */
    public void carregaMarcas(String tipo){
        try{
            ManipJSON manip = new ManipJSON();
            String URL = this.URL + tipo+ "/marcas.json";
            URL url = new URL(URL);
            
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            InputStream content = connection.getInputStream();
            
            String marcas = convertStreamToString(content);
            System.out.println(marcas);
            Gson gson = new Gson();
            gson.toJson(marcas);
            ListaMarca lista = new ListaMarca();
            manip.gravar(lista, marcas);
            
        } catch(MalformedURLException m){
            m.printStackTrace();
        } catch(IOException io){
            io.printStackTrace();
        }
    }
    /** Metodo que verifica se a conexão conseque ser feita
     * @param tipo String - pode ser carros, motos ou caminhoes
     * @param idMarca String - id da marca que se quer verificar
     * @return boolean - se a conexão pode ser feita ou não
    */
    public boolean verificaModelo(String tipo, String idMarca) {
        try {
            URL url = new URL(this.URL + tipo+ "/veiculos/" + idMarca + ".json");
            URLConnection conn = url.openConnection();
            conn.connect();
            return true;
            
        } catch(IOException e) {
            return false;
        }
    }
    /** Metodo que popula o json com os modelos
     * @param tipo String - pode ser carros, motos ou caminhoes
     * @param idMarca String - id da marca que se quer verificar
    */
    public void carregaModelo(String tipo, String idMarca){
        try{
            ManipJSON manip = new ManipJSON();
            String URL = this.URL + tipo+ "/veiculos/" + idMarca + ".json";
            URL url = new URL(URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream content = connection.getInputStream();
            String modelos = convertStreamToString(content);
            Gson gson = new Gson();
            gson.toJson(modelos);
            ListaModelo lista = new ListaModelo();
            manip.gravar(lista, modelos);
        } catch(MalformedURLException m){
            m.printStackTrace();
        } catch(IOException io){
            io.printStackTrace();
        }
    }
    /** Metodo que verifica se a conexão conseque ser feita
     * @param tipo String - pode ser carros, motos ou caminhoes
     * @param idMarca String - id da marca que se quer verificar
     * @param codCarro String - codigo do carro que se quer verificar
     * @return boolean - se a conexão pode ser feita ou não
    */
        public boolean verificaAnoModelo(String tipo, String idMarca, String codCarro) {
        try {
            URL url = new URL(this.URL + tipo+ "/veiculo/" + idMarca + "/" + codCarro + ".json");
            URLConnection conn = url.openConnection();
            conn.connect();
            return true;
            
        } catch(IOException e) {
            return false;
        }
    }
    /** Metodo que popula o json com os modelos
     * @param tipo String - pode ser carros, motos ou caminhoes
     * @param idMarca String - id da marca que se quer verificar
     * @param codCarro String - codigo do carro que se quer verificar
    */
     public void carregaAnoModelo(String tipo, String idMarca, String codCarro){
        try{
            ManipJSON manip = new ManipJSON();
            String URL = this.URL + tipo+ "/veiculo/" + idMarca + "/" + codCarro + ".json";
            URL url = new URL(URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream content = connection.getInputStream();
            String anoModelos = convertStreamToString(content);
            Gson gson = new Gson();
            gson.toJson(anoModelos);
            ListaAnoModelo lista = new ListaAnoModelo();
            manip.gravar(lista, anoModelos);
        } catch(MalformedURLException m){
            m.printStackTrace();
        } catch(IOException io){
            io.printStackTrace();
        }
    }
     /** Metodo que verifica se a conexão conseque ser feita
     * @param tipo String - pode ser carros, motos ou caminhoes
     * @param idMarca String - id da marca que se quer verificar
     * @param codCarro String - codigo do carro que se quer verificar
     * @param anoCarro String - ano do carro que se quer verificar
     * @return boolean - se a conexão pode ser feita ou não
    */
      public boolean verificaCarro(String tipo, String idMarca, String codCarro, String anoCarro) {
        try {
            URL url = new URL(this.URL + tipo+ "/veiculo/" + idMarca + "/" + codCarro + "/" + anoCarro + ".json");
            URLConnection conn = url.openConnection();
            conn.connect();
            return true;
        } catch(IOException e) {
            return false;
        }
    }
     /** Metodo que popula o jsno com os carros
     * @param tipo String - pode ser carros, motos ou caminhoes
     * @param idMarca String - id da marca que se quer verificar
     * @param codCarro String - codigo do carro que se quer verificar
     * @param anoCarro String - ano do carro que se quer verificar
    */
      public void carregaCarro(String tipo, String idMarca, String codCarro, String anoCarro){
        try{
            ManipJSON manip = new ManipJSON();
            String URL = this.URL + tipo+ "/veiculo/" + idMarca + "/" + codCarro + "/" + anoCarro + ".json";
            URL url = new URL(URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream content = connection.getInputStream();
            String carros = convertStreamToString(content);
            Gson gson = new Gson();
            gson.toJson(carros);
            ListaCarro lista = new ListaCarro();
            manip.gravar(lista, carros);
        } catch(MalformedURLException m){
            m.printStackTrace();
        } catch(IOException io){
            io.printStackTrace();
        }
    }
}
