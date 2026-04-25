public class DynamicStringList implements StringList{

    
    String[] backingArray;
    int size = 0;
    int capacity = 10; // default capacity

    // Will create a new DynamicStringList with the given initial capacity.
    public DynamicStringList(int initialCapacity){
        backingArray = new String[initialCapacity];
        capacity = initialCapacity;
    }

    // Will create a new DynamicStringList with the default initial capacity of 10.
    public DynamicStringList(){
        backingArray = new String[capacity];
        
    }
    
    // Will get and return the string at the given index. 
    // If the index is out of bounds, throw an IndexOutOfBoundsException.
    @Override
    public String get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        return backingArray[index];
    }

    // Will set the string at the given index to the given value.
    @Override
    public void set(int index, String value){
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        backingArray[index] = value;
    }

    // Will add the given string to the end of the list.
    @Override
    public void add(String word){
        if (word == null || word.length() == 0) {
            throw new IndexOutOfBoundsException("cannot be null or empty");
        }
        if (size + 1 > capacity) {
            throw new IndexOutOfBoundsException("no more capacity");
        }
        backingArray[size] = word;
        size++;

    }
    
    //Will remove the string at the given index and return it.
    @Override
    public String remove(int index){
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        String word = backingArray[index];
        size --;
        return word;
    }

    // Will return the number of strings currently in the list.
    @Override
    public int size(){
    return size;
    }

    // Will return the current capacity of the list.
    @Override
    public int capacity(){
    return capacity;
    }
}