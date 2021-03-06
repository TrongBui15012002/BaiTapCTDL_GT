package com.trongbt2008110320.tuan08;

public class BinaryTree {
    Node root;

    void add(int key) {
        root = them(root, key);
    }

    Node them(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = them(root.left, key);
        else if (key > root.key)
            root.right = them(root.right, key);
        return root;
    }

    void duyetCay() {
        System.out.print("- Danh sách phần tử:");
        duyet(root);
        System.out.println("\n");
    }

    void duyet(Node root) {
        if (root != null) {
            duyet(root.left);
            System.out.print(root.key + " ");
            duyet(root.right);
        }
    }
}
