package com.example.project.onlinelibrarywithsecurity.repository;


import com.example.project.onlinelibrarywithsecurity.models.SecuredUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SecuredUserRepository extends JpaRepository<SecuredUser, Integer> {
    @Query("select u from SecuredUser u where u.username = :username")
    public SecuredUser findByUsername(String username) ;
}
