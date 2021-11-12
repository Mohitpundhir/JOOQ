/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultValueNew implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long      templateDefinitionId;
    private Long      parentId;
    private Boolean   hasEntities;
    private Long      entityId;
    private Long      parentEntityId;
    private Long      entityAttributesId;
    private Double    defaultValue;
    private Long      defaultOptionId;
    private LocalDate defaultDate;

    public DefaultValueNew() {}

    public DefaultValueNew(DefaultValueNew value) {
        this.templateDefinitionId = value.templateDefinitionId;
        this.parentId = value.parentId;
        this.hasEntities = value.hasEntities;
        this.entityId = value.entityId;
        this.parentEntityId = value.parentEntityId;
        this.entityAttributesId = value.entityAttributesId;
        this.defaultValue = value.defaultValue;
        this.defaultOptionId = value.defaultOptionId;
        this.defaultDate = value.defaultDate;
    }

    public DefaultValueNew(
        Long      templateDefinitionId,
        Long      parentId,
        Boolean   hasEntities,
        Long      entityId,
        Long      parentEntityId,
        Long      entityAttributesId,
        Double    defaultValue,
        Long      defaultOptionId,
        LocalDate defaultDate
    ) {
        this.templateDefinitionId = templateDefinitionId;
        this.parentId = parentId;
        this.hasEntities = hasEntities;
        this.entityId = entityId;
        this.parentEntityId = parentEntityId;
        this.entityAttributesId = entityAttributesId;
        this.defaultValue = defaultValue;
        this.defaultOptionId = defaultOptionId;
        this.defaultDate = defaultDate;
    }

    /**
     * Getter for <code>finance_service.default_value_new.template_definition_id</code>.
     */
    public Long getTemplateDefinitionId() {
        return this.templateDefinitionId;
    }

    /**
     * Setter for <code>finance_service.default_value_new.template_definition_id</code>.
     */
    public DefaultValueNew setTemplateDefinitionId(Long templateDefinitionId) {
        this.templateDefinitionId = templateDefinitionId;
        return this;
    }

    /**
     * Getter for <code>finance_service.default_value_new.parent_id</code>.
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * Setter for <code>finance_service.default_value_new.parent_id</code>.
     */
    public DefaultValueNew setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Getter for <code>finance_service.default_value_new.has_entities</code>.
     */
    public Boolean getHasEntities() {
        return this.hasEntities;
    }

    /**
     * Setter for <code>finance_service.default_value_new.has_entities</code>.
     */
    public DefaultValueNew setHasEntities(Boolean hasEntities) {
        this.hasEntities = hasEntities;
        return this;
    }

    /**
     * Getter for <code>finance_service.default_value_new.entity_id</code>.
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * Setter for <code>finance_service.default_value_new.entity_id</code>.
     */
    public DefaultValueNew setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Getter for <code>finance_service.default_value_new.parent_entity_id</code>.
     */
    public Long getParentEntityId() {
        return this.parentEntityId;
    }

    /**
     * Setter for <code>finance_service.default_value_new.parent_entity_id</code>.
     */
    public DefaultValueNew setParentEntityId(Long parentEntityId) {
        this.parentEntityId = parentEntityId;
        return this;
    }

    /**
     * Getter for <code>finance_service.default_value_new.entity_attributes_id</code>.
     */
    public Long getEntityAttributesId() {
        return this.entityAttributesId;
    }

    /**
     * Setter for <code>finance_service.default_value_new.entity_attributes_id</code>.
     */
    public DefaultValueNew setEntityAttributesId(Long entityAttributesId) {
        this.entityAttributesId = entityAttributesId;
        return this;
    }

    /**
     * Getter for <code>finance_service.default_value_new.default_value</code>.
     */
    public Double getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * Setter for <code>finance_service.default_value_new.default_value</code>.
     */
    public DefaultValueNew setDefaultValue(Double defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * Getter for <code>finance_service.default_value_new.default_option_id</code>.
     */
    public Long getDefaultOptionId() {
        return this.defaultOptionId;
    }

    /**
     * Setter for <code>finance_service.default_value_new.default_option_id</code>.
     */
    public DefaultValueNew setDefaultOptionId(Long defaultOptionId) {
        this.defaultOptionId = defaultOptionId;
        return this;
    }

    /**
     * Getter for <code>finance_service.default_value_new.default_date</code>.
     */
    public LocalDate getDefaultDate() {
        return this.defaultDate;
    }

    /**
     * Setter for <code>finance_service.default_value_new.default_date</code>.
     */
    public DefaultValueNew setDefaultDate(LocalDate defaultDate) {
        this.defaultDate = defaultDate;
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
        final DefaultValueNew other = (DefaultValueNew) obj;
        if (templateDefinitionId == null) {
            if (other.templateDefinitionId != null)
                return false;
        }
        else if (!templateDefinitionId.equals(other.templateDefinitionId))
            return false;
        if (parentId == null) {
            if (other.parentId != null)
                return false;
        }
        else if (!parentId.equals(other.parentId))
            return false;
        if (hasEntities == null) {
            if (other.hasEntities != null)
                return false;
        }
        else if (!hasEntities.equals(other.hasEntities))
            return false;
        if (entityId == null) {
            if (other.entityId != null)
                return false;
        }
        else if (!entityId.equals(other.entityId))
            return false;
        if (parentEntityId == null) {
            if (other.parentEntityId != null)
                return false;
        }
        else if (!parentEntityId.equals(other.parentEntityId))
            return false;
        if (entityAttributesId == null) {
            if (other.entityAttributesId != null)
                return false;
        }
        else if (!entityAttributesId.equals(other.entityAttributesId))
            return false;
        if (defaultValue == null) {
            if (other.defaultValue != null)
                return false;
        }
        else if (!defaultValue.equals(other.defaultValue))
            return false;
        if (defaultOptionId == null) {
            if (other.defaultOptionId != null)
                return false;
        }
        else if (!defaultOptionId.equals(other.defaultOptionId))
            return false;
        if (defaultDate == null) {
            if (other.defaultDate != null)
                return false;
        }
        else if (!defaultDate.equals(other.defaultDate))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.templateDefinitionId == null) ? 0 : this.templateDefinitionId.hashCode());
        result = prime * result + ((this.parentId == null) ? 0 : this.parentId.hashCode());
        result = prime * result + ((this.hasEntities == null) ? 0 : this.hasEntities.hashCode());
        result = prime * result + ((this.entityId == null) ? 0 : this.entityId.hashCode());
        result = prime * result + ((this.parentEntityId == null) ? 0 : this.parentEntityId.hashCode());
        result = prime * result + ((this.entityAttributesId == null) ? 0 : this.entityAttributesId.hashCode());
        result = prime * result + ((this.defaultValue == null) ? 0 : this.defaultValue.hashCode());
        result = prime * result + ((this.defaultOptionId == null) ? 0 : this.defaultOptionId.hashCode());
        result = prime * result + ((this.defaultDate == null) ? 0 : this.defaultDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DefaultValueNew (");

        sb.append(templateDefinitionId);
        sb.append(", ").append(parentId);
        sb.append(", ").append(hasEntities);
        sb.append(", ").append(entityId);
        sb.append(", ").append(parentEntityId);
        sb.append(", ").append(entityAttributesId);
        sb.append(", ").append(defaultValue);
        sb.append(", ").append(defaultOptionId);
        sb.append(", ").append(defaultDate);

        sb.append(")");
        return sb.toString();
    }
}