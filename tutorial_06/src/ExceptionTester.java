import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

public class ExceptionTester {

    int a;
    public void method1() throws FileNotFoundException {
        Object o;
        throw new FileNotFoundException();
    }

    public void method2() throws IOException {
        throw new IOException();
    }

    public void method3() throws IOError {
        throw new IOError(new IOException());
    }
}
