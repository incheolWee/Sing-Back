package com.example.sign_back.Sign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api/signs")
public class SignController {
    @Autowired
    private SignService signService;
    @GetMapping
    public List<Sign> getAllSigns() {
        return signService.getAllSigns();
    }

    @GetMapping("/{id}")
    public Sign getSignById(@PathVariable Long id) {
        return signService.getSignById(id);
    }

    @PostMapping
    public Sign createSign(@RequestBody Sign sign) {
        return signService.saveSign(sign);
    }

    @DeleteMapping("/{id}")
    public void deleteSign(@PathVariable Long id) {
        signService.deleteSign(id);
    }
}
