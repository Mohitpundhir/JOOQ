/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables.records;


import com.tej.JooQDemo.jooq.sample.model.tables.FinancialAssessmentEntityValuesView;

import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FinancialAssessmentEntityValuesViewRecord extends TableRecordImpl<FinancialAssessmentEntityValuesViewRecord> implements Record14<Long, Long, Long, Long, String, Long, String, Boolean, String, String, Long, Double, Double, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.entity_attributes_id</code>.
     */
    public FinancialAssessmentEntityValuesViewRecord setEntityAttributesId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.entity_attributes_id</code>.
     */
    public Long getEntityAttributesId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.display_order</code>.
     */
    public FinancialAssessmentEntityValuesViewRecord setDisplayOrder(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.display_order</code>.
     */
    public Long getDisplayOrder() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.entity_id</code>.
     */
    public FinancialAssessmentEntityValuesViewRecord setEntityId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.entity_id</code>.
     */
    public Long getEntityId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.attribute_id</code>.
     */
    public FinancialAssessmentEntityValuesViewRecord setAttributeId(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.attribute_id</code>.
     */
    public Long getAttributeId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.name</code>.
     */
    public FinancialAssessmentEntityValuesViewRecord setName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.name</code>.
     */
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.input_type_id</code>.
     */
    public FinancialAssessmentEntityValuesViewRecord setInputTypeId(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.input_type_id</code>.
     */
    public Long getInputTypeId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.description</code>.
     */
    public FinancialAssessmentEntityValuesViewRecord setDescription(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.is_user_input</code>.
     */
    public FinancialAssessmentEntityValuesViewRecord setIsUserInput(Boolean value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.is_user_input</code>.
     */
    public Boolean getIsUserInput() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.suffix</code>.
     */
    public FinancialAssessmentEntityValuesViewRecord setSuffix(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.suffix</code>.
     */
    public String getSuffix() {
        return (String) get(8);
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.prefix</code>.
     */
    public FinancialAssessmentEntityValuesViewRecord setPrefix(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.prefix</code>.
     */
    public String getPrefix() {
        return (String) get(9);
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.financial_assessment_id</code>.
     */
    public FinancialAssessmentEntityValuesViewRecord setFinancialAssessmentId(Long value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.financial_assessment_id</code>.
     */
    public Long getFinancialAssessmentId() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.value</code>.
     */
    public FinancialAssessmentEntityValuesViewRecord setValue(Double value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.value</code>.
     */
    public Double getValue() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.target_value</code>.
     */
    public FinancialAssessmentEntityValuesViewRecord setTargetValue(Double value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.target_value</code>.
     */
    public Double getTargetValue() {
        return (Double) get(12);
    }

    /**
     * Setter for <code>finance_service.financial_assessment_entity_values_view.attribute_option_id</code>.
     */
    public FinancialAssessmentEntityValuesViewRecord setAttributeOptionId(Long value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_entity_values_view.attribute_option_id</code>.
     */
    public Long getAttributeOptionId() {
        return (Long) get(13);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<Long, Long, Long, Long, String, Long, String, Boolean, String, String, Long, Double, Double, Long> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<Long, Long, Long, Long, String, Long, String, Boolean, String, String, Long, Double, Double, Long> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FinancialAssessmentEntityValuesView.FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW.ENTITY_ATTRIBUTES_ID;
    }

    @Override
    public Field<Long> field2() {
        return FinancialAssessmentEntityValuesView.FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW.DISPLAY_ORDER;
    }

    @Override
    public Field<Long> field3() {
        return FinancialAssessmentEntityValuesView.FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW.ENTITY_ID;
    }

    @Override
    public Field<Long> field4() {
        return FinancialAssessmentEntityValuesView.FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW.ATTRIBUTE_ID;
    }

    @Override
    public Field<String> field5() {
        return FinancialAssessmentEntityValuesView.FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW.NAME;
    }

    @Override
    public Field<Long> field6() {
        return FinancialAssessmentEntityValuesView.FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW.INPUT_TYPE_ID;
    }

    @Override
    public Field<String> field7() {
        return FinancialAssessmentEntityValuesView.FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW.DESCRIPTION;
    }

    @Override
    public Field<Boolean> field8() {
        return FinancialAssessmentEntityValuesView.FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW.IS_USER_INPUT;
    }

    @Override
    public Field<String> field9() {
        return FinancialAssessmentEntityValuesView.FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW.SUFFIX;
    }

    @Override
    public Field<String> field10() {
        return FinancialAssessmentEntityValuesView.FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW.PREFIX;
    }

    @Override
    public Field<Long> field11() {
        return FinancialAssessmentEntityValuesView.FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW.FINANCIAL_ASSESSMENT_ID;
    }

    @Override
    public Field<Double> field12() {
        return FinancialAssessmentEntityValuesView.FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW.VALUE;
    }

    @Override
    public Field<Double> field13() {
        return FinancialAssessmentEntityValuesView.FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW.TARGET_VALUE;
    }

    @Override
    public Field<Long> field14() {
        return FinancialAssessmentEntityValuesView.FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW.ATTRIBUTE_OPTION_ID;
    }

    @Override
    public Long component1() {
        return getEntityAttributesId();
    }

    @Override
    public Long component2() {
        return getDisplayOrder();
    }

    @Override
    public Long component3() {
        return getEntityId();
    }

    @Override
    public Long component4() {
        return getAttributeId();
    }

    @Override
    public String component5() {
        return getName();
    }

    @Override
    public Long component6() {
        return getInputTypeId();
    }

    @Override
    public String component7() {
        return getDescription();
    }

    @Override
    public Boolean component8() {
        return getIsUserInput();
    }

    @Override
    public String component9() {
        return getSuffix();
    }

    @Override
    public String component10() {
        return getPrefix();
    }

    @Override
    public Long component11() {
        return getFinancialAssessmentId();
    }

    @Override
    public Double component12() {
        return getValue();
    }

    @Override
    public Double component13() {
        return getTargetValue();
    }

    @Override
    public Long component14() {
        return getAttributeOptionId();
    }

    @Override
    public Long value1() {
        return getEntityAttributesId();
    }

    @Override
    public Long value2() {
        return getDisplayOrder();
    }

    @Override
    public Long value3() {
        return getEntityId();
    }

    @Override
    public Long value4() {
        return getAttributeId();
    }

    @Override
    public String value5() {
        return getName();
    }

    @Override
    public Long value6() {
        return getInputTypeId();
    }

    @Override
    public String value7() {
        return getDescription();
    }

    @Override
    public Boolean value8() {
        return getIsUserInput();
    }

    @Override
    public String value9() {
        return getSuffix();
    }

    @Override
    public String value10() {
        return getPrefix();
    }

    @Override
    public Long value11() {
        return getFinancialAssessmentId();
    }

    @Override
    public Double value12() {
        return getValue();
    }

    @Override
    public Double value13() {
        return getTargetValue();
    }

    @Override
    public Long value14() {
        return getAttributeOptionId();
    }

    @Override
    public FinancialAssessmentEntityValuesViewRecord value1(Long value) {
        setEntityAttributesId(value);
        return this;
    }

    @Override
    public FinancialAssessmentEntityValuesViewRecord value2(Long value) {
        setDisplayOrder(value);
        return this;
    }

    @Override
    public FinancialAssessmentEntityValuesViewRecord value3(Long value) {
        setEntityId(value);
        return this;
    }

    @Override
    public FinancialAssessmentEntityValuesViewRecord value4(Long value) {
        setAttributeId(value);
        return this;
    }

    @Override
    public FinancialAssessmentEntityValuesViewRecord value5(String value) {
        setName(value);
        return this;
    }

    @Override
    public FinancialAssessmentEntityValuesViewRecord value6(Long value) {
        setInputTypeId(value);
        return this;
    }

    @Override
    public FinancialAssessmentEntityValuesViewRecord value7(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public FinancialAssessmentEntityValuesViewRecord value8(Boolean value) {
        setIsUserInput(value);
        return this;
    }

    @Override
    public FinancialAssessmentEntityValuesViewRecord value9(String value) {
        setSuffix(value);
        return this;
    }

    @Override
    public FinancialAssessmentEntityValuesViewRecord value10(String value) {
        setPrefix(value);
        return this;
    }

    @Override
    public FinancialAssessmentEntityValuesViewRecord value11(Long value) {
        setFinancialAssessmentId(value);
        return this;
    }

    @Override
    public FinancialAssessmentEntityValuesViewRecord value12(Double value) {
        setValue(value);
        return this;
    }

    @Override
    public FinancialAssessmentEntityValuesViewRecord value13(Double value) {
        setTargetValue(value);
        return this;
    }

    @Override
    public FinancialAssessmentEntityValuesViewRecord value14(Long value) {
        setAttributeOptionId(value);
        return this;
    }

    @Override
    public FinancialAssessmentEntityValuesViewRecord values(Long value1, Long value2, Long value3, Long value4, String value5, Long value6, String value7, Boolean value8, String value9, String value10, Long value11, Double value12, Double value13, Long value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FinancialAssessmentEntityValuesViewRecord
     */
    public FinancialAssessmentEntityValuesViewRecord() {
        super(FinancialAssessmentEntityValuesView.FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW);
    }

    /**
     * Create a detached, initialised FinancialAssessmentEntityValuesViewRecord
     */
    public FinancialAssessmentEntityValuesViewRecord(Long entityAttributesId, Long displayOrder, Long entityId, Long attributeId, String name, Long inputTypeId, String description, Boolean isUserInput, String suffix, String prefix, Long financialAssessmentId, Double value, Double targetValue, Long attributeOptionId) {
        super(FinancialAssessmentEntityValuesView.FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW);

        setEntityAttributesId(entityAttributesId);
        setDisplayOrder(displayOrder);
        setEntityId(entityId);
        setAttributeId(attributeId);
        setName(name);
        setInputTypeId(inputTypeId);
        setDescription(description);
        setIsUserInput(isUserInput);
        setSuffix(suffix);
        setPrefix(prefix);
        setFinancialAssessmentId(financialAssessmentId);
        setValue(value);
        setTargetValue(targetValue);
        setAttributeOptionId(attributeOptionId);
    }
}
