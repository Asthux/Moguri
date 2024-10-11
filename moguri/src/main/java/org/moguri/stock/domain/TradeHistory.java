package org.moguri.stock.domain;

import lombok.*;
import org.moguri.stock.enums.TradeType;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
public class TradeHistory {
    private String stockNameKR;
    private String marketType;
    private int price;
    private int quantity;
    private int totalAmount;
    private TradeType tradeType;
    private LocalDateTime tradeAt;
}