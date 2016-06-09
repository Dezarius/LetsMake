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
public class EntityManager {
    
    public static Player player = new Player();
    
    public static void move(int delta) {
        player.move(delta);
    }
    
}
