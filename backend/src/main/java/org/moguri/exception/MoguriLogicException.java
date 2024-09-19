package org.moguri.exception;

import org.moguri.common.enums.ReturnCode;
// 개발자가 잘못 한 것 예외 처리
public class MoguriLogicException extends MoguriException {
    public MoguriLogicException(ReturnCode returnCode) {
        super(returnCode);
    }
}
