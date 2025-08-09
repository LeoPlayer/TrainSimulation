package trainsimulation.entities;

public abstract class Entity {
    private String id;

    public Entity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
