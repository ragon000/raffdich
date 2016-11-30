import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class raffdich {
	private String Fach1;
	private String Fach2;
	private String Fach3;
	private String Fach4;
	private int xp;
	private int lvlUpXp;
	private String lang;
	private List<String> others = new ArrayList<String>();
public raffdich(int pTag){
	Properties prop = new Properties();
	InputStream input = null;

	try {

		input = new FileInputStream("config.properties");

		// load a properties file
		prop.load(input);

		// load Properties
		Fach1=prop.getProperty(pTag+"Fach0");
		Fach2=prop.getProperty(pTag+"Fach1");
		Fach3=prop.getProperty(pTag+"Fach2");
		Fach4=prop.getProperty(pTag+"Fach3");
		lang=prop.getProperty("language");
		System.out.println(lang);
		xp=Integer.parseInt(prop.getProperty("xp"));
		lvlUpXp=Integer.parseInt(prop.getProperty("lvlupxp"));
	} catch (IOException ex) {
		ex.printStackTrace();
		createGui creator = new createGui();
	} finally {
		if (input != null) {
			try {

				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
}
	 FileReader fr;
	try {
		fr = new FileReader("others.properties");
	    BufferedReader br = new BufferedReader(fr);

	    String zeile="asdf";
while(zeile!=null){
	zeile = br.readLine();
	others.add(zeile);
}
	    br.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public List<String> getOthers(){
	return others;
}
public String getFach1(){
	return Fach1;
	
}
public String getFach2(){
	return Fach2;
	
}
public String getFach3(){
	return Fach3;
	
}
public String getFach4(){
	return Fach4;
	
}
public int getXP()
{return xp;



}
public int getlvlUpXp(){
	return lvlUpXp;
}
public String getLang(){
	return lang;
}
public void addXP(int pXp){
	
	
	
	xp += pXp;
	
    OutputStream out = null;
    try {

        Properties props = new Properties();

        File f = new File("config.properties");
        if(f.exists()){

            props.load(new FileReader(f));
            //Change your values here
            props.setProperty("xp", ""+xp);
        }
        else{

        }



        out = new FileOutputStream( f );
        props.store(out, "This is an optional header comment string");


   }
    catch (Exception e ) {
        e.printStackTrace();
    }
    finally{

        if(out != null){

            try {

                out.close();
            } 
            catch (IOException ex) {

                System.out.println("IOException: Could not close myApp.properties output stream; " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
}
  
	
	
	
	
	
}





