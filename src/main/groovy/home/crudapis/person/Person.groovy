package home.crudapis.person

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Person {
    @Id @GeneratedValue
    Long id
    @Column(name = "first_name")
    String firstName
    @Column(name = "last_name")
    String lastName


    @Override
    String toString() {
        firstName  + " " + lastName
    }
}
