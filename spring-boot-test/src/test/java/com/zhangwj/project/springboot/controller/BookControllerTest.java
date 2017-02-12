package com.zhangwj.project.springboot.controller;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
/*@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)*/
@WebMvcTest(controllers = BookController.class)
public class BookControllerTest {

/*    @Autowired
    private TestRestTemplate restTemplate;*/

   @Autowired
   private MockMvc mockMvc;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: home()
     */
    @Test
    public void testHome() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/book/home")).andExpect(MockMvcResultMatchers.status().isOk());
        mockMvc.perform(MockMvcRequestBuilders.get("/book/home")).andExpect(MockMvcResultMatchers.content().string("book home"));
/*        String content = restTemplate.getForObject("/book/home", String.class);
        Assert.assertEquals("book home", content);*/
    }

    @Test
    public void testShow() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/book/show").param("id","1")).andExpect(MockMvcResultMatchers.content().string("book show id is 1"));
    }

} 
