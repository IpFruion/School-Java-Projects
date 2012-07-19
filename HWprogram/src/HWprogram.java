

import java.awt.*;
 
// import an extra class for the ActionListener 
import java.awt.event.*;
import java.io.File;

import javax.swing.JTextField;

import org.lekan.graphics.*;

public class HWprogram extends GraphicsProgram implements ActionListener 
{



	 
	 Button okButton; 
     Button wrongButton; 
     JTextField nameField;
     JTextField num2;
     JTextField num3;
     CheckboxGroup radioGroup; 
     
     
    int a = 0;
 	int b;
 	
 	String version = new String();
 	
 	SGImage image;
 	SGRect rect;
 	SGEllipse cr;
 	
 	
  /* Checkbox radio1; 
     Checkbox radio2; 
     Checkbox radio3;
*/
 	public static void main(String[] args) {

 		new HWprogram();
 		
 	}
     public void setup()  
     { 
  
    	  version = "1.5";
    	  
    	  
    	  //image = new SGImage(100, 100, "pic1.jpeg");
    	  this.getFrame().setDimensions(1450, 900);
    	  this.getFrame().setTitle("Dlock-HWprogram v" + version);
    	  this.getFrame().setBackgroundColor(Color.cyan);
    	 // this.getFrame().drawImage(400, 600, "/pic1.jpeg");
    	  
    	  
          nameField = new JTextField("Put in 1st Dom number",20);
          num2 = new JTextField("Put in 2nd Mid number",20); 
          num3 = new JTextField("Put in 3rd Rec number",20); 
          
          
          
      /*    radio1 = new Checkbox("Red", radioGroup,false); 
          radio2 = new Checkbox("Blue", radioGroup,true); 
          radio3 = new Checkbox("Green", radioGroup,false); 
       */ 
          
          this.addButton("Calculate", NORTH);
          this.addButton("Quit", NORTH);
          this.addButton("Clear", NORTH);
          this.addTextField(nameField, WEST); 
          this.addTextField(num2, WEST);
          this.addTextField(num3, WEST);
      /*   
          add(radio1); 
          add(radio2); 
          add(radio3);
*/
   
         }
     
     	 public void run() {
     		 draw();
     	 }
 
         public void draw()  
         { 
        	 rect = new SGRect(500, 100, 500, 400, Color.BLACK, false);
          this.getFrame().drawText("HWprogram v" + version, 650, 120);
       	  this.getFrame().addObject(rect);
          //this.getFrame().drawRect(500, 100, 500, 400);
       	  this.getFrame().drawText("HOW TO USE:", 510, 140);
       	  this.getFrame().drawText("Type in each box the Dom then mid then Rec and press calculate", 510, 160);
       	  this.getFrame().drawText("To Clear press clear. To quit press quit.", 510, 180);
       	  this.getFrame().drawText("Program by Derrick Lockwood", 650, 300);
       	  //this.getFrame().addObject(image);
        	 
         }

 

        public void actionPerformed(ActionEvent evt)  
         { 
  
              if (evt.getActionCommand().equals("Calculate") )  
            	  
            	  for(int c = 0; c<1; c++) {
            		  this.getFrame().clearGraphics();
            	  }
           
            	  hwstart();
                  

  
          if (evt.getActionCommand().equals("Quit"))  
          {
        	  this.getFrame().clearGraphics();
        	  System.exit(0);
        	  
        	  
          } 
          if (evt.getActionCommand().equals("Clear")) {
        	  a = 0;
        	  this.getFrame().clearGraphics();
          }
     }
     
       
        public String input1() {
        	return nameField.getText(); 
        }
        public String input2() {
        	return num2.getText();
        }
        public String input3() {
        	return num3.getText();
        }
        
        
    	int rule;
    	double constant = 1;
    	int ans1;
    	int ans2;
    	int ans3;
    	int N;
    	
    	
    	
 
    	
    	public void hwstart() {

    		
    		
    			
    		
    		ans1 = Integer.parseInt(input1());
    		
    		ans2 = Integer.parseInt(input2());
    		
    		ans3 = Integer.parseInt(input3());
    		
    		process(ans1, ans2, ans3);
    		
    	}
    	public void process(int t1, int t2, int t3) {
    		int talle;
    		double P;
    		double Q;
    		double dom;
    		double mid;
    		double rec;
    		o("t1:"+t1+" t2:"+t2+" t3:"+t3);
    		
    		o("");
    		N = t1 + t2 + t3;
    		o("The N value is: " + N);
    		
    		talle = N*2;
    		o("The total number of alleles is: " + talle);
    		
    		P = (double)((t1 * 2) + t2)/ (double)talle;
    		Q = (double)((t3 * 2) + t2)/ (double)talle;
    		o("The P is: " + P);
    		o("The Q is: " + Q);
    		
    		o("");
    		
    		o("The Dom is: " + solveansd(P));
    		o("The Middle is: " + solveansm(P, Q));
    		o("The Rec is: " + solveansr(Q));
    		
    		o("");
    		dom = solveansd(P);
    		mid = solveansm(P, Q);
    		rec = solveansr(Q);
    		equal(dom, mid, rec);
    		
    	}
    	double e1;
    	double e2;
    	double e3;
    	public void equal(double x, double y, double z) {
    		o("The equilibrium Dom: " + (x * N));
    		o("The equilibrium Mid: " + (y * N));
    		o("The equilibrium Rec: " + (z * N));
    		o("");
    		e1 = x * N;
    		e2 = y * N;
    		e3 = z * N;
    		evo();
    	}
    	public void evo() {
    		if (e1< ans1 | e2<ans2 | e3< ans3) {
    			this.getFrame().drawRect(500, 200, 100, 300);
    			this.getFrame().drawText("EVOLUTION", 550, 250);
    		}
    		else if (e1>ans1 | e2>ans2 | e3>ans3) {
    			this.getFrame().drawRect(500, 200, 100, 300);
    			this.getFrame().drawText("EVOLUTION", 550, 250);
    		}
    		else {
    			this.getFrame().drawRect(500, 200, 100, 300);
    			this.getFrame().drawText("NO EVOLUTION", 550, 250);
    		}
    	}
    	public double solveansd(double p) {
    		double dans;
    		dans =  Math.pow(p, 2);
    		
    		return dans;
    	}
    	public double solveansm(double p, double q) {
    		double mans;
    		mans =  2 * p * q;
    		
    		return mans;
    	}
    	public double solveansr(double q) {
    		double rans;
    		rans =  Math.pow(q, 2);
    		
    		return rans;
    	}
    	public void o(String x) {
    		b = 20;
    		a = a+20;
    		this.getFrame().drawText(x, b, a);
    	
    	}

} 
 

// That gives you an idea of how to implement actions. 
// Note that clicking the radiobuttons only shows it's effect when the 
// applet is repainted. That is because no ActionListener is added 
// to the radio buttons. You can do that in the same way as the buttons.

// Next example is about MouseListener, a way to let the user interact with mouse-clicks.

// Go to MouseClickExample.java