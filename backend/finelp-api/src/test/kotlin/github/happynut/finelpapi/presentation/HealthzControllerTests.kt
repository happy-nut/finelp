package github.happynut.finelpapi.presentation

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@AutoConfigureMockMvc
@SpringBootTest
class HealthzControllerTests {

  @Autowired
  private lateinit var mockMvc: MockMvc

  @Test
  fun `It returns 200 OK`() {
    mockMvc
      .get("/healthz")
      .andExpect {
        status { isOk() }
      }
  }
}

