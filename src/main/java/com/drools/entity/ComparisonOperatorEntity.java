package com.drools.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ComparisonOperatorEntity implements Serializable {
    private String names;
    private List<String> list;
}
