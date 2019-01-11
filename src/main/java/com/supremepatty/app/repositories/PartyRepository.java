package com.supremepatty.app.repositories;

import com.supremepatty.app.jooq.tables.Party;
import com.supremepatty.app.jooq.tables.records.PartyRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.supremepatty.app.jooq.tables.Party.PARTY;


@Repository
public class PartyRepository extends BaseRepository<PartyRecord, Party> {


    public PartyRepository(DSLContext jooq) {
        super(jooq);
    }

    protected Party getTable() {
        return PARTY;
    }

    public List<PartyRecord> getParties() {
        return jooq.selectFrom(PARTY).fetch();
    }
}
