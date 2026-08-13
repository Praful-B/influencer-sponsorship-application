package com.backend.app.brand;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50)
    private String brandName;

    @Column(unique = true)
    private String email;
    private String password;

}
