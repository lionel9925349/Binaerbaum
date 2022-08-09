package binaerbaum;

public class Tree {
     Node root;

     public Tree(){

     }

     public void addNode(int value){
         Node newNode = new Node(value);
         if (root == null){
             root = newNode;
         }else {
             Node currentNode = root;
             Node parent;
             while (true){
                 parent = currentNode;
                 if(value < currentNode.value){
                     currentNode = currentNode.left;

                     if (currentNode == null){
                         parent.left = newNode;
                         return;
                     }
                 }else {
                     currentNode = currentNode.right;
                     if (currentNode == null){
                         parent.right = newNode;
                         return;

                     }
                 }
             }
         }
     }

     public  int countNodes(Node r){
         if (r == null){
             return 0;
         }else {
             int l = 1;
             l+= countNodes(r.left);
             l+= countNodes(r.right);
             return l;
         }
     }
}
