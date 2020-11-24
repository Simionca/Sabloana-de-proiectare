package Test;

public class AlignCenter implements AlignStrategy {


    @Override
    public void render(txt t) {
        System.out.println("___"+t.getNume()+".txt"+"___");
    }
}