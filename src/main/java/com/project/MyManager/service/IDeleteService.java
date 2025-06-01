package com.project.MyManager.service;

public interface IDeleteService<T, ID> {

    void delete(long id) throws Exception;
}
