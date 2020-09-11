import gpdraw.*;
import java.awt.*;
import java.util.*;

/**
 * <p> BackgroundScreen draws a rectangle with certain x and y positions, width, and height</p>
 * 
 * <p><b>Example Usage: </b></p>
 *              <pre>
 * BackgroundScren bs = new BackgroundScreen (pen, 200.0, 100.0, 34.0, 23.0);
 * bs.setBgScreenColor(Color.red);
 * bs.draw();
 *                  </pre>
 * @author Aditya Rao
 * @version 9/2/2020
 */
public class P4_Rao_Aditya_BackgroundScreen
{
    
    /** The pen that draws*/
    DrawingTool pen; 
    /** The color of the background screen*/
    Color bgScreenColor;
    /** The x position of the upper left corner of the background screen*/
    double x;
    /** The y position of the upper left corner of the background screen*/
    double y;
    /** The width of the background screen*/
    double width;
    /** The height of the background screen*/
    double height;
    
    
    /** This is the constructor for objects of the BackgroundScreen class 
     * 
     * @param dt The pen that draws
     * @param xPos The x position of the upper left corner of the background screen
     * @param yPos The y position of the upper left corner of the background screen
     */
    public P4_Rao_Aditya_BackgroundScreen(DrawingTool dt, double xPos, double yPos){
        pen = dt;
        x = xPos;
        y = yPos;
        width = 100;
        height = 100;
        bgScreenColor = new Color(220, 246, 250);
    }
    /** This is the constructor for objects of the BackgroundScreen class
     * 
     * @param dt The pen that draws
     * @param xPos The x position of the upper left corner of the background screen
     * @param yPos The y position of the upper left corner of the background screen
     * @param w The width of the background screen
     * @param h The height of the background screen
     */
    public P4_Rao_Aditya_BackgroundScreen(DrawingTool dt, double xPos, double yPos, double w, double h){
        pen = dt;
        x = xPos;
        y = yPos;
        width = w;
        height = h;
        bgScreenColor = new Color(220, 246, 250);
    }
   
    
    /**
     * The draw method tells the pen how to use the given parameters
     *
     *
     */
    public void draw(){
        
        pen.setColor(bgScreenColor);
        pen.up();
        pen.move(x, y);
        pen.down();
        pen.drawRect(width, height);
        pen.fillRect(width, height);

    }
    /**
     * This setter method is for the width and height dimensions of the background screen
     *
     * @param w  The width of the background screen
     * @param h  The height of the background screen
     */
    public void setDimensions(double w, double h){
        width = w;
        height = h;
    }
    /**
     * This setter method is for the x and y positions of the background screen
     *
     * @param xPos The x position of the upper left corner of the background screen
     * @param yPos The y position of the upper left corner of the background screen
     */
    public void setPosition(double xPos, double yPos){
        x = xPos;
        y = yPos;
    }
    /**
     * This setter method is for the color of the background screen
     *
     * @param c  The color of the background screen
     */
    public void setColor(Color c){
        bgScreenColor = c;
    }
    
    
}
