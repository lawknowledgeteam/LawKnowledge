package com.liyang.service;


import com.liyang.entity.Law;

import java.util.HashMap;
import java.util.List;

public interface LawService {
    List<Law> getList(int page);
    Law getLaw(String lawName);
    HashMap<String,Integer> getCount();
    int insertNew(Law law);
}