package com.langltc.pl.repositories;

import com.langltc.pl.models.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Issam As-sahal ISA On 10/5/2018
 * 6:58 PM
 **/
@Repository
public interface SectionRepository extends JpaRepository<Section,Long> {


}
