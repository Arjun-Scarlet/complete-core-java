package i_dataStructure.Tree;

import java.util.LinkedList;
import java.util.Queue;

// Binary Search Tree is a tree data structure.
// It stores the data in such a manner that the smaller elements are left side and bigger elements are in right side comparing to the root element.
class Node {
	int key;
	Node left;
	Node right;
	Node(int k){
		key = k;
	}
	Node(int k, Node l, Node r){
		key = k;
		left = l;
		right = r;
	}
}
public class BST {
	private Node root;
	private int count;
	private boolean addFlag;
	private boolean removeFlag;
	
	public boolean add(int k) {
		addFlag = true;
		root = addNode(root, k);
		return addFlag; 
	}
	private Node addNode(Node n, int k) {
		if(n==null) {
			n = new Node(k);
			count++;
			return n;
		}
		if(k<n.key) {
			n.left = addNode(n.left,k);
		}
		else if(k>n.key) {
			n.right = addNode(n.right,k);
		}
		else addFlag = false;
		return n;
	}
	
	public int size() {
		return count;
	}
	
	//Traversing
	//Breadth-First Traverse(Level-Order Traverse)
	public void levelOrder() {
		Queue<Node> q = new LinkedList<Node>();
		if(root!=null) q.add(root);
		while(!q.isEmpty()) { //empty queue stops the loop
			Node n = (Node)q.poll();
			System.out.print(n.key+" ");
			if(n.left!=null) q.add(n.left);
			if(n.right!=null) q.add(n.right);
		}
		System.out.println();
	}
	
	//Depth-First Traverse
	//Pre-Order Traverse(root, left, right)
	public void preOrder() {//wrapper method(prints the implementation which is on another method)
		preOrder(root);
		System.out.println();
	}
	private void preOrder(Node n) {
		if(n==null) return;
		System.out.print(n.key+" ");
		preOrder(n.left);
		preOrder(n.right);
	}
	//Post-Order Traverse(left, right, root)
	public void postOrder() {
		postOrder(root);
		System.out.println();
	}
	private void postOrder(Node n) {
		if(n==null) return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.key+" ");
	}
	//In-Order Traverse(left, root, right)-->always return the elements in ascending order
	public void inOrder() {
		inOrder(root);
		System.out.println();
	}
	private void inOrder(Node n) {
		if(n==null) return;
		inOrder(n.left);
		System.out.print(n.key+" ");
		inOrder(n.right);
	}
	
	public boolean remove(int k) {
		removeFlag = false;
		root = removeNode(root,k);
		if(removeFlag) count--;
		return removeFlag;
	}
	private Node removeNode(Node n, int k) {
		if(n==null) return null;
		//checking the position of the element
		if(k<n.key) n.left = removeNode(n.left, k);
		else if(k>n.key) n.right = removeNode(n.right, k);
		//deletion process
		else {
			removeFlag = true;
			//leaf node deletion(scenario-1)
			if(n.left==null && n.right==null) n = null;
			
			//either left or right node deletion(scenario-2)
			else if(n.left==null) n = n.right;
			else if(n.right==null) n = n.left;
			
			//parent node deletion(scenario-3)
			else {
				Node maxNode = getMaxNode(n.left);
				int temp = maxNode.key;
				maxNode.key = n.key;
				n.key = temp;
				n.left = removeNode(n.left, k);
			}
		}
		return n;
	}
	private Node getMaxNode(Node n) { //this method returns leftmost smaller element
		if(n.right==null) return n;
		return getMaxNode(n.right);
	}
}















