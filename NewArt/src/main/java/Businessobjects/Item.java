package Businessobjects;

public class Item {

    private String itemName;
    private String sku;
    private String price;

    public String getItemName() {return itemName;}
    public void setItemName(String itemName) {this.itemName = itemName;}

    public String getSku() {return sku;}
    public void setSku(String sku) {this.sku = sku;}

    public String getPrice() {return price;}
    public void setPrice(String price) {this.price = price;}

    public Item() {
        this.itemName = "Blouse";
        this.sku = "demo_2";
        this.price = "27.00";
    }

}
