package model;

public class CustomerInfo{
   private String Name;
   private String Address;
   private boolean Codprice = false;
   private String Mop;

    public String getCustomerName() {
        return this.Name;
    }

    public void setCustomerName(String name) {
        this.Name = name;
    }

    public String getCustomerAddress() {
        return this.Address;
    }

    public void setCustomerAddress(String address) {
        this.Address = address;
    }

    public boolean getCustomercod() {
        return this.Codprice;
    }

    public void setCustomercod(boolean codprice) {
        this.Codprice = codprice;
    }

    public String getCustomerMop() {
        return this.Mop;
    }

    public void setCustomerMop(String mop) {
        this.Mop = mop;
    }
}