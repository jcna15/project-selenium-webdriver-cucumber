package com.company.projectwebdriver.redmine;

import com.company.projectwebdriver.base.BaseTest;
import com.company.projectwebdriver.model.RedmineProject;
import com.company.projectwebdriver.pages.RedmineHomePage;
import com.company.projectwebdriver.pages.RedmineProjectsPage;
import org.junit.jupiter.api.Test;

public class RedmineProjectTest extends BaseTest {
    @Test
    public void testCreateProjectRedmine() {

        RedmineHomePage redmineHomePage = redmineLoginPage.login("jnavarro", "jnavarro");

        RedmineProjectsPage redmineProjectsPage = redmineHomePage.clickOnLink("Projects");

        RedmineProject redmineProject = new RedmineProject();
        redmineProject.setName("RedmineProjectName");
        redmineProject.setDescription("Esta es una descripción de prueba");
        redmineProject.setHomePage("RedmineProjectName");
        redmineProject.setPublic(true);


        redmineProjectsPage.createProject(redmineProject);

        //System.out.println("");
    }
}
