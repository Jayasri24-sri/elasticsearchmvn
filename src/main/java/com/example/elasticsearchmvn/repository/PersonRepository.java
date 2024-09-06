package com.example.elasticsearchmvn.repository;
import com.example.elasticsearchmvn.document.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import java.util.Optional;
public interface PersonRepository extends ElasticsearchRepository<Person, String> {
    void save(Person person);

    Optional<Person> findById(String id);
}


