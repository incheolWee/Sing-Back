package com.example.sign_back.Requirement;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Requirement { // 요구사항
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long RId; //고유 id

    @JoinColumn(name="workId")
    private Long workId; //워크 번호

    private String SorT; // 사인인지 text인지 구별
    private double xPosition; // 지정한 x 좌표
    private double yPosition; // 지정한 y 좌표

    private boolean finish; // 완료

    @CreationTimestamp
    private LocalDateTime createDate; // 생성일

}
