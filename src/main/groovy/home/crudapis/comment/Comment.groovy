package home.crudapis.comment

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Comment {
    @Id @GeneratedValue
    Long id
    String twitterIdentifier
    String content

    @Override
     String toString() {
        "{" +
        "id=" + id +
        ", twitterIdentifier='" + twitterIdentifier + '\'' +
        ", content='" + content + '\'' +
        '}'
    }
}
