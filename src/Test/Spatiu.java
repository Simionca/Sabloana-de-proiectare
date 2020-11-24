package Test;

public class Spatiu implements Command{
    public void execute(){

        Director d= DirectorManager.getInstance().getDir();
        if(d!=null) {
            SpatiuStatistics stats = new SpatiuStatistics();
            d.accept(stats);
            stats.printStatistics();
            System.out.println("Statistics");
        }
    }
}