package com.yash.microservices.labs.moneyconversionservice;

import java.math.BigDecimal;

public class MoneyConversion {
    private Long id;
    private String from;
    private String to;
    private BigDecimal quantity;
    private BigDecimal conversionMultiple;
    private BigDecimal totolCalculatedAmmount;
    private String environment;

    public MoneyConversion() {
    }

    public MoneyConversion(Long id, String from, String to, BigDecimal quantity, BigDecimal conversionMultiple, BigDecimal totolCalculatedAmmount, String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.quantity = quantity;
        this.conversionMultiple = conversionMultiple;
        this.totolCalculatedAmmount = totolCalculatedAmmount;
        this.environment = environment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public BigDecimal getTotolCalculatedAmmount() {
        return totolCalculatedAmmount;
    }

    public void setTotolCalculatedAmmount(BigDecimal totolCalculatedAmmount) {
        this.totolCalculatedAmmount = totolCalculatedAmmount;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
