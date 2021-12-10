/**
 * Process
 */

import java.lang.Math;

public class Process {

    private int memorySize, totalRuntime;
    private PCB block;
    private SystemClock clock;

    public Process() {
        memorySize = (int) (Math.random()*100 + 4096);
        totalRuntime = (int) (Math.random()*25 + 1000);
        block = new PCB();
        clock = new SystemClock();
    }

    public PCB getBlock() {
        return block;
    }

    public int getTotalRuntime() {
        return totalRuntime;
    }

    public int getMemorySize() {
        return memorySize;
    }
}