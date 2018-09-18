package com.vogella.spring.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	// @Bean
	// public CommandLineRunner jpaSample(TodoRepository todoRepo) {
	// return (args) -> {
	//
	// // save 2 todos in the H2 database
	// todoRepo.save(new Todo("Test"));
	//
	// Todo todo = new Todo("Detailed test");
	// todo.setDueDate(new Date());
	// todo.setDescription("Detailed description");
	// todoRepo.save(todo);
	//
	// // query for all todos in the H2 database and print them
	// todoRepo.findAll().forEach(System.out::println);
	// };
	// }

	// 1. Query Todos by summary
	// @Bean
	// public CommandLineRunner jpaSample(TodoRepository todoRepo) {
	// return (args) -> {
	// todoRepo.save(new Todo("irrelevant 1"));
	// todoRepo.save(new Todo("irrelevant 2"));
	// todoRepo.save(new Todo("irrelevant 1"));
	//
	// todoRepo.findBySummary("irrelevant 1").forEach(System.out::println);
	// };
	// }

	// 2. Query just one optional Todo by summary and due date
	// @Bean
	// public CommandLineRunner jpaSample(TodoRepository todoRepo) {
	// return (args) -> {
	// // create and set todo
	// Todo todo = new Todo();
	// String summary = "irrelevant";
	// Date dueDate = new Date();
	// todo.setSummary(summary);
	// todo.setDueDate(dueDate);
	//
	// // try to find without any answer
	// System.out.println(todoRepo.findOneBySummaryAndDueDate(summary, dueDate));
	//
	// // try to find with one answer
	// todoRepo.save(todo);
	// System.out.println(todoRepo.findOneBySummaryAndDueDate(summary, dueDate));
	//
	// // try to find with two answers
	// todoRepo.save(todo);
	// System.out.println(todoRepo.findOneBySummaryAndDueDate(summary, dueDate));
	// };
	// }

	// 3. Query a stream of Todos by summary or description
	// @Bean
	// public CommandLineRunner jpaSample(TodoRepository todoRepo) {
	// return new CommandLineRunner() {
	// @Override
	// @Transactional
	// public void run(String... args) throws Exception {
	// Todo todo1 = new Todo();
	// Todo todo2 = new Todo();
	// String summary = "irrelevant";
	// String description = "irrelevant";
	// todo1.setSummary(summary);
	// todo2.setDescription(description);
	//
	// todoRepo.save(todo1);
	// todoRepo.save(todo2);
	//
	// try (Stream<Todo> stream = todoRepo.findBySummaryOrDescription(summary,
	// description)) {
	// List<Todo> collect = stream.collect(Collectors.toList());
	// collect.forEach(System.out::println);
	// } catch (Exception e) {
	// throw new RuntimeException(e.getMessage(), e);
	// }
	// }
	// };
	// }

	// 4. Count the amout of Todos in the database table
	// @Bean
	// public CommandLineRunner jpaSample(TodoRepository todoRepo) {
	// return (args) -> {
	// todoRepo.save(new Todo());
	// todoRepo.save(new Todo());
	// todoRepo.save(new Todo());
	//
	// System.out.println(todoRepo.count());
	// };
	// }

	// 5. Count the amout of Todos with a certain summary
	// @Bean
	// public CommandLineRunner jpaSample(TodoRepository todoRepo) {
	// return (args) -> {
	// String summary = "irrelevant";
	// todoRepo.save(new Todo(summary));
	// todoRepo.save(new Todo());
	// todoRepo.save(new Todo(summary));
	//
	// System.out.println(todoRepo.countBySummary(summary));
	// };
	// }

	// 6. Write a custom query for all todos in the year 2016
	// @Bean
	// public CommandLineRunner jpaSample(TodoRepository todoRepo) {
	// return (args) -> {
	// Todo todo1 = new Todo();
	// Todo todo2 = new Todo();
	// Todo todo3 = new Todo();
	// Todo todo4 = new Todo();
	//
	// DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	// Date date1 = formatter.parse("2016-03-01");
	// Date date2 = formatter.parse("2016-04-01");
	// Date date3 = formatter.parse("2015-03-01");
	// Date date4 = formatter.parse("2017-03-01");
	//
	// todo1.setDueDate(date1);
	// todo2.setDueDate(date2);
	// todo3.setDueDate(date3);
	// todo4.setDueDate(date4);
	//
	// todoRepo.save(todo1);
	// todoRepo.save(todo2);
	// todoRepo.save(todo3);
	// todoRepo.save(todo4);
	//
	// todoRepo.findAllOf2016().forEach(System.out::println);
	// };
	// }

	// 7. Get available Todos by summary asynchronously
	// @Bean
	// public CommandLineRunner jpaSample(TodoRepository todoRepo) {
	// return (args) -> {
	// String summary = "irrelevant";
	// todoRepo.save(new Todo(summary));
	// todoRepo.save(new Todo());
	// todoRepo.save(new Todo(summary));
	//
	// Future<List<Todo>> future = todoRepo.findAsyncBySummary(summary);
	//
	// List<Todo> todos = Collections.emptyList();
	// try {
	// todos = future.get();
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	//
	// todos.forEach(System.out::println);
	// };
	// }

}
