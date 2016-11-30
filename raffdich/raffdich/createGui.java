import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

import java.util.Properties;
/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 19.11.2016
  * @author 
  */

public class createGui extends JFrame {
  // Anfang Attribute
  private JTextField jTextField1 = new JTextField();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private JLabel jLabel5 = new JLabel();
  private JButton Speichern = new JButton();
  private JTextField jTextField2 = new JTextField();
  private JTextField jTextField3 = new JTextField();
  private JTextField jTextField4 = new JTextField();
  private JTextField jTextField5 = new JTextField();
  private JButton jButton1 = new JButton();
  private String[][] Faecher = new String[10][4]   ;
  private JTextArea jTextArea1 = new JTextArea("");
    private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);


  private JLabel jLabel6 = new JLabel();
  private JTextField jTextField6 = new JTextField();
  private JTextField jTextField7 = new JTextField();
  private JLabel jLabel7 = new JLabel();
  private JTextArea jTextArea2 = new JTextArea("");
    private JScrollPane jTextArea2ScrollPane = new JScrollPane(jTextArea2);
  private JLabel jLabel8 = new JLabel();
  private JLabel jLabel9 = new JLabel();
  private JLabel jLabel10 = new JLabel();
  private JTextArea jTextArea3 = new JTextArea("");
    private JScrollPane jTextArea3ScrollPane = new JScrollPane(jTextArea3);
  // Ende Attribute
  
  public createGui() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 833; 
    int frameHeight = 378;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Create New Config");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten

    
    
    jTextField1.setBounds(96, 40, 150, 20);
    cp.add(jTextField1);
    jLabel1.setBounds(16, 40, 62, 20);
    jLabel1.setText("Day");
    cp.add(jLabel1);
    jLabel2.setBounds(16, 72, 70, 20);
    jLabel2.setText("Course1");
    cp.add(jLabel2);
    jLabel3.setBounds(16, 104, 70, 20);
    jLabel3.setText("Course2");
    cp.add(jLabel3);
    jLabel4.setBounds(16, 136, 70, 20);
    jLabel4.setText("Course3");
    cp.add(jLabel4);
    jLabel5.setBounds(16, 168, 70, 20);
    jLabel5.setText("Course4");
    cp.add(jLabel5);
    Speichern.setBounds(9, 232, 239, 49);
    Speichern.setText("Save this day");
    Speichern.setMargin(new Insets(2, 2, 2, 2));
    Speichern.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Speichern_ActionPerformed(evt);
      }
    });
    cp.add(Speichern);
    jTextField2.setBounds(96, 72, 150, 20);
    cp.add(jTextField2);
    jTextField3.setBounds(96, 104, 150, 20);
    cp.add(jTextField3);
    jTextField4.setBounds(96, 136, 150, 20);
    cp.add(jTextField4);
    jTextField5.setBounds(96, 168, 150, 20);
    cp.add(jTextField5);
    jButton1.setBounds(8, 288, 803, 49);
    jButton1.setText("Save to File");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jTextArea1ScrollPane.setBounds(256, 40, 192, 164);
    jTextArea1.setText("Day: 0 = Monday even\nDay: 1 = Tuesday even\nDay: 2 = Wednesday even\nDay: 3 = Thursday even\nDay: 4 = Friday even\nDay: 5 = Monday uneven\nDay: 6 = Tuesday uneven\nDay: 7 = Wednesday Unerade\nDay: 8 = Thursday uneven\nDay: 9 = Friday uneven");
    jTextArea1.setEditable(false);
    cp.add(jTextArea1ScrollPane);
    jLabel6.setBounds(16, 200, 142, 20);
    jLabel6.setText("LvlUpXp");
    cp.add(jLabel6);
    jTextField6.setBounds(96, 200, 150, 20);
    cp.add(jTextField6);
    jTextField7.setBounds(328, 208, 110, 20);
    cp.add(jTextField7);
    jLabel7.setBounds(264, 208, 110, 20);
    jLabel7.setText("Language:");
    cp.add(jLabel7);
    jTextArea2ScrollPane.setBounds(352, 232, 73, 41);
    jTextArea2.setText("de=german\nen=english");
    jTextArea2.setEditable(false);
    cp.add(jTextArea2ScrollPane);
    jLabel8.setBounds(8, 0, 438, 36);
    jLabel8.setText("School");
    jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel8.setFont(new Font("Dialog", Font.BOLD, 15));
    cp.add(jLabel8);
    jLabel9.setBounds(448, 0, 382, 36);
    jLabel9.setText("Other things");
    jLabel9.setFont(new Font("Dialog", Font.BOLD, 15));
    jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(jLabel9);
    jLabel10.setBounds(448, 40, 206, 20);
    jLabel10.setText("Syntax:     Thing:XP");
    cp.add(jLabel10);
    jTextArea3ScrollPane.setBounds(448, 64, 368, 220);
    jTextArea3.setText("Cleaned Room:100");
    cp.add(jTextArea3ScrollPane);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public createGui
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new createGui();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
      Properties prop = new Properties();
  OutputStream output = null;

  try {

    output = new FileOutputStream("config.properties");

    // set the properties value
  for (int T=0;T<10 ;T++ ) {
  for (int F=0;F<4 ;F++ ) {
          if (Faecher[T][F]==null) {
            prop.setProperty(T+"Fach"+F,"Frei");    
          }else{
            
  prop.setProperty(T+"Fach"+F,Faecher[T][F]); 
  }     
  } // end of for
  } // end of for
prop.setProperty("xp", "0");
  /*   jTextField1.setText("");  
       jTextField2.setText("");  
       jTextField3.setText("");  
       jTextField4.setText("");  
       jTextField5.setText("");  
    */   
       // end of for

       prop.setProperty("lvlupxp",jTextField6.getText());
              prop.setProperty("language",jTextField7.getText());
    // save properties to project root folder
    prop.store(output, null);

  } catch (IOException io) {
    io.printStackTrace();
  } finally {
    if (output != null) {
      try {
        output.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }
    

  try {
	  BufferedWriter writer = new BufferedWriter(new FileWriter("others.properties", true)); // true for append
	jTextArea3.write(writer);
	  writer.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

  
  
  
  } // end of Speichern_ActionPerformed

  public void Speichern_ActionPerformed(ActionEvent evt) {
    Faecher[Integer.parseInt(jTextField1.getText())][0]=jTextField2.getText();
    Faecher[Integer.parseInt(jTextField1.getText())][1]=jTextField3.getText();
    Faecher[Integer.parseInt(jTextField1.getText())][2]=jTextField4.getText();
    Faecher[Integer.parseInt(jTextField1.getText())][3]=jTextField5.getText();
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class createGui
