/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitys;

import main.Utilities;
import map.MapManager;
import config.Config;

/**
 *
 * @author Jan
 */
public class Player {

    private double x, y;
    private double velX, velY;
    private int jumpCounter = 0;

    public Player() {
        x = 32;
        y = 32;
    }

    public void move(int delta) {
        if (collisionTop(delta)) {
            velY = 0;
        }
        if (!collisionBottum(delta)) {
            velY = Utilities.gravity(velY, delta);
        } else {
            velY = 0;
            if (MapManager.collsion(x + 2, y + Config.playerHeight) || MapManager.collsion(x - 2 + Config.playerWidth, y + Config.playerHeight)) {
                y = y - y % Config.playerHeight;
            } else  {
                y = y + Config.playerHeight - y % Config.playerHeight + 1;
            }
        }

        if (collisionLeft(delta)) {
            velX = 0;
        } else if (collisionRight(delta)) {
            velX = 0;

        }

        y = y + velY * delta;
        x = x + velX * delta;

    }

    public void jump() {
        if (jumpCounter < Config.jumpCount) {
            velY = -0.5;
            jumpCounter++;
        }
    }

    public void moveSidewards(boolean right, int delta) {
        if (right && !collisionRight(delta)) {
            if (velX < 0.35) {
                velX = velX + 0.0007 * delta;
            } else {
                velX = 0.35;
            }
        } else if (!collisionLeft(delta)) {
            if (velX > -0.35) {
                velX = velX - 0.0007 * delta;
            } else {
                velX = -0.35;
            }
        }
    }

    public void slowSidewards(int delta) {
        if (velX > 0 && collisionBottum(delta)) {
            if (velX - 0.001 * delta > 0) {
                velX = velX - 0.001 * delta;
            } else {
                velX = 0;
            }
        } else if (velX < 0 && collisionBottum(delta)) {
            if (velX + 0.001 * delta < 0) {
                velX = velX + 0.001 * delta;
            } else {
                velX = 0;
            }
        }
        if (velX > 0 && !collisionBottum(delta)) {
            if (velX - 0.00025 * delta > 0) {
                velX = velX - 0.00025 * delta;
            } else {
                velX = 0;
            }
        } else if (velX < 0 && !collisionBottum(delta)) {
            if (velX + 0.00025 * delta < 0) {
                velX = velX + 0.00025 * delta;
            } else {
                velX = 0;
            }
        }
    }

    public boolean collisionBottum(int delta) {
        if (MapManager.collsion(x + 2, y + Config.playerHeight + velY * delta)
                || MapManager.collsion(x + Config.playerWidth - 2, y + Config.playerHeight + velY * delta)) {
            jumpCounter = 0;
            return true;
        }
        return false;
    }

    public boolean collisionTop(int delta) {
        if (MapManager.collsion(x + 2, y + velY * delta)
                || MapManager.collsion(x + Config.playerWidth - 2, y + velY * delta)) {
            return true;
        }
        return false;
    }

    public boolean collisionLeft(int delta) {
        if (MapManager.collsion(x + velX * delta, y + 2)
                || MapManager.collsion(x + velX * delta, y  + Config.playerHeight - 10)) {
            return true;
        }
        return false;
    }

    public boolean collisionRight(int delta) {
        if (MapManager.collsion(x + velX * delta + Config.playerWidth, y  + 2)
                || MapManager.collsion(x + velX * delta + Config.playerWidth, y + Config.playerHeight - 10)) {
            return true;
        }
        return false;
    }

    public void reset() {
        velX = 0;
        velY = 0;
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

    public double getVelX() {
        return velX;
    }

    public double getVelY() {
        return velY;
    }

    public void setVelXTtal(double velXTotal) {
        velX = velXTotal;
    }

    public void setVelYTotal(double velYTotal) {
        velY = velYTotal;
    }
}
