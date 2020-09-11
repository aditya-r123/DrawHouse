import gpdraw.*;
import java.awt.*;
import java.util.*;

/**
 * <p> Roof draws a triangle with certain x and y positions, width, and height</p>
 * <p><b>Example Usage: </b></p>
 *              <pre>
 * P4_Rao_Aditya_Roof r = new P4_Rao_Aditya_Roof(pen, 357, 203, 23, 170);
 * r.setroofColor(Color.red);
 * r.draw();
 *                  </pre>
 * @author Aditya Rao
 * @version 9/2/2020
 */
public class P4_Rao_Aditya_Roof
{

    /** The pen that draws*/
    DrawingTool pen; 
    /** The color of the roof*/
    Color roofColor;
    /** The x position of the bottom left corner of the roof*/
    double x;
    /** The y position of the bottom left corner of the roof*/
    double y;
    /** The width of the roof*/
    double width;
    /** The height of the roof*/
    double height;

    /** This is the constructor for objects of the Roof class
     * 
     * @param dt The pen that draws
     * @param xPos The x position of the bottom left corner of the roof
     * @param yPos The y position of the bottom left corner of the roof
     */
    public P4_Rao_Aditya_Roof(DrawingTool dt, double xPos, double yPos){
        pen = dt;
        x = xPos;
        y = yPos;
        width = 100;
        height = 100;

        roofColor = new Color(220, 246, 250);
    }

    /** This is the constructor for objects of the Roof class
     * 
     * @param dt The pen that draws
     * @param xPos The x position of the bottom left corner of the roof
     * @param yPos The y position of the bottom left corner of the roof
     * @param w The width of the base of roof
     * @param h The height of the roof
     */
    public P4_Rao_Aditya_Roof(DrawingTool dt, double xPos, double yPos, double w, double h){
        pen = dt;
        x = xPos;
        y = yPos;
        width = w;
        height = h;
        roofColor = new Color(220, 246, 250);
    }

    /**
     * The draw method tells the pen how to use the given parameters
     *
     *
     */
    public void draw(){
        pen.up();
        pen.move(x, y+height/2);
        pen.down();
        for(int i = 0; i<height; i++){
            y+=1;
            pen.down();
            pen.setColor(roofColor);
            pen.fillRect(width-2*i, height/150);
            pen.up();
            pen.move(x, y+height/2);
        }

    }

    /**
     * This setter method is for the width and height dimensions of the roof
     *
     * @param w  The width of the base of roof
     * @param h  The height of the roof
     */
    public void setDimensions(double w, double h){
        width = w;
        height = h;
    }

    /**
     * This setter method is for the x and y positions of the roof
     *
     * @param xPos The x position of the bottom left corner of the roof
     * @param yPos The y position of the bottom left corner of the roof
     */
    public void setPosition(double xPos, double yPos){
        x = xPos;
        y = yPos;
    }

    /**
     * This setter method is for the color of the roof
     *
     * @param c  The color of the roof
     */
    public void setColor(Color c){
        roofColor = c;
    }

}

  
