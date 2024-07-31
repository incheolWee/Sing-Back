package com.example.sign_back.File;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
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
@Table(name= "File")
public class File {
    @Id
    @JoinColumn(name = "workId")
    private Long id;// workID의  PK. FK이지만 PK로 사용

    private String font; // 폰트 이름

    private String name; // 파일 이름
    private byte size; // 파일 사이즈
    private String path; // 파일 경로

    private double xPixel; // 파일 X축 길이
    private double yPixel; // 파일 Y축 길이

    @CreationTimestamp
    private LocalDateTime createDate; // 생성일

    @UpdateTimestamp
    private LocalDateTime updateDDage; // 수정일

}
