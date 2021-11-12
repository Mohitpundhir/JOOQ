/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FinancialAssessmentEntityValuesView implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long    entityAttributesId;
    private Long    displayOrder;
    private Long    entityId;
    private Long    attributeId;
    private String  name;
    private Long    inputTypeId;
    private String  description;
    private Boolean isUserInput;
    private String  suffix;
    private String  prefix;
    private Long    financialAssessmentId;
    private Double  value;
    private Double  targetValue;
    private Long    attributeOptionId;

    public FinancialAssessmentEntityValuesView() {}

    public FinancialAssessmentEntityValuesView(FinancialAssessmentEntityValuesView value) {
        this.entityAttributesId = value.entityAttributesId;
        this.displayOrder = value.displayOrder;
        this.entityId = value.entityId;
        this.attributeId = value.attributeId;
        this.name = value.name;
        this.inputTypeId = value.inputTypeId;
        this.description = value.description;
        this.isUserInput = value.isUserInput;
        this.suffix = value.suffix;
        this.prefix = value.prefix;
        this.financialAssessmentId = value.financialAssessmentId;
        this.value = value.value;
        this.targetValue = value.targetValue;
        this.attributeOptionId = value.attributeOptionId;
    }

    public FinancialAssessmentEntityValuesView(
        Long    entityAttributesId,
        Long    displayOrder,
        Long    entityId,
        Long    attributeId,
        String  name,
        Long    inputTypeId,
        String  description,
        Boolean isUserInput,
        String  suffix,
        String  prefix,
        Long    financialAssessmentId,
        Double  value,
        Double  targetValue,
        Long    attributeOptionId
    ) {
        this.entityAttributesId = entityAttributesId;
        this.displayOrder = displayOrder;
        this.entityId = entityId;
        this.attributeId = attributeId;
        this.name = name;
        this.inputTypeId = inputTypeId;
        this.description = description;
        this.isUserInput = isUserInput;
        this.suffix = suffix;
        this.prefix = prefix;
        this.financialAssessmentId = financialAssessmentId;
        this.value = value;
        this.targetValue = targetValue;
        this.attributeOptionId = attributeOptionId;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.entity_attributes_id</code>.
     */
    public Long getEntityAttributesId() {
        return this.entityAttributesId;
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.entity_attributes_id</code>.
     */
    public FinancialAssessmentEntityValuesView setEntityAttributesId(Long entityAttributesId) {
        this.entityAttributesId = entityAttributesId;
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.display_order</code>.
     */
    public Long getDisplayOrder() {
        return this.displayOrder;
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.display_order</code>.
     */
    public FinancialAssessmentEntityValuesView setDisplayOrder(Long displayOrder) {
        this.displayOrder = displayOrder;
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.entity_id</code>.
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.entity_id</code>.
     */
    public FinancialAssessmentEntityValuesView setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.attribute_id</code>.
     */
    public Long getAttributeId() {
        return this.attributeId;
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.attribute_id</code>.
     */
    public FinancialAssessmentEntityValuesView setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.name</code>.
     */
    public FinancialAssessmentEntityValuesView setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.input_type_id</code>.
     */
    public Long getInputTypeId() {
        return this.inputTypeId;
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.input_type_id</code>.
     */
    public FinancialAssessmentEntityValuesView setInputTypeId(Long inputTypeId) {
        this.inputTypeId = inputTypeId;
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.description</code>.
     */
    public FinancialAssessmentEntityValuesView setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.is_user_input</code>.
     */
    public Boolean getIsUserInput() {
        return this.isUserInput;
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.is_user_input</code>.
     */
    public FinancialAssessmentEntityValuesView setIsUserInput(Boolean isUserInput) {
        this.isUserInput = isUserInput;
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.suffix</code>.
     */
    public String getSuffix() {
        return this.suffix;
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.suffix</code>.
     */
    public FinancialAssessmentEntityValuesView setSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.prefix</code>.
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.prefix</code>.
     */
    public FinancialAssessmentEntityValuesView setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.financial_assessment_id</code>.
     */
    public Long getFinancialAssessmentId() {
        return this.financialAssessmentId;
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.financial_assessment_id</code>.
     */
    public FinancialAssessmentEntityValuesView setFinancialAssessmentId(Long financialAssessmentId) {
        this.financialAssessmentId = financialAssessmentId;
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.value</code>.
     */
    public Double getValue() {
        return this.value;
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.value</code>.
     */
    public FinancialAssessmentEntityValuesView setValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.target_value</code>.
     */
    public Double getTargetValue() {
        return this.targetValue;
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.target_value</code>.
     */
    public FinancialAssessmentEntityValuesView setTargetValue(Double targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.attribute_option_id</code>.
     */
    public Long getAttributeOptionId() {
        return this.attributeOptionId;
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.attribute_option_id</code>.
     */
    public FinancialAssessmentEntityValuesView setAttributeOptionId(Long attributeOptionId) {
        this.attributeOptionId = attributeOptionId;
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
        final FinancialAssessmentEntityValuesView other = (FinancialAssessmentEntityValuesView) obj;
        if (entityAttributesId == null) {
            if (other.entityAttributesId != null)
                return false;
        }
        else if (!entityAttributesId.equals(other.entityAttributesId))
            return false;
        if (displayOrder == null) {
            if (other.displayOrder != null)
                return false;
        }
        else if (!displayOrder.equals(other.displayOrder))
            return false;
        if (entityId == null) {
            if (other.entityId != null)
                return false;
        }
        else if (!entityId.equals(other.entityId))
            return false;
        if (attributeId == null) {
            if (other.attributeId != null)
                return false;
        }
        else if (!attributeId.equals(other.attributeId))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (inputTypeId == null) {
            if (other.inputTypeId != null)
                return false;
        }
        else if (!inputTypeId.equals(other.inputTypeId))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (isUserInput == null) {
            if (other.isUserInput != null)
                return false;
        }
        else if (!isUserInput.equals(other.isUserInput))
            return false;
        if (suffix == null) {
            if (other.suffix != null)
                return false;
        }
        else if (!suffix.equals(other.suffix))
            return false;
        if (prefix == null) {
            if (other.prefix != null)
                return false;
        }
        else if (!prefix.equals(other.prefix))
            return false;
        if (financialAssessmentId == null) {
            if (other.financialAssessmentId != null)
                return false;
        }
        else if (!financialAssessmentId.equals(other.financialAssessmentId))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        }
        else if (!value.equals(other.value))
            return false;
        if (targetValue == null) {
            if (other.targetValue != null)
                return false;
        }
        else if (!targetValue.equals(other.targetValue))
            return false;
        if (attributeOptionId == null) {
            if (other.attributeOptionId != null)
                return false;
        }
        else if (!attributeOptionId.equals(other.attributeOptionId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.entityAttributesId == null) ? 0 : this.entityAttributesId.hashCode());
        result = prime * result + ((this.displayOrder == null) ? 0 : this.displayOrder.hashCode());
        result = prime * result + ((this.entityId == null) ? 0 : this.entityId.hashCode());
        result = prime * result + ((this.attributeId == null) ? 0 : this.attributeId.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.inputTypeId == null) ? 0 : this.inputTypeId.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.isUserInput == null) ? 0 : this.isUserInput.hashCode());
        result = prime * result + ((this.suffix == null) ? 0 : this.suffix.hashCode());
        result = prime * result + ((this.prefix == null) ? 0 : this.prefix.hashCode());
        result = prime * result + ((this.financialAssessmentId == null) ? 0 : this.financialAssessmentId.hashCode());
        result = prime * result + ((this.value == null) ? 0 : this.value.hashCode());
        result = prime * result + ((this.targetValue == null) ? 0 : this.targetValue.hashCode());
        result = prime * result + ((this.attributeOptionId == null) ? 0 : this.attributeOptionId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FinancialAssessmentEntityValuesView (");

        sb.append(entityAttributesId);
        sb.append(", ").append(displayOrder);
        sb.append(", ").append(entityId);
        sb.append(", ").append(attributeId);
        sb.append(", ").append(name);
        sb.append(", ").append(inputTypeId);
        sb.append(", ").append(description);
        sb.append(", ").append(isUserInput);
        sb.append(", ").append(suffix);
        sb.append(", ").append(prefix);
        sb.append(", ").append(financialAssessmentId);
        sb.append(", ").append(value);
        sb.append(", ").append(targetValue);
        sb.append(", ").append(attributeOptionId);

        sb.append(")");
        return sb.toString();
    }
}
