package trainsimulation.response;

import java.util.List;

public final class GameResponse {
    private List<EntityResponse> entities;

    public GameResponse(List<EntityResponse> entities) {
        this.entities = entities;
    }

    public List<EntityResponse> getEntities() {
        return entities;
    }
}
