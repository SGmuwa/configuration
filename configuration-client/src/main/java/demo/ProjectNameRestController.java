package demo;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
class ProjectNameRestController {

 /**
  * Создание лога. Логи можно создовать везде.
  * Я создал в контроллере.
  */
 private Log log = LogFactory.getLog(getClass());

 /**
  * Поле хранит в себе имя проекта.
  */
 private final String projectName = "My project";

 /**
  * Обработка запроса по url: /project-name
  */
 @RequestMapping("/project-name")
 String projectName() {
  log.info("get projectName: " + projectName);
  return this.projectName;
 }
}
