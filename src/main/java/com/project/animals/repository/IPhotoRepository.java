package com.project.animals.repository;

import com.project.animals.model.Photo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhotoRepository  extends CrudRepository<Photo, Integer> {
}
