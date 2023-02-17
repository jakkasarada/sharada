package hello.java.controller;

import java.util.ArrayList;
import java.util.List;

public class jakkaclass {
	 public jakka jak;  
	  
	    public jakkaclass(jakka ja) {  
	        this.jak = ja;  
	    }  
	      
	    public List<String> getTodosforHibernate(String user) {  
	          
	        List<String> hibernatelist = new ArrayList<String>();  
	        List<String> Combinedlist = jak.getTodos(user);  
	          
	        for(String todo: Combinedlist) {  
	            if(todo.contains("Hibernate")) {  
	                hibernatelist.add(todo);  
	            }  
	        }  
	          
	        return hibernatelist;  
	        }  

}
