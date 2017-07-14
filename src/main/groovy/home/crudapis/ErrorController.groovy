package home.crudapis

import groovy.util.logging.Slf4j
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@Slf4j
@RestControllerAdvice
@EnableWebMvc
class ErrorController {

    @ExceptionHandler
    @ResponseBody
    ResponseEntity exception(Exception ex) {
        log.error(" error: ", ex)
        ResponseEntity.ok(ex.message)
    }
}
