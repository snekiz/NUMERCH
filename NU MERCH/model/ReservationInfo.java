package model;

public class ReservationInfo {
   private String Name;
   private String Address;
   private String StudentNumber;
   private String ContactNumber;
   private String Date;
   private String productname;
   private String size;
   private String style;
   private int qty;

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

    public String getStudentNumber() {
        return this.StudentNumber;
    }

    public void setStudentNumber(String studentNum) {
        this.StudentNumber = studentNum;
    }

    public String getContactNumber() {
        return this.ContactNumber;
    }

    public void setContactNumber(String contactnumber) {
        this.ContactNumber = contactnumber;
    }

    public String getDate() {
        return this.Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }

     public String getProductName() {
        return this.productname;
    }

    public void setProductName(String Productname) {
        this.productname = Productname;
    }

    public String getsize() {
        return this.size;
    }

    public void setsize(String Size) {
        this.size = Size;
    }

    public String getstyle() {
        return this.style;
    }

    public void setstyle(String Style) {
        this.style = Style;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int Qty) {
        this.qty = Qty;
    }
}
