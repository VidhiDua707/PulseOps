package com.pulseops.repository;

import com.pulseops.model.Api;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ApiRepository extends JpaRepository<Api, Long> {
}
