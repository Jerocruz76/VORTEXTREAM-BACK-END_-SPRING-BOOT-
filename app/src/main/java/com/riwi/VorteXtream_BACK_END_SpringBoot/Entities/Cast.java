package com.riwi.VorteXtream_BACK_END_SpringBoot.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity
@Table(name="casts")
public class Cast {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    @Column(name="name", nullable = false)
    String name;
}
