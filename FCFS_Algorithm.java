import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.lang.Math;


public class FCFS_Algorithm implements Scheduler{
    @Override
    public void doAlgorithm(int Head, ArrayList<Integer> queue) {
        Queue<Integer> q = new LinkedList<>(queue);
        LinkedList<Integer> sequence = new LinkedList<>();
        int a = Head,b,HeadMovment = 0;
        while(!q.isEmpty()){
            b = q.remove();
            HeadMovment += Math.abs(b-a);
            a = b;
            sequence.add(b);
        }
        System.out.println("Sequence: " + sequence);
        System.out.println("HeadMovement: " + HeadMovment);
    }
}
