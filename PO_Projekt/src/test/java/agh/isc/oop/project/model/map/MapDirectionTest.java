package agh.isc.oop.project.model.map;

import agh.isc.oop.project.model.util.Vector2d;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MapDirectionTest {

    @Test
    void testTurnBy(){
            assertEquals(MapDirection.NORTH, MapDirection.NORTH.turnBy(0));
            assertEquals(MapDirection.EAST, MapDirection.EAST.turnBy(0));
            assertEquals(MapDirection.SOUTHWEST, MapDirection.SOUTHWEST.turnBy(0));

            assertEquals(MapDirection.EAST, MapDirection.NORTH.turnBy(2));
            assertEquals(MapDirection.SOUTH, MapDirection.EAST.turnBy(2));
            assertEquals(MapDirection.NORTHWEST, MapDirection.SOUTHWEST.turnBy(2));

            assertEquals(MapDirection.NORTH, MapDirection.NORTH.turnBy(8));
            assertEquals(MapDirection.EAST, MapDirection.NORTH.turnBy(10));
            assertEquals(MapDirection.NORTHWEST, MapDirection.NORTHWEST.turnBy(16));
    }

    @Test
    void testReverse() {
        assertEquals(MapDirection.SOUTH, MapDirection.NORTH.reverse());
        assertEquals(MapDirection.SOUTHWEST, MapDirection.NORTHEAST.reverse());
        assertEquals(MapDirection.WEST, MapDirection.EAST.reverse());
        assertEquals(MapDirection.NORTHWEST, MapDirection.SOUTHEAST.reverse());
        assertEquals(MapDirection.NORTH, MapDirection.SOUTH.reverse());
        assertEquals(MapDirection.NORTHEAST, MapDirection.SOUTHWEST.reverse());
        assertEquals(MapDirection.EAST, MapDirection.WEST.reverse());
        assertEquals(MapDirection.SOUTHEAST, MapDirection.NORTHWEST.reverse());
    }

    @Test
    void testToUnitVector() {
        assertEquals(new Vector2d(0, 1), MapDirection.NORTH.toUnitVector());
        assertEquals(new Vector2d(1, 1), MapDirection.NORTHEAST.toUnitVector());
        assertEquals(new Vector2d(1, 0), MapDirection.EAST.toUnitVector());
        assertEquals(new Vector2d(1, -1), MapDirection.SOUTHEAST.toUnitVector());
        assertEquals(new Vector2d(0, -1), MapDirection.SOUTH.toUnitVector());
        assertEquals(new Vector2d(-1, -1), MapDirection.SOUTHWEST.toUnitVector());
        assertEquals(new Vector2d(-1, 0), MapDirection.WEST.toUnitVector());
        assertEquals(new Vector2d(-1, 1), MapDirection.NORTHWEST.toUnitVector());
    }
}
