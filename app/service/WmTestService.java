package service;

import play.db.jpa.JPA;
import po.WmTest;

/**
 * Created by keel47 on 2015/9/6.
 */
public class WmTestService {

    public WmTest getById(int id) {
        return JPA.em().find(WmTest.class, id);
    }

}
