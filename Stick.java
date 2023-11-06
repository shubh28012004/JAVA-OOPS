class Stock {
    String item;
    int qt;
    double rate;
    double amt;

    Stock(String item, int qt, double rate) {
        this.item = item;
        this.qt = qt;
        this.rate = rate;
        this.amt = qt * rate;
    }

    void display() {
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qt);
        System.out.println("Unit Price: $" + rate);
        System.out.println("Net Value: $" + amt);
    }
}

class Purchase extends Stock {
    int pqt;
    double prate;

    Purchase(String item, int qt, double rate, int pqt, double prate) {
        super(item, qt, rate);
        this.pqt = pqt;
        this.prate = prate;
        update();
    }

    void update() {
        qt += pqt;
        if (rate != prate) {
            rate = prate;
            amt = qt * rate;
        }
    }

    @Override
    void display() {
        super.display();
        System.out.println("Purchased Quantity: " + pqt);
        System.out.println("Purchase Rate: $" + prate);
    }
}
