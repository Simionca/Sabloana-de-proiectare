package Test;

import java.io.IOException;

public interface Fisier {

    void print() throws IOException;
    void accept(VisitorSpace visitor);
}
