package Businessobjects;

public class Item {

    private String itemName;
    private String sku;
    private Double price;

    public String getItemName() {return itemName;}
    public void setItemName(String itemName) {this.itemName = itemName;}

    public String getSku() {return sku;}
    public void setSku(String sku) {this.sku = sku;}

    public Double getPrice() {return price;}
    public void setPrice(Double price) {this.price = price;}

    public Item() {
        this.itemName = "Blouse";
        this.sku = "demo_2";
        this.price = 27.00;
    }

}
