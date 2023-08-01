
package satelier.estacionamientov2.logic.models;


public class VehicleType {
    
    private int id;
    private String type;
    private float value;

    public VehicleType() {
    }

    public VehicleType(int id, String type, float value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
    
    
    
}
