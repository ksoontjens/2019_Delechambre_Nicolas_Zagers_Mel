package hellotvxlet;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.tv.xlet.*;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HStaticText;
import org.havi.ui.HTextButton;
import org.havi.ui.HVisible;
import org.havi.ui.event.HActionListener;


public class HelloTVXlet implements Xlet, HActionListener {

     HScene scene;
     MijnComponent mc=new MijnComponent(0,0,720,576);
     String  vragen[]={"Wat is de hoofdstad van Japan?", "Wat is de hoofdstad van Australië?", "Wat is de hoofdstad van België?", "Wat is de hoofdstad van Zweden?", "Wat is de hoofdstad van Peru?", "Wat is de hoofdstad van Venezuela?", "Wat is de hoofdstad van Rusland?", "Wat is de hoofdstad van Canada?", "Wat is de hoofdstad van Brazilië?", "Wat is de hoofdstad van India?"};
     int huidigevraag=0;
     int score = 0; 
     
     HStaticText vraag = new HStaticText (vragen[huidigevraag], 20, 300, 680, 50);
     
     
    public HelloTVXlet() {
       
    }
    
    public void initXlet(XletContext context) {
        
      scene=HSceneFactory.getInstance().getDefaultHScene();
   
      scene.add(mc);
      
      
      vraag.setBackgroundMode(HVisible.BACKGROUND_FILL);
      vraag.setBackground(Color.BLUE);
      
      scene.add(vraag);
      
     HStaticText scherm = new HStaticText("Score: " + score, 310, 10, 100, 50);
     scherm.setBackgroundMode(HVisible.BACKGROUND_FILL);
     scherm.setBackground(Color.GRAY);
     
     scene.add(scherm);
     scene.popToFront(scherm);
     scene.repaint();
      
      HTextButton btn1 = new HTextButton("Brussel", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn2 = new HTextButton("Melbourne", 20,450,300,50); // x y w h
      btn2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn2.setBackground(Color.BLUE);
      scene.add(btn2);
      
      HTextButton btn3 = new HTextButton("Tokyo", 350,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
     
      HTextButton btn4 = new HTextButton("Seoul", 350,450,300,50); // x y w h
      btn4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn4.setBackground(Color.BLUE);
      scene.add(btn4);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn2, null, btn3); //Boven Onder Links Rechts
      btn2.setFocusTraversal(btn1, null, null, btn4);
      btn3.setFocusTraversal(null, btn4, btn1, null);
      btn4.setFocusTraversal(btn3, null, btn2, null);
      
      btn1.setActionCommand("btn1");
      btn2.setActionCommand("btn2");
      btn3.setActionCommand("btn3");
      btn4.setActionCommand("btn4");
      
      btn1.addHActionListener(this);
      btn2.addHActionListener(this);
      btn3.addHActionListener(this);
      btn4.addHActionListener(this);
      

      scene.pushToBack(mc);
      
      scene.validate();
      scene.setVisible(true);
     
    }
    
    public void vraag2()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("Melbourne", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn2 = new HTextButton("Canberra", 20,450,300,50); // x y w h
      btn2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn2.setBackground(Color.BLUE);
      scene.add(btn2);
      
      HTextButton btn3 = new HTextButton("Moskou", 350,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
     
      HTextButton btn4 = new HTextButton("Berlijn", 350,450,300,50); // x y w h
      btn4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn4.setBackground(Color.BLUE);
      scene.add(btn4);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn2, null, btn3); //Boven Onder Links Rechts
      btn2.setFocusTraversal(btn1, null, null, btn4);
      btn3.setFocusTraversal(null, btn4, btn1, null);
      btn4.setFocusTraversal(btn3, null, btn2, null);
      
      btn1.setActionCommand("btn1");
      btn2.setActionCommand("btn2");
      btn3.setActionCommand("btn3");
      btn4.setActionCommand("btn4");
      
      btn1.addHActionListener(this);
      btn2.addHActionListener(this);
      btn3.addHActionListener(this);
      btn4.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn2);
      scene.popToFront(btn3);
      scene.popToFront(btn4);
      
      scene.validate();
      scene.setVisible(true);
      huidigevraag++;
     }
     
     public void vraag3()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("Praag", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn2 = new HTextButton("Oslo", 20,450,300,50); // x y w h
      btn2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn2.setBackground(Color.BLUE);
      scene.add(btn2);
      
      HTextButton btn3 = new HTextButton("Kaapstad", 350,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
     
      HTextButton btn4 = new HTextButton("Brussel", 350,450,300,50); // x y w h
      btn4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn4.setBackground(Color.BLUE);
      scene.add(btn4);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn2, null, btn3); //Boven Onder Links Rechts
      btn2.setFocusTraversal(btn1, null, null, btn4);
      btn3.setFocusTraversal(null, btn4, btn1, null);
      btn4.setFocusTraversal(btn3, null, btn2, null);
      
      btn1.setActionCommand("btn1");
      btn2.setActionCommand("btn2");
      btn3.setActionCommand("btn3");
      btn4.setActionCommand("btn4");
      
      btn1.addHActionListener(this);
      btn2.addHActionListener(this);
      btn3.addHActionListener(this);
      btn4.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn2);
      scene.popToFront(btn3);
      scene.popToFront(btn4);
      
      scene.validate();
      scene.setVisible(true);
      huidigevraag++;
     }
     
     public void vraag4()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("Stockholm", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn2 = new HTextButton("Caïro", 20,450,300,50); // x y w h
      btn2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn2.setBackground(Color.BLUE);
      scene.add(btn2);
      
      HTextButton btn3 = new HTextButton("Tbilisi", 350,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
     
      HTextButton btn4 = new HTextButton("Helsinki", 350,450,300,50); // x y w h
      btn4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn4.setBackground(Color.BLUE);
      scene.add(btn4);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn2, null, btn3); //Boven Onder Links Rechts
      btn2.setFocusTraversal(btn1, null, null, btn4);
      btn3.setFocusTraversal(null, btn4, btn1, null);
      btn4.setFocusTraversal(btn3, null, btn2, null);
      
      btn1.setActionCommand("btn1");
      btn2.setActionCommand("btn2");
      btn3.setActionCommand("btn3");
      btn4.setActionCommand("btn4");
      
      btn1.addHActionListener(this);
      btn2.addHActionListener(this);
      btn3.addHActionListener(this);
      btn4.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn2);
      scene.popToFront(btn3);
      scene.popToFront(btn4);
      
      scene.validate();
      scene.setVisible(true);
      huidigevraag++;
     }
     
     public void vraag5()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("Funafuti", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn2 = new HTextButton("Suva", 20,450,300,50); // x y w h
      btn2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn2.setBackground(Color.BLUE);
      scene.add(btn2);
      
      HTextButton btn3 = new HTextButton("Lima", 350,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
     
      HTextButton btn4 = new HTextButton("Bogota", 350,450,300,50); // x y w h
      btn4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn4.setBackground(Color.BLUE);
      scene.add(btn4);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn2, null, btn3); //Boven Onder Links Rechts
      btn2.setFocusTraversal(btn1, null, null, btn4);
      btn3.setFocusTraversal(null, btn4, btn1, null);
      btn4.setFocusTraversal(btn3, null, btn2, null);
      
      btn1.setActionCommand("btn1");
      btn2.setActionCommand("btn2");
      btn3.setActionCommand("btn3");
      btn4.setActionCommand("btn4");
      
      btn1.addHActionListener(this);
      btn2.addHActionListener(this);
      btn3.addHActionListener(this);
      btn4.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn2);
      scene.popToFront(btn3);
      scene.popToFront(btn4);
      
      scene.validate();
      scene.setVisible(true);
      
      huidigevraag++;
     }
     
     public void vraag6()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("Caracas", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn2 = new HTextButton("Lilongwe", 20,450,300,50); // x y w h
      btn2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn2.setBackground(Color.BLUE);
      scene.add(btn2);
      
      HTextButton btn3 = new HTextButton("Amman", 350,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
     
      HTextButton btn4 = new HTextButton("Paramaribo", 350,450,300,50); // x y w h
      btn4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn4.setBackground(Color.BLUE);
      scene.add(btn4);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn2, null, btn3); //Boven Onder Links Rechts
      btn2.setFocusTraversal(btn1, null, null, btn4);
      btn3.setFocusTraversal(null, btn4, btn1, null);
      btn4.setFocusTraversal(btn3, null, btn2, null);
      
      btn1.setActionCommand("btn1");
      btn2.setActionCommand("btn2");
      btn3.setActionCommand("btn3");
      btn4.setActionCommand("btn4");
      
      btn1.addHActionListener(this);
      btn2.addHActionListener(this);
      btn3.addHActionListener(this);
      btn4.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn2);
      scene.popToFront(btn3);
      scene.popToFront(btn4);
      
      scene.validate();
      scene.setVisible(true);
      
      huidigevraag++;
     }
     
     public void vraag7()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("Minsk", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn2 = new HTextButton("Bratislava", 20,450,300,50); // x y w h
      btn2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn2.setBackground(Color.BLUE);
      scene.add(btn2);
      
      HTextButton btn3 = new HTextButton("Boekarest", 350,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
     
      HTextButton btn4 = new HTextButton("Moskou", 350,450,300,50); // x y w h
      btn4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn4.setBackground(Color.BLUE);
      scene.add(btn4);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn2, null, btn3); //Boven Onder Links Rechts
      btn2.setFocusTraversal(btn1, null, null, btn4);
      btn3.setFocusTraversal(null, btn4, btn1, null);
      btn4.setFocusTraversal(btn3, null, btn2, null);
      
      btn1.setActionCommand("btn1");
      btn2.setActionCommand("btn2");
      btn3.setActionCommand("btn3");
      btn4.setActionCommand("btn4");
      
      btn1.addHActionListener(this);
      btn2.addHActionListener(this);
      btn3.addHActionListener(this);
      btn4.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn2);
      scene.popToFront(btn3);
      scene.popToFront(btn4);
      
      scene.validate();
      scene.setVisible(true);
      
      huidigevraag++;
     }
     
     public void vraag8()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("Roseau", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn2 = new HTextButton("Ottawa", 20,450,300,50); // x y w h
      btn2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn2.setBackground(Color.BLUE);
      scene.add(btn2);
      
      HTextButton btn3 = new HTextButton("Toronto", 350,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
     
      HTextButton btn4 = new HTextButton("Castriers", 350,450,300,50); // x y w h
      btn4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn4.setBackground(Color.BLUE);
      scene.add(btn4);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn2, null, btn3); //Boven Onder Links Rechts
      btn2.setFocusTraversal(btn1, null, null, btn4);
      btn3.setFocusTraversal(null, btn4, btn1, null);
      btn4.setFocusTraversal(btn3, null, btn2, null);
      
      btn1.setActionCommand("btn1");
      btn2.setActionCommand("btn2");
      btn3.setActionCommand("btn3");
      btn4.setActionCommand("btn4");
      
      btn1.addHActionListener(this);
      btn2.addHActionListener(this);
      btn3.addHActionListener(this);
      btn4.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn2);
      scene.popToFront(btn3);
      scene.popToFront(btn4);
      
      scene.validate();
      scene.setVisible(true);
      
      huidigevraag++;
     }
     
     public void vraag9()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("Brasilia", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn2 = new HTextButton("Quito", 20,450,300,50); // x y w h
      btn2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn2.setBackground(Color.BLUE);
      scene.add(btn2);
      
      HTextButton btn3 = new HTextButton("Buenos Aires", 350,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
     
      HTextButton btn4 = new HTextButton("Santiago", 350,450,300,50); // x y w h
      btn4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn4.setBackground(Color.BLUE);
      scene.add(btn4);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn2, null, btn3); //Boven Onder Links Rechts
      btn2.setFocusTraversal(btn1, null, null, btn4);
      btn3.setFocusTraversal(null, btn4, btn1, null);
      btn4.setFocusTraversal(btn3, null, btn2, null);
      
      btn1.setActionCommand("btn1");
      btn2.setActionCommand("btn2");
      btn3.setActionCommand("btn3");
      btn4.setActionCommand("btn4");
      
      btn1.addHActionListener(this);
      btn2.addHActionListener(this);
      btn3.addHActionListener(this);
      btn4.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn2);
      scene.popToFront(btn3);
      scene.popToFront(btn4);
      
      scene.validate();
      scene.setVisible(true);
      
      huidigevraag++;
     }
     
     public void vraag10()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("Teheran", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn2 = new HTextButton("Mumbai", 20,450,300,50); // x y w h
      btn2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn2.setBackground(Color.BLUE);
      scene.add(btn2);
      
      HTextButton btn3 = new HTextButton("Jakarta", 350,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
     
      HTextButton btn4 = new HTextButton("New Delhi", 350,450,300,50); // x y w h
      btn4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn4.setBackground(Color.BLUE);
      scene.add(btn4);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn2, null, btn3); //Boven Onder Links Rechts
      btn2.setFocusTraversal(btn1, null, null, btn4);
      btn3.setFocusTraversal(null, btn4, btn1, null);
      btn4.setFocusTraversal(btn3, null, btn2, null);
      
      btn1.setActionCommand("btn1");
      btn2.setActionCommand("btn2");
      btn3.setActionCommand("btn3");
      btn4.setActionCommand("btn4");
      
      btn1.addHActionListener(this);
      btn2.addHActionListener(this);
      btn3.addHActionListener(this);
      btn4.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn2);
      scene.popToFront(btn3);
      scene.popToFront(btn4);
      
      scene.validate();
      scene.setVisible(true);
      
     huidigevraag++;

     }
     
    public void einde(){
        scene.removeAll();
        
        scene.add(mc);
        
        HStaticText scorebord = new HStaticText("U behaalde een score van " + score + " op 10.", 20, 300, 680, 50);
        scorebord.setBackgroundMode(HVisible.BACKGROUND_FILL);
        scorebord.setBackground(Color.BLUE);
        
        scene.add(scorebord);
        scene.popToFront(scorebord);
        scene.repaint();
        
    }
    
    public void startXlet() {
    
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }
    
    public void actionPerformed(ActionEvent arg0) {
       
     System.out.println(arg0.getActionCommand());
     System.out.println("hudige="+huidigevraag);
       
     if(arg0.getActionCommand().equals("btn1")) {
        
        if(huidigevraag == 0){
           huidigevraag++;
        } 
        if(huidigevraag == 1){
                  
        }
        if(huidigevraag == 2){
        
        }
        if(huidigevraag == 3){
            
        }
        if(huidigevraag == 4){
            score++;
        }
        if(huidigevraag == 5){
            
        }
        if(huidigevraag == 6){
            score++;
        }
        if(huidigevraag == 7){
        
        }
        if(huidigevraag == 8){
            
        }
        if(huidigevraag == 9){
            score++;
        }
      
        scene.repaint();
     }
     
     if(arg0.getActionCommand().equals("btn2")) {
        if(huidigevraag == 0){
        huidigevraag++;
        }
        if(huidigevraag == 1){
            
        }
        if(huidigevraag == 2){
            score++;
        }
        if(huidigevraag == 3){
        
        }
        if(huidigevraag == 4){
        
        }
        if(huidigevraag == 5){
        
        }
        if(huidigevraag == 6){
        
        }
        if(huidigevraag == 7){
            
        }
        if(huidigevraag == 8){
            score++;
        }
        if(huidigevraag == 9){
        
        }
        
        scene.repaint();
     }
     
     if(arg0.getActionCommand().equals("btn3")) {
        if(huidigevraag == 0){
            score++;
            huidigevraag++;
        }
        if(huidigevraag == 1){
        
        }
        if(huidigevraag == 2){
        
        }
        if(huidigevraag == 3){
        
        }
        if(huidigevraag == 4){
            
        }
        if(huidigevraag == 5){
            score++;
        }
        if(huidigevraag == 6){
        
        }
        if(huidigevraag == 7){
        
        }
        if(huidigevraag == 8){
        
        }
        if(huidigevraag == 9){
        
        }
        
        scene.repaint();
     }
     
     if(arg0.getActionCommand().equals("btn4")) {
       if(huidigevraag == 0){
        huidigevraag++;
        }
        if(huidigevraag == 1){
        
        }
        if(huidigevraag == 2){
  
        }
        if(huidigevraag == 3){
            score++;
        }
        if(huidigevraag == 4){
        
        }
        if(huidigevraag == 5){
        
        }
        if(huidigevraag == 6){
            
        }
        if(huidigevraag == 7){
            score++;
        }
        if(huidigevraag == 8){
        
        }
        if(huidigevraag == 9){
            
        }
        if (huidigevraag == 10){
            score++;
        }
        
        scene.repaint();
     }
        if(huidigevraag == 0){
        huidigevraag++;
        }
        else if(huidigevraag == 1){
            vraag2(); 
        } 
        else if(huidigevraag == 2){ 
            vraag3();
        }
        else if(huidigevraag == 3){ 
            vraag4();
        }
        else if(huidigevraag == 4){
            vraag5();
        }
        else if(huidigevraag == 5){
            vraag6();
        }
        else if(huidigevraag == 6){
            vraag7();
        }
        else if(huidigevraag == 7){
            vraag8();
        }
        else if(huidigevraag == 8){
            vraag9();
        }
        else if(huidigevraag == 9){
            vraag10();
        }
        else if(huidigevraag == 10){
            einde();
        }
        else scene.repaint();
   
     HStaticText scherm = new HStaticText("Score: " + score, 310, 10, 100, 50);
     scherm.setBackgroundMode(HVisible.BACKGROUND_FILL);
     scherm.setBackground(Color.GRAY);
     
     scene.add(scherm);
     scene.popToFront(scherm);
     scene.repaint();
     
     System.out.println("score =" + score);
    }

}
