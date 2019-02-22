package com.process;

import org.activiti.engine.runtime.ProcessInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class WorkFlowHandler extends ProcessServiceFactory implements WorkFlow{

    protected static Logger logger = LoggerFactory.getLogger(WorkFlowHandler.class);

    @Override
    public ProcessInstance startProcessInstanceByKey(String processDefinitionKey, String businessKey,
                                                     Map<String, Object> variables) throws RuntimeException,Exception {

        ProcessInstance pi = runtimeService.startProcessInstanceByKey(processDefinitionKey, businessKey, variables);

        return pi;
    }

    @Override
    public void suspendProcessInstanceById(String processInstanceId) throws RuntimeException,Exception{

        runtimeService.suspendProcessInstanceById(processInstanceId);
    }

    @Override
    public void deleteProcessInstance(String processInstanceId, String deleteReason) throws RuntimeException,Exception{

        runtimeService.deleteProcessInstance(processInstanceId, deleteReason);
    }

    @Override
    public void setAuthenticatedUserId(String authenticatedUserId) {
        identityService.setAuthenticatedUserId(authenticatedUserId);
    }

}

