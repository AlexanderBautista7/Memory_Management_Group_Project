public class PCB {
    private int processID;
    private int startFrame, endFrame, currentRuntime;
    private String state;
    private static int idNum = 0;

    public PCB() {
        processID = idNum;
        state = "New";
        startFrame = 0; // to be decided by memory allocation
        endFrame = 0; // to be decided by memory allocation
        currentRuntime = 0; // to be calculated by System Clock class
        idNum++;
    }

    public int getProcessID() {
        return processID;
    }

    public String getState() {
        return state;
    }

    public int getCurrentRuntime() {
        return currentRuntime;
    }

    public int numFrames() {
        return endFrame - startFrame;
    }

    public void setFrames(int start, int end) {
        startFrame = start;
        endFrame = end;
    }

    public void setState(String newState) {
        state = newState;
    }
}
