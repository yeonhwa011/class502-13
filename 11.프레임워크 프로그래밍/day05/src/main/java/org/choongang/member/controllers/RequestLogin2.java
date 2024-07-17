package org.choongang.member.controllers;

import lombok.Builder;
import lombok.Getter;

//@Getter
@Builder
public record RequestLogin2 (
    String email,
    String password
){}
