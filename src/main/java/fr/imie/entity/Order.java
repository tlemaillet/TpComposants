package fr.imie.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by tlemaillet on 6/23/16.
 */
@Entity
@Table(name = "order_mais_cetait_reserve")
public class Order {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ref", nullable = false)
    private String ref;

    @Column(name = "dateCreated", nullable = false)
    private Date dateCreated;

    @OneToMany
    private List<OrderDetail> orderDetails;

    @OneToMany
    private List<Delivery> deliveries;

    @ManyToOne
    private Customer customer;

    public Order(String ref, Date dateCreated, List<OrderDetail> orderDetails,
                 List<Delivery> deliveries, Customer customer) {
        this.ref = ref;
        this.dateCreated = dateCreated;
        this.orderDetails = orderDetails;
        this.deliveries = deliveries;
        this.customer = customer;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}