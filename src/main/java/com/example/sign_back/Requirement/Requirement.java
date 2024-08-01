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
    private Long id;

    @ManyToOne
    @JoinColumn(name = "work_id", nullable = false)
    private Work work;

    private Boolean finish;
    private String sort;
    private double xPosition;
    private double yPosition;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createDate;

    @OneToMany(mappedBy = "requirement", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Log> logs;
}
