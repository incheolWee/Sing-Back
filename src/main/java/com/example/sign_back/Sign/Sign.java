package com.example.sign_back.Sign;

import com.example.sign_back.User.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;


@NoArgsConstructor
@Getter
@Setter
@Entity
public class Sign {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id; // ID 값

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String path; // 사진 경로 cloud 사용

    private Boolean saved; // 저장 여부

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createDate; // 생성일

    @UpdateTimestamp
    private LocalDateTime updateDate; // 수정일
}
