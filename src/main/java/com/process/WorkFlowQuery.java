package com.process;

import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.runtime.ProcessInstanceQuery;

public interface WorkFlowQuery {

    public ProcessInstanceQuery createProcessInstanceQuery();


    public ProcessInstance processInstanceId(String processInstanceId);


    public ProcessInstance processInstanceBusinessKey(String processInstanceBusinessKey);


    public ProcessInstance taskId(String taskId);


    public boolean isProcessfinished(String processInstanceId);


}