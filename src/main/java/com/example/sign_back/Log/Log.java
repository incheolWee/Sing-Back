package com.example.sign_back.Log;

import com.example.sign_back.Requirement.Requirement;
import com.example.sign_back.User.User;
import com.example.sign_back.Work.Work;
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
public class Log { // 기록
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logId;

    @ManyToOne
    @JoinColumn(name = "workId", nullable = false)
    private Work work;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "requirementId", nullable = false)
    private Requirement requirement;

    private String sort;
    private String state;
    private int xPosition;
    private int yPosition;
    private int width;
    private int height;
    private int fontSize;
    private int pageNum;

    @CreationTimestamp
    private LocalDateTime createDate;

    private String message;
}