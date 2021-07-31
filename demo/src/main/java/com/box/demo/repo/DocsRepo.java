package com.box.demo.repo;

import com.box.demo.essence.Doc;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DocsRepo  extends CrudRepository <Doc, Long> {
    List<Doc> findByTag(String barcode);
}
