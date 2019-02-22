package com.process;

import java.util.Map;

import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.runtime.ProcessInstanceQuery;

public interface WorkFlow {

    ProcessInstance startProcessInstanceByKey(String processDefinitionKey, String businessKey, Map<String, Object> variables) throws RuntimeException,Exception;


    void suspendProcessInstanceById(String processInstanceId) throws RuntimeException,Exception;


    void deleteProcessInstance(String processInstanceId, String deleteReason) throws RuntimeException,Exception;

    /** 设置流程开始节点发起人*/
    void setAuthenticatedUserId(String authenticatedUserId);

}
