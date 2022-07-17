package com.chanseok.orderservice.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
public class BaseEntity {

    @Column(updatable = false)
    @CreatedDate
    private LocalDateTime createAt;

    @Column(updatable = false)
    private Long createNo;

    @LastModifiedDate
    private LocalDateTime updateAt;

    private Long updateNo;
}
