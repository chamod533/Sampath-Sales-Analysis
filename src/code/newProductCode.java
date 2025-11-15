/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author Mr.Shamly
 */
public class newProductCode {

    int tra_id;

    int c_id;
    int p_id;
    String p_name;
    int quantity;
    double p_unit;
    String date;
    double price;
    String region;

    public newProductCode(int tra_id, int c_id, int p_id, String p_name, int quantity, double p_unit, String date, double price, String region) {
        this.tra_id = tra_id;
        this.c_id = c_id;
        this.p_id = p_id;
        this.p_name = p_name;
        this.quantity = quantity;
        this.p_unit = p_unit;
        this.date = date;
        this.price = price;
        this.region = region;
    }

    public int getTra_id() {
        return tra_id;
    }

    public void setTra_id(int tra_id) {
        this.tra_id = tra_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getP_unit() {
        return p_unit;
    }

    public void setP_unit(double p_unit) {
        this.p_unit = p_unit;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}
