public class AlignCenter implements  AlignStrategy{

    public void render(Paragraph n)
    {
        System.out.println("           "+n.getName()+"         ");
    }
}
