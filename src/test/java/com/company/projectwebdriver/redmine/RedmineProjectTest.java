package com.company.projectwebdriver.redmine;

import com.company.projectwebdriver.base.BaseTest;
import com.company.projectwebdriver.model.RedmineProject;
import com.company.projectwebdriver.pages.RedmineHomePage;
import com.company.projectwebdriver.pages.RedmineProjectsPage;
import com.company.projectwebdriver.utils.Util;
import org.junit.Test;

public class RedmineProjectTest extends BaseTest {
    @Test
    public void testCreateProjectRedmine() {

        RedmineHomePage redmineHomePage = redmineLoginPage.login("jnavarro", "jnavarro");

        RedmineProjectsPage redmineProjectsPage = redmineHomePage.clickOnLink("Projects");

        String number = Util.generateRandomNumber();

        RedmineProject redmineProject = new RedmineProject();
        redmineProject.setName("RedmineProjectName" + number);
        redmineProject.setDescription("Esta es una descripción de prueba" + number);
        redmineProject.setHomePage("RedmineProjectName" + number);
        redmineProject.setPublic(true);

        redmineProjectsPage.createProject(redmineProject);

        //assertEquals("Successful creation.", redmineProjectsPage.getUIMessage(), "The message is not correct");

        //System.out.println("");
    }
}
