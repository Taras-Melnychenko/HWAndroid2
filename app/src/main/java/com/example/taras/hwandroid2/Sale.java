package com.example.taras.hwandroid2;

/**
 * Created by Taras on 26.11.2016.
 */
//Создать класс для учета продаж (поля: товар, производитель, покупатель
// , количество, цена за единицу, общая стоимость).
public class Sale {

    private String item;
    private String brand;
    private int count;
    private String buyer;
    private int pricePerItem;
    private int allPrice;

    public Sale(String item, String brand, int count, String buyer, int pricePerItem, int allPrice) {
        this.item = item;
        this.brand = brand;
        this.count = count;
        this.buyer = buyer;
        this.pricePerItem = pricePerItem;
        this.allPrice = allPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sale sale = (Sale) o;

        if (count != sale.count) return false;
        if (pricePerItem != sale.pricePerItem) return false;
        if (allPrice != sale.allPrice) return false;
        if (!item.equals(sale.item)) return false;
        if (!brand.equals(sale.brand)) return false;
        return buyer.equals(sale.buyer);

    }

    @Override
    public int hashCode() {
        int result = item.hashCode();
        result = 31 * result + brand.hashCode();
        result = 31 * result + count;
        result = 31 * result + buyer.hashCode();
        result = 31 * result + pricePerItem;
        result = 31 * result + allPrice;
        return result;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "item='" + item + '\'' +
                ", brand='" + brand + '\'' +
                ", count=" + count +
                ", buyer='" + buyer + '\'' +
                ", pricePerItem=" + pricePerItem +
                ", allPrice=" + allPrice +
                '}';
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public int getAllPrice() {
        return allPrice;
    }

    public void setAllPrice(int allPrice) {
        this.allPrice = allPrice;
    }
}
