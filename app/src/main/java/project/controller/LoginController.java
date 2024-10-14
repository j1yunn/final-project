package project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * packageName    : project.controller
 * fileName       : LoginController
 * author         : narilee
 * date           : 24. 10. 14.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 14.        narilee       최초 생성
 */
@Controller
public class LoginController {
  @GetMapping("/login")
  public String login() {
    return "login";
  }
}
