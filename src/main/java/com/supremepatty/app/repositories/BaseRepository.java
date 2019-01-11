package com.supremepatty.app.repositories;

import lombok.Data;
import org.jooq.DSLContext;
import org.jooq.UpdatableRecord;
import org.jooq.impl.TableImpl;
import org.springframework.stereotype.Repository;

@Repository
@Data
public abstract class BaseRepository<T extends UpdatableRecord, R extends TableImpl<T>> {

    protected final DSLContext jooq;


    public T newRecord() {
        return jooq.newRecord(getTable());
    }

    protected abstract R getTable();

}
