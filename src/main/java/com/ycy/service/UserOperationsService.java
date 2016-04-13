package com.ycy.service;

import com.ycy.domain.User;

/**
 * @author ycy
 */
public interface UserOperationsService {
    void add(User user);

    User getUser(String key);

}
