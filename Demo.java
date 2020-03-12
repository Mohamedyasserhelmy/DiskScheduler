import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
   ArrayList<Integer> input = new ArrayList<>();
   int NeedleHead;
   public Demo()
   {

   }
   public void get_input()
   {
       String in = "";
       Scanner scn;
       scn = new Scanner(System.in);
       System.out.println("Initial Head start cylinder: ");
       NeedleHead = scn.nextInt();
       System.out.println("Enter sequence: ");
       while(scn.hasNext())
       {
           in+= scn.next();
       }
       for (int i =0; i < in.length(); i++)
       {
           int index = Integer.parseInt(String.valueOf(in.charAt(i)));
           input.add(index);
       }
       System.out.println(input);
   }
    public static void main(String...args)
    {
        /*Demo d = new Demo();
        d.get_input();*/
        //Disk di = new Disk(new //Your Class name());
        //di.callStrategy(d.NeedleHead, d.input);
    }

}
