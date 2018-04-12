package io.zipcoder.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Account {

    @Id
    @GeneratedValue
    @Column (name = "ACCOUNT_ID")
    private Long id;
    @Column (name = "ACCOUNT_TYPE")
    private Enum type;
    @Column (name = "ACCOUNT_NICKNAME")
    private String nickname;
    @Column (name = "ACCOUNT_REWARDS")
    private Integer rewards;
    @Column (name = "ACCOUNT_BALANCE")
    private Double balance;
    @Column (name = "ACCOUNT_CUSTOMER")
    private Customer customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Enum getType() {
        return type;
    }

    public void setType(Enum type) {
        this.type = type;
    }

    public java.lang.String getNickname() {
        return nickname;
    }

    public void setNickname(java.lang.String nickname) {
        this.nickname = nickname;
    }

    public Integer getString() {
        return rewards;
    }

    public void setString(Integer rewards) {
        this.rewards = rewards;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
