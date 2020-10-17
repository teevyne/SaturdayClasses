package com.selector.demoSelector.editor;

import com.selector.demoSelector.model.BusinessStatus;
import java.beans.PropertyEditorSupport;

public class StatusEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String id){
        BusinessStatus status;

        switch(Integer.parseInt(id)){
            case 1:
                status = new BusinessStatus(1, "Always Open");
                break;
            case 2:
                status = new BusinessStatus(2, "Open for business");
                break;
            case 3:
                status = new BusinessStatus(3, "Closed for business");
                break;
            case 4:
                status = new BusinessStatus(4, "Set business hours");
            default:
                status = null;
        }
        this.setValue(status);
    }

}
