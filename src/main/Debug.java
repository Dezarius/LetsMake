/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author Jan
 */
public class Debug {
    
    private static boolean isOn = false; 
    
    public static void drawDebug(GameContainer container, StateBasedGame game, Graphics g) {
        if(isOn) {
            g.drawString("DEBUGMODE " , 5, 5);
            g.drawString("FPS: " + container.getFPS(), 5, 20);
        }
    }
    
    public static void toggleDebug() {
        isOn = !isOn;
    }
}
