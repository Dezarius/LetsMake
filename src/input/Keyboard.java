/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;

import main.Debug;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.Input;

/**
 *
 * @author Jan
 */
public class Keyboard {
    
    public static void keyInput(GameContainer gc, StateBasedGame s) {
        changeState(gc, s);
        if(gc.getInput().isKeyPressed(Input.KEY_F3)) {
            Debug.toggleDebug();
        }
    }
    
    private static void changeState(GameContainer gc, StateBasedGame s) {
        if (gc.getInput().isKeyPressed(Input.KEY_G) && s.getCurrentStateID() == 0) {
            s.enterState(1);
        } else if (gc.getInput().isKeyPressed(Input.KEY_M) && s.getCurrentStateID() == 2) {
            s.enterState(0);
        } else if (gc.getInput().isKeyPressed(Input.KEY_ESCAPE)) {
            if (s.getCurrentStateID() == 1) {
                s.enterState(2);
            } else if (s.getCurrentStateID() == 2) {
                s.enterState(1);
            }
        }
    }
}
