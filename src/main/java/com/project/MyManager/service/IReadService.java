package com.project.MyManager.service;
/*
 * Nghiêp vụ đọc dữ liệu
 * 
 * @param <ID>
 * 
 */

import java.util.List;
import java.util.Optional;

public interface IReadService<T, ID> {

    List<T> getAll();

    Optional<T> getById(long id) throws Exception;

}