package trainsimulation.game;

import java.util.List;

import org.json.JSONObject;

import trainsimulation.entities.Entity;
import trainsimulation.entities.EntityFactory;

public class Simulator {
    private Map map;

    public Simulator() {
        map = new Map();
    }

    public void addEntity(JSONObject obj) {
        map.addEntity(EntityFactory.create(obj));
    }

    public void modifyLine(String id, List<String> newRoute) { };

    public void simulate(int seconds) { };

    public void breakTrain(String id, int seconds) { };

    public void removeEntity(Entity entity) {
        map.removeEntity(entity);
    }

    public void removeEntity(String id) {
        map.removeEntity(id);
     };

    // Getters
    public Map getMap() {
        return map;
    }

    public List<Entity> getEntities() {
        return map.getEntities();
    }

    public <T extends Entity> List<T> getEntities(Class<T> t) {
        return map.getEntities().stream().filter(e -> t.isInstance(e)).map(e -> t.cast(e)).toList();
    }
}
