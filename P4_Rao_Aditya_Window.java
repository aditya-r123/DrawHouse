import gpdraw.*;
import java.awt.*;
import java.util.*;

/**
 * <p> Window draws a rectangle with certain x and y positions, width, and height</p>
 * <p><b>Example Usage: </b></p>
 *              <pre>
 * P4_Rao_Aditya_Window w = new P4_Rao_Aditya_Window (pen, 200.0, 100.0, 34.0, 23.0);
 * w.setWindowColor(Color.red);
 * w.draw();
 *                  </pre>
 * @author Aditya Rao
 * @version 9/2/2020
 */
public class P4_Rao_Aditya_Window
{
    
    /** The pen that draws*/
    DrawingTool pen; 
    /** The color of the window*/
    Color windowColor;
    /** The x position of the upper left corner of the window*/
    double x;
    /** The y position of the upper left corner of the window*/
    double y;
    /** The width of the window*/
    double width;
    /** The height of the window*/
    double height;
    
    
    /** This is the constructor for objects of the window class
     * 
     * @param dt The pen that draws
     * @param xPos The x position of the upper left corner of the window
     * @param yPos The y position of the upper left corner of the window
     */
    public P4_Rao_Aditya_Window(DrawingTool dt, double xPos, double yPos){
        pen = dt;
        x = xPos;
        y = yPos;
        width = 100;
        height = 100;
        
        windowColor = new Color (128,0,0);
    }
    /** This is the constructor for objects of the window class
     * 
     * @param dt The pen that draws
     * @param xPos The x position of the upper left corner of the window
     * @param yPos The y position of the upper left corner of the window
     * @param w The width of the window
     * @param h The height of the window
     */
    public P4_Rao_Aditya_Window(DrawingTool dt, double xPos, double yPos, double w, double h){
        pen = dt;
        x = xPos;
        y = yPos;
        width = w;
        height = h;
         windowColor = new Color (128,0,0);
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
        pen.setColor(windowColor);
        pen.drawRect(width, height);
        pen.fillRect(width, height);   
        
    }
    /**
     * This setter method is for the width and height dimensions of the window
     *
     * @param w  The width of the window
     * @param h  The height of the window
     */
    public void setDimensions(double w, double h){
        width = w;
        height = h;
    }
    /**
     * This setter method is for the x and y positions of the window
     *
     * @param xPos The x position of the upper left corner of the window
     * @param yPos The y position of the upper left corner of the window
     */
    public void setPosition(double xPos, double yPos){
        x = xPos;
        y = yPos;
    }
    /**
     * This setter method is for the color of the window
     *
     * @param c  The color of the window
     */
    public void setColor(Color c){
        windowColor = c;
    }

    
}
