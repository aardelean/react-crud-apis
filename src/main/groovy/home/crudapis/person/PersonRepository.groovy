package home.crudapis.person

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "persons", path = "persons")
interface PersonRepository extends PagingAndSortingRepository<Person, Long>{
}
