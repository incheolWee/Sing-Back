package com.example.sign_back.Sign;

import com.example.sign_back.User.User;

import java.util.List;
import java.util.Optional;

public interface SignService {
Sign createSign(Sign sign);
Optional<Sign> getSignById(Long id);
List<Sign> getAllSigns();
List<Sign> getSignsByUser(User user);
Sign updateSign(Long id, Sign signDetails);
void deleteSign(Long id);
}
