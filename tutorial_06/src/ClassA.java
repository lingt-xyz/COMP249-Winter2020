import java.io.IOException;

public class ClassA {
    public void test() throws IOException {
        throw new IOException();
    }

    public void compare(Object o){

    }

    public void compare(ClassA a){

    }
}
