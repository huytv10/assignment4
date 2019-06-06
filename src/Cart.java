import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int id;
    private String customer;
    private int tongtien;
    private List<String> productList = new ArrayList<>();
    private String city;

    public Cart() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Cart(int id, String customer, int tongtien, List<String> productList, String city) {
        this.id = id;
        this.customer = customer;
        this.tongtien = tongtien;
        this.productList = productList;
        this.city = city;
    }

    public void add(String tenSP) {
        productList.add(tenSP);
    }

    public void tinhTongTien() {
        if ("HN".equals(getCity()) || "HCM".equals(getCity())) {
            tongtien += tongtien / 100;
        } else {
            tongtien += 2 * tongtien / 100;
        }
    }
}
