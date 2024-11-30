package com.javalover.service;

import com.javalover.bo.ProjectEngineerResponseBO;
import com.javalover.entity.Engineer;
import com.javalover.entity.Project;
import com.javalover.repository.EngineerRepository;
import com.javalover.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectManagementService {
    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private EngineerRepository engineerRepository;

    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public List<Engineer> getAllEngineers() {
        return engineerRepository.findAll();
    }

    public String deleteProject(Integer projectId) {
        projectRepository.deleteById(projectId);
        return "Project deleted " + projectId;
    }

    public String[] getProjectSpecificInfoSQL(){
       return projectRepository.getProjectSpecificInfoWithSQL();
    }

    public List<ProjectEngineerResponseBO> getProjectSpecificInfoJPQL(){
        return projectRepository.getProjectSpecificInfoWithJPQL();
    }


}
