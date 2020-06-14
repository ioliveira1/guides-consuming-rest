package com.ioliveira.domain.currency;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder(toBuilder = true)
@JsonPropertyOrder({"base", "date", "rates"})
public class Currency {
    private Rates rates;
    private String base;
    private String date;
}
