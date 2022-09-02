package com.example.test.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.test.data.TestData;

@Controller
public class TestCtrl {
    /**
     * @return
     */
    @GetMapping("/test")
    public String openTest(Model model) {
        TestData data1 = new TestData();
        data1.setId(1);
        data1.setName("a");
        data1.setDateTime(LocalDateTime.now());

        TestData data2 = new TestData();
        data2.setId(2);
        data2.setName("b");
        data2.setDateTime(LocalDateTime.now());

        TestData data3 = new TestData();
        data3.setId(3);
        data3.setName("c");
        data3.setDateTime(LocalDateTime.now());

        ArrayList<TestData> dataList = new ArrayList<TestData>();
        dataList.add(data1);
        dataList.add(data2);
        dataList.add(data3);
        
        model.addAttribute("data", dataList);

        return "test/board";
    }
}
