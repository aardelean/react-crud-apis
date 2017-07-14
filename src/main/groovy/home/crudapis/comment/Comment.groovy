package home.crudapis.comment

import com.fasterxml.jackson.annotation.JsonIgnore
import home.crudapis.person.Person
import home.crudapis.tweet.Tweet

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "comments")
class Comment {
    @Id @GeneratedValue
    Long id
    @ManyToOne
    @JsonIgnore
    Tweet tweet
    String content
    @ManyToOne
    @JsonIgnore
    Person owner

    @Override
     String toString() {
        "{" +
        "id=" + id +
        ", content='" + content + '\'' +
        '}'
    }
}
