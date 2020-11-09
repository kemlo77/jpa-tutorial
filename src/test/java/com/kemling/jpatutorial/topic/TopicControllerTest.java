package com.kemling.jpatutorial.topic;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(TopicController.class)
class TopicControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private TopicService topicService;

  @Test
  void getAllTopics() throws Exception {

    List<Topic> topicList = new ArrayList<>();
    topicList.add(new Topic("arne", "Arne framework", "Arne description"));
    when(topicService.getAllTopics())
        .thenReturn(topicList);

    RequestBuilder request = MockMvcRequestBuilders
        .get("/topics")
        .accept(MediaType.APPLICATION_JSON);
    MvcResult result = mockMvc.perform(request)
        .andExpect((status().isOk()))
        .andExpect(content()
            .json("[{id:arne,name:\"Arne framework\",description:\"Arne description\"}]")
        )
        .andReturn();

    //assertEquals("Hello World", result.getResponse().getContentAsString());
  }

  @Test
  void getTopic() {
  }

  @Test
  void addTopic() {
  }

  @Test
  void updateTopic() {
  }

  @Test
  void deleteTopic() {
  }
}