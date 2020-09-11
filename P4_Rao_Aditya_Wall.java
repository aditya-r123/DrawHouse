import gpdraw.*;
import java.awt.*;
import java.util.*;

/**
 * <p> Wall draws a rectangle with certain x and y positions, width, and height</p>
 * <p><b>Example Usage: </b></p>
 *              <pre>
 * P4_Rao_Aditya_Wall w = new P4_Rao_Aditya_Wall (pen, 200.0, 100.0, 34.0, 23.0);
 * w.setWallColor(Color.red);
 * w.draw();
 *                  </pre>
 * @author Aditya Rao
 * @version 9/2/2020
 */
public class P4_Rao_Aditya_Wall
{
    
    /** The pen that draws*/
    DrawingTool pen; 
    /** The color of the wall*/
    Color wallColor;
    /** The x position of the upper left corner of the wall*/
    double x;
    /** The y position of the upper left corner of the wall*/
    double y;
    /** The width of the wall*/
    double width;
    /** The height of the wall*/
    double height;
    
    
    /** This is the constructor for objects of the Wall class
     * 
     * @param dt The pen that draws
     * @param xPos The x position of the upper left corner of the wall
     * @param yPos The y position of the upper left corner of the wall
     */
    public P4_Rao_Aditya_Wall(DrawingTool dt, double xPos, double yPos){
        pen = dt;
        x = xPos;
        y = yPos;
        width = 100;
        height = 100;
        
        wallColor = new Color (128,0,0);
    }
    /** This is the constructor for objects of the Wall class
     * 
     * @param dt The pen that draws
     * @param xPos The x position of the upper left corner of the wall
     * @param yPos The y position of the upper left corner of the wall
     * @param w The width of the wall
     * @param h The height of the wall
     */
    public P4_Rao_Aditya_Wall(DrawingTool dt, double xPos, double yPos, double w, double h){
        pen = dt;
        x = xPos;
        y = yPos;
        width = w;
        height = h;
         wallColor = new Color (128,0,0);
    }
   

    /**
     * The draw method tells the pen how to use the given parameters
     *
     *
     */
    public void draw(){
        pen.up();
        pen.move(x, y);
        pen.down();
        pen.setColor(wallColor);
        pen.drawRect(width, height);
        pen.fillRect(width, height);   
        
    }
    /**
     * This setter method is for the width and height dimensions of the wall
     *
     * @param w  The width of the wall
     * @param h  The height of the wall
     */
    public void setDimensions(double w, double h){
        width = w;
        height = h;
    }
    /**
     * This setter method is for the x and y positions of the wall
     *
     * @param xPos The x position of the upper left corner of the wall
     * @param yPos The y position of the upper left corner of the wall
     */
    public void setPosition(double xPos, double yPos){
        x = xPos;
        y = yPos;
    }
    /**
     * This setter method is for the color of the wall
     *
     * @param c  The color of the wall
     */
    public void setColor(Color c){
        wallColor = c;
    }

    
}
