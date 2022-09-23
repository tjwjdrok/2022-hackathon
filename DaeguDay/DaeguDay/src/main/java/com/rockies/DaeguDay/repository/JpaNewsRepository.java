//package com.rockies.DaeguDay.repository;
//
//import com.rockies.DaeguDay.domain.News;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import java.util.List;
//import java.util.Optional;
//
//public class JpaNewsRepository implements NewsRepository{
//
//    private final EntityManager em;
//    public JpaNewsRepository(EntityManager em) {
//        this.em = em;
//    }
//
//    @Override
//    public Optional<News> findByCategory(int category) {
//        News news = em.find(News.class, category);
//        return Optional.ofNullable(news);
//    }
//
//    @Override
//    public List<News> findAll() {
//        return em.createQuery("select n from News n", News.class)
//                .getResultList();
//    }
//
//}
