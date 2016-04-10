package openEngine;

import GUI.MainFrame;
import GUI.MainThread;

public class Launcher {
	private static MainThread thread;
	public static void main(String[] args){
		thread = new MainThread(new CurrentProgram(new MainFrame()));	
	}
}
