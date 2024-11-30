package com.javalover.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectEngineerResponseBO {

    private String projectName;
    private String projectCode;
    private String engineerName;
    private String email;

    public ProjectEngineerResponseBO(String projectName, String engineerName) {
        this.projectName = projectName;
        this.engineerName = engineerName;
    }
}

