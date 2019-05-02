
package DTO;

/** Classes para objetos do tipo Modelo, que contem as variaveis name, fipe_name, key e id
*/

public class Modelo {
    private String key;
    private String name;
    private String id;
    private String fipe_name;

    public Modelo(String key, String name, String id, String fipe_name) {
        this.key = key;
        this.name = name;
        this.id = id;
        this.fipe_name = fipe_name;
    }
    public Modelo() {
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFipe_name() {
        return fipe_name;
    }
    public void setFipe_name(String fipe_name) {
        this.fipe_name = fipe_name;
    }

    @Override
    public String toString() {
        return "Modelo{" + "key=" + key + ", name=" + name + ", id=" + id + ", fipe_name=" + fipe_name + '}';
    }
    
    
    
}
