public class App {
    public static void main(String[] args) {
        Cabinet cabinet = new Cabinet();

     
        Book book = new Book("Harry Potter ");
        cabinet.put("MiddleShelf", book);

     
        Tablet tablet = new Tablet("Apple   ");
        cabinet.put("TopShelf", tablet);

        Phone phone = new Phone("Samsung    ");
        cabinet.put("BottomShelf", phone);

            System.out.println(cabinet.toString());

    }
}