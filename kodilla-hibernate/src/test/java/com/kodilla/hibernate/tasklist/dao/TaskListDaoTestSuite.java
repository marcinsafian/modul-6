package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    private static final String LISTNAME = "To Do";
    private static final String DESCRIPTION_1 = "1st task to do";
    private static final String DESCRIPTION_2 = "2nd task to do";

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION_1);
        TaskList taskList1 = new TaskList(LISTNAME, DESCRIPTION_2);

        //When
        taskListDao.save(taskList);
        taskListDao.save(taskList1);

        //Then
        List<TaskList> theList = taskListDao.findByListName(LISTNAME);

        Assert.assertEquals(2, theList.size());
        Assert.assertEquals(LISTNAME, theList.get(0).getListName());
        Assert.assertEquals(LISTNAME, theList.get(1).getListName());

        //CleanUp
        taskListDao.delete(taskList);
        taskListDao.delete(taskList1);
    }
}
