import java.awt.*;

public class ImageProxy implements Element{

    public String nameProxy;
    Image realImage=null;

    ImageProxy(String name)
    {
        this.nameProxy=name;
    }

    public void print()
    {
        if(realImage==null)
        {
            realImage= new Image(this.nameProxy);
        }
        realImage.print();
    }

}
