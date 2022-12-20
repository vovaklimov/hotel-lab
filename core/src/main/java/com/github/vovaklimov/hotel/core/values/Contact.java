package com.github.vovaklimov.hotel.core.values;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Contact {
    private String phone;
    private String email;
    @Id
    @GeneratedValue
    private Long id;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (!Objects.equals(phone, contact.phone)) return false;
        return Objects.equals(email, contact.email);
    }

    @Override
    public int hashCode() {
        int result = phone != null ? phone.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    protected void setId(Long id) {
        this.id = id;
    }

    protected Long getId() {
        return id;
    }
}
