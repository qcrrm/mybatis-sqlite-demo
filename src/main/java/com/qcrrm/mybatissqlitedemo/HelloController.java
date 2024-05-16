package com.qcrrm.mybatissqlitedemo;

import com.qcrrm.mybatissqlitedemo.mapper.UserMapper;
import com.qcrrm.mybatissqlitedemo.pojo.User;
import com.qcrrm.mybatissqlitedemo.util.MybatisUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAll();
        System.out.println(users);
    }
}