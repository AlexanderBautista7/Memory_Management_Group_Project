package MemoryManagement;

import java.util.*;
public class ReadyQueue {
	    public LinkedList<PCB> queue;
		private Process manageState;
	    
	    public ReadyQueue(Process state) {
	    	queue = new LinkedList<PCB>();
	    	this.manageState = state;
	    }
	   
	    public boolean isEmpty() {
	    	System.out.println("The queue is empty.");
	        return queue.isEmpty();
	        
	    }

	    public void add(PCB pcb) {
	    	System.out.println("The PCB is being added to queue.");
	    	pcb.manageState = manageState;
	    	queue.add(pcb);
	    }

	    public PCB remove() {
	    	System.out.println("The PCB is removed from queue.");
	        return queue.remove();
	    }
	    
	    public PCB remove(int pID) {
	    	System.out.println("The Process ID is removed from queue.");
	        return queue.remove(pID);
	    }

	    public boolean remove(PCB pcb) {
	    	System.out.println("The PCB is removed from queue.");
	        return queue.remove(pcb);
	    }

	    public void add(int idx, PCB pcb) {
	    	System.out.println("The PCB is ready to be excuted.");
	        queue.add(idx, pcb);
	    }
}
