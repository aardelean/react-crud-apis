package home.crudapis.message

import home.crudapis.comment.Comment
import home.crudapis.person.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.stereotype.Component

@Component
class MessageDispatcher {

    @Autowired
    private SimpMessagingTemplate template

    void pushComment(Comment comment) throws Exception {
        template.convertAndSend("/topic/comments",
                comment)
    }
}
