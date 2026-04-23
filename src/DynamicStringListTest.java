import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DynamicStringListTest {
    @Test
    public void testConstructor(){

        DynamicStringList list = new DynamicStringList();
        assertEquals(list.size(), 0);
    }
        @Test
    public void testConstructorWithInput(){

        DynamicStringList list = new DynamicStringList(100);
        assertEquals(list.capacity(), 100);
    }

}
