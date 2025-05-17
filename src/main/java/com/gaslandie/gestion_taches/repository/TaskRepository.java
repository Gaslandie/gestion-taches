package com.gaslandie.gestion_taches.repository;


import com.gaslandie.gestion_taches.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long>{

}
