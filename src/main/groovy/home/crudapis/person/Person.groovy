package home.crudapis.person

import home.crudapis.comment.Comment
import home.crudapis.tweet.Tweet

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "persons")
class Person {
    @Id @GeneratedValue
    Long id
    @Column(name = "first_name")
    String firstName
    @Column(name = "last_name")
    String lastName
    @OneToMany(mappedBy = "owner")
    List<Tweet> tweets;
    @OneToMany(mappedBy = "owner")
    List<Comment> comments


    @Override
    String toString() {
        firstName  + " " + lastName
    }
}
