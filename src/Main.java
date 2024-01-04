
import Models.Tshirt;
import Models.Order;

    public class Main {
        public static void main(String[] args) {
            // Create T-shirt objects
            Tshirt tShirt1 = new Tshirt("Gorkhali Batman",  572, 1235.0, "Karuna ",
                    "You either die a hero or live long enough to see yourself be a villain", new String[]{"XL", "Medium", "Large"});

            // Description of the T-shirt
            tShirt1.describeTShirt();

            // Create Order objects
            Order order1 = new Order("Gopal Sharma", "0486756465",
                    new int[]{572}, new double[]{1235.0});

            // Print the bill with VAT
            order1.printBillWithVAT();
        }
    }