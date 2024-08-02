package com.example.sign_back.Sign;

import com.example.sign_back.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SignServiceImpl implements SignService{
    @Autowired
    private SignRepository signRepository;

    @Override
    public Sign createSign(Sign sign) {
        return signRepository.save(sign);
    }

    @Override
    public Optional<Sign> getSignById(Long id) {
        return signRepository.findById(id);
    }

    @Override
    public List<Sign> getAllSigns() {
        return signRepository.findAll();
    }

    @Override
    public List<Sign> getSignsByUser(User user) {
        return signRepository.findByUser(user);
    }

    @Override
    public Sign updateSign(Long id, Sign signDetails) {
        return signRepository.findById(id).map(sign-> {
            sign.setPath(signDetails.getPath());
            sign.setSaved(signDetails.getSaved());
            return signRepository.save(sign);
        }).orElseThrow(()-> new RuntimeException("Sign not found with id"+ id));
    }

    @Override
    public void deleteSign(Long id) {
        signRepository.deleteById(id);
    }
}
