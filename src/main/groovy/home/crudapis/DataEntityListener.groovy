package home.crudapis

import home.crudapis.comment.Comment
import home.crudapis.message.MessageDispatcher
import home.crudapis.person.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.rest.core.annotation.HandleAfterCreate
import org.springframework.data.rest.core.annotation.HandleBeforeCreate
import org.springframework.data.rest.core.annotation.RepositoryEventHandler
import org.springframework.stereotype.Component

@Component
@RepositoryEventHandler()
class DataEntityListener {

    @Autowired
    MessageDispatcher messageDispatcher

    @HandleAfterCreate(Person)
    void onAfterCreatePerson(Person entity) {
        messageDispatcher.greeting entity
    }

    @HandleAfterCreate(Comment)
    void onAfterCreateComment(Comment entity) {
        messageDispatcher.pushComment entity
    }
}
