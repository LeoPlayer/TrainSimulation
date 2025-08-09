package trainsimulation.response;

import trainsimulation.entities.Entity;
import trainsimulation.utility.ClassGetter;

public class EntityResponse {
    private String id;
    private String type;

    public EntityResponse(String id, Entity entity) {
        this.id = id;
        type = ClassGetter.getName(entity);
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
