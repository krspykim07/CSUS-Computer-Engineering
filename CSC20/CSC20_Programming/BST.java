import java.util.*;

class BST {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<Integer>();
    
        for(int i = 0; i < 50; i += 10)
            q.add(i);
        q.clear();
        q.add(q.remove());
        System.out.println(q.toString());
    }
}
