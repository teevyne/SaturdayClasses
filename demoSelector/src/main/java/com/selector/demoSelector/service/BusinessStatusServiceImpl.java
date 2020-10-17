package com.selector.demoSelector.service;

import com.selector.demoSelector.model.BusinessStatus;
import com.selector.demoSelector.repository.BusinessStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BusinessStatusServiceImpl implements BusinessStatusService{

    @Autowired
    private BusinessStatusRepository businessStatusRepository;

    @Override
    public List<BusinessStatus> getAllBusinessStatus(BusinessStatus businessStatus) {
        ArrayList<BusinessStatus> businessStatusList = new ArrayList<BusinessStatus>();
        businessStatusList.add(new BusinessStatus(1,  "Always open for business"));
        businessStatusList.add(new BusinessStatus(2,  "Open for business"));
        businessStatusList.add(new BusinessStatus(3,  "Closed for business"));
        businessStatusList.add(new BusinessStatus(4,  "Set business hours"));
        return businessStatusList;
//        return businessStatusRepository.findAll();
    }
}
