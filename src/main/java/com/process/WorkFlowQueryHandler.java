package com.process;


import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.runtime.ProcessInstanceQuery;
import org.activiti.engine.task.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class WorkFlowQueryHandler  extends ProcessServiceFactory implements WorkFlowQuery{

    protected static Logger logger = LoggerFactory.getLogger(WorkFlowQueryHandler.class);

    @Override
    public ProcessInstanceQuery createProcessInstanceQuery() {

        return runtimeService.createProcessInstanceQuery();
    }

    @Override
    public ProcessInstance processInstanceId(String processInstanceId) {

        return createProcessInstanceQuery().processInstanceId(processInstanceId).singleResult();
    }

    @Override
    public ProcessInstance processInstanceBusinessKey(String processInstanceBusinessKey) {

        return createProcessInstanceQuery().processInstanceBusinessKey(processInstanceBusinessKey).singleResult();
    }

    @Override
    public boolean isProcessfinished(String processInstanceId) {

        ProcessInstance pi = processInstanceId(processInstanceId);

        return pi ==null;
    }

    @Override
    public ProcessInstance taskId(String taskId) {

        Task task = taskService.createTaskQuery().taskId(taskId).singleResult();

        String processInstId = task.getProcessInstanceId();

        return this.processInstanceId(processInstId);
    }

}
