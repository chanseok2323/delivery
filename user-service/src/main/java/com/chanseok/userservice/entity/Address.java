package com.chanseok.userservice.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "address")
public class Address extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_no")
    private Long no;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_no")
    private Member member;

    private String address;
    private String addressDetail;
}
