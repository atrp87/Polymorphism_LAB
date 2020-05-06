import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> items;
//    private ArrayList<DebitCard> debitCards;
//    private ArrayList<LoyaltyCard> loyaltyCards;
//    private ArrayList<Ticket> tickets;

    public Wallet(String name) {
        this.name = name;
        this.items = new ArrayList<IScan>();
//        this.debitCards = new ArrayList<DebitCard>();
//        this.loyaltyCards = new ArrayList<LoyaltyCard>();
//        this.tickets = new ArrayList<Ticket>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.items.size();
    }

    public void addItem(IScan item) {
        this.items.add(item);
    }

//    public void addItem(DebitCard item) {
//        this.items.add(item);
//    }
//
//    public void addItem(LoyaltyCard item) {
//        this.items.add(item);
//    }
//
//    public void addItem(Ticket item) {
//        this.items.add(item);
//    }
}
