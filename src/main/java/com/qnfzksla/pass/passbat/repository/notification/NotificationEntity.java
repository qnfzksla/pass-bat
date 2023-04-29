package com.qnfzksla.pass.passbat.repository.notification;

import com.qnfzksla.pass.passbat.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Entity
@Table(name = "notification")
public class NotificationEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//기본 키 생성을 DB에 위입합니다. (AUTO_INCREMENT)
    private Integer notification_seq;
    private String uuid;
    private NotificationEvent event;
    private String text;
    private boolean sent;
    private LocalDateTime sentAt;
}
