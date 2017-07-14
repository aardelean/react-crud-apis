package home.crudapis.tweet

import home.crudapis.comment.Comment
import home.crudapis.person.Person

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "tweets")
class Tweet {
    @Id @GeneratedValue
    Long id
    String title
    @OneToMany(mappedBy = "tweet")
    List<Comment> comments;
    @ManyToOne
    Person owner
}
