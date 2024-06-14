package com.example.demo.batch;

import com.example.demo.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<User, User> {

    private static final Map<String, String> deptMap = new HashMap<>();

    public Processor(){
        deptMap.put("1", "dept1");
        deptMap.put("2", "dept2");
        deptMap.put("3", "dept3");
    }

    @Override
    public User process(User user) throws Exception {
        user.setDept(deptMap.get(user.getDept()));
        return user;
    }
}
