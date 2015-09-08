import controllers.MyController2;
import org.junit.Test;
import play.mvc.Result;
import play.test.FakeRequest;

import static play.test.Helpers.*;

import static play.test.Helpers.GET;

/**
 * Simple (JUnit) tests that can call all parts of a play app.
 * If you are interested in mocking a whole application, see the wiki for more details.
 */
public class MyTest2 {

    @Test
    public void sc2() {
        System.out.println("hello!2222");
    }


    @Test
    public void sc3() {
        Result result = MyController2.index2();

        System.out.println(result.toString());
    }

    @Test
    public void sc4() {
        System.out.println("helloworld");
    }

}
