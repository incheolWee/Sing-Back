package com.example.sign_back.Log;

import com.example.sign_back.User.User;
import com.example.sign_back.Work.Work;
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
public class Log { // 기록
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "work_id", nullable = false) // The column in the Log table that refers to the Work table
    private Work work;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "log_id", nullable = false)
    private Log log;

    private Long rId;
    private String sort;
    private String state;
    private int xPosition;
    private int yPosition;
    private int width;
    private int height;
    private int fontSize;
    private LocalDateTime createDate;
    private String message;

}
