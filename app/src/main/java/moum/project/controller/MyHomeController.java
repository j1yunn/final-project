package moum.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyHomeController {

  @PostMapping("/myHome")
  public void myHome() {
  }
}
