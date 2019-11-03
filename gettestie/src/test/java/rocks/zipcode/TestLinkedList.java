package rocks.zipcode;

import org.junit.Assert;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestLinkedList() {

        LinkedList<String> strLinkedList = new LinkedList<>();
        strLinkedList.add("One");
        strLinkedList.add("Two");
        strLinkedList.add("Three");
        strLinkedList.add("Four");

        Iterator<String> i = strLinkedList.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        strLinkedList.add(1, "One and a Half");
        Assert.assertEquals(strLinkedList.get(1), "One and a Half");
        Assert.assertEquals(strLinkedList.get(2), "Two");

        strLinkedList.remove("One and a Half");
        Assert.assertEquals(strLinkedList.get(1), "Two");

    }

}
