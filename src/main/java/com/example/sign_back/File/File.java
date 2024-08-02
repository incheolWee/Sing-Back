package com.example.sign_back.File;

import com.example.sign_back.Work.Work;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fileId;

    @OneToMany(mappedBy = "file", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Work> works;

    private String font;
    private String name;
    private byte size;
    private String path;
    private double xPixel;
    private double yPixel;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createDate;



}
