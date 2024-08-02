package com.MainApp;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ConnectionFactory.ConnectionFactory;
import com.Model.Answer;
import com.Model.Question;
public class App 
{
    public static void main( String[] args )
    {
    	 Session s = ConnectionFactory.getSession();
    	 Transaction t = s.beginTransaction();
    	 
    	 Question q1 = new Question();
    	 q1.setQid(101);
    	 q1.setQues("What is sql");
    	
    	 Answer a1 = new Answer();
    	 a1.setAid(1);
    	 a1.setAns("structure query languaage");
    	 a1.setQues(q1);
    	 q1.setAns(a1);
    	 
    	 Question q2 = new Question();
    	 q2.setQid(102);
    	 q2.setQues("What is hql");
    	
    	 Answer a2 = new Answer();
    	 a2.setAid(2);
    	 a2.setAns("Hibernate query languaage");
    	 a2.setQues(q2);
    	 q2.setAns(a2);
    	 
    	 s.save(q1);
    	 s.save(q2);
    	 
    	 t.commit();
    	 
    }
    
}
