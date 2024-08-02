package com.example.sign_back.Sign;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.sign_back.User.User;
import java.util.List;

@RestController
@RequestMapping("api/signs")
public class SignController {
    @Autowired
    private SignService signService;

    @PostMapping
    public Sign createSign(@RequestBody Sign sign){
        return signService.createSign(sign);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sign> getSignById(@PathVariable Long id){
        return signService.getSignById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Sign> getAllSigns(){
        return signService.getAllSigns();
    }

    @GetMapping ("/user/{userId}")
    public List<Sign> getSignsByUserId(@PathVariable Long userId){
        return null;
    }
}
