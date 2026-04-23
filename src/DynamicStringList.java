public class DynamicStringList implements StringList{

    
    String[] backingArray;
    int size = 0;
    int capacity = 10;

    public DynamicStringList(int size){
        backingArray = new String[size];
        capacity = size;
    }
    public DynamicStringList(){
        backingArray = new String[capacity];
        
    }

    public String get(int index) {
        if (index > size) {
            throw new IllegalArgumentException("index out of bounds");
        }
        return backingArray[index];
    }
    public void set(int index, String value){
        if (index > size || index < 0) {
            throw new IllegalArgumentException("index out of bounds");
        }
        backingArray[index] = value;
    }

    public void add(String word){
        if (word == null || word.length() == 0) {
            throw new IllegalArgumentException("cannot be null or empty");
        }
        if (size + 1 > capacity) {
            throw new IndexOutOfBoundsException("no more capacity");
        }
        backingArray[size] = word;
        size++;

    }
    public String remove(int index){
        if (index > size || index < 0) {
            throw new IllegalArgumentException("index out of bounds");
        }
        String word = backingArray[index];
        size --;
        return word;
    }
      public int size(){
        return size;
      }

      public int capacity(){
        return capacity;
      }
}