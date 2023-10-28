package com.stc.system.adapter.out.persistence.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "permission_group")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PermissionGroupJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "permissionGroup", fetch = FetchType.LAZY)
    private Set<UserJpaEntity> users;

    @OneToMany(mappedBy = "permissionGroup", fetch = FetchType.LAZY)
    private Set<SpaceJpaEntity> spaces;
}
