package home.crudapis.message

import home.crudapis.person.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.stereotype.Component

@Component
class MessageDispatcher {

    @Autowired
    private SimpMessagingTemplate template

    void greeting(Person person) throws Exception {
        template.convertAndSend("/topic/greetings",
            new Greeting("Say hello to our newest member, " + person.toString() + "!"))
    }
}
