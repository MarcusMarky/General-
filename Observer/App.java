public class App {

    public static void main(String[] args) {
        Shop shop = new Shop();
        subscribeClients(shop);
        displaySubscribers(shop);
        
        shop.addProduct(new Product("Gaming PC"));
        displayProducts(shop);
        
        shop.unsubscribe(0);
        displaySubscribers(shop);
    }

    private static void subscribeClients(Shop shop) {
        shop.subscribe(new Client("Johny Stevens"));
        shop.subscribe(new Client("Eva Malone"));
    }

    private static void displaySubscribers(Shop shop) {
        System.out.println("Shop subscribers:\n");
        for (Client client : shop.clients) {
            if (client != null) {
                System.out.println(client.fullName);
            }
        }
        System.out.println();
    }

    private static void displayProducts(Shop shop) {
        System.out.println("Shop products:\n");
        for (Product product : shop.products) {
            if (product != null) {
                System.out.println(product.name);
            }
        }
        System.out.println();
    }

}

class Shop {
    public Product[] products = new Product[5];
    public Client[] clients = new Client[10];
//HW2:
private int findEmptyIndex(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return i;
            }
        }
        return -1; 
    }

  public void addProduct(Product product) {
        int index = findEmptyIndex(products);
        if (index != -1) {
            products[index] = product;
            notifyClients(product);
        }
    }

    private void notifyClients(Product product) {
        for (Client client : clients) {
            if (client != null) {
                client.update(product);
            }
        }
    }
    
    public void subscribe(Client client) {
        int index = findEmptyIndex(clients);
        if (index != -1) {
            clients[index] = client;
        }
    }

//HW1:
     public void unsubscribe(int index) {
        if (clients[index] != null) {
            System.out.println("Unsubscribing client: " + clients[index].fullName + "\n");
            clients[index] = null;
        }
    }
}


class Product {
    public String name;
    public Product(String name){
        this.name = name;
    }
}

class Client {
    public String fullName;
    public Client(String fullName){
        this.fullName = fullName;
    }
    public void update(Product product){
        System.out.println("Client name: " + fullName + " decided to buy a " + product.name + "\n");
    }
}