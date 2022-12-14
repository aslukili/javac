package org.loukili.javac.repository;

import jakarta.persistence.Query;

public interface IFilterRepository<T> {
    public T getAllAndCount();
    public long getCount();
}
