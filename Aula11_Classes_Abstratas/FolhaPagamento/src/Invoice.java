public class Invoice implements Payable{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

   public Invoice(String part, String description, int count, double price){
       this.partNumber = part;
       this.partDescription = description;
       setQuantity(count);
       setPricePerItem(price);
   }

  public double getPaymentAmount(){
       return getQuantity() * getPricePerItem();
   }

   
public String getPartNumber() {
    return partNumber;
}

public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
}

public String getPartDescription() {
    return partDescription;
}

public void setPartDescription(String partDescription) {
    this.partDescription = partDescription;
}

public int getQuantity() {
    return quantity;
}

public void setQuantity(int quantity) {
    this.quantity = quantity;
}

public double getPricePerItem() {
    return pricePerItem;
}

public void setPricePerItem(double pricePerItem) {
    this.pricePerItem = pricePerItem;
} 

public String toString(){
    return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", "Invoice"
    , "partNumber", getPartNumber(), getPartDescription(), "quantity", this.getQuantity(),
    "price per item", this.getPricePerItem());
}
   
}
