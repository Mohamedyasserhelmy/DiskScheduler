import java.util.ArrayList;


public class Disk {
    private Scheduler strategy;

    public Disk(Scheduler sc)
    {
        strategy = sc;
    }

    public void callStrategy(int Head, ArrayList<Integer> queue)
    {

        strategy.doAlgorithm(Head, queue);

    }
}
