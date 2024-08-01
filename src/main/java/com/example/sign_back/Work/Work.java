package com.example.sign_back.Work;

import com.example.sign_back.Log.Log;
import com.example.sign_back.Requirement.Requirement;
import com.example.sign_back.User.User;
import com.example.sign_back.File.File;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table (name ="Work")
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //PK

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private boolean shared; // 공유됨
    private boolean trashed; // 휴지통

    @CreationTimestamp
    private LocalDateTime createDate; // 생성일

    @UpdateTimestamp
    private LocalDateTime updateDate; // 수정일
    private LocalDateTime deleteDate; // 삭제일

    @OneToMany(mappedBy = "work", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<File> files;

    @OneToMany(mappedBy = "work", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Requirement> requirements;

    @OneToMany(mappedBy = "work", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Log> logs;
}
