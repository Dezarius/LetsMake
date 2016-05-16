/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import entitys.EntityManager;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;
import config.Config;

/**
 *
 * @author Jan
 */
public class Map {
    
    private final String maps[] = {
        "/res/maps/map01.tmx" //0
    };
    
    private static TiledMap currentMap = null;
    
    public Map(int id) throws SlickException {
       loadMap(id); 
    }
    
    private void loadMap(int id) throws SlickException {
        currentMap = new TiledMap(maps[id]);
        for(int i = 0; i < currentMap.getWidth(); i++) {
            for(int j = 0; j < currentMap.getHeight(); j++) {
                if(currentMap.getTileId(i, j, currentMap.getLayerIndex("interactives")) == 100) {
                    EntityManager.player.setXTotal(i * Config.tileSize);
                    EntityManager.player.setYTotal(j * Config.tileSize);
                }
            }
        }
    }
    
    public void render(int x, int y) {
        currentMap.render(x, y);
    }
    
    public void render(int x, int y, int layer) {
        currentMap.render(x, y, layer);
    }
}
