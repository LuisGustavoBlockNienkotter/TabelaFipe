
package DTO;

/** Classes para objetos do tipo AnoModelo, que contem as variaveis name, fipe_codigo, key, id e 
*/

public class AnoModelo {
        private String fipe_codigo;
        private String name;
        private String key;
        private String veiculo;
        private String id;

    public AnoModelo(String fipe_codigo, String name, String key, String veiculo, String id) {
        this.fipe_codigo = fipe_codigo;
        this.name = name;
        this.key = key;
        this.veiculo = veiculo;
        this.id = id;
    }
    public AnoModelo() {
    }

    public String getFipe_codigo() {
        return fipe_codigo;
    }
    public void setFipe_codigo(String fipe_codigo) {
        this.fipe_codigo = fipe_codigo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AnoModelo{" + "fipe_codigo=" + fipe_codigo + ", name=" + name + ", key=" + key + ", veiculo=" + veiculo + ", id=" + id + '}';
    }
    
    
}
