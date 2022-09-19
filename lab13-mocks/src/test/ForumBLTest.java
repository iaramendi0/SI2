package test;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import businessLogic.ForumBL;
import database.ForumDAOInterface;


@RunWith(MockitoJUnitRunner.class)
public class ForumBLTest {
	@Mock 
	ForumDAOInterface forumDAO;

	@InjectMocks
	ForumBL sut;

	@Test
	public void test0() {
	try
	{
	System.out.println("forumDAO.addUserDAO(\"1234\",\"Jon\",\"654478722\")" +forumDAO.addUserDAO("1234","Jon","654478722"));
	System.out.println("forumDAO.getUserDAO(\"1234\")" +forumDAO.getUserDAO("1234"));
	}
	catch
	(Exception e) {
	
	e.printStackTrace();
	}
	}
}
