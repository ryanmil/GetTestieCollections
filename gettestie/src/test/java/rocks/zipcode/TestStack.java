package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false

        assertEquals("Hello world", stack.peek());

        stack.push("Yep");
        assertEquals("Yep", stack.pop());
        assertEquals("Hello world", stack.pop());
        assertEquals(0, stack.size());
    }

    // Make a bigger test exercising more Stack methods.....
}
