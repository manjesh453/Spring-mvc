package springmvc.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String description;

    private long price;

}
