package com.liyang.servicelmpl;

import com.liyang.entity.LawItemType;
import com.liyang.mapper.LawItemTypeMapper;
import com.liyang.service.LawItemTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class LawItemTypeServicelmpl implements LawItemTypeService {
    @Autowired
    LawItemTypeMapper lawItemTypeMapper;
    private static final int pageCount = 10;
    @Override
    public HashMap<String, Integer> getCount() {
        HashMap<String, Integer> hm = new HashMap<>();
        int count = lawItemTypeMapper.getCount();
        if (count != 0){
            hm.put("code",0);
            hm.put("count",count);
        }else{
            hm.put("code",0);
        }
        return hm;
    }

    @Override
    public LawItemType getLawItemTypeName(int lawItemType) {

        return lawItemTypeMapper.getLawItemTypeName(lawItemType);
    }

    @Override
    public List<LawItemType> getList(int page) {
        int limits = (page-1)*pageCount;
        int limite = pageCount;
        return lawItemTypeMapper.getList(limits,limite);
    }

    @Override
    public int insertNew(LawItemType lawItemType) {
        return lawItemTypeMapper.insertNew(lawItemType);
    }

}
