package top.yyf.daoTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import top.yyf.dao.ActualRoomDao;
import top.yyf.util.ApplicationContextHelper;
import top.yyf.util.BeforeTest;

/**
 * ActualRoomDao Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>03/13/2017</pre>
 */
public class ActualRoomDaoTest {
    ActualRoomDao actualRoomDao;

    @Before
    public void before() throws Exception {
        BeforeTest.beforeTest();
        actualRoomDao = ApplicationContextHelper.getApplicationContext().getBean(ActualRoomDao
                .class);
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getActualRoomsByRoomPlan(int roomPlanId)
     */
    @Test
    public void testGetActualRoomsByRoomPlan() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getEmptyRoom(int rpId, String date)
     */
    @Test
    public void testGetEmptyRoom() throws Exception {
    }


} 
