package raffdich;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 18.11.2016
  * @author 
  */

public class lvlupgui extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JButton OK = new JButton();
  private JLabel jLabel2 = new JLabel();
  private List<String> list = new ArrayList<String>();

  // Ende Attribute
  public static void main(String args){
	  new lvlupgui();
  }
  public lvlupgui() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("LEVEL UP!!!");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(0, 8, 298, 148);
    jLabel1.setText("LEVEL UP");
    jLabel1.setFont(new Font("Dialog", Font.BOLD, 40));
    jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(jLabel1);
    OK.setBounds(8, 208, 275, 57);
    OK.setText("OK");
    OK.setMargin(new Insets(2, 2, 2, 2));
    OK.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        OK_ActionPerformed(evt);
      }
    });
    cp.add(OK);
    jLabel2.setBounds(8, 168, 278, 36);
    try{
    FileReader fr = new FileReader("belohnungen.txt");
    BufferedReader br = new BufferedReader(fr);


    String zeile = "";
    while( (zeile = br.readLine()) != null )
    {
      list.add(zeile);
    }
    br.close();
    }catch(IOException e){
    	
    }
    Random r = new Random();
    String[] Belohnungen= 
    list.toArray(new String[list.size()]);
    for(int i=0;i<Belohnungen.length;i++){
    	System.out.println(Belohnungen[i]);
    }
    
    jLabel2.setText(Belohnungen[r.nextInt(Belohnungen.length)]);
    jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(jLabel2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public lvlupgui
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new lvlupgui();
  } // end of main
  
  public void OK_ActionPerformed(ActionEvent evt) {
	 this.setVisible(false);
    // TODO hier Quelltext einfügen
  } // end of OK_ActionPerformed

  // Ende Methoden
} // end of class lvlupgui
