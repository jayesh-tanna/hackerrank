
/*
https://practice.geeksforgeeks.org/problems/nodes-at-odd-levels/1/?ref=self
Given a binary tree of size N, your task is to complete the function printOddNodes(), that print's the nodes of 
binary tree present at odd level of the tree.At each level print nodes in any left to right order. 
Root is considered at level 1.
*/



public void nodeAtOdd(Node root)
     {
         if(root == null)
            return;
         Queue<Node> q = new LinkedList<>();
         q.add(root);
         int level = 1;
         while(q.size() > 0){
             int n = q.size();
             boolean oddLevel = level % 2 != 0;
             for(int i=0;i<n;i++){
                 Node current = q.remove();
                 if(oddLevel){
                     System.out.print(current.data + " ");
                 }
                 if(current.left != null)
                    q.add(current.left);
                if(current.right != null)
                    q.add(current.right);
                
             }
             level++;
         }
     }


