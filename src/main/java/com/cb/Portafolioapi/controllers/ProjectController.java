package com.cb.Portafolioapi.controllers;

import com.cb.Portafolioapi.models.Project;
import com.cb.Portafolioapi.security.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Project> addProject(@RequestBody Project project){
        Project project1 = projectService.add(project);
        try{
            return ResponseEntity.created(new URI("/api/project" + project1.getId())).body(project1);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Project> updateProject(@RequestBody Project project, @PathVariable(value = "id") Long id){
        Project project1 = projectService.update(project, id);
        try {
            return ResponseEntity.created(new URI("/api/project" + project1.getId())).body(project1);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public  void deleteProject(@PathVariable(value = "id") Long id){
        projectService.delete(id);
    }

    @GetMapping
    public  ResponseEntity<List<Project>> getAllProject(){
        return ResponseEntity.ok(projectService.getAllProject());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Project>> getProject(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok(projectService.getProject(id));
    }
}
