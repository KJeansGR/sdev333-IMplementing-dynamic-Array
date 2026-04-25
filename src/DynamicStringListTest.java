import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class DynamicStringListTest {
    @Test
    public void testConstructorInitialSizeisZero(){

        DynamicStringList list = new DynamicStringList();
        assertEquals(list.size(), 0);
    }
    @Test
    public void testConstructorWithInputCapacity(){

        DynamicStringList list = new DynamicStringList(100);
        
        assertEquals(list.capacity(), 100);
    }
    @Test
    public void testAddWithSize() {
        DynamicStringList list = new DynamicStringList();
        list.add("Apple");
        list.add("Strawberry");
        assertEquals(2, list.size());
    }
    @Test
    public void testGetReturnsCorrectValue() {
        DynamicStringList list = new DynamicStringList();
        list.add("Apple");
        list.add("Strawberry");
        assertEquals("Apple", list.get(0));
    }
    @Test
    public void testGetReturnsErrorWhenIndexOutOfBounds() {
        DynamicStringList list = new DynamicStringList();
        list.add("Apple");
        list.add("Strawberry");
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(5));
    }
    @Test
    public void testGetReturnsErrorWhenIndexOutOfBoundsNegetiveValue() {
        DynamicStringList list = new DynamicStringList();
        list.add("Apple");
        list.add("Strawberry");
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
    }
    @Test
    public void testRemoveReturnsCorrectValue() {
        DynamicStringList list = new DynamicStringList();
        list.add("Apple");
        list.add("Strawberry");
        list.add("Blueberry");
        list.add("Snozberry");
        assertEquals("Snozberry", list.get(3));
    }
    @Test
    public void testRemoveReturnsErrorWhenIndexOutOfBounds() {
        DynamicStringList list = new DynamicStringList();
        list.add("Apple");
        list.add("Strawberry");
        list.add("Blueberry");
        list.add("Snozberry");
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(5));
    }
    @Test
    public void testRemoveReturnsErrorWhenIndexOutOfBoundsNegetiveValue() {
        DynamicStringList list = new DynamicStringList();
        list.add("Apple");
        list.add("Strawberry");
        list.add("Blueberry");
        list.add("Snozberry");
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
    }
    @Test
    public void testSizeReturnsCorrectValue() {
        DynamicStringList list = new DynamicStringList(100);
        list.add("Apple");
        list.add("Strawberry");
        list.add("Blueberry");
        list.add("Snozberry");
        assertEquals(4, list.size());
    }
    @Test
    public void testCapacityReturnsCorrectValue() {
        DynamicStringList list = new DynamicStringList(100);
        assertEquals(100, list.capacity());
    }
}
