import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class chanStatusTest {

    @Test
    void chanStatus() {
        final ByteArrayOutputStream outContent=new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Log x=new Log("李明","123456");
        x.addEvent("上课","2020.6.30",false);
        x.chanStatus(0,true);
        x.showEvents();
        Assert.assertThat(outContent.toString(), CoreMatchers.containsString("已完成！"));
    }
}
