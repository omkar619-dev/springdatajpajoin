package com.javalover.controller;

import com.javalover.bo.ProjectEngineerResponseBO;
import com.javalover.entity.Engineer;
import com.javalover.entity.Project;
import com.javalover.service.ProjectManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectManagementController {

    @Autowired
    private ProjectManagementService service;

    @PostMapping("/projects")
    public Project addNewProject(@RequestBody Project project) {
        return  service.saveProject(project);
    }
    @GetMapping("/projects")
    public List<Project> getPojects() {
        return service.getAllProjects();
    }

    @GetMapping("/engineers")
    public List<Engineer> getEngineers() {
        return service.getAllEngineers();
    }

    @DeleteMapping("/project/{projectId}")
    public String deleteProject(@PathVariable Integer projectId) {
        return service.deleteProject(projectId);
    }

    @GetMapping("/join/sql")
    public String[] getProjectSpecificInfoSQL(){
        return service.getProjectSpecificInfoSQL();
    }
    @GetMapping("/join/jpql")
    public List<ProjectEngineerResponseBO> getProjectSpecificInfoJPQL(){
        return service.getProjectSpecificInfoJPQL();
    }


}
