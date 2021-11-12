/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables.records;


import com.tej.JooQDemo.jooq.sample.model.tables.ModelGroup;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ModelGroupRecord extends UpdatableRecordImpl<ModelGroupRecord> implements Record7<Long, String, String, Long, Long, Long, BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>finance_service.model_group.id</code>.
     */
    public ModelGroupRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.model_group.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>finance_service.model_group.name</code>.
     */
    public ModelGroupRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.model_group.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>finance_service.model_group.description</code>.
     */
    public ModelGroupRecord setDescription(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.model_group.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>finance_service.model_group.template_definition_id</code>.
     */
    public ModelGroupRecord setTemplateDefinitionId(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.model_group.template_definition_id</code>.
     */
    public Long getTemplateDefinitionId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>finance_service.model_group.parent_id</code>.
     */
    public ModelGroupRecord setParentId(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.model_group.parent_id</code>.
     */
    public Long getParentId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>finance_service.model_group.display_order</code>.
     */
    public ModelGroupRecord setDisplayOrder(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.model_group.display_order</code>.
     */
    public Long getDisplayOrder() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>finance_service.model_group.default_escalation_rate</code>.
     */
    public ModelGroupRecord setDefaultEscalationRate(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>finance_service.model_group.default_escalation_rate</code>.
     */
    public BigDecimal getDefaultEscalationRate() {
        return (BigDecimal) get(6);
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
    public Row7<Long, String, String, Long, Long, Long, BigDecimal> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, String, String, Long, Long, Long, BigDecimal> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ModelGroup.MODEL_GROUP.ID;
    }

    @Override
    public Field<String> field2() {
        return ModelGroup.MODEL_GROUP.NAME;
    }

    @Override
    public Field<String> field3() {
        return ModelGroup.MODEL_GROUP.DESCRIPTION;
    }

    @Override
    public Field<Long> field4() {
        return ModelGroup.MODEL_GROUP.TEMPLATE_DEFINITION_ID;
    }

    @Override
    public Field<Long> field5() {
        return ModelGroup.MODEL_GROUP.PARENT_ID;
    }

    @Override
    public Field<Long> field6() {
        return ModelGroup.MODEL_GROUP.DISPLAY_ORDER;
    }

    @Override
    public Field<BigDecimal> field7() {
        return ModelGroup.MODEL_GROUP.DEFAULT_ESCALATION_RATE;
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
    public String component3() {
        return getDescription();
    }

    @Override
    public Long component4() {
        return getTemplateDefinitionId();
    }

    @Override
    public Long component5() {
        return getParentId();
    }

    @Override
    public Long component6() {
        return getDisplayOrder();
    }

    @Override
    public BigDecimal component7() {
        return getDefaultEscalationRate();
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
    public String value3() {
        return getDescription();
    }

    @Override
    public Long value4() {
        return getTemplateDefinitionId();
    }

    @Override
    public Long value5() {
        return getParentId();
    }

    @Override
    public Long value6() {
        return getDisplayOrder();
    }

    @Override
    public BigDecimal value7() {
        return getDefaultEscalationRate();
    }

    @Override
    public ModelGroupRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ModelGroupRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public ModelGroupRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public ModelGroupRecord value4(Long value) {
        setTemplateDefinitionId(value);
        return this;
    }

    @Override
    public ModelGroupRecord value5(Long value) {
        setParentId(value);
        return this;
    }

    @Override
    public ModelGroupRecord value6(Long value) {
        setDisplayOrder(value);
        return this;
    }

    @Override
    public ModelGroupRecord value7(BigDecimal value) {
        setDefaultEscalationRate(value);
        return this;
    }

    @Override
    public ModelGroupRecord values(Long value1, String value2, String value3, Long value4, Long value5, Long value6, BigDecimal value7) {
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
     * Create a detached ModelGroupRecord
     */
    public ModelGroupRecord() {
        super(ModelGroup.MODEL_GROUP);
    }

    /**
     * Create a detached, initialised ModelGroupRecord
     */
    public ModelGroupRecord(Long id, String name, String description, Long templateDefinitionId, Long parentId, Long displayOrder, BigDecimal defaultEscalationRate) {
        super(ModelGroup.MODEL_GROUP);

        setId(id);
        setName(name);
        setDescription(description);
        setTemplateDefinitionId(templateDefinitionId);
        setParentId(parentId);
        setDisplayOrder(displayOrder);
        setDefaultEscalationRate(defaultEscalationRate);
    }
}
