package com.meeting.com.meeting.admin.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2016-12-17.
 */
@Entity
public class Account {

    @Id private String id;
    @NotNull private String password;
    @NotNull private String email;

}
