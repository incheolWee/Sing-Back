package com.example.sign_back.Sign;

import com.example.sign_back.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SignRepository extends JpaRepository<Sign,Long> {
    List<Sign> findByUser(User user);
}
