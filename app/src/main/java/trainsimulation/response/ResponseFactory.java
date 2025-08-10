package trainsimulation.response;

import trainsimulation.game.Simulator;

public class ResponseFactory {
    public static GameResponse getResponse(Simulator sim) {
        return new GameResponse(
            sim.getEntities().stream().map(s -> new EntityResponse(s.getId(), s)).toList()
        );
    }
}
