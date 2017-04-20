package com.company.demo.web.client;

import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.demo.entity.Client;
import com.haulmont.cuba.gui.components.FieldGroup;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;

import javax.inject.Inject;
import java.util.Map;

public class ClientEdit extends AbstractEditor<Client> {
    @Inject
    private FieldGroup fieldGroup;
    @Inject
    private ComponentsFactory componentsFactory;

    private int customNameCount = 1;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        FieldGroup.FieldConfig customNameField = fieldGroup.createField("customName0");
        customNameField.setComponent(componentsFactory.createComponent(TextField.class));
        customNameField.setCaption("Custom name 0");
        fieldGroup.addField(customNameField);
    }

    public void addName() {
        FieldGroup.FieldConfig customNameField = fieldGroup.createField("customName" + customNameCount);
        customNameField.setComponent(componentsFactory.createComponent(TextField.class));
        customNameField.setCaption("Custom name " + customNameCount++);
        fieldGroup.addField(customNameField, 0, 0);
    }

    public void removeName() {
        if (customNameCount > 0) {
            fieldGroup.removeField("customName" + (customNameCount - 1));
            customNameCount--;
        }
    }

    public void changeCaption() {
        fieldGroup.getFieldNN("title").setCaption("Changed title!");
    }
}