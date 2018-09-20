package part1.chapter1_5_4.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Objects;

/**
 * 测试一下简单的lambda表达式吧
 * @author RippleChan
 * @date 2018-09-19
 * @time 22:51
 */
public class SyntacticTest {

    @Test
    public void test1() throws InterruptedException {
        Runnable runnable = () -> System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }
        Thread.sleep(1000L);
    }

    @Test
    public void test2() {
        SyntacticInterface syntacticInterface = (a, b) -> a + b;
        Integer add = syntacticInterface.add(1, 2);
        System.out.println(add);
    }

    @Test
    public void test3() {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(1);
        objects.add(null);
        System.out.println(objects.size());
        objects.removeIf(Objects::isNull);
        System.out.println(objects.size());
    }

    @Test
    public void test4() {
        StringStr stringStr = String::trim;
        String str = stringStr.test("stetue  ");
        System.out.println(str);
    }

}
