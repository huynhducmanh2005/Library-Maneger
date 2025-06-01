package com.project.MyManager.service;

public interface BaseService<T, R, ID> extends IDeleteService<T, ID>, IReadService<T, ID>, IWriteService<T, R, ID> {

}
