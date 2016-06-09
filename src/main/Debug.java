/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.StateBasedGame;
import entitys.EntityManager;

/**
 *
 * @author Jan
 */
public class Debug {
    
    private static boolean isOn = false; 
    
    public static void drawDebug(GameContainer container, StateBasedGame game, Graphics g, int delta) {
        if(isOn) {
            g.drawString("DEBUGMODE " , 5, 5);
            g.drawString("FPS: " + container.getFPS(), 5, 20);
            g.drawString("PlayerCords: x:" + EntityManager.player.getX() + " y:" + EntityManager.player.getY(),5, 35);
            g.drawString("CollisionTopBot: |" + EntityManager.player.collisionTop(delta) +  "|" + EntityManager.player.collisionBottum( delta) + "|", 5, 50);
            g.drawString("CollisionLeft: |" + EntityManager.player.collisionLeft(delta) + "|", 5 , 65);
            g.drawString("CollisionRight: |" + EntityManager.player.collisionRight(delta) + "|",5, 80);
        }
    }
    
    public static void toggleDebug() {
        isOn = !isOn;
    }
}
