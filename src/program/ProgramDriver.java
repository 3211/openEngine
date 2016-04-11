package program;

import openEngine.MainFrame;

/**
 * your core program logic goes here.
 * You have a JFrame "frame" to work with (customisable in openEngine.MainFrame)
 * openEngine.MainThread calls update() ever BASE_MS (customisable in MainThread)
 * 
 * @author A.Audette
 * @version 1
 */

public class ProgramDriver {
	MainFrame frame;
	/**
	 * Default constructor, accepts a MainFrame parameter and sets it as a field in this class
	 * @param MainFrame - the frame to be set
	 */
	public ProgramDriver(MainFrame frame){
		this.frame = frame;
	}
	/**
	 * The update method to be called by MainThread
	 */
	public void update(){
	}
}
