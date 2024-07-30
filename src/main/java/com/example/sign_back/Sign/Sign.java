package com.example.sign_back.Sign;

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
@Table(name= "Sign")
public class Sign {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name="userId")
    private Long userId;

    private String path;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createDate;

    @UpdateTimestamp
    private LocalDateTime updateDate;
}
