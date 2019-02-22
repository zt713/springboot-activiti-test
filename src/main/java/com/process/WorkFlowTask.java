package com.process;

import java.util.List;
import java.util.Map;

import org.activiti.engine.task.Comment;

public interface WorkFlowTask {

    public void setVariableLocal(String taskId, String variableName, Object value);


    public void claim(String taskId, String userId) throws RuntimeException,Exception;


    public void unclaim(String taskId)throws RuntimeException,Exception;


    public void complete(String taskId)throws RuntimeException,Exception;


    public void complete(String taskId, Map<String, Object> variables)throws RuntimeException,Exception;


    public void setAssignee(String taskId, String userId)throws RuntimeException,Exception;


    public void addCandidateUser(String taskId, String userId)throws RuntimeException,Exception;


    public Comment addComment(String taskId, String processInstanceId, String message)throws RuntimeException,Exception;


    public List<Comment> getTaskComments(String taskId)throws RuntimeException,Exception;

}
