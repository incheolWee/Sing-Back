package com.example.sign_back.Sign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignService {
    @Autowired
    private SignRepository signRepository;

    public List<Sign> getAllSigns(){
        return signRepository.findAll();
    }
    public Sign getSignById(Long id){
        return signRepository.findById(id).orElse(null);
    }
    public Sign saveSign(Sign sign){
        return signRepository.save(sign);
    }
    public void deleteSign(Long id){
        signRepository.deleteById(id);
    }
}
