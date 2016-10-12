/*
 * LeetCode User :  volTRon
 * Email ID : depankar13singh@gmail.com
 *
 * Problem : Creating a BST from a givin array
 */
public class BTreeFromArray {
	public static void inOrder(TreeNode root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.println(root.val);
		inOrder(root.right);
	}
	public static TreeNode createTree(int[] arr, int l, int r) {
		if (l > r)
			return null;
		int mid = (l + r) / 2;
		TreeNode root = new TreeNode(arr[mid]);

		root.left = createTree(arr, l, mid - 1); // creating left tree
		root.right = createTree(arr, mid + 1, r);// creating right tree
		return root;
	}

	public static void main(String arg[]) {
		int[] arr = new int[] { 2, 4, 6, 7, 8, 10, 11, 13, 14, 15, 16, 24 };
		TreeNode root = createTree(arr, 0, arr.length - 1);
		inOrder(root);
	}
}
