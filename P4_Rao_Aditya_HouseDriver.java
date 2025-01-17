/*
 * Aditya Rao
 * Period 4
 * This lab was a fun project for me. 
 * I found most of the lab easy, except I had some trouble coming up with the logic to draw the roof and grass. 
 * But I got everything to work eventually. 
 * This lab was extremely time taking for me, it took me about 5 hours total.
 */
import gpdraw.*;
import java.awt.*;
import javax.swing.JOptionPane;
public class P4_Rao_Aditya_HouseDriver{

    public static void main(String[] args){
       
    
        String choice;
        Color skyColor = null;
        Color skyObjectColor = null;
        Color grassColor = null;
        Color mudColor = null;
        Color windowColor = null;

        choice = JOptionPane.showInputDialog(null, "Is it day or night?");
         
        if ((choice != null) && (choice.length() > 0)) {
            if(choice.equalsIgnoreCase("day")) {
                skyColor = new Color(130, 200, 239);
                skyObjectColor = new Color(252, 212, 64);
                grassColor = new Color (116, 220, 80);
                mudColor = new Color(188, 158, 130);
                windowColor = new Color(168, 204, 213);
            }else if(choice.equalsIgnoreCase("night")){
                skyColor = new Color(43, 47, 119);
                skyObjectColor = new Color(254, 252, 215); 
                grassColor = new Color (34,139,34);
                mudColor = new Color(101, 67, 33);
                windowColor = new Color(245, 217, 157);
            }else{
                return;
            }

        }else{
            return;
        }
        

       
        SketchPad pad = new SketchPad(900, 700);
        DrawingTool pen = new DrawingTool(pad);

        
        Color bricksColor = new Color(230, 220, 200);
        Color wallColor = new Color(203,65,84);
        Color doorknobColor = new Color(89, 82, 82);
        Color chimneyColor = new Color (145, 145, 142);
        Color doorColor = new Color (204, 116, 81);
        Color roofColor = new Color(156, 96, 85);
        Color windowLinesColor = new Color(242, 240, 230);

        P4_Rao_Aditya_BackgroundScreen sky = new P4_Rao_Aditya_BackgroundScreen(pen, 200, 200, 30000, 820);
        sky.setColor(skyColor);
        sky.draw();

        P4_Rao_Aditya_BackgroundScreen mud = new P4_Rao_Aditya_BackgroundScreen(pen, 200, -515, 30000, 625);
        mud.setColor(mudColor);
        mud.draw();

        P4_Rao_Aditya_Wall w = new P4_Rao_Aditya_Wall(pen, -7, 0, 711, 406);
        w.setColor(wallColor);
        w.draw();

        P4_Rao_Aditya_Bricks b = new P4_Rao_Aditya_Bricks(pen, -370, -180, 80.0, 40.0);
        b.setColor(bricksColor);
        b.draw();

        P4_Rao_Aditya_Line l1 = new P4_Rao_Aditya_Line(pen, 1, 350, -165, 350, 208);
        l1.setColor(bricksColor);
        l1.draw();

        P4_Rao_Aditya_Line l2 = new P4_Rao_Aditya_Line(pen, 1, -329, -202, -329, 208);
        l2.setColor(bricksColor);
        l2.draw();

        P4_Rao_Aditya_Background bg = new P4_Rao_Aditya_Background(pen, 372, 95, 370, 96, 40, 598, 80, 599);
        bg.setColor(skyColor);
        bg.draw();

        P4_Rao_Aditya_Door d = new P4_Rao_Aditya_Door(pen, 0, -100, 100, 200, 12, 15, -110);
        d.setColor(doorknobColor);
        d.setDoorColor(doorColor);
        d.draw();

        P4_Rao_Aditya_Window w1 = new P4_Rao_Aditya_Window(pen, 175, 60, 100, 100);
        w1.setColor(windowColor);
        w1.draw();
        P4_Rao_Aditya_Window w2 = new P4_Rao_Aditya_Window(pen, -175, 60, 100, 100);
        w2.setColor(windowColor);
        w2.draw();

        P4_Rao_Aditya_Chimney c = new P4_Rao_Aditya_Chimney(pen, -255, 320, 70, 160);
        c.setColor(chimneyColor);
        c.draw();

        P4_Rao_Aditya_Roof r = new P4_Rao_Aditya_Roof(pen, 11, 110, 700, 175);
        r.setColor(roofColor);
        r.draw();

        P4_Rao_Aditya_Line l3 = new P4_Rao_Aditya_Line(pen, 10, -173, 14, -173, 105);
        l3.setColor(windowLinesColor);
        l3.draw();

        P4_Rao_Aditya_Line l4 = new P4_Rao_Aditya_Line(pen, 10, 175, 14, 175, 105);
        l4.setColor(windowLinesColor);
        l4.draw();

        P4_Rao_Aditya_Line l5 = new P4_Rao_Aditya_Line(pen, 10, 130, 60, 221, 60);
        l5.setColor(windowLinesColor);
        l5.draw();

        P4_Rao_Aditya_Line l6 = new P4_Rao_Aditya_Line(pen, 10, -220, 60, -129, 60);
        l6.setColor(windowLinesColor);
        l6.draw();

        P4_Rao_Aditya_Grass g = new P4_Rao_Aditya_Grass(pen, 2, -305, -600.00, 6, 200.0, 20.0, 5, 2000, 62, 10);
        g.setGrassColor(grassColor);
        g.draw();

        P4_Rao_Aditya_SkyObject so = new P4_Rao_Aditya_SkyObject(pen, -750, 400, 90);
        so.setColor(skyObjectColor);
        so.draw();

    }
}
