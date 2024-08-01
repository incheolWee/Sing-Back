package com.example.sign_back.Work;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //PK
    @JoinColumn(name ="userId")
    private Long userId; // UserId 의 PK , FK로 황ㄹ용
    private boolean shared; // 공유됨
    private boolean trashed; // 휴지통
    @CreationTimestamp
    private LocalDateTime createDate; // 생성일
    @UpdateTimestamp
    private LocalDateTime updateDate; // 수정일
    private LocalDateTime deleteDate; // 삭제일
}
