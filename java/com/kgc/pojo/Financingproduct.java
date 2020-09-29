package com.kgc.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Financingproduct {
    private Long id;

    private Long risk;

    private String income;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date salestarting;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date saleend;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date end;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRisk() {
        return risk;
    }

    public void setRisk(Long risk) {
        this.risk = risk;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income == null ? null : income.trim();
    }

    public Date getSalestarting() {
        return salestarting;
    }

    public void setSalestarting(Date salestarting) {
        this.salestarting = salestarting;
    }

    public Date getSaleend() {
        return saleend;
    }

    public void setSaleend(Date saleend) {
        this.saleend = saleend;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}