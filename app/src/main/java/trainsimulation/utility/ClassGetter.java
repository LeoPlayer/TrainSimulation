package trainsimulation.utility;

import trainsimulation.entities.Entity;
import trainsimulation.entities.station.Station;

public class ClassGetter {
    public static String getName(Entity entity) {
        if (entity instanceof Station) {
            return "Station";
        }

        return "Class not registered in ClassGetter";
    }
}
