/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables.records;


import com.tej.JooQDemo.jooq.sample.model.tables.ModelTemplate;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ModelTemplateRecord extends UpdatableRecordImpl<ModelTemplateRecord> implements Record7<Long, String, Long, Boolean, Long, Boolean, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>finance_service.model_template.id</code>.
     */
    public ModelTemplateRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.model_template.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>finance_service.model_template.name</code>.
     */
    public ModelTemplateRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.model_template.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>finance_service.model_template.model_group_id</code>.
     */
    public ModelTemplateRecord setModelGroupId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.model_template.model_group_id</code>.
     */
    public Long getModelGroupId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>finance_service.model_template.has_positive_cashflows</code>.
     */
    public ModelTemplateRecord setHasPositiveCashflows(Boolean value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.model_template.has_positive_cashflows</code>.
     */
    public Boolean getHasPositiveCashflows() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>finance_service.model_template.display_order</code>.
     */
    public ModelTemplateRecord setDisplayOrder(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.model_template.display_order</code>.
     */
    public Long getDisplayOrder() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>finance_service.model_template.has_entities</code>.
     */
    public ModelTemplateRecord setHasEntities(Boolean value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.model_template.has_entities</code>.
     */
    public Boolean getHasEntities() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>finance_service.model_template.description</code>.
     */
    public ModelTemplateRecord setDescription(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.model_template.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, Long, Boolean, Long, Boolean, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, String, Long, Boolean, Long, Boolean, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ModelTemplate.MODEL_TEMPLATE.ID;
    }

    @Override
    public Field<String> field2() {
        return ModelTemplate.MODEL_TEMPLATE.NAME;
    }

    @Override
    public Field<Long> field3() {
        return ModelTemplate.MODEL_TEMPLATE.MODEL_GROUP_ID;
    }

    @Override
    public Field<Boolean> field4() {
        return ModelTemplate.MODEL_TEMPLATE.HAS_POSITIVE_CASHFLOWS;
    }

    @Override
    public Field<Long> field5() {
        return ModelTemplate.MODEL_TEMPLATE.DISPLAY_ORDER;
    }

    @Override
    public Field<Boolean> field6() {
        return ModelTemplate.MODEL_TEMPLATE.HAS_ENTITIES;
    }

    @Override
    public Field<String> field7() {
        return ModelTemplate.MODEL_TEMPLATE.DESCRIPTION;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Long component3() {
        return getModelGroupId();
    }

    @Override
    public Boolean component4() {
        return getHasPositiveCashflows();
    }

    @Override
    public Long component5() {
        return getDisplayOrder();
    }

    @Override
    public Boolean component6() {
        return getHasEntities();
    }

    @Override
    public String component7() {
        return getDescription();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Long value3() {
        return getModelGroupId();
    }

    @Override
    public Boolean value4() {
        return getHasPositiveCashflows();
    }

    @Override
    public Long value5() {
        return getDisplayOrder();
    }

    @Override
    public Boolean value6() {
        return getHasEntities();
    }

    @Override
    public String value7() {
        return getDescription();
    }

    @Override
    public ModelTemplateRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ModelTemplateRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public ModelTemplateRecord value3(Long value) {
        setModelGroupId(value);
        return this;
    }

    @Override
    public ModelTemplateRecord value4(Boolean value) {
        setHasPositiveCashflows(value);
        return this;
    }

    @Override
    public ModelTemplateRecord value5(Long value) {
        setDisplayOrder(value);
        return this;
    }

    @Override
    public ModelTemplateRecord value6(Boolean value) {
        setHasEntities(value);
        return this;
    }

    @Override
    public ModelTemplateRecord value7(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public ModelTemplateRecord values(Long value1, String value2, Long value3, Boolean value4, Long value5, Boolean value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ModelTemplateRecord
     */
    public ModelTemplateRecord() {
        super(ModelTemplate.MODEL_TEMPLATE);
    }

    /**
     * Create a detached, initialised ModelTemplateRecord
     */
    public ModelTemplateRecord(Long id, String name, Long modelGroupId, Boolean hasPositiveCashflows, Long displayOrder, Boolean hasEntities, String description) {
        super(ModelTemplate.MODEL_TEMPLATE);

        setId(id);
        setName(name);
        setModelGroupId(modelGroupId);
        setHasPositiveCashflows(hasPositiveCashflows);
        setDisplayOrder(displayOrder);
        setHasEntities(hasEntities);
        setDescription(description);
    }
}
