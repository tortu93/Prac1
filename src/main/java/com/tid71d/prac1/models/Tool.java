package com.tid71d.prac1.models;

import javax.persistence.*;

@Entity
@Table(name = "tools")
public class Tool {
    @Id
    @Column(name = "tool_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tool_seq_gen")
    @SequenceGenerator(name = "tool_seq_gen",sequenceName = "tool_id_seq",allocationSize = 1)
    private Integer toolId;

    @Column(name = "tool_name",columnDefinition = "varchar(25)")
    private String name;

    @Column(name = "stock",columnDefinition = "int")
    private Integer stock;

    @Column(name = "price",columnDefinition = "varchar(25)")
    private String price;

    public Integer getToolId() {
        return toolId;
    }

    public void setToolId(Integer toolId) {
        this.toolId = toolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
