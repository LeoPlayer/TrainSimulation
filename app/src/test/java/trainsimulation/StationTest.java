package trainsimulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import trainsimulation.game.Controller;

public class StationTest {
    @Test
    @Tag("Station-1")
    @DisplayName("Check passenger station is created")
    public void createStation() {
        Controller controller = new Controller();

        controller.addEntity(Map.of(
            "id", "pas-station-1",
            "type", "Passenger Station",
            "x", "1",
            "y", "3"
        ));

        assertEquals("pas-station-1", ResponseHandler.getEntities(controller, "Passenger Station").get(0).getId());
    }
}
