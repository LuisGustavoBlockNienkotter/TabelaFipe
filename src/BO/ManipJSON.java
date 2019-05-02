
package BO;

import DTO.AnoModelo;
import DTO.Carro;
import DTO.LeituraArquivos;
import DTO.Marca;
import DTO.Modelo;
import com.google.gson.Gson;
import java.io.InputStream;
import java.io.StringWriter;
import sun.misc.IOUtils;

/** Metodo que retorna o nome do Carro pelo id dele
    */

public class ManipJSON {
     final static String LOCALHOST = "src/Persistencia/";
     /** Metodo que salva um arquivo json apenas com uma string 
      * @param lista ListaMarca - para identificar o tipo de lista que se vai salvar
     * @param marcas String - String que se vai salvar
     * @return boolean - se salvou ou não
    */
    public boolean gravar(ListaMarca lista, String marcas){
        String NOMEDOARQUIVO = "ListaMarca";
        String caminho = LOCALHOST + NOMEDOARQUIVO + ".json";
        //String jsonAtendimento = new Gson().toJson(marcas);
        LeituraArquivos.write("{\"lista\":" + marcas + "}", caminho);
        if(LeituraArquivos.read(caminho).equals("")){
            return false;
        }
        return true;
    }
    /** Metodo que salva um arquivo json passando a classe que se quer salvar
     * @param lista ListaMarca - Lista que se quer salvar
     * @return boolean - se salvou ou não
    */
     public boolean gravar(ListaMarca lista){
        String NOMEDOARQUIVO = "ListaMarca";
        String caminho = LOCALHOST + NOMEDOARQUIVO + ".json";
        String jsonAtendimento = new Gson().toJson(lista);
        if(lista == null){
            LeituraArquivos.write("", caminho);
            return true;
        }
        LeituraArquivos.write(jsonAtendimento, caminho);
        if(LeituraArquivos.read(caminho).equals("")){
            return false;
        }
        return true;
    }
     /** Metodo que lê um arquivo json
     * @param lista ListaMarca - lista em que se vai salvar os dados lidos
     * @return ListaMarca - a classe com os dados salvos
    */
    public ListaMarca ler(ListaMarca lista){
        String NOMEDOARQUIVO = "ListaMarca";
        String caminho = LOCALHOST + NOMEDOARQUIVO + ".json";   
        if(!LeituraArquivos.read(caminho).equals("")) {           
            lista = new Gson().fromJson(LeituraArquivos.read(caminho), ListaMarca.class);
	}
        return lista;             
    }
    /** Metodo que salva um arquivo json apenas com uma string 
      * @param lista ListaModelo - para identificar o tipo de lista que se vai salvar
     * @param modelo String - String que se vai salvar
     * @return boolean - se salvou ou não
    */
     public boolean gravar(ListaModelo lista, String modelo){
        String NOMEDOARQUIVO = "ListaModelo";
        String caminho = LOCALHOST + NOMEDOARQUIVO + ".json";
        String jsonAtendimento = new Gson().toJson(modelo);
        LeituraArquivos.write("{\"lista\":" + modelo + "}", caminho);
        if(LeituraArquivos.read(caminho).equals("")){
            return false;
        }
        return true;
    }
     /** Metodo que salva um arquivo json passando a classe que se quer salvar
     * @param lista ListaModelo - Lista que se quer salvar
     * @return boolean - se salvou ou não
    */
      public boolean gravar(ListaModelo lista){
        String NOMEDOARQUIVO = "ListaModelo";
        String caminho = LOCALHOST + NOMEDOARQUIVO + ".json";
        String jsonAtendimento = new Gson().toJson(lista);
        if(lista == null){
            LeituraArquivos.write("", caminho);
            return true;
        }
        LeituraArquivos.write(jsonAtendimento, caminho);
        if(LeituraArquivos.read(caminho).equals("")){
            return false;
        }
        return true;
    }
      /** Metodo que lê um arquivo json
     * @param lista ListaModelo - lista em que se vai salvar os dados lidos
     * @return ListaModelo - a classe com os dados salvos
    */
     public ListaModelo ler(ListaModelo lista){
        String NOMEDOARQUIVO = "ListaModelo";
        String caminho = LOCALHOST + NOMEDOARQUIVO + ".json";   
        if(!LeituraArquivos.read(caminho).equals("")) {
            lista = new Gson().fromJson(LeituraArquivos.read(caminho), ListaModelo.class);
	}
        return lista;             
    }
     /** Metodo que salva um arquivo json apenas com uma string 
      * @param lista ListaAnoModelo - para identificar o tipo de lista que se vai salvar
     * @param modelo String - String que se vai salvar
     * @return boolean - se salvou ou não
    */
     public boolean gravar(ListaAnoModelo lista, String modelo){
        String NOMEDOARQUIVO = "ListaAnoModelo";
        String caminho = LOCALHOST + NOMEDOARQUIVO + ".json";
        String jsonAtendimento = new Gson().toJson(modelo);
        LeituraArquivos.write("{\"lista\":" + modelo + "}", caminho);
        if(LeituraArquivos.read(caminho).equals("")){
            return false;
        }
        return true;
    }
     /** Metodo que salva um arquivo json passando a classe que se quer salvar
     * @param lista ListaAnoModelo - Lista que se quer salvar
     * @return boolean - se salvou ou não
    */
     public boolean gravar(ListaAnoModelo lista){
        String NOMEDOARQUIVO = "ListaAnoModelo";
        String caminho = LOCALHOST + NOMEDOARQUIVO + ".json";
        String jsonAtendimento = new Gson().toJson(lista);
        if(lista == null){
            LeituraArquivos.write("", caminho);
            return true;
        }
        LeituraArquivos.write(jsonAtendimento, caminho);
        if(LeituraArquivos.read(caminho).equals("")){
            return false;
        }
        return true;
    }
     /** Metodo que lê um arquivo json
     * @param lista ListaAnoModelo - lista em que se vai salvar os dados lidos
     * @return ListaAnoModelo - a classe com os dados salvos
    */
     public ListaAnoModelo ler(ListaAnoModelo lista){
        String NOMEDOARQUIVO = "ListaAnoModelo";
        String caminho = LOCALHOST + NOMEDOARQUIVO + ".json";   
        if(!LeituraArquivos.read(caminho).equals("")) {            
            lista = new Gson().fromJson(LeituraArquivos.read(caminho), ListaAnoModelo.class);
	}
        return lista;             
    }
     /** Metodo que salva um arquivo json apenas com uma string 
      * @param lista ListaCarro - para identificar o tipo de lista que se vai salvar
     * @param carro String - String que se vai salvar
     * @return boolean - se salvou ou não
    */
     public boolean gravar(ListaCarro lista, String carro){
        String NOMEDOARQUIVO = "ListaCarro";
        String caminho = LOCALHOST + NOMEDOARQUIVO + ".json";
        String jsonAtendimento = new Gson().toJson(carro);
        LeituraArquivos.write("{\"lista\":[" + carro + "]}", caminho);
        if(LeituraArquivos.read(caminho).equals("")){
            return false;
        }
        return true;
    }
     /** Metodo que salva um arquivo json passando a classe que se quer salvar
     * @param lista ListaCarro - Lista que se quer salvar
     * @return boolean - se salvou ou não
    */
     public boolean gravar(ListaCarro lista){
        String NOMEDOARQUIVO = "ListaCarro";
        String caminho = LOCALHOST + NOMEDOARQUIVO + ".json";
        String jsonAtendimento = new Gson().toJson(lista);
        if(lista == null){
            LeituraArquivos.write("", caminho);
            return true;
        }
        LeituraArquivos.write(jsonAtendimento, caminho);
        if(LeituraArquivos.read(caminho).equals("")){
            return false;
        }
        return true;
    }
     /** Metodo que lê um arquivo json
     * @param lista ListaCarro - lista em que se vai salvar os dados lidos
     * @return ListaCarro - a classe com os dados salvos
    */
     public ListaCarro ler(ListaCarro lista){
        String NOMEDOARQUIVO = "ListaCarro";
        String caminho = LOCALHOST + NOMEDOARQUIVO + ".json";   
        if(!LeituraArquivos.read(caminho).equals("")) {
            lista = new Gson().fromJson(LeituraArquivos.read(caminho), ListaCarro.class);
	}
        return lista;             
    }
}
