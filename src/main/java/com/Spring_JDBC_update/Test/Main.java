package com.Spring_JDBC_update.Test;

import com.Spring_JDBC_update.Dao.ProjectDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application-context.xml");
        ProjectDao projectDao= applicationContext.getBean("projectDao",ProjectDao.class);
        int count=projectDao.updateProject(1,"student information");
        System.out.println(count);
    }
}