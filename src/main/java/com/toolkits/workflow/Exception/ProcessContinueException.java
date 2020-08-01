/**
 * lsp10@gmail.com
 * Copyright (c) 2019-2020 All Rights Reserved.
 */

package com.toolkits.workflow.Exception;

/**
 * 流程继续异常，用于应用跳过当前状跳转process的后续Action， 继续执行正常的router
 * @author lsp10
 * @version $Id: ProcessContinueException.java, v 0.1 2017-11-27 21:08 lsp10 Exp $$
 */
public class ProcessContinueException extends WorkFlowException {

    /** serialVersionUID */
    private static final long serialVersionUID = 4152454735215348604L;


    /**
     * 枚举值作为入参的构造函数
     *
     * @param errorCodeEnum
     */
    public ProcessContinueException(ProcessBaseEnum errorCodeEnum) {
        super(WorkFlowErrorCode.PROCESS_CONTINUE_EXCEPTION);
    }
}