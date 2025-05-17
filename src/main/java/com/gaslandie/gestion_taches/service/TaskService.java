package com.gaslandie.gestion_taches.service;

import com.gaslandie.gestion_taches.model.Task;
import com.gaslandie.gestion_taches.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TaskService {
    private final TaskRepository taskRepository;

    //Injection du repository via le constructeur
    @Autowired
    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    //recupere une tache par son id (ou null si non trouvée)
    public Task getTaskById(Long id){
        Optional<Task> optionalTask = taskRepository.findById(id);
        return optionalTask.orElse(null);
    }

    //crée ou modifie une tache
    public Task saveTask(Task task){
        return taskRepository.save(task);
    }

    //Supprime une tache par son ID
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}
