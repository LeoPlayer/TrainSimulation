package trainsimulation.game;

import java.util.Map;

import org.json.JSONObject;

import trainsimulation.response.GameResponse;
import trainsimulation.response.ResponseFactory;

public class Controller {
    private Simulator game;
    public Controller() {
        // add option to make a prefab map
        game = new Simulator();
    }

    public GameResponse getResponse() {
        return ResponseFactory.getResponse(game);
    }

    public void addEntity(JSONObject obj) {
        game.addEntity(obj);
    }

    public void addEntity(Map<String, String> parameters) {
        game.addEntity(new JSONObject(parameters));
    }
}
