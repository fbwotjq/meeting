package com.meeting.com.meeting.admin.account;

import com.meeting.com.meeting.admin.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016-12-18.
 */
public interface AccountRepository extends JpaRepository<Account, String> {

}
