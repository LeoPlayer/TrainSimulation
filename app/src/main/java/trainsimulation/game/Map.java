package trainsimulation.game;

import java.util.ArrayList;
import java.util.List;

import trainsimulation.entities.Entity;

public class Map {
    private List<Entity> entities = new ArrayList<Entity>();

    public void addEntity(Entity e) {
        entities.add(e);
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void removeEntity(Entity entity) {
        entities = entities.stream().filter(e -> !e.getId().equals(entity.getId())).toList();
    }

    public void removeEntity(String id) {
        entities = entities.stream().filter(e -> !e.getId().equals(id)).toList();
    }
}
