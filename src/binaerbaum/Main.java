package binaerbaum;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Tree baum = new Tree();
        baum.addNode(8);
        baum.addNode(6);
        baum.addNode(10);
        baum.addNode(12);
        baum.addNode(4);
        baum.addNode(3);
        baum.addNode(100);


        System.out.println("anzahl der Node ist " + baum.countNodes(baum.root));

    }
}
