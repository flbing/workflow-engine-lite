/**
 * lsp10@gmail.com
 * Copyright (c) 2019-2020 All Rights Reserved.
 */

package com.toolkits.workflow;

import com.toolkits.workflow.Exception.WorkFlowException;
import com.toolkits.workflow.model.WorkFlowContext;
import com.toolkits.workflow.model.config.Process;

/**
 * 流程控制器接口
 * @author lsp10
 * @version $Id: ProcessorController.java, v 0.1 2017-11-24 14:01 lsp10 Exp $$
 */
public interface WorkFlowController {

    /**
     * 流程控制方法
     * @param  workFlowContext
     * @throws WorkFlowException
     */
    public void process(WorkFlowContext workFlowContext, Process processConfig) throws WorkFlowException;
}
