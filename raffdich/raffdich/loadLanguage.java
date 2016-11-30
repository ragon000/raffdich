package raffdich;
 /**
  * import-Liste 
  * ggf. weiter von Hand anpassen 
  */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
 
public class loadLanguage {
 
 /**
  *  Attribute der Klasse
  */
 
   private String mainDone;
   private String mainHomework;
   private String mainLevel;
   private String mainNothing;
   private String mainTitle;
   private String mainTomorrow;
 
 /**
  *  Attribute die aus Beziehungen resultieren
  */
 

/**
 *         loadLanguage: Methoden 
 */

/********* loadLanguage (public) ***************************************/
public loadLanguage(String lang)
{
	Properties prop = new Properties();
	InputStream input = null;
	try {
		
		input = new FileInputStream(lang+".properties");

		// load a properties file
		prop.load(input);

		// load Properties
		mainTitle = prop.getProperty("mainTitle", "Get yourself");
		mainHomework = prop.getProperty("mainHomework", "Homework?");
		mainTomorrow = prop.getProperty("mainTomorrow", "Your courses tomorrow...");
		mainLevel = prop.getProperty("mainLevel", "Level");
		mainDone = prop.getProperty("mainDone", "Done");
		mainNothing = prop.getProperty("mainNothing", "No Homework");
		
	} catch (IOException ex) {
		ex.printStackTrace();

	} finally {
		if (input != null) {
			try {

				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
}
	
}

/********* getMainDone (public) ****************************************/
public String getMainDone()
{
  return mainDone;
}

/********* getMainHomework (public) ************************************/
public String getMainHomework()
{
  return mainHomework;
}

/********* getMainLevel (public) ***************************************/
public String getMainLevel()
{
  return mainLevel;
}

/********* getMainNothing (public) *************************************/
public String getMainNothing()
{
  return mainNothing;
}

/********* getMainTitle (public) ***************************************/
public String getMainTitle()
{
  return mainTitle;
}

/********* getMainTomorrow (public) ************************************/
public String getMainTomorrow()
{
  return mainTomorrow;
}

}
