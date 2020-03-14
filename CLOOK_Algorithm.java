import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class CLOOK_Algorithm implements Scheduler{
    @Override
    public void doAlgorithm(int Head, ArrayList<Integer> queue){


        System.out.print("Enter direction: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dir;


        try {
            dir = reader.readLine();

            ArrayList<Integer> sequence = new ArrayList<>();
            ArrayList<Integer> rightlist = new ArrayList<>();
            ArrayList<Integer> leftlist = new ArrayList<>();

            int a = Head,b,HeadMovment=0;

            for(int i:queue){

                if(i >= Head) {
                    rightlist.add(i);
                }
                else
                    leftlist.add(i);
            }
            Collections.sort(rightlist);
            Collections.sort(leftlist);
            if(dir.equals("right")){
                while(!rightlist.isEmpty()){
                    b = rightlist.get(0);
                    HeadMovment += Math.abs(b-a);
                    sequence.add(b);
                    a = b;
                    rightlist.remove(0);
                }
                while(!leftlist.isEmpty()){
                    b = leftlist.get(0);
                    HeadMovment += Math.abs(b-a);
                    sequence.add(b);
                    a = b;
                    leftlist.remove(0);
                }
            }
            else {
                while(!leftlist.isEmpty()){
                    b = leftlist.get(leftlist.size()-1);
                    HeadMovment += Math.abs(b-a);
                    sequence.add(b);
                    a = b;
                    leftlist.remove(leftlist.size()-1);
                }
                while(!rightlist.isEmpty()){
                    b = rightlist.get(rightlist.size()-1);
                    HeadMovment += Math.abs(b-a);
                    sequence.add(b);
                    a = b;
                    rightlist.remove(rightlist.size()-1);
                }
            }
            reader.close();
            System.out.println("Sequence: " + sequence);
            System.out.println("HeadMovment: " + HeadMovment);
        }
        catch (IOException e){
            System.out.println(e);
        }

    }

}
