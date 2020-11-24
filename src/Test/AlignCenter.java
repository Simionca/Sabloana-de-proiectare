package Test;

public class AlignCenter implements AlignStrategy {
    public void render(txt t) {
        System.out.println("___"+t.getNume()+".txt"+"___");
    }
}