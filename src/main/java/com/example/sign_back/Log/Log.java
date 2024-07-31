package com.example.sign_back.Log;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.awt.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name= "Log")
public class Log { // 기록

    @Id
    @JoinColumn(name= "RId")
    private Long RId;  //Requirement 를 PK로 작성

    @JoinColumn(name= "workId")
    private Long workId; //workId

    @JoinColumn(name= "userId")
    private Long userIid; // UserId

    private String state; // 상태 add, update , delete
    private String SorT; // 사인인지  Text인지

    private int xPosition; // 저장된 X 좌표
    private int yPosition; // 저장된 Y 좌표

    private int width; // 가로 길이
    private int height; // 세로 길이

    private int fontSize; // 글씨 크기

    private TextArea content;

    @CreationTimestamp
    private LocalDateTime createDate;

}
