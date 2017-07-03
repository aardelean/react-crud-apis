package home.crudapis.comment

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "comments", path = "comments")
interface CommentRepository extends PagingAndSortingRepository<Comment, Long>{
    Comment findByTwitterIdentifier(String identifier)
}