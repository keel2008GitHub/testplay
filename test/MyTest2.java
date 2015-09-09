import controllers.MyController2;
import controllers.routes;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import play.db.jpa.JPA;
import play.db.jpa.JPAPlugin;
import play.mvc.Result;
import play.test.FakeApplication;
import play.test.FakeRequest;
import play.test.Helpers;
import scala.Option;

import javax.persistence.EntityManager;

import static play.test.Helpers.*;

import static play.test.Helpers.GET;

/**
 * Simple (JUnit) tests that can call all parts of a play app.
 * If you are interested in mocking a whole application, see the wiki for more details.
 */
public class MyTest2 {

    private EntityManager em;

    @Before
    public void setUp() {
        FakeApplication app = Helpers.fakeApplication();
        Helpers.start(app);
        Option<JPAPlugin> jpaPlugin = app.getWrappedApplication().plugin(JPAPlugin.class);
        em = jpaPlugin.get().em("default");
        JPA.bindForCurrentThread(em);
    }

    @After
    public void tearDown() {
        JPA.bindForCurrentThread(null);
        em.close();
    }

    @Test
    public void sc4() {
        Result result = callAction(
                controllers.routes.ref.MyController2.index(),
                new FakeRequest(GET, "/")
        );

        System.out.println("");


        System.out.println(contentAsString(result));
    }

}
