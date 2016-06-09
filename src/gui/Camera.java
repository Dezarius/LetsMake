/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entitys.EntityManager;
import main.Debug;
import map.MapManager;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author Jan
 */
public class Camera {
    private static int delta = 0;
    
    public void updatedelta(int delta) {
        this.delta = delta;
    }
    
    public static void drawPlayer() {
        Resources.getImage("player").draw((int) EntityManager.player.getX(), (int) EntityManager.player.getY());
    }
    
    public static void drawMap() {
        MapManager.render(0, 0, 0);
    }
    
    public static void drawOverlay() {
        Resources.getImage("mapOverlay").draw(0, 0);
    }
    
    public static void drawDebug(GameContainer container, StateBasedGame game, Graphics g) {
        Debug.drawDebug(container, game, g, delta);
    }
    
    
}
