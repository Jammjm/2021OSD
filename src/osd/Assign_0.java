package osd;

import java.util.Scanner;

public class Assign_0 {
	
	static class Node{
		public int degree;
		public int coefficient;
		public Node next;
		public Node prev;
		
		public Node(int degree, int coefficient) {
			this.degree = degree;
			this.coefficient = coefficient;
			this.next = null;
			this.prev = null;
		}
	}
	static class NodeList{
		public Node first;
		public Node last;
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputpoly();
	}
	
	static Node inputpoly() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Input (degree) (coefficient): ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a<0 && b<0)
				break;
			
		}
		return null;
	}

}
