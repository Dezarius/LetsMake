/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package states;

import gui.Camera;
import gui.Resources;
import input.Keyboard;
import map.Map;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author Jan
 */
public class MenuState extends BasicGameState {
    
    @Override
    public int getID() {
        return 0;
    }

    @Override
    public void init(GameContainer container, StateBasedGame game) throws SlickException {
    }

    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        g.drawString("MENU!", 620, 300);
        
        Camera.drawDebug(container, game, g);
    }

 
    
    @Override
    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
        Keyboard.keyInput(container, game, delta);
    }
    
}
