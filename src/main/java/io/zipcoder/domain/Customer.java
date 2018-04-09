package io.zipcoder.domain;

import java.util.Set;

public class Customer {

    public Long id;
    public String firstName;
    public String lastName;
    public Set<Address> Address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<io.zipcoder.domain.Address> getAddress() {
        return Address;
    }

    public void setAddress(Set<io.zipcoder.domain.Address> address) {
        Address = address;
    }
}
