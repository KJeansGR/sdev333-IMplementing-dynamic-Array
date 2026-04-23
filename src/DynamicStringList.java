public class DynamicStringList implements StringList{

    
    String[] backingArray;

    public DynamicStringList(int size){
        backingArray = new String[size];
    }
    public DynamicStringList(){
        backingArray = new String[10];
    }



}