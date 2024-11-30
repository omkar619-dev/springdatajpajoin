package com.javalover.repository;

import com.javalover.bo.ProjectEngineerResponseBO;
import com.javalover.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
    @Query(value = "select p.name,p.project_code,e.email,e.name from project p join engineer e on p.project_id=e.project_id_fk",nativeQuery = true)
    public String[] getProjectSpecificInfoWithSQL();

    @Query(value = "SELECT new com.javalover.bo.ProjectEngineerResponseBO (p.name,p.projectCode,e.email,e.name) FROM Project p join p.engineers e")
    public List<ProjectEngineerResponseBO> getProjectSpecificInfoWithJPQL();
}
