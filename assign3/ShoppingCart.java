//Copyright 2024 Justin Schlag 


import java.util.ArrayList;

/**
 * The ShoppingCart class is a purely static class with both static methods and
 * attributes. The class needs to store a collection of Products and corresponding
 * counts.
 */
public class ShoppingCart {
    private static ArrayList<Product> productList = new ArrayList<>();
    private static ArrayList<Integer> countList = new ArrayList<>();
    private static double shipping;
    private static double federalTax;
    private static double stateTax;

    /**
     * The reset method initializes or clears any lists maintained and sets or
     * resets any shipping or taxes. Assume this is always called once before building
     * a new Order by adding/removing/deleting product instances.
     * 
     * @param shipping Value assigned as a shipping fee; must be >= 0.0
     * @param federalTax Value assigned as any federal taxes; must be >= 0.0
     * @param stateTax Value assigned as any state taxes; must be >= 0.0
     */
    public static void reset(double shipping, double federalTax, double stateTax) {
        if (shipping >= 0.0 && federalTax >= 0.0 && stateTax >= 0.0) {
            productList.clear();
            countList.clear();
            ShoppingCart.shipping = shipping;
            ShoppingCart.federalTax = federalTax;
            ShoppingCart.stateTax = stateTax;
        }
    }

    /**
     * Method addProduct accepts a Product instance. If the added Product instance
     * does not yet exist in the shopping cart, the method makes a copy of the
     * instance and sets count to 1. If the Product instance exists, the method
     * increases count by 1.
     * 
     * @param product The Product instance to add to the shopping cart.
     */
    public static void addProduct(Product product) {
        if (product != null) {
            int index = findProductIndex(product);
            if (index == -1) {
                productList.add(product);
                countList.add(1);
            } else {
                countList.set(index, countList.get(index) + 1);
            }
        }
    }

    /**
     * The buildOrder method creates an order from the present state of the
     * ShoppingCart's lists.
     * 
     * @return A complete Order instance, ready to be completed.
     */
    public static Order buildOrder() {
        Order order = new Order();
        order.setShipping(shipping);
        order.setFederalTax(federalTax);
        order.setStateTax(stateTax);

        for (int i = 0; i < productList.size(); i++) {
            order.addProduct(productList.get(i), countList.get(i));
        }

        return order;
    }

    /**
     * The getContents method is essentially a toString method for a static class.
     * 
     * @return A string representing the product list with counts in the format:
     *         <<product id>> : <<product count>>
     */
    public static String getContents() {
        StringBuilder contents = new StringBuilder();
        for (int i = 0; i < productList.size(); i++) {
            String formattedId = String.format("%010d", productList.get(i).id());
            int count = countList.get(i);
            contents.append(formattedId).append(" : ").append(String.format("%4d", count)).append("\n");
        }
        return contents.toString().trim(); // Remove trailing newline
    }

    /**
     * The removeProduct method decrements the count of, or removes the Product parameter.
     * 
     * @param product The Product instance to be removed or decremented.
     */
    public static void removeProduct(Product product) {
        int index = findProductIndex(product);
        if (index != -1) {
            int currentCount = countList.get(index);
            if (currentCount > 1) {
                countList.set(index, currentCount - 1);
            } else {
                productList.remove(index);
                countList.remove(index);
            }
        }
    }

    /**
     * The deleteProduct method removes all instances of the product parameter.
     * 
     * @param product The Product instance to be removed completely from the lists.
     */
    public static void deleteProduct(Product product) {
        int index = findProductIndex(product);
        if (index != -1) {
            productList.remove(index);
            countList.remove(index);
        }
    }

    /**
     * Helper method to find the index of a product in the productList.
     * 
     * @param product The Product to search for.
     * @return The index of the product in the productList, or -1 if not found.
     */
    private static int findProductIndex(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).equals(product)) {
                return i;
            }
        }
        return -1;
    }
}
