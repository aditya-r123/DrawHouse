import gpdraw.*;
import java.awt.*;
import java.util.*;

/**
 * <p> Background draws two rectangles with certain x and y positions, widths, and heights. </p>
 * 
 * <p><b>Example Usage: </b></p>
 *              <pre>
 * P4_Rao_Aditya_ Background bg = new Background(pen, 372, 95, 370, 96, 40, 598, 80, 599);
 * bg.setBackgroundColor(Color.red);
 * bg.draw();
 *                  </pre>
 * @author Aditya Rao
 * @version 9/2/2020
 */
public class P4_Rao_Aditya_Background
{

    /** The pen that draws*/
    DrawingTool pen;
    /** The color of the background rectangles*/
    Color backgroundColor;
    /** The x position of the upper left corner of the first rectangle*/
    double x1;
    /** The y position of the upper left corner of the first rectangle*/
    double y1;
    /** The width of the first rectangle*/
    double width1;
    /** The height of the first rectangle*/
    double height1;
    /** The x position of the upper left corner of the second rectangle*/
    double x2;
    /** The y position of the upper left corner of the second rectangle*/
    double y2;
    /** The width of the second rectangle*/
    double width2;
    /** The height of the second rectangle*/
    double height2;

    /** This is the constructor for objects of the Background class 
     * 
     * @param dt The pen that draws
     * @param xPos1 The x position of the upper left corner of the first rectangle
     * @param yPos1 The y position of the upper left corner of the first rectangle
     * @param xPos2 The x position of the upper left corner of the second rectangle
     * @param yPos2 The y position of the upper left corner of the second rectangle
     */
    public P4_Rao_Aditya_Background(DrawingTool dt, double xPos1, double yPos1, double xPos2, double yPos2){
        pen = dt;
        x1 = xPos1;
        y1 = yPos1;
        width1 = 2;
        height1 = 2;
        x2 = xPos2;
        y2 = yPos2;
        width2 = 2;
        height2 = 2;
        backgroundColor = new Color(220, 246, 250);
    }

    /** This is the constructor for objects of the Background class 
     * 
     * @param dt The pen that draws
     * @param xPos1 The x position of the upper left corner of the first rectangle
     * @param yPos1 The y position of the upper left corner of the first rectangle
     * @param xPos2 The x position of the upper left corner of the second rectangle
     * @param yPos2 The y position of the upper left corner of the second rectangle
     * @param w1 The width of the first rectangle
     * @param h1 The height of the first rectangle
     * @param w2 The width of the second rectangle
     * @param h2 The height of the second rectangle
     */
    public P4_Rao_Aditya_Background(DrawingTool dt, double xPos1, double yPos1, double xPos2, double yPos2, double w1, double h1, double w2, double h2){
        pen = dt;
        x1 = xPos1;
        y1 = yPos1;
        width1 = w1;
        height1 = h1;
        x2 = xPos2;
        y2 = yPos2;
        width2 = w2;
        height2 = h2;
        backgroundColor = new Color(220, 246, 250);
    }

    /**
     * The draw method tells the pen how to use the given parameters
     *
     *
     */
    public void draw(){

        pen.up();
        pen.move(x1, y1);
        pen.setColor(backgroundColor);
        pen.down();
        pen.drawRect(width1, height1);
        pen.fillRect(width1, height1);

        pen.up();
        pen.move(-x2, y2);
        pen.setColor(backgroundColor);
        pen.down();
        pen.drawRect(width2, height2);
        pen.fillRect(width2, height2);

    }

    /**
     * This setter method is for the widths and heights dimensions of both rectangles
     *
     * @param w1 The width of the first rectangle
     * @param h1 The height of the first rectangle
     * @param w2 The width of the second rectangle
     * @param h2 The height of the second rectangle
     */
    public void setDimensions(double w1, double h1, double w2, double h2){
        width1 = w1;
        height1 = h1;
        width2 = w2;
        height2 = h2;
    }

    /**
     * This setter method is for the x and y positions of both rectangles
     * @param xPos1 The x position of the upper left corner of the first rectangle
     * @param yPos1 The y position of the upper left corner of the first rectangle
     * @param xPos2 The x position of the upper left corner of the second rectangle
     * @param yPos2 The y position of the upper left corner of the second rectangle
     */
    public void setPosition(double xPos1, double yPos1, double xPos2, double yPos2){
        x1 = xPos1;
        y1 = yPos1;
        x2 = xPos2;
        y2 = yPos2;
    }

    /**
     * This setter method is for the color of the rectangles
     *
     * @param c  The color of the rectangles
     */
    public void setColor(Color c){
        backgroundColor = c;
    }

}
