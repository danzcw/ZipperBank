package io.zipcoder.domain;

public class Account {
    private Long id;
    private Enum type;
    private String nickname;
    private Integer String;
    private  Double balance;
    private  Customer customer;

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
        return String;
    }

    public void setString(Integer string) {
        String = string;
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
