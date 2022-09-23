package com.rockies.DaeguDay.repository;

import com.rockies.DaeguDay.domain.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface NewsRepository extends JpaRepository<News, Long> {
    Optional<News> findByCategory(int category);
    List<News> findAll();
}
