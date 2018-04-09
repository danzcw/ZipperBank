package io.zipcoder.domain;

public class Deposit {
    private Long id;
    private String type;
    private String transactionDate;
    private String status;
    private Long payeeId;
    private String medium;
    private Double amount;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransaction_date() {
        return transactionDate;
    }

    public void setTransaction_date(String transaction_date) {
        this.transactionDate = transaction_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getPayee_id() {
        return payeeId;
    }

    public void setPayee_id(Long payee_id) {
        this.payeeId = payee_id;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

