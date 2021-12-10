// A class that generates a number of random processes and adds them to new queue
// to begin simulation.
public class ProcessGenerator {
    private ReadyQueue newQueue; // newqueue class doesn't work, used readyqueue class instead

    public ProcessGenerator() {
        newQueue = new ReadyQueue();
    }

    // creates numP amount of processes and adds them to ready queue
    public void AddProcess(int numP) {
        while (numP != 0) {
            newQueue.add(new Process());
            numP--;
        }

    }

    public ReadyQueue getQueue() {
        return newQueue;
    }

    // test simulation displaying process in queue
    public static void main(String[] args) {

        ProcessGenerator pg1 = new ProcessGenerator();

        pg1.AddProcess(5);

        for (int i = 0; i < 5; i++) {
            System.out.println("Process ID: " + pg1.getQueue().getProcess(i).getBlock().getProcessID());
            System.out.println("Process Size: " + pg1.getQueue().getProcess(i).getMemorySize());
            System.out.println("Process Time: " + pg1.getQueue().getProcess(i).getTotalRuntime());
            System.out.println();
        }
    }
}
