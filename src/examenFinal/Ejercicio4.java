package examenFinal;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ejercicio4 {

	public static void main(String[] args) {
		Queue<Integer>q=new LinkedList<>(List.of(1,2,3,4,5,6,7,8,9,10));
		intercalar(q);
		System.out.println(q);
		

	}
	
	public static void intercalar(Queue<Integer> q) {
	Queue<Integer>aux=new LinkedList<Integer>();
	int n=(q.size()/2);//5
	for(int i=0;i<n;i++) {
		aux.offer(q.poll());
	}while(!aux.isEmpty()) {
		q.offer(aux.poll());
		q.offer(q.poll());
	}
	
	
		
	}

}

