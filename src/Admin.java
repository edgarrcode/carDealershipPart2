public class Admin implements User {

//public abstract class Person {
String username;
String password;
String fullName;
double money;
String id;
String membership;

String carsBought;
    public Admin (String id, String fullName, double money,String carsBought, String membership,String username, String password) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.money = money;
        this.id = id;
        this.carsBought=carsBought;
        this.membership = membership;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String isMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public String getCarsBought() {
        return carsBought;
    }

    public void setCarsBought(String carsBought) {
        this.carsBought = carsBought;
    }
}