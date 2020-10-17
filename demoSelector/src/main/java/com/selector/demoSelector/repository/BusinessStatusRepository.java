package com.selector.demoSelector.repository;

import com.selector.demoSelector.model.Business;
import com.selector.demoSelector.model.BusinessStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessStatusRepository extends JpaRepository<BusinessStatus, Integer> {
}
