import java.lang.reflect.Field;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestDel {



    @org.junit.Test
    public void testdelEvent() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        /*
         * 一个函数必定会会有作用，所以我们从它发生的作用来测试
         * 通过检测ArrayList的长度来检测函数是否发生作用
         * 第一次通过添加事件使之增加1，然后用delEvent函数使之减少1
         * */

        Log log = new Log("123456", "123456");
        Event event = new Event("唱，跳，rap篮球", "2020 07 08", false);
        log.addEvent("唱，跳，rap篮球 ", "2020 07 08", false);

        Class logClass = log.getClass();
        Field field = logClass.getDeclaredField("events");
        field.setAccessible(true);
        Object obj=field.get(log);
        ArrayList<Event> eventArrayList=(ArrayList<Event>)obj;
        assertEquals(1,eventArrayList.size());

        log.delEvent(0);
        assertEquals(0,eventArrayList.size());



    }
}