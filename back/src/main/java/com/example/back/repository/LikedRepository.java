package com.example.back.repository;

import com.example.back.entity.Liked;
import com.example.back.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikedRepository extends JpaRepository<Liked, Long> {

    User findByUserId(String userId);
    Liked findByDno(Long dno);
    List<Liked> findLikedByDno(Long dno);

}