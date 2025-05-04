package i_dataStructure.Graph;

public class Test {

	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		b.add(); //42, 17, 89, 63, 25, 78, 91, 34, 56, 12
		
		System.out.println("\nLevel Order:");
		b.levelOrder();
		
		System.out.println("\nPre Order:");
		b.preOrder();
		
		System.out.println("\nPost Order:");
		b.postOrder();
		
		System.out.println("\nIn Order:");
		b.inOrder();
		
		System.out.println("\nDisplay():");
		b.display();
	}
}
