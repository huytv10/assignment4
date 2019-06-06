public class Product {
    private int id;
    private String productName;
    private int qTy;
    private int price;


    public Product() {
    }

    public Product(int id, String productName, int qTy, int price) {
        this.id = id;
        this.productName = productName;
        this.qTy = qTy;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getqTy() {
        return qTy;
    }

    public void setqTy(int qTy) {
        this.qTy = qTy;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void checkQty() {
        if (getqTy() > 0) {
            System.out.println("con hang");
        } else {
            System.out.println("het hang");
        }
    }
}
