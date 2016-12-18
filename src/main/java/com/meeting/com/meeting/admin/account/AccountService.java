package com.meeting.com.meeting.admin.account;

import com.meeting.com.meeting.admin.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016-12-18.
 */
@Service
public class AccountService {

    @Autowired AccountRepository accountRepository;

    public Account getAccount(String id) {
        return accountRepository.findOne(id);
    }

}
