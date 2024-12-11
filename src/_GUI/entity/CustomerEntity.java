package _GUI.entity;

public class CustomerEntity {
    private String customerID;
    private String customerName;
    private int age;
    private String level;
    String jab;
    private int savedMoney;

    public String getCustomerID() {
        return customerID;
    }

    public int getSavedMoney() {
        return savedMoney;
    }

    public void setSavedMoney(int savedMoney) {
        this.savedMoney = savedMoney;
    }

    public String getJab() {
        return jab;
    }

    public void setJab(String jab) {
        this.jab = jab;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
