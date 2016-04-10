package GUI;
import openEngine.CurrentProgram;

public class MainThread{
	CurrentProgram currentProgram;
	public static final int DEFAULT_MS = 256;
	private boolean clockRunning;
	private CoreThread coreThread;		
    public MainThread(CurrentProgram currentProgram) {
		if(currentProgram != null){
			this.currentProgram = currentProgram;
		} else {
			currentProgram = new CurrentProgram(new MainFrame());
		}
		startClock(true);
	}
    public void update(){
		currentProgram.update();
	}
    private class CoreThread extends Thread    {
		public void run()        {
            while (clockRunning) {
                update();
                pause();
            }        
        } 
        private void pause()
        {
            try {
                Thread.sleep(DEFAULT_MS);   // pause for variable milliseconds
            }
            catch (InterruptedException exc) {
            }        
        }  
        
    }

    public void startClock(boolean runClock){
        if (runClock == true){
            start();
        }else{
            stop();
        }
    }
    
    private void start()
    {
        clockRunning = true;
        coreThread = new CoreThread();
        coreThread.start();
    }
    
    private void stop(){
        clockRunning = false;
    }

}