package com.box.demo.repo;

import com.box.demo.essence.Box;
import org.springframework.data.repository.CrudRepository;

public interface BoxRepo extends CrudRepository<Box, Long> {
    Iterable<Box> findByTag(String filter);
}
