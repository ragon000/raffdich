package raffdich;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 18.11.2016
  * @author 
  */

public class maingui extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JButton jButton4 = new JButton();
  private JLabel jLabel5 = new JLabel();
  private JButton jButton5 = new JButton();
  private JButton jButton6 = new JButton();
  private JButton jButton7 = new JButton();
  private JButton jButton8 = new JButton();
  private JLabel jLabel6 = new JLabel();
  private JProgressBar jProgressBar1;
  private raffdich raffen;
  private JLabel jLabel7 = new JLabel();
  private int oldLevel;
  private int frameWidth = 424; 
  private int frameHeight = 282;
  private loadLanguage lang;
  // Ende Attribute
  
  public maingui() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);

    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    Calendar cal = Calendar.getInstance();
    int dayOfWeek = (cal.get(Calendar.DAY_OF_WEEK));

    int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
    boolean geradeWoche = weekOfYear % 2 == 0;
  //  System.out.println(dayOfWeek + "  "+weekOfYear+"   "+geradeWoche);
    
    if(dayOfWeek>5){
    	System.exit(0);
   //   System.out.println("Heute haben Fächer keinen sinn amk");
    }
    if(geradeWoche){
      raffen = new raffdich(dayOfWeek-1);
      
    }else{
      
      raffen = new raffdich(dayOfWeek+4);
    }
    if(raffen.getLang()==null)    lang = new loadLanguage("en");
    else lang = new loadLanguage(raffen.getLang());
    setTitle(lang.getMainTitle());
    jLabel1.setBounds(16, 56, 110, 20);
    jLabel1.setText(raffen.getFach1());
    cp.add(jLabel1);
    jLabel2.setBounds(16, 88, 110, 20);
    jLabel2.setText(raffen.getFach2());
    cp.add(jLabel2);
    jLabel3.setBounds(16, 120, 110, 20);
    jLabel3.setText(raffen.getFach3());
    cp.add(jLabel3);
    jLabel4.setBounds(16, 152, 110, 20);
    jLabel4.setText(raffen.getFach4());
    cp.add(jLabel4);
    jButton1.setBounds(136, 56, 99, 25);
    jButton1.setText(lang.getMainHomework());
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    if(raffen.getFach1().equals("")!=true){
    cp.add(jButton1);}
    jButton2.setBounds(136, 88, 99, 25);
    jButton2.setText(lang.getMainHomework());
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    if(raffen.getFach2().equals("")!=true){
    cp.add(jButton2);}
    jButton3.setBounds(136, 120, 99, 25);
    jButton3.setText(lang.getMainHomework());
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    if(raffen.getFach3().equals("")!=true){
    cp.add(jButton3);}
    jButton4.setBounds(136, 152, 99, 25);
    jButton4.setText(lang.getMainHomework());
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
      }
    });
    if(raffen.getFach4().equals("")!=true){
    cp.add(jButton4);}
    jLabel5.setBounds(16, 8, 190, 36);
    jLabel5.setText(lang.getMainTomorrow());
    cp.add(jLabel5);
    jButton5.setBounds(296, 152, 107, 25);
    jButton5.setText("Spülmaschiene");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton5_ActionPerformed(evt);
      }
    });
    cp.add(jButton5);
    jButton6.setBounds(296, 120, 107, 25);
    jButton6.setText("Zimmer");
    jButton6.setMargin(new Insets(2, 2, 2, 2));
    jButton6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton6_ActionPerformed(evt);
      }
    });
    cp.add(jButton6);
    jButton7.setBounds(296, 88, 107, 25);
    jButton7.setText("Sport");
    jButton7.setMargin(new Insets(2, 2, 2, 2));
    jButton7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton7_ActionPerformed(evt);
      }
    });
    cp.add(jButton7);
    jButton8.setBounds(296, 56, 107, 25);
    jButton8.setText("Wasser");
    jButton8.setMargin(new Insets(2, 2, 2, 2));
    jButton8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton8_ActionPerformed(evt);
      }
    });
    cp.add(jButton8);
    jLabel6.setBounds(296, 184, 110, 20);
    jLabel6.setText("XP: "+(raffen.getXP() % raffen.getlvlUpXp()));
    cp.add(jLabel6);
    jProgressBar1 = new JProgressBar(0,raffen.getlvlUpXp());
    jProgressBar1.setBounds(8, 208, 398, 32);
    jProgressBar1.setValue(raffen.getXP() % raffen.getlvlUpXp());
    System.out.println(raffen.getXP() % raffen.getlvlUpXp());
    cp.add(jProgressBar1);
    jLabel7.setBounds(8, 184, 110, 20);
    jLabel7.setText(lang.getMainLevel()+((raffen.getXP()-(raffen.getXP() % raffen.getlvlUpXp()))/raffen.getlvlUpXp()));
    cp.add(jLabel7);
    oldLevel =((raffen.getXP()-(raffen.getXP() % raffen.getlvlUpXp()))/raffen.getlvlUpXp());
    // Ende Komponenten

    setVisible(true);
  } // end of public maingui
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new maingui();
  } // end of main
  
  public void reloadScreen(){
	    jLabel7.setText("Level: " +((raffen.getXP()-(raffen.getXP() % raffen.getlvlUpXp()))/raffen.getlvlUpXp()));
	    jLabel6.setText("XP: "+(raffen.getXP() % raffen.getlvlUpXp()));
	    jProgressBar1.setValue(raffen.getXP() % raffen.getlvlUpXp());
	    
  }
  public void getLevelUp(){
	    int newLevel =((raffen.getXP()-(raffen.getXP() % raffen.getlvlUpXp()))/raffen.getlvlUpXp());
	    if (newLevel>oldLevel){
	    	lvlupgui upgui= new lvlupgui();
	    	oldLevel=newLevel;
	    }
	    
  }
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
	  int HA = JOptionPane.showOptionDialog(null, lang.getMainHomework(),"Optionsdialog",
              JOptionPane.YES_NO_CANCEL_OPTION,
              JOptionPane.WARNING_MESSAGE, null, 
              new String[]{lang.getMainDone(), lang.getMainNothing()}, "B");
	  if (HA==0){
		  raffen.addXP(100);
		  
	  }
	  getLevelUp();
	  jButton1.setVisible(false);
	  jLabel1.setVisible(false);
	  reloadScreen();
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
	  int HA = JOptionPane.showOptionDialog(null, lang.getMainHomework(),"Optionsdialog",
              JOptionPane.YES_NO_CANCEL_OPTION,
              JOptionPane.WARNING_MESSAGE, null, 
              new String[]{lang.getMainDone(), lang.getMainNothing()}, "B");
	  if (HA==0){
		  raffen.addXP(100);
		  
	  }
	  getLevelUp();
	  jButton2.setVisible(false);
	  jLabel2.setVisible(false);
	  reloadScreen();
  } // end of jButton2_ActionPerformed

  public void jButton3_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
	  int HA = JOptionPane.showOptionDialog(null, lang.getMainHomework(),"Optionsdialog",
              JOptionPane.YES_NO_CANCEL_OPTION,
              JOptionPane.WARNING_MESSAGE, null, 
              new String[]{lang.getMainDone(), lang.getMainNothing()}, "B");
	  if (HA==0){
		  raffen.addXP(100);
		  
	  }
	  getLevelUp();
	  jButton3.setVisible(false);
	  jLabel3.setVisible(false);
	  reloadScreen();
  } // end of jButton3_ActionPerformed

  public void jButton4_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
	  int HA = JOptionPane.showOptionDialog(null, lang.getMainHomework(),"Optionsdialog",
              JOptionPane.YES_NO_CANCEL_OPTION,
              JOptionPane.WARNING_MESSAGE, null, 
              new String[]{lang.getMainDone(), lang.getMainNothing()}, "B");
	  if (HA==0){
		  raffen.addXP(100);
		  
	  }
	  getLevelUp();
	  jButton4.setVisible(false);
	  jLabel4.setVisible(false);
	  reloadScreen();
  } // end of jButton4_ActionPerformed

  public void jButton5_ActionPerformed(ActionEvent evt) {
	  raffen.addXP(100);
	  getLevelUp();
	  reloadScreen();
    // TODO hier Quelltext einfügen
  } // end of jButton5_ActionPerformed

  public void jButton6_ActionPerformed(ActionEvent evt) {
	  raffen.addXP(50);
	  getLevelUp();
	  reloadScreen();
    // TODO hier Quelltext einfügen
  } // end of jButton6_ActionPerformed

  public void jButton7_ActionPerformed(ActionEvent evt) {
	  raffen.addXP(250);
	  getLevelUp();
	  reloadScreen();
    // TODO hier Quelltext einfügen
  } // end of jButton7_ActionPerformed

  public void jButton8_ActionPerformed(ActionEvent evt) {
	  raffen.addXP(50);
	  getLevelUp();
	  reloadScreen();
    // TODO hier Quelltext einfügen
  } // end of jButton8_ActionPerformed

  // Ende Methoden
} // end of class maingui
