package com.vogella.spring.jpa.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Future;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;

import com.vogella.spring.jpa.Todo;

public interface TodoRepository extends CrudRepository<Todo, Long> {

	List<Todo> findBySummary(String summary);

	Optional<Todo> findOneBySummaryAndDueDate(String summary, Date dueDate);

	Stream<Todo> findBySummaryOrDescription(String summary, String description);

	int countBySummary(String summary);

	@Query("Select t from Todo t where t.dueDate BETWEEN '2016-01-01' AND '2016-12-31'")
	List<Todo> findAllOf2016();

	@Async
	Future<List<Todo>> findAsyncBySummary(String summary);

}
