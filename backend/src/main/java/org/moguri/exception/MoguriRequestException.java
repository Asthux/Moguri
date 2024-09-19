package org.moguri.exception;

import org.moguri.common.enums.ReturnCode;
// 서버가 잘못 보낼 때 예외 처리
public class MoguriRequestException extends MoguriException {
    public MoguriRequestException(ReturnCode returnCode) {
        super(returnCode);
    }
}
