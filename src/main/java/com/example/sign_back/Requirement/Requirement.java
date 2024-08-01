package com.example.sign_back.Requirement;


import com.example.sign_back.Work.Work;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.mapping.ToOne;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Requirement { // 요구사항
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @OneToOne(mappedBy = "log") // The column in the Requirement table that refers to the Work table
//    private Work work;

    private Boolean finish;
    private String sort;
    private double xPosition;
    private double yPosition;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createDate;

}
