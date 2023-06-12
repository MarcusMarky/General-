public class Book extends Thing {

    private String name;
 
    public Book() {
        this.name = "";
    }

    public Book(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Book: " + getName();
    }

    @Override
    public void setName(String name) {
       this.name = name;
    }

    @Override
    public String getName() {
       return name;
    }
    
}
