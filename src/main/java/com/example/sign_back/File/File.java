package com.example.sign_back.File;

import com.example.sign_back.Work.Work;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_id")
    private Long workId;

    @ManyToOne
    @JoinColumn(name = "work_id", insertable = false, updatable = false) // The column in the File table that refers to the Work table
    private Work work;

    private String font;
    private String name;
    private byte size;
    private String path;
    private double xPixel;
    private double yPixel;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createDate;

    @UpdateTimestamp
    private LocalDateTime updateDate;

}
