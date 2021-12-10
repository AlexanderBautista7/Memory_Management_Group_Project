//package MemoryManagement;

import java.util.*;

public class ReadyQueue {
	public LinkedList<Process> queue;

	public ReadyQueue() {
		queue = new LinkedList<Process>();
	}

	public boolean isEmpty() {
		return queue.isEmpty();

	}

	public void add(Process process) {
		queue.add(process);
	}

	public Process getProcess(int num) {
		return queue.get(num);
	}

	public Process remove() {
		return queue.remove();
	}

	public Process remove(int pID) {
		return queue.remove(pID);
	}

	public boolean remove(PCB pcb) {
		return queue.remove(pcb);
	}

	public void add(int idx, Process process) {
		queue.add(idx, process);
	}
}
