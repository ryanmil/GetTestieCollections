package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayDeque;
import java.util.Iterator;

public class TestArrayDeque {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestArrayDeque() {

        ArrayDeque<String> stringArrayDeque = new ArrayDeque<>();
        stringArrayDeque.add("One");
        stringArrayDeque.add("Two");
        stringArrayDeque.add("Three");
        stringArrayDeque.add("Four");

        Iterator<String> i = stringArrayDeque.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        Assert.assertEquals(stringArrayDeque.pop(), "One");
        Assert.assertEquals(stringArrayDeque.peek(), "Two");
        Assert.assertEquals(stringArrayDeque.size(), 3);
    }
}
