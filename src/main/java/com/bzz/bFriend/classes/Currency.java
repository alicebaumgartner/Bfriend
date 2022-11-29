package com.bzz.bFriend.classes;

import com.bzz.bFriend.enums.Country;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Currency")
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double currencyRate;

    public Currency() {

    }

    public Currency(String name, double currencyRate) {
        super();
        this.name = name;
        this.currencyRate = currencyRate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(double currencyRate) {
        this.currencyRate = currencyRate;
    }

    @Override
    public String toString() {
        return "Currency [id=" + id + ", name=" + name + ", currencyRate=" + currencyRate  + "]";
    }
}
