
package DTO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/** Classe de leitura de arquivos, utilizado nas classes de manipulação de dados
*/

public class LeituraArquivos {
    /** Metodo para leitura de arquivos
     * @param caminho String - caminho do arquivo para leitura
     * @return String - com o valor dentro do arquivo
    */
    public static String read (String caminho) {
		String txt = "";
		try {
			FileReader file = new FileReader(caminho);
                        BufferedReader br = new BufferedReader(file);
			String s;
			while ((s = br.readLine()) != null){
				if (txt.equals("")) {
					txt = s;
				}else {
					txt = txt + "\n" + s;
				}
			}
			file.close();
		}catch (IOException f){
			f.printStackTrace();
		}
		return txt;
	}
    /** Metodo para escrever em algum arquivo
     * @param txt String - caminho do arquivo para escrever
     * @param caminho String - caminho do arquivo que se quer escrever
    */
    public static void write (String txt, String caminho) {
		try {
			FileWriter file = new FileWriter(caminho);
			file.write(txt);
			file.flush();
			file.close();
		}catch (IOException f){
			f.printStackTrace();
		}
	}
}
