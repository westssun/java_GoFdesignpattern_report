package com.designpattern.report._03_abstract_factory.step1_before;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Ship {
    private String name;
    private String color;
    private String logo;

    private Wheel wheel;
    private Anchor anchor;
}
