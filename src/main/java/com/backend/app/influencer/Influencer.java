package com.backend.app.influencer;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "influencer")
@Data
public class Influencer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID influencerId;

    @Column(length = 50)
    private String username;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;

    @OneToOne(orphanRemoval = true, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private InfluencerSocialLinks influencerSocialLinks;

    @CreationTimestamp
    @Column(name="created_at" ,updatable = false, nullable = false)
    private Timestamp created;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private Timestamp updated;
}
