package com.example.sign_back.Log;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name= "Log")
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  //PK

    @JoinColumn(name= "workId")
    private Long workId;

    @JoinColumn(name= "userId")
    private Long userIid;

    private String state;
    private int xPosition;
    private int yPosition;
    private int width;
    private int height;
    private String SorT;
    private int fontSize;

    @CreationTimestamp
    private LocalDateTime createDate;

}
