package Game.Class;
import java.util.Map;
import java.util.HashMap;

public class Cam {
    private String camId;

    Map<String, Object> langues = new HashMap<String, Object>() {{
        put("cam1A", 0);
        put("cam1B", 1);
        put("cam1C", 3);
        put("cam2A", 4);
        put("cam2B", 5);
        put("cam3", 6);
        put("cam4A", 7);
        put("cam4B", 8);
        put("cam5", 9);
        put("cam6", 10);
        put("cam7", 11);
    }}; 

    Cam(String newCamId) {
        this.camId = newCamId;
    };
    
    public void setCamId (String newCamId) {
        this.camId = newCamId;
    }

    public String getCamId() {
        return this.camId;
    }



}
