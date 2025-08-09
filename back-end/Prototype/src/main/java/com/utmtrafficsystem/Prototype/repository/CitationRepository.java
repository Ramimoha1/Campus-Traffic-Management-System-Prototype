package com.utmtrafficsystem.Prototype.repository;

import com.utmtrafficsystem.Prototype.model.Citation;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@RegisterBeanMapper(Citation.class)
public interface CitationRepository {
    @SqlUpdate("INSERT INTO citation (matric, citation_type, citation_time, address, violation_photo) " +
            "VALUES (:matric, :citation_type, :citation_time, :address, :violation_photo)")
    void addCitation(String matric, String citation_type, LocalDateTime citation_time, String address, byte[] violation_photo);

    @SqlQuery("SELECT * FROM citation")
    List<Citation> showAllCitations();
}
