package com.clauber.estudo01.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum PhoneType {

    HOME("Home"),
    MOBILE("Mobile"),
    COMERCIAL("Comercial");

    PhoneType(String description) {
        this.description = description;
    }

    private final String description;

}
