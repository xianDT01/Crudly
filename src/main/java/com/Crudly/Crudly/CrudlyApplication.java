package com.Crudly.Crudly;

import com.Crudly.Crudly.Repository.TaskRepository;
import com.Crudly.Crudly.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudlyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudlyApplication.class, args);
	}


	@Autowired
	private TaskRepository taskRepository;

	@Override
	public void run(String... args) throws Exception {
		// Crear algunas tareas de ejemplo
		Task task1 = new Task("Aprender Spring Boot", "Completar el tutorial de Spring Boot", false);
		Task task2 = new Task("Crear proyecto CRUD", "Desarrollar Crudly desde cero", true);

		// Guardar tareas en la base de datos
		taskRepository.save(task1);
		taskRepository.save(task2);

		System.out.println("Tareas guardadas en la base de datos:");
		taskRepository.findAll().forEach(task -> {
			System.out.println(task.getTitle() + " - " + task.getDescription());
		});
	}
}
