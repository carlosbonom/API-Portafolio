package com.cb.Portafolioapi.security.services;

import com.cb.Portafolioapi.models.Project;
import com.cb.Portafolioapi.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project add(Project project){
        return projectRepository.save(project);
    }

    public List<Project> getAllProject (){
        return projectRepository.findAll();
    }

    public Optional<Project> getProject(Long id){
        return projectRepository.findById(id);
    }

    public Project update(Project project, Long id){
        Project projectId = projectRepository.findById(id)
                .orElseThrow(()-> new ExpressionException("no found"));
        projectId.setImage(project.getImage());
        projectId.setCover(project.getCover());
        projectId.setDescription(project.getDescription());
        projectId.setLink(project.getLink());
        projectId.setLinkGit(project.getLinkGit());
        projectId.setLogo(project.getLogo());
        projectId.setTech(project.getTech());
        projectId.setName(project.getName());

        return projectRepository.save(projectId);

    }

    public void delete(Long id){

        projectRepository.deleteById(id);

    }
}
