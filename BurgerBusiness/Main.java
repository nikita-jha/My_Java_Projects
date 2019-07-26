public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "white", "chicken", 3.56);
        double price = hamburger.itemizedHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("cheese", 1.13);
        System.out.println("Total burger price is " + hamburger.itemizedHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Turkey", 5.67);
        healthyBurger.addhealthyAddition1("Carrots", 2.75);
        healthyBurger.addHealthyAddition2("Pickles", 2.75);
        System.out.println("The total price for the healthy burger is " + healthyBurger.itemizedHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition1("Candy", 10.00);
        System.out.println("The total price for the deluxe burger is " + db.itemizedHamburger());
    }
}
