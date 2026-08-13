package com.backend.app.influencer;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InfluencerRepository extends JpaRepository<User, UUID> {
}
