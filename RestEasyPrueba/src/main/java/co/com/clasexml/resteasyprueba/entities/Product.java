/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.clasexml.resteasyprueba.entities;

/**
 *
 * @author jaro
 */
public class Product {

    private String code;
    private String name;
    private double cost;
    
    public Product() {
    }
    
    public Product(String code, String name, double cost) {
        this.code = code;
        this.name = name;
        this.cost = cost;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" + "code=" + code + ", name=" + name + ", cost=" + cost + '}';
    }
}
