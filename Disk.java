import java.util.ArrayList;

public class Disk {
    private Scheduler strategy;

    public Disk(Scheduler sc)
    {
        sc = this.strategy;
    }

    public void callStrategy(int Head, ArrayList<Integer> queue)
    {
        strategy.doAlgorithm(Head, queue);
    }
}
