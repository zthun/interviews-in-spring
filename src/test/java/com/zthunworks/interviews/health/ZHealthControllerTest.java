package com.zthunworks.interviews.health;

import com.zthunworks.interviews.ZInterviewApi;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ZHealthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnTrueWhenInvoked() throws Exception {
        // Arrange.

        // Act
        ResultActions actual = mockMvc.perform(get(ZInterviewApi.health()));

        // Assert.
        actual.andExpect(content().string("true"));
    }

    @Test
    public void shouldReturnAStatusOfOk() throws Exception {
        // Arrange.

        // Act.
        ResultActions actual = mockMvc.perform(get(ZInterviewApi.health()));

        // Assert.
        actual.andExpect(status().isOk());
    }
}
