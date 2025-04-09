package algorithm_practice.fourth_week;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    String name;
    List<TreeNode> children;

    TreeNode(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    void addChild(TreeNode child) {
        children.add(child);
    }
}

public class Tree_01 {
    public static void main(String[] args) {
        // 트리 생성
        TreeNode root = new TreeNode("루트");

        TreeNode child1 = new TreeNode("자식1");
        TreeNode child2 = new TreeNode("자식2");

        TreeNode grandChild1 = new TreeNode("자식1의 자식");
        TreeNode grandChild2 = new TreeNode("자식2의 자식");

        // 트리 연결
        child1.addChild(grandChild1);
        child2.addChild(grandChild2);

        root.addChild(child1);
        root.addChild(child2);

        // 트리 출력
        printTree(root, 0);
    }

    // 트리 출력 함수 (깊이 표시)
    public static void printTree(TreeNode node, int depth) {
        System.out.println("  ".repeat(depth) + "- " + node.name);
        for (TreeNode child : node.children) {
            printTree(child, depth + 1);
        }
    }
}
