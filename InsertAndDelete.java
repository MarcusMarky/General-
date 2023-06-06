public class InsertAndDelete {
    public static void main(String[] args) {
        
        int[] data = {10,20,30,40,50};
        
        int newValue = -10;
        int indexToInsert = 2;

        int[] newData = new int[data.length + 1];

        for (int oi = 0, ci = 0; oi < data.length; oi++, ci++) {
            if (oi == indexToInsert) {
                newData[ci] = newValue;
                ci++;
            }
            newData[ci] = data[oi];
        }
       
        data = newData;

        for (int element : newData) {
            System.out.println(element);
        }
  } 
}

  
