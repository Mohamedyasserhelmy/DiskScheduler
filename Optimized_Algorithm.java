import java.util.ArrayList;
import java.util.Collections;

/*
    The optimized algorithm is exactly the same as FCFS algorithm with sorted sequence
    and initial head position at 0.
*/




public class Optimized_Algorithm implements Scheduler {
    @Override
    public void doAlgorithm(int Head, ArrayList<Integer> queue) {
        Head = 0;
        int HeadMovement;
        ArrayList<Integer> sequence = new ArrayList<>();
        Collections.sort(queue);
        for(int i=0;i<=queue.get(queue.size()-1);i++){
            if(queue.contains(i)){
                sequence.add(i);
            }
        }
        HeadMovement = sequence.get(sequence.size()-1);
        System.out.println("Sequence: " + sequence);
        System.out.println("Head Movement: " + HeadMovement);
    }
}
