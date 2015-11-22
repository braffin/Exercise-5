
package turnitin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class Buttons {
    
   private JFrame mainFrame;
   
   private JLabel headerLabel;
   private JLabel statusLabel;
   
   private JPanel controlPanel;

   public Buttons(){
      prepareGUI();
   }

   public static void main(String[] args){
      Buttons  swingControlDemo = new Buttons();      
      swingControlDemo.showButtonDemo();
   }

   private void prepareGUI(){
      mainFrame = new JFrame("Java Swing Examples");
      mainFrame.setSize(400,300);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.setLocationRelativeTo(null);
  
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.CENTER);    

      statusLabel.setSize(350,100);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   public void showButtonDemo(){

      headerLabel.setText("File has been read, manipulated, and rewritten."); 

      JButton okButton = new JButton("OK");          

      okButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.exit(0);;
         }          
      });

      controlPanel.add(okButton);
      
      mainFrame.setVisible(true);  
   }
}
