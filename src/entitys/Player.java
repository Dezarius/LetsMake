/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitys;

/**
 *
 * @author Jan
 */
public class Player {
    private double x, y;
    
    public Player() {
       x = 32;
       y = 32;
    }
    
    public void setXRel(double xRel) {
        x += xRel;
    }
    
    public void setXTotal(double xTot) {
        x = xTot;
    }
    
    public double getX() {
        return x;
    }
    
    public void setYRel(double yRel) {
        y += yRel;
    }
    
    public void setYTotal(double yTot) {
        y = yTot;
    }
    
    public double getY() {
        return y;
    }

    
}
