package com.qcrrm.mybatissqlitedemo.mapper;

import com.qcrrm.mybatissqlitedemo.pojo.User;

import java.util.List;

/**
 * @author qcrrm
 * @date 2024-05-16 17:15
 */
public interface UserMapper {
    List<User> selectAll();
}
