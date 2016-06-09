/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import entitys.EntityManager;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

/**
 *
 * @author Jan
 */
public class MapManager {

    public static Map map = null;

    public static void loadMap(int id) throws SlickException {
        map = new Map(id);
    }

    public static void reloadCurrentMap() throws SlickException {
        if (map.currentMapID != -1) {
            map = new Map(map.currentMapID);
            EntityManager.player.reset();
        }
    }

    public static void render(int x, int y) {
        if (map != null) {
            map.render(x, y);
        }
    }

    public static void render(int x, int y, int layer) {
        if (map != null) {
            map.render(x, y, layer);
        }
    }

    public static boolean collsion(double x, double y) {
        return map.collsion(x, y);
    }

}
