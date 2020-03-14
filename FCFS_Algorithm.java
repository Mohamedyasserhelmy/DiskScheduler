import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.io.File;
import java.util.Scanner;
import java.lang.Math;


public class FCFS_Algorithm implements Scheduler{
    static Queue<Integer> q = new LinkedList<>();
    static LinkedList<Integer> sequence;
    static int HeadPointer;
    static int HeadMovment;

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

    static void findSequence(Queue<Integer> q){
        int a = HeadPointer;
        HeadMovment = 0;
        int b;
        sequence = new LinkedList<>();

        while(!q.isEmpty()){
            b = q.remove();
            HeadMovment += Math.abs(b-a);
            a = b;
            sequence.add(b);
        }
    }

    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("FCFS_Input.txt");
        Scanner sc = new Scanner(file);
        String str = sc.nextLine();
        String Input[] = str.split("[\\s,]+");
        for(String s:Input){
           q.add(Integer.parseInt(s));
        }
        str = sc.nextLine();
        HeadPointer = Integer.parseInt(str);
        findSequence(q);
        System.out.println(sequence);
        System.out.println(HeadMovment);
        sc.close();
    }
}
