import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
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

        //Demo d = new Demo();
        //d.get_input();

        //Disk di = new Disk(new FCFS_Algorithm());

        //di.callStrategy(d.NeedleHead, d.input);
        //38 180 130 10 50 15 190 90 150
    }

}
