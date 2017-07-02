package home.crudapis.person

import home.crudapis.message.MessageDispatcher
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.rest.core.annotation.HandleBeforeCreate
import org.springframework.data.rest.core.annotation.HandleBeforeSave
import org.springframework.data.rest.core.annotation.RepositoryEventHandler
import org.springframework.data.rest.core.event.AbstractRepositoryEventListener
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.messaging.simp.broker.SimpleBrokerMessageHandler
import org.springframework.stereotype.Component

@Component
@RepositoryEventHandler()
class PersonEntityListener {

    @Autowired
    MessageDispatcher messageDispatcher

    @HandleBeforeSave(Person)
    @HandleBeforeCreate(Person)
    void onAfterSave(Person entity) {
        messageDispatcher.greeting entity
    }
}
