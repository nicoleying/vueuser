package com.qf.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "vue_permission")
@Data
public class SysPermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer permId;
    private String permName;
    private String permUrl;
    private String permState;
}
