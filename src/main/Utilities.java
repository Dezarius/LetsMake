/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import org.newdawn.slick.GameContainer;

/**
 *
 * @author Jan
 */
public class Utilities {
    
    public static double gravity(double velY, int delta) {
        
        if(velY < 1) {
            velY += 0.0008 * delta;
        }
        else {
            velY = 1;
        }
        
        return velY;
    }
}
