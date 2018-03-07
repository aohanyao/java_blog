package com.aohanyao.blog.controller;

import com.aohanyao.blog.bean.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by 江俊超 on 2018-03-06.
 * Version:1.0
 * Description:
 * ChangeLog:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MockServletContext.class)
@WebAppConfiguration
public class UserControllerTest {
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }

    @Test
    public void register() throws Exception {
        //填充数据 start
        User userBean = new User();
        userBean.setEmail("aohanyao@gmail.com");
        userBean.setAge(18);
        userBean.setNickName("测试");
        userBean.setPhone("15761660995");
        userBean.setSex(1);
        userBean.setUserName("ahanyao");
        userBean.setUserPass("123456");
        userBean.setHeader("头像地址");
        //填充数据 end

        mvc.perform(MockMvcRequestBuilders.post("/user/").accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());

    }

}
