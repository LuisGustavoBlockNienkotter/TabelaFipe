
package DTO;

/** Classes para objetos do tipo Carro, que contem as variaveis name, marca, key, id,
 *  ano_modelo, preco, veiculo, combustivel, referencia e fipe_codigo
*/

public class Carro {
    private String id;
    private String marca;
    private String ano_modelo;
    private String name;
    private String veiculo;
    private String preco;
    private String combustivel;
    private String referencia;
    private String fipe_codigo;
    private String key;

    public Carro(String id, String marca, String ano_modelo, String name, String veiculo, String preco, 
                 String combustivel, String referencia, String fipe_codigo, String key) {
        this.id = id;
        this.marca = marca;
        this.ano_modelo = ano_modelo;
        this.name = name;
        this.veiculo = veiculo;
        this.preco = preco;
        this.combustivel = combustivel;
        this.referencia = referencia;
        this.fipe_codigo = fipe_codigo;
        this.key = key;
    }
    public Carro() {
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getAno_modelo() {
        return ano_modelo;
    }
    public void setAno_modelo(String ano_modelo) {
        this.ano_modelo = ano_modelo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
    public String getPreco() {
        return preco;
    }
    public void setPreco(String preco) {
        this.preco = preco;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public String getFipe_codigo() {
        return fipe_codigo;
    }
    public void setFipe_codigo(String fipe_codigo) {
        this.fipe_codigo = fipe_codigo;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Carro{" + "id=" + id + ", marca=" + marca + ", ano_modelo=" + ano_modelo + ", name=" + name + ", veiculo=" + veiculo + ", preco=" + preco + ", combustivel=" + combustivel + ", referencia=" + referencia + ", fipe_codigo=" + fipe_codigo + ", key=" + key + '}';
    }
   
    
}
