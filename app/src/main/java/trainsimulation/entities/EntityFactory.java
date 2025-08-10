package trainsimulation.entities;

import org.json.JSONObject;

import trainsimulation.entities.station.PassengerStation;
import trainsimulation.utility.Position;

public class EntityFactory {
    public static Entity create(JSONObject obj) {
        String id = obj.getString("id");
        return switch (obj.getString("type")) {
            case "Passenger Station" -> new PassengerStation(
                id,
                getPosition(obj),
                obj.optInt("pax", PassengerStation.PAX),
                obj.optInt("transfer", PassengerStation.TRANSFER_TIME)
                );
            default -> null;
        };
    }

    private static Position getPosition(JSONObject obj) {
        return new Position(obj.getInt("x"), obj.getInt("y"));
    }
}
