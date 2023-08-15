public class Production {
    public Production(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    private String productId;

    private String productName;

    public String getproductName() {
        return productName;
    }
    public String getproductId() {
        return productId;
    }
}