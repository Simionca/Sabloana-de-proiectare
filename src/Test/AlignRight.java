package Test;

public class AlignRight implements AlignStrategy {
    public void render(txt t) {
        System.out.println(t.getNume()+".txt" +"_____");
    }
}