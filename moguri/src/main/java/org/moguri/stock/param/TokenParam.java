package org.moguri.stock.param;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TokenParam {
    private String grant_type;
    private String appkey;
    private String appsecret;
}
