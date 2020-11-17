import java.util.ArrayList;

public class Book {
    String title;
    public Author autor;
    public ArrayList<Element> content = new ArrayList<>();

    public Book(String title)
    {
        this.title = title;
    }
    public void addAuthor(Author a)
    {
        autor =a;
    }
    public void addContent(Element e)
    {
        content.add(e);
    }
    public void print()
    {
        System.out.println("Book:" + title);
        System.out.println("Author:" + autor.name);
        for(Element e: content)
        {
            e.print();
        }
    }

    public void accept(Visitor v){
        v.visit(this);
        for(Element i:content){
            i.accept(v);
        }
    }
}