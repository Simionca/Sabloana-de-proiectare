public class AlignLeft implements AlignStrategy{

    public void render(Paragraph n)
    {
        System.out.println("        "+n.getName() );
    }
}
