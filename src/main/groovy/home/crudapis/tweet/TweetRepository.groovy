package home.crudapis.tweet

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "tweets", path = "tweets")
interface TweetRepository extends PagingAndSortingRepository<Tweet, Long> {
}
