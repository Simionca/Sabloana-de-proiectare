package Test;

public class svg implements Fisier{
    String nume;
    public svg(String n){
        nume=n;
    }
    public void print()
    {
        System.out.println(nume+".svg");
    }
    public void accept(VisitorSpace visitor) {
        visitor.visit(this);
    }
}