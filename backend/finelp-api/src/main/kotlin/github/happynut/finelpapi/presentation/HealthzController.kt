package github.happynut.finelpapi.presentation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("healthz")
class HealthzController {

  @GetMapping
  fun checkHealthz () {
  }
}