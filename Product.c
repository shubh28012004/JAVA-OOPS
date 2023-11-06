class Product {
    String name;
    int code;
    double amount;

    Product(String n, int c, double p) {
        name = n;
        code = c;
        amount = p;
    }

    void show() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Code: " + code);
        System.out.println("Sale Amount: $" + amount);
    }
}

class Sales extends Product {
    int day;
    double tax;
    double totamt;

    Sales(String n, int c, double p, int d) {
        super(n, c, p);
        day = d;
        compute();
    }

    void compute() {
        tax = 0.124 * amount;
        if (day > 30) {
            double fine = 0.025 * amount;
            totamt = amount + tax + fine;
        } else {
            totamt = amount + tax;
        }
    }

    @Override
    void show() {
        super.show();
        System.out.println("Days Taken: " + day);
        System.out.println("Service Tax: $" + tax);
        System.out.println("Total Amount Paid: $" + totamt);
    }
}
