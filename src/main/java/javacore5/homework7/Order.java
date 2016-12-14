package javacore5.homework7;

public class Order implements Comparable {

    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    public Order(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    @Override
    public String toString() {
        return "User [id=" + id
                + ", price=" + price
                + ", currency=" + currency
                + ", itemName=" + itemName
                + ", shopIdentificator=" + shopIdentificator
                + ", user=" + user + "]";
    }

    public int compareTo(Order order1, Order order2) {
        return order2.getPrice() - order1.getPrice();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Order other = (Order) obj;

        if (price != other.price) {
            return false;
        }
        if (currency != other.currency) {
            return false;
        }
        if (itemName == null) {
            if (other.itemName != null) {
                return false;
            }
        } else if (!itemName.equals(other.itemName)) {
            // do nothing
        }
        if (shopIdentificator == null) {
            if (other.shopIdentificator != null) {
                return false;
            }
        } else if (!shopIdentificator.equals(other.shopIdentificator)) {
            // do nothing
        }
        if (user != other.user) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + price;
        result = 31 * result + (currency == null ? 0 : currency.hashCode());
        result = 31 * result + (itemName == null ? 0 : itemName.hashCode());
        result = 31 * result + (shopIdentificator == null ? 0 : shopIdentificator.hashCode());
        result = 31 * result + (user == null ? 0 : user.hashCode());
        return result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public int compareTo(Object arg0) {
        return 1;
    }
}
