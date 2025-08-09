package trainsimulation.entities.route;

import java.util.List;

import trainsimulation.entities.Entity;

public class Route extends Entity {
    private List<Object> route;
    // create a .isStation in Station and Train

    public Route(String id, List<Object> route) {
        super(id);
        this.route = route;
    }
}
