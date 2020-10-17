package com.selector.demoSelector.controller;

import com.selector.demoSelector.editor.StatusEditor;
import com.selector.demoSelector.model.BusinessStatus;
import com.selector.demoSelector.service.BusinessStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BusinessStatusController {

    @Autowired
    private BusinessStatusService businessStatusService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(BusinessStatus.class, new StatusEditor());
    }

    @ModelAttribute("allDepartments")
    @GetMapping("/allstatus")
    public List<BusinessStatus> gwtAllBusinessStatus(BusinessStatus businessStatus) {
        return businessStatusService.getAllBusinessStatus(businessStatus);
    }
}
