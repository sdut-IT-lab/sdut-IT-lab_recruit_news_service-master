package io.github.sdutsoftlab.service;

import io.github.sdutsoftlab.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Devhui
 * @Date: 2019-12-02 19:15
 * @Version 1.0
 */
public interface AdminService {
    /**
     * 当前阶段的进行时间段
     * 报名/结果查询
     * @param menu
     * @return
     */
    String switchMenu(String menu);

    int getMenuStatus(String menu);

    // 查询
    List<User> fetchAllStudents();


}
