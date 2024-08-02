package com.example.sign_back.User;

import com.example.sign_back.Log.Log;
import com.example.sign_back.Sign.Sign;
import com.example.sign_back.Work.Work;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId; // PK

    private String userName; // 이름
    private String email; // 이메일
    private String password; // 비밀번호

    private int level;// 유저 접근 레벨

    @CreationTimestamp
    private LocalDateTime createDate; // 생성일

    @UpdateTimestamp
    private LocalDateTime updateDate; // 수정일

    private LocalDateTime loginTime; // 로그인 시간

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Sign> signs;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Work> works;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Log> logs;
}
