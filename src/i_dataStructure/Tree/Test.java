package i_dataStructure.Tree;

public class Test {
	public static void main(String[] args) {
		BST b = new BST();
		b.add(50);
		b.add(65);
		b.add(70);
		b.add(15);
		b.add(25);
		b.add(55);
		b.add(10);
		b.add(20);
		System.out.println("size: "+b.size());
		b.levelOrder();
		b.preOrder();
		b.postOrder();
		b.inOrder();
		System.out.println("-----------"); 
		
		b.remove(70);//scenario-1
		System.out.println("size: "+b.size());
		b.inOrder();
		System.out.println("-----------");
		
		b.remove(25);//scenario-2
		System.out.println("size: "+b.size());
		b.inOrder();
		System.out.println("-----------");
		
		b.remove(50);//scenario-3
		System.out.println("size: "+b.size());
		b.inOrder();
		System.out.println("-----------");
		
		System.out.println(b.remove(0));
		System.out.println("size: "+b.size());
		b.inOrder();
	}
}
