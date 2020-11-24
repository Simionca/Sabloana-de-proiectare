package Test;

public class DirectorManager {
    public static DirectorManager instance;
    private static Director instanced_book;
    private DirectorManager(){
    }
    public static DirectorManager getInstance(){
        if(instance==null){
            instance=new DirectorManager();
        }
        return instance;
    }
    public static Director getDir()
    {
        return instanced_book;
    }
    public static void setDir(Director d)
    {
        instanced_book=d;
    }
}