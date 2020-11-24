package Test;

public class mp3 implements Fisier{
    String nume;
    public mp3(String n){
        nume=n;
    }
    public void print()
    {
        System.out.println(nume+".mp3");
    }
    public void accept(VisitorSpace visitor) {
        visitor.visit(this);
    }
}