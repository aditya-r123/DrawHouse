import gpdraw.*;
import java.awt.*;
import java.util.*;

/**
 * <p> Door draws a rectangle with certain x and y positions, width, and height, and also draws a circle with certain x and y positions, and radius</p>
 * 
 * <p><b>Example Usage: </b></p>
 *              <pre>
 * P4_Rao_Aditya_Door d = new P4_Rao_Aditya_Door(pen, 0, -100, 100, 200, 10, 15, -120);
 * d.setDoorknobColor(Color.red);
 * d.setDoorColor(Color.yellow);
 * d.draw();
 *                  </pre>
 * @author Aditya Rao
 * @version 9/2/2020
 */
public class P4_Rao_Aditya_Door
{
    /** The pen that draws*/
    DrawingTool pen; 
    /** The color of the door*/
    Color doorColor;
    /** The color of the doorknob*/
    Color doorknobColor;
    /** The x position of the upper left corner of the door*/
    double x;
    /** The y position of the upper left corner of the door*/
    double y;
    /** The width of the door*/
    double width;
    /** The height of the door*/
    double height;
    /** The radius of the doorknob*/
    double rad;
    /** The x position of the center of the doorknob*/
    double dx;
    /** The y position of the center of the doorknob*/
    double dy;

    
    /** This is the constructor for objects of the Door class 
     * 
     * @param dt The pen that draws
     * @param xPos The x position of the upper left corner of the door
     * @param yPos The y position of the upper left corner of the door
     * @param doorknobX The x position of the center of the doorknob
     * @param doorknobY The y position of the center of the doorknob
     */
    public P4_Rao_Aditya_Door(DrawingTool dt, double xPos, double yPos, double doorknobX, double doorknobY){
        pen = dt;
        x = xPos;
        y = yPos;
        width = 100;
        height = 100;
        rad = 5;
        dx = doorknobX;
        dy = doorknobY;
        doorColor =  new Color(125, 97, 55);
        doorknobColor = new Color(200, 100, 200);
    }
    /** This is the constructor for objects of the Door class 
     * 
     * @param dt The pen that draws
     * @param xPos The x position of the upper left corner of the door
     * @param yPos The y position of the upper left corner of the door
     * @param w The width of the door
     * @param h The height of the door
     * @param radius The radius of the doorknob
     * @param doorknobX The x position of the center of the doorknob
     * @param doorknobY The y position of the center of the doorknob
     */
    public P4_Rao_Aditya_Door(DrawingTool dt, double xPos, double yPos, double w, double h, double radius, double doorknobX, double doorknobY){
        pen = dt;
        x = xPos;
        y = yPos;
        width = w;
        height = h;
        rad = radius;
        dx = doorknobX;
        dy = doorknobY;
        
        doorColor = new Color(220, 246, 250);
        doorknobColor = new Color(200, 100, 200);
    }

    /**
     * The draw method tells the pen how to use the given parameters
     *
     *
     */
    public void draw(){
        pen.up();
        pen.move(x, y);
        pen.setColor(doorColor);
        pen.down();
        pen.drawRect(width, height);
        pen.fillRect(width, height);
        
        pen.up();
        pen.move(dx, dy);
        pen.down();
        pen.setColor(doorknobColor);
        pen.drawCircle(rad);
        pen.fillCircle(rad);
    }
    /**
     * This setter method is for the width, height, and radius dimensions of both the door and doorknob
     *
     * @param w  The width of the door
     * @param h  The height of the door
     * @param radius The radius of the doorknob
     */
    public void setDimensions(double w, double h, double radius){
        width = w;
        height = h;
        rad = radius;
    }
    /**
     * This setter method is for the x and y positions of both the door and doorknob
     *
     * @param xPos The x position of the upper left corner of the door
     * @param yPos The y position of the upper left corner of the door
     * @param doorknobX The x position of the center of the doorknob
     * @param doorknobY The y position of the center of the doorknob
     */
    public void setPosition(double xPos, double yPos, double doorknobX, double doorknobY){
        x = xPos;
        y = yPos;

        dx = doorknobX;
        dy = doorknobY;
    }
    /**
     * This setter method is for the color of the door
     *
     * @param c  The color of the door
     */
    public void setDoorColor(Color c){
        doorColor = c;
    }
    /**
     * This setter method is for the color of the doorknob
     *
     * @param c  The color of the doorknob
     */
    public void setColor(Color c){
        doorknobColor = c;
    }

}
