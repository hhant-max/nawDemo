package com.sun.nawdemo.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(QueryNawController.class)
class QueryNawControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void helloReturnsDefaultNameWhenNotProvided() throws Exception {
        mockMvc.perform(get("/api/hello"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Hello, world!"))
                .andExpect(jsonPath("$.timestamp").exists());
    }

    @Test
    void helloReturnsProvidedName() throws Exception {
        mockMvc.perform(get("/api/hello").param("name", "Sofia"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Hello, Sofia!"))
                .andExpect(jsonPath("$.timestamp").exists());
    }
}

