package LinkedLists;

class TreeNode {
	int key;
	TreeNode left, right;
	
	public TreeNode(int item) {
		key = item;
		left = right=null;
	}

}

public class BinaryTree{
	TreeNode root;
	
	//Method to insert a new node with the given key
	public void insert(int key) {
		root = insertRec(root, new TreeNode(key));
	}
	public void printInorder() {
		inorder(root);
	}
	public void printPreorder() {
		preorder(root);
	}
	public void printPostorder() {
		postorder(root);
	}
	
	// Left -> data -> right
	public void inorder(TreeNode node) {
		if(node==null)
			return;
		inorder(node.left);
		System.out.println(node.key+",");
		inorder(node.right);
	}
	
	//data -> left -> right
	public void preorder(TreeNode node) {
		if(node==null)
			return;
		System.out.println(node.key+",");
		preorder(node.left);
		preorder(node.right);
	}
	
	//left -> right -> data
	public void postorder(TreeNode node) {
		if(node == null)
			return;
		postorder(node.left);
		postorder(node.right);
		System.out.println(node.key+",");
	}
	
	//private recursive call for insertion
	private TreeNode insertRec(TreeNode currentParent, TreeNode newNode) {
		if(currentParent == null) {
			return newNode;
		}
		else if(newNode.key > currentParent.key) {
			currentParent.right = insertRec(currentParent.right, newNode);
		}
		else if(newNode.key < currentParent.key) {
			currentParent.left = insertRec(currentParent.left, newNode);
		}
		return currentParent;
	}


public static void main(String[] args) {
	BinaryTree tree=new BinaryTree();
	//18 29 21 8 10 9 15 33 4 14 50
	tree.insert(18);
	tree.insert(29);
	tree.insert(21);
	tree.insert(8);
	tree.insert(10);
	tree.insert(9);
	tree.insert(15);
	tree.insert(33);
	tree.insert(4);
	tree.insert(14);
	tree.insert(50);
	
	//Print Tree traversal of the tree
	System.out.println("\n Inorder Traversal:");
	tree.printInorder();
	System.out.println("\n Preorder");
	tree.printPreorder();
	System.out.println("\n Postorder");
	tree.printPostorder();
}
}