// Copyright 2024 Justin Schlag

import java.util.ArrayList;

/**
 * Order class stores information about Products and how many are included in an
 * Order instance.
 */
public class Order {
    private ArrayList<Product> productList;
    private ArrayList<Integer> countList;
    private double stateTax;
    private double federalTax;
    private boolean isFederalTaxSet; // Tracks if the federal tax was explicitly set
    private double shipping;

    /**
     * Default Order constructor
     *
     * Initializes any arrays or ArrayLists required, as well as tax and shipping info.
     */
    public Order() {
        productList = new ArrayList<>();
        countList = new ArrayList<>();
        stateTax = 0.0;
        federalTax = 0.0;
        isFederalTaxSet = false;
        shipping = 0.0;
    }

    /**
     * The addProduct method is called once per Product instance. Expected to
     * be used by ShoppingCart, it will not be called until the final Order
     * instance is ready to be returned.
     *
     * @param product Description of product(s) added to Order instance.
     * @param count   Number of products represented in instance.
     */
    public void addProduct(Product product, int count) {
        if (product != null && count > 0) {
            productList.add(product);
            countList.add(count);
        }
    }

    /**
     * Mutator for state tax.
     *
     * @param stateTax Must be greater than or equal to 0.
     */
    public void setStateTax(double stateTax) {
        if (stateTax >= 0) {
            this.stateTax = stateTax;
        }
    }

    /**
     * Mutator for federal tax.
     *
     * @param federalTax Must be greater than or equal to 0.
     */
    public void setFederalTax(double federalTax) {
        if (federalTax >= 0) {
            this.federalTax = federalTax;
            this.isFederalTaxSet = true; // Mark that it has been explicitly set
        }
    }

    /**
     * Mutator for shipping costs.
     *
     * @param shipping Must be greater than or equal to 0.
     */
    public void setShipping(double shipping) {
        if (shipping >= 0) {
            this.shipping = shipping;
        }
    }

    /**
     * The completeOrder method returns a final order with all calculations as a
     * string.
     *
     * @return The formatted string as described in the specification.
     */
    public String completeOrder() {
        StringBuilder orderDetails = new StringBuilder();
        double productTotal = 0.0;

        // Append product list details
        orderDetails.append("Product List\n");
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            int count = countList.get(i);
            orderDetails.append("\t")
                        .append(product.toString())
                        .append("\t")
                        .append(count)
                        .append("\n");
            productTotal += product.price() * count;
        }

        // Use the explicitly set federal tax or default to 0 if not set
        double applicableFederalTax = isFederalTaxSet ? federalTax : 0.0;
        double stateTaxAmount = productTotal * stateTax;
        double federalTaxAmount = productTotal * applicableFederalTax;
        double orderTotal = productTotal + stateTaxAmount + federalTaxAmount + shipping;

        // Add order summary
        orderDetails.append("Order Summary\n");
        orderDetails.append("\tProduct Total:\t$").append(String.format("%.2f", productTotal)).append("\n");

        // Display state tax line only if greater than 0
        if (stateTax > 0) {
            orderDetails.append("\tState Tax:\t$").append(String.format("%.2f", stateTaxAmount)).append("\n");
        }

        // Display federal tax line only if greater than 0
        if (isFederalTaxSet && federalTax > 0) {
            orderDetails.append("\tFederal Tax:\t$").append(String.format("%.2f", federalTaxAmount)).append("\n");
        }

        // Always display shipping, even if zero
        orderDetails.append("\tShipping:\t$").append(String.format("%.2f", shipping)).append("\n");
        orderDetails.append("\tOrder Total:\t$").append(String.format("%.2f", orderTotal)).append("\n");

        return orderDetails.toString().trim();
    }
}
