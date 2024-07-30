package com.example.sign_back.Sign;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignRepository extends JpaRepository<Sign,Long> {

}
