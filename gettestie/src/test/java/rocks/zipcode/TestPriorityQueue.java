package rocks.zipcode;

import org.junit.Assert;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPriorityQueue {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestPriorityQueue() {

        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>();
        stringPriorityQueue.add("One");
        stringPriorityQueue.add("Two");
        stringPriorityQueue.add("Three");
        stringPriorityQueue.add("Four");

        Iterator<String> i = stringPriorityQueue.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        Assert.assertEquals("Four", stringPriorityQueue.peek());

        stringPriorityQueue.remove("Four");

        Assert.assertEquals("One", stringPriorityQueue.peek());

        Assert.assertEquals(3, stringPriorityQueue.size());
    }

}
