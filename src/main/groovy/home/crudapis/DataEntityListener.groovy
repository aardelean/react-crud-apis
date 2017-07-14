package home.crudapis

import home.crudapis.comment.Comment
import home.crudapis.message.MessageDispatcher
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.rest.core.annotation.HandleAfterCreate
import org.springframework.data.rest.core.annotation.RepositoryEventHandler
import org.springframework.stereotype.Component

@Component
@RepositoryEventHandler()
class DataEntityListener {

    @Autowired
    MessageDispatcher messageDispatcher

    @HandleAfterCreate(Comment)
    void onAfterCreateComment(Comment entity) {
        messageDispatcher.pushComment entity
    }
}
