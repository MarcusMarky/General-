public class Phone extends Thing{
    
    private String name;
    
   public Phone() {
        this.name = "";
    }

    public Phone(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Phone : " + getName();
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