package trainsimulation;

import java.util.List;

import trainsimulation.game.Controller;
import trainsimulation.response.EntityResponse;

public class ResponseHandler {
    public static List<EntityResponse> getEntities(Controller ctrl) {
        return ctrl.getResponse().getEntities();
    }

    public static List<EntityResponse> getEntities(Controller ctrl, String type) {
        return ctrl.getResponse().getEntities().stream().filter(r -> r.getType().equals(type)).toList();
    }
}
