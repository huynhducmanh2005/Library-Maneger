package com.project.MyManager.service;

public interface IWriteService<T, R, ID> {

    T creat(R entity) throws Exception;

    T update(long id, R entity) throws Exception;

}
