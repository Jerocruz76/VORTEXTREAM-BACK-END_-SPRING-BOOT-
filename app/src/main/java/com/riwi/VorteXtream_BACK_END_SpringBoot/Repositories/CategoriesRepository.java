package com.riwi.VorteXtream_BACK_END_SpringBoot.Repositories;

import com.riwi.VorteXtream_BACK_END_SpringBoot.Entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Categories, String> {
}
