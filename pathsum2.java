/*
 * LeetCode User :  volTRon
 * Email ID : depankar13singh@gmail.com
 * 
 * Problem : Finding paths from root till leaf node, which have a particular sum.
 */
import java.util.ArrayList;
import java.util.List;

public class pathsum2 {

	public static void findPath(TreeNode node, List<Integer> current, List<List<Integer>> result, int currentSum,
			int sum) {
		if (node.left == null && node.right == null) {//leaf node condition
			if (currentSum + node.val == sum) {
				current.add(node.val);
				result.add(new ArrayList<Integer>(current));
				current.remove(current.size() - 1);
				return;
			}
		}
		current.add(node.val); //adding current node to our list
		if (node.left != null) {
			findPath(node.left, current, result, currentSum + node.val, sum);
		}
		if (node.right != null) {
			findPath(node.right, current, result, currentSum + node.val, sum);
		}
		current.remove(current.size() - 1); // removing the node which was added previously
	}

	public static void main(String arg[]) {

		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);

		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);

		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(1);
		root.right.right.left = new TreeNode(5);

		List<List<Integer>> result = new ArrayList<>();
		List<Integer> current = new ArrayList();
        int sum = 22; 
		findPath(root, current, result, 0, sum);
		//all path with sum equals to 22 will be stored in result

	}
}
