package project2;

/**
  * This class implements the main which creates and runs the initial GUI.
  *
  * @author James Osborne
  * @version 1.0  
  * File: Project2.java
  * Created: 16 Sept 2016
  * ©Copyright James Osborne. All rights reserved.
  * Summary of Modifications:
  *     16 Sept 2016 – JAO – Declared, initialized, and setVisible the main GUI.
  * 
  * Description: This class provides a main for the whole GUI program, creating
  * the GUI from which the user can choose to continue into calculating
  * GCD or factorial in a different GUI/dialog.
  */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initial GUI for the whole program.
        Project2UI gui = new Project2UI();
        
        //Makes the GUI visible to the user.
        gui.setVisible(true);        
    }
}