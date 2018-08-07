public class Player {

    String name;
    int number;
    int transferMarketPrice;

    public Player(String name,int number, int transferMarketPrice) {
        super();
        this.name=name;
        this.number=number;
        this.transferMarketPrice=transferMarketPrice;
    }

    public void speak(){
        System.out.println("Zovem se " + name + ".");
        System.out.println("Nosim broj " + number + ".");
        System.out.println("Vrijedim " + transferMarketPrice + " million €" + ".");
    }



}