// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP102 - 2020T3, Assignment 1
 * Name:
 * Username:
 * ID:
 */

import ecs100.*;
import java.awt.Color;

/**
 * Draws various flags
 *
 * You can find lots of flag details (including the correct dimensions and colours)
 * from  http://www.crwflags.com/fotw/flags/    
 */

public class FlagDrawer{

    public static final double LEFT = 100;  // the left side of the flags
    public static final double TOP = 50;    // the top of the flags

    /**   CORE
     * Draw the flag of Germany.
     * The flag has three horizontal stripes;
     * The top is black, the middle is red, and the bottom is yellow.
     * The flag is 3/5 as high as it is wide (ratio 3:5).
     */
    public void drawGermanFlag(){
        UI.clearGraphics();
        UI.println("German Flag");
        double width = UI.askDouble("How wide: ");
        /*# YOUR CODE HERE */
        double height = width*3.0/5.0;
        UI.fillRect(LEFT, TOP, width, height/3.0);
        UI.setColor(Color.red);
        UI.fillRect(LEFT, TOP+height/3.0, width, height/3.0);
        UI.setColor(Color.yellow);
        UI.fillRect(LEFT, TOP+2.0*height/3.0, width, height/3.0);
    }

    /** CORE
     *  The flag for Norway is a red rectangle with
     *  a white cross containing a thinner blue cross
     *  slightly off-set to the left-hand side;
     * The flag is 8/11 as high as it is wide (ratio 8:11).
     */
    public void drawNorwayFlag() {
        UI.clearGraphics();
        UI.println("Norway Flag");
        double width = UI.askDouble("How wide: ");
        /*# YOUR CODE HERE */

    }

    /** COMPLETION
     *  Pacman
     *  A red pacman looking up on a black background chasing yellow, green, and blue dots.
     * The flag is 3/2 as high as it is wide (ratio 3:2).
     */
    public  void drawPacman() {
        UI.clearGraphics();        
        UI.println("Pacman Flag");
        double width = UI.askDouble("How wide: ");
        /*# YOUR CODE HERE */

    }

    /** COMPLETION
     *  The Czech flag
     *  The flag is 2/3 as high as it is wide (ratio 2:3).
     *  Two horizontal stripes (white and red) with a blue isoceles triangle on the left side.
     *  Note: there is no fillTriangle method in the UI class! Maybe you could use arcs?
     */
    public  void drawCzechFlag(){
        UI.clearGraphics();        
        UI.println("Czech Flag");
        double width = UI.askDouble("How wide: ");
        /*# YOUR CODE HERE */

    }

    /**  CHALLENGE
     *  The Jamaican flag has a yellow diagonal cross with 
     *  green triangles top and bottom, and black triangles left and right.
     *  The flag is 1/2 as high as it is wide (ratio 1:2).
     */
    public void drawJamaicaFlag(){
        UI.clearGraphics();
        UI.println("Flag of Jamaica");
        double width = UI.askDouble("How wide: ");
        /*# YOUR CODE HERE */

    }

    /**   CHALLENGE
     * The 3 stars flag has a blue vertical stripe on the left and black
     * vertical stripe on the right and 3 red 5 pointed stars in the middle stripe
     * The height is 2/3 of the width (ratio 2:3).
     * A full marks solution will have a method for drawing a 5 pointed star,
     * and call that method for each of the stars
     */
    public void drawThreeStarsFlag() {
        UI.clearGraphics();        
        /*# YOUR CODE HERE */

    }


    public void setupGUI(){
        UI.initialise();
        UI.addButton("Clear", UI::clearPanes);
        UI.addButton("Core: Flag of Germany", this::drawGermanFlag);
        UI.addButton("Core: Flag of Norway",  this::drawNorwayFlag);
        // COMPLETION
        UI.addButton("Completion: Pacman Flag", this::drawPacman);
        UI.addButton("Completion: Czech Flag", this::drawCzechFlag);
        // CHALLENGE
        UI.addButton("Challenge: Flag of Jamaica", this::drawJamaicaFlag);
        UI.addButton("Challenge: Three stars flag", this::drawThreeStarsFlag);
        UI.addButton("Quit", UI::quit);

        UI.setDivider(0.3);
    }


}
