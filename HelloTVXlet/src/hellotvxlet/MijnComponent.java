/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import org.havi.ui.HComponent;

/**
 *
 * @author student
 */

public class MijnComponent extends HComponent{
    
    Image achtergrond;
    int x=200;
    int y=500;
    int ay=0;
    
    public MijnComponent (int x, int y, int x2, int y2) {
        this.setBounds(x,y,x2,y2);
        achtergrond = this.getToolkit().getImage("Angkor2.jpg");
        
        MediaTracker mt = new MediaTracker(this);
        mt.addImage(achtergrond,1);
        
        try{
            mt.waitForAll();
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    public void paint (Graphics g){
       // g.drawLine(0, 0, 100, 100); //x,y,x2,y2
       // g.drawLine(0,100,100,0);
       // g.setColor (Color.GREEN);
       // g.fillOval(0,0,100,100);
       g.drawImage(achtergrond, 0, ay, this);
    }
}
