import java.util.Arrays;

public class App {
    public static void main(String[] args) {
    DataCollection dataCollection = DataCollection.getInstance();
    dataCollection.add(10);
    dataCollection.add(20);
    dataCollection.add(30);
    
    System.out.println(dataCollection.get(0));
    System.out.println(dataCollection.get(1));
    System.out.println(dataCollection.get(2));

    System.out.println();
    
    
    DataCollection dataCollection2 = DataCollection.getInstance();
    dataCollection2.add(40);

    System.out.println(dataCollection2.get(0));
        System.out.println(dataCollection2.get(1));
            System.out.println(dataCollection2.get(2));
                System.out.println(dataCollection2.get(3));

                dataCollection2.remove(1);
                System.out.println();

                System.out.println(dataCollection2.get(0));
                System.out.println(dataCollection2.get(1));
                System.out.println(dataCollection2.get(2));
}
}

class DataCollection {

    private Object[] data;

    private static DataCollection instance;

    private DataCollection(){

    }
    public static DataCollection getInstance(){
        if(instance == null){
           instance = new DataCollection();
        }
        return instance;
    }

    public void add (Object object) {
        if (data == null) {
            data = new Object[1];
        } else {
            data = Arrays.copyOf(data, data.length +1);
            
        }
        data[data.length - 1] = object;
    }
    //HW1:
        public void remove(int index) {
        if (data == null || index < 0 || index >= data.length) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }

        
        for (int i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }

        data = Arrays.copyOf(data, data.length - 1);
    }

       
    public Object get(int index) {
        return data[index];
    }
}