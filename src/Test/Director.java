package Test;

import java.io.IOException;
import java.util.ArrayList;

public class Director {
    String nume;
    public ArrayList<Fisier> content=new ArrayList<>();
    public Director(String n){
        nume=n;
    }
    public void add(Fisier f)
    {
        content.add(f);
    }
    public void accept(VisitorSpace visitor){
        visitor.visit(this);
        for(Fisier elem : content){
            elem.accept(visitor);
        }
    }
    public void print() throws IOException {
        System.out.println("Director " + nume);
        for (Fisier e : content) {

            e.print();
        }
    }
}