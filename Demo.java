import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Demo {
   ArrayList<Integer> input = new ArrayList<>();
   int NeedleHead;
   public Demo()
   {

   }
   public void get_input() throws IOException
   {
       String in;
       BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Initial Head start cylinder: ");
       NeedleHead = Integer.parseInt(reader1.readLine());


       System.out.println("Enter sequence: ");
       in = reader1.readLine();
       String str[] = in.split("[\\s]+");


       int index;
       for (String s:str)
       {
           index = Integer.parseInt(s);
           input.add(index);
       }
   }
    public static void main(String...args) throws IOException
    {

        Demo d = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();

        d.get_input();

        d2.input = new ArrayList<>(d.input);
        d2.NeedleHead = d.NeedleHead;

        d3.input = new ArrayList<>(d.input);
        d3.NeedleHead = d.NeedleHead;

        Disk di = new Disk(new Optimized_Algorithm());
        Disk di2 = new Disk(new FCFS_Algorithm());
        Disk di3 = new Disk(new CLOOK_Algorithm());

        System.out.println();

        di.callStrategy(d.NeedleHead, d.input);
        System.out.println();

        di2.callStrategy(d2.NeedleHead, d2.input);
        System.out.println();

        di3.callStrategy(d3.NeedleHead, d3.input);
        System.out.println();

        //38 180 130 10 50 15 190 90 150
    }

}
