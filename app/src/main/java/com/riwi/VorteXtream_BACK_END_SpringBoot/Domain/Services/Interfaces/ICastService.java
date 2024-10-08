package com.riwi.VorteXtream_BACK_END_SpringBoot.Domain.Services.Interfaces;

import com.riwi.VorteXtream_BACK_END_SpringBoot.Domain.Entities.Cast;
import com.riwi.VorteXtream_BACK_END_SpringBoot.Domain.Services.CRUD.*;
import jakarta.transaction.Transactional;

import java.util.List;

public interface ICastService extends
        Create<Cast, Cast>,
        Update<Long, Cast>,
        GetByName<Cast, String>,
        GetById<Cast, Long>,
        Delete<Long> {
    @Transactional
    List<Cast> readAll() throws Exception;

    @Transactional
    Cast getByName(String name);
}
