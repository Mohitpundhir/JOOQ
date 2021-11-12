/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ModelTemplateDefinition implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long   id;
    private String displayName;
    private Long   level;
    private Long   parentId;
    private Long   modelTemplateId;
    private Long   displayOrder;

    public ModelTemplateDefinition() {}

    public ModelTemplateDefinition(ModelTemplateDefinition value) {
        this.id = value.id;
        this.displayName = value.displayName;
        this.level = value.level;
        this.parentId = value.parentId;
        this.modelTemplateId = value.modelTemplateId;
        this.displayOrder = value.displayOrder;
    }

    public ModelTemplateDefinition(
        Long   id,
        String displayName,
        Long   level,
        Long   parentId,
        Long   modelTemplateId,
        Long   displayOrder
    ) {
        this.id = id;
        this.displayName = displayName;
        this.level = level;
        this.parentId = parentId;
        this.modelTemplateId = modelTemplateId;
        this.displayOrder = displayOrder;
    }

    /**
     * Getter for <code>finance_service.model_template_definition.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>finance_service.model_template_definition.id</code>.
     */
    public ModelTemplateDefinition setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>finance_service.model_template_definition.display_name</code>.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Setter for <code>finance_service.model_template_definition.display_name</code>.
     */
    public ModelTemplateDefinition setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Getter for <code>finance_service.model_template_definition.level</code>.
     */
    public Long getLevel() {
        return this.level;
    }

    /**
     * Setter for <code>finance_service.model_template_definition.level</code>.
     */
    public ModelTemplateDefinition setLevel(Long level) {
        this.level = level;
        return this;
    }

    /**
     * Getter for <code>finance_service.model_template_definition.parent_id</code>.
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * Setter for <code>finance_service.model_template_definition.parent_id</code>.
     */
    public ModelTemplateDefinition setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Getter for <code>finance_service.model_template_definition.model_template_id</code>.
     */
    public Long getModelTemplateId() {
        return this.modelTemplateId;
    }

    /**
     * Setter for <code>finance_service.model_template_definition.model_template_id</code>.
     */
    public ModelTemplateDefinition setModelTemplateId(Long modelTemplateId) {
        this.modelTemplateId = modelTemplateId;
        return this;
    }

    /**
     * Getter for <code>finance_service.model_template_definition.display_order</code>.
     */
    public Long getDisplayOrder() {
        return this.displayOrder;
    }

    /**
     * Setter for <code>finance_service.model_template_definition.display_order</code>.
     */
    public ModelTemplateDefinition setDisplayOrder(Long displayOrder) {
        this.displayOrder = displayOrder;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ModelTemplateDefinition other = (ModelTemplateDefinition) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (displayName == null) {
            if (other.displayName != null)
                return false;
        }
        else if (!displayName.equals(other.displayName))
            return false;
        if (level == null) {
            if (other.level != null)
                return false;
        }
        else if (!level.equals(other.level))
            return false;
        if (parentId == null) {
            if (other.parentId != null)
                return false;
        }
        else if (!parentId.equals(other.parentId))
            return false;
        if (modelTemplateId == null) {
            if (other.modelTemplateId != null)
                return false;
        }
        else if (!modelTemplateId.equals(other.modelTemplateId))
            return false;
        if (displayOrder == null) {
            if (other.displayOrder != null)
                return false;
        }
        else if (!displayOrder.equals(other.displayOrder))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.displayName == null) ? 0 : this.displayName.hashCode());
        result = prime * result + ((this.level == null) ? 0 : this.level.hashCode());
        result = prime * result + ((this.parentId == null) ? 0 : this.parentId.hashCode());
        result = prime * result + ((this.modelTemplateId == null) ? 0 : this.modelTemplateId.hashCode());
        result = prime * result + ((this.displayOrder == null) ? 0 : this.displayOrder.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ModelTemplateDefinition (");

        sb.append(id);
        sb.append(", ").append(displayName);
        sb.append(", ").append(level);
        sb.append(", ").append(parentId);
        sb.append(", ").append(modelTemplateId);
        sb.append(", ").append(displayOrder);

        sb.append(")");
        return sb.toString();
    }
}
