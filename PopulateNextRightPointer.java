/*
 * LeetCode User :  volTRon
 * Email ID : depankar13singh@gmail.com
 * 
 * Problem : Populate each next pointer to point to its next right node. 
 *           If there is no next right node, the next pointer should be set to NULL.
 *           Initially, all next pointers are set to NULL.
 */
public class PopulateNextRightPointer {
	/**
	 * Definition for binary tree with next pointer. public class TreeLinkNode {
	 * int val; TreeLinkNode left, right, next; 
	 * TreeLinkNode(int x) { val = x; }
	 * }
	 */
	public void setLinks(TreeLinkNode node, List<TreeLinkNode> links, int level) {
		if (node == null)
			return;

		if (links.size() > level) {
			TreeLinkNode tmp = links.get(level);
			links.set(level, node);
			tmp.next = node;
		} else {
			links.add(node);
		}
		setLinks(node.left, links, level + 1);
		setLinks(node.right, links, level + 1);
	}

	public void connect(TreeLinkNode root) {
		List<TreeLinkNode> links = new ArrayList();
		setLinks(root, links, 0);
		for (TreeLinkNode t : links)
			t.next = null;
		// Finally you have tree with each node pointing to its next node in
		// same level
	}
}
