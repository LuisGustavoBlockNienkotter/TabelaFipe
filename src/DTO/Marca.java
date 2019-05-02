
package DTO;

/** Classes para objetos do tipo Marca, que contem as variaveis name, fipe_name, key e id
*/

public class Marca {
   
    private String name;
    private String fipe_name;
    private String key;
    private int id;

    public Marca(String key, int id, String fipe_name, String name) {
        this.key = key;
        this.id = id;
        this.fipe_name = fipe_name;
        this.name = name;
    }
    public Marca() {
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFipe_name() {
        return fipe_name;
    }
    public void setFipe_name(String fipe_name) {
        this.fipe_name = fipe_name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Marca{" + "key=" + key + ", id=" + id + ", fipe_name=" + fipe_name + ", name=" + name + '}';
    }
    
    
}
