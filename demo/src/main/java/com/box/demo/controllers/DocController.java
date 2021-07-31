package com.box.demo.controllers;

import com.box.demo.essence.Box;
import com.box.demo.essence.Doc;
import com.box.demo.repo.BoxRepo;
import com.box.demo.repo.DocsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@org.springframework.stereotype.Controller
public class DocController {
    @Autowired
    private DocsRepo docsRepo;
    @Autowired
    private BoxRepo boxRepo;

    @GetMapping
    public String main(Map<String, Object> model) {
        Iterable<Doc> docs = docsRepo.findAll();
        Iterable<Box> boxes = boxRepo.findAll();
        model.put("docs", docs);
        model.put("boxes", boxes);

        return "main";
    }

    @PostMapping
    public String add(@RequestParam String title, @RequestParam String barcode, Map<String, Object> model) {
        Doc doc = new Doc(title, barcode);
        Box box = new Box(title, barcode);

        docsRepo.save(doc);
        boxRepo.save(box);

        Iterable<Doc> docs = docsRepo.findAll();
        Iterable<Box> boxes = boxRepo.findAll();

        model.put("docs", docs);
        model.put("boxes", boxes);

        return "main";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String filter, Map<String, Object> model){
        Iterable<Doc> docs;

        if (filter != null && !filter.isEmpty()) {
            docs = docsRepo.findByTag(filter);
        }else {
            docs=docsRepo.findAll();
        }
        model.put("docs", docs);

        return "main";
    }


}
