package com.rockies.DaeguDay.repository;

import com.rockies.DaeguDay.domain.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {

    @Query("select n from News n where n.category=?1")
    List<News> findAllByCategory(int category);

}
