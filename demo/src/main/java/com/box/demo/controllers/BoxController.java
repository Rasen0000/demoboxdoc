/*package com.box.demo.controllers;

import com.box.demo.essence.Box;
import com.box.demo.essence.Doc;
import com.box.demo.repo.BoxRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class BoxController {

    @Autowired
    private BoxRepo boxRepo;

    @GetMapping
    public String main(Map<String, Object> model) {
        Iterable<Box> boxes = boxRepo.findAll();

        model.put("boxes", boxes);

        return "main";
    }

    @PostMapping
    public String add(@RequestParam String title, @RequestParam String barcode, Map<String, Object> model) {
        Box box = new Box(title, barcode);

        boxRepo.save(box);

        Iterable<Box> boxes = boxRepo.findAll();

        model.put("boxes", boxes);

        return "main";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String filter, Map<String, Object> model){
        Iterable<Box> boxes;

        if (filter != null && !filter.isEmpty()) {
            boxes = boxRepo.findByTag(filter);
        }else {
            boxes=boxRepo.findAll();
        }
        model.put("boxes", boxes);

        return "main";
    }


}
*/