import java.util.ArrayList;

public class Section implements Element {
    public String title;
    public ArrayList<Element> content=new ArrayList<>();

    Section(String t)
    {
        title=t;
    }

    public void add(Element e)
    {
        content.add(e);
    }

    public void remove(Element e)
    {
        content.remove(e);
    }

    public Element getElement(int index){
        return content.get(index);
    }

    public void print()
    {
        System.out.println(title);
        for(Element e:content)
        {

            e.print();
        }
    }
}