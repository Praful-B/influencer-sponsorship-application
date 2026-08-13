package com.backend.app.influencer;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "influencer_social_links")
public class InfluencerSocialLinks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long influencerSocialLinksId;

    private String youtubeUrl;
    private String twitterUrl;
    private String instagramUrl;
    private String facebookUrl;
    private String redditUrl;
    private String tiktokUrl;
    private String linkedinUrl;
    private String snapchatUrl;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "influencer_id", unique = true)
    private Influencer influencer;



}
