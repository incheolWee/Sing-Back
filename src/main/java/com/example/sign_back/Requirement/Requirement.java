package com.example.sign_back.Requirement;


import com.example.sign_back.Log.Log;
import com.example.sign_back.Work.Work;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.mapping.ToOne;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Requirement { // 요구사항
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requirementId;

    @ManyToOne
    @JoinColumn(name = "workId", nullable = false)
    private Work work;

    @OneToMany(mappedBy = "requirement", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Log> logs;

    private Boolean finish;
    private String sort;
    private double xPosition;
    private double yPosition;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createDate;


}
