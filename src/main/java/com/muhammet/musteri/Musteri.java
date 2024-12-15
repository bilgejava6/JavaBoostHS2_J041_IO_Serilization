package com.muhammet.musteri;

import java.io.Serializable;
import java.util.Random;

public class Musteri implements Serializable {
    private Long id;
    private String name;
    private String address;
    private String phone;

    public Musteri(String name, String address, String phone) {
        this.id = new Random().nextLong(1_000_000, 5_000_000);
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Musteri{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
