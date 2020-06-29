package test;

import main.Event;
import main.Log;

import java.lang.reflect.Field;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class LogTest {



    @org.junit.Test
    public void testAddEvent() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        /*编写void返回值的函数的测试需要另辟蹊径
         * 我们都知道 函数必定会会有作用，我们课以从他发生的作用来测试  而不必着眼于返回值
         * */
//        还有一个问题就是Log类中的状态是private类型的   是不能够被直接访问的  所以需要使用反射机制

        Log log = new Log("123456", "123456");
        Event event = new Event("吃饭", "2020 10 10", false);
        log.addEvent("吃饭", "2020 10 10", false);
        Class logClass = log.getClass();
        Field field = logClass.getDeclaredField("events");
        field.setAccessible(true);
        Object obj=field.get(log);
        ArrayList<Event> eventArrayList=(ArrayList<Event>)obj;
        assertEquals("吃饭",eventArrayList.get(0).getEvent());
        assertEquals("2020 10 10",eventArrayList.get(0).getDate());
        assertEquals(false,eventArrayList.get(0).getStatus());

    }
}