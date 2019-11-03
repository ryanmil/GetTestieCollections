package rocks.zipcode;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Iterator;

public class TestHashMap {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestHashMap() {

        HashMap<String, Integer> strHashMap = new HashMap<>();
        strHashMap.put("A", 95);
        strHashMap.put("B", 80);
        strHashMap.put("C", 70);
        strHashMap.put("C", 32);

        Assert.assertEquals(32, strHashMap.get("C").intValue());

        Assert.assertEquals(3, strHashMap.size());

    }

}
