import java.util.*;

public class newQueue {
	
	public void testQueue(int[] p) {
		Queue<Integer> q = new LinkedList<>();
		int[] a = new int[p.length];
		for (int i = 0; i < p.length; i++) {           // linked list version
			q.add(p[i]);
		}
// 		for (int i = 0; i < p.length; i++) {           array version
//			a[i] = p[i];
//			}
		
//		System.out.println(Arrays.toString(a));        array version
		System.out.println(q);                         // linked list version
	}
	
	public void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {6, 2, 8, 3, 5};                    // dummy data
		testQueue(x);
	}

}
