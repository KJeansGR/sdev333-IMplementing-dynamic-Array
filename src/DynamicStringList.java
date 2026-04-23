public class DynamicStringList implements StringList{

    
    String[] backingArray;
    int size = 0;

    public DynamicStringList(int size){
        backingArray = new String[size];
    }
    public DynamicStringList(){
        backingArray = new String[10];
    }

    public String get(int index) {
        if (index > size) {
            throw new IllegalArgumentException("index out of bounds");
        }

        return backingArray[index];

    }


}