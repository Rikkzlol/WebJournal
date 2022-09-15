package com.rikkz.WebJournal.repo;

import com.rikkz.WebJournal.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
