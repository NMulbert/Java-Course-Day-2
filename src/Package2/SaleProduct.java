package Package2;

public class SaleProduct extends Product{
    private int Discount;

    public SaleProduct(int discount) {
        Discount = discount;
    }

    public int CalculateFinalPrice(int productPrice){
        return productPrice - Discount;
    }
}
