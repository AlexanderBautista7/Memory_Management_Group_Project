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

	    public boolean removePCB(PCB pcb) {
	    	System.out.println("The PCB is removed from queue.");
	        return queue.remove(pcb);
	    }

	    public void add(int pID) {
	    	System.out.println("The PCB is ready to be excuted.");
	        return queue.add(pID);
	    }
	    
	    public boolean addPCB(PCB pcb) {
	    	System.out.println("The PCB is ready to be excuted.");
	        return queue.add(pcb);
	    }
	    
	    //Short Term Scheduler
	    
	    public boolean schedule(PCB pcb) {
	    	Process.startTimer();

	    	PCB result =  pcb;
	    	
	    	if(result != null) {
	    		queue.remove(pcb);
	    		return queue.add(pcb);
	    	}else {
	    		return queue.remove(pcb);
	    		
	    	}
	    }
}
