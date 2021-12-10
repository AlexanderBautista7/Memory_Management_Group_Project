package memoryManager;
import java.util.*;

public class MemoryManager {
	private ArrayList<Process> emptyProcesses = new ArrayList<Process>();
	private  ArrayList<Process> processList = new ArrayList<Process>();


	
	
	public MemoryManager(ArrayList<Process> p) {
		processList = p;
	}
	
	
	void addEmpties() {
		
		for(int i = 0; i< processList.size(); i++) {
			if(processList.get(i) == null) {
				emptyProcesses.add(processList.get(i));
				processList.remove(i);
			}
		}
		
		
	}
	
	
		
	
	
	
	
	
 
	
 
	
	
	



}
