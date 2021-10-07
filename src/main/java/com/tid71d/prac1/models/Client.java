package com.tid71d.prac1.models;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @Column(name = "client_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "client_seq_gen")
    @SequenceGenerator(name = "client_seq_gen",sequenceName = "client_id_seq",allocationSize = 1)
    private Integer clientId;

    @Column(name = "client_name",columnDefinition = "varchar(25)")
    private String name;

    @Column(name = "email",columnDefinition = "varchar(30)")
    private String email;

    @Column(name = "phone",columnDefinition = "varchar(10)")
    private String phone;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
