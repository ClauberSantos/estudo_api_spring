package com.clauber.estudo01.enums;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME("Home"),
    MOBILE("Mobile"),
    COMERCIAL("Comercial");

    PhoneType(String description) {
        this.description = description;
    }

    private String description;

}
