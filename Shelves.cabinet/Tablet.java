public class Tablet extends Thing {

    private String name;
 
    public Tablet() {
        this.name = "";
    }

    public Tablet(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Tablet: " + getName();
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