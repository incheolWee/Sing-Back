package com.example.sign_back.Coworker;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="Coworker")
public class Coworker {
    @Id
    @JoinColumn(name = "workId")
    private Long workId;

    @JoinColumn (name = "userId")
    private Long userId;
}
