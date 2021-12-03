/**
 * Process
 */
public class Process {

    private int memorySize, totalRuntime;
    private PCB block;

    public Process() {
        memorySize = (int)Math.random()*100 + 4096;
        totalRuntime = (int)Math.random()*25 + 1000;
        block = new PCB();
    }

    public int getTotalRuntime() {
        return totalRuntime;
    }

    public int getMemorySize() {
        return memorySize;
    }
}