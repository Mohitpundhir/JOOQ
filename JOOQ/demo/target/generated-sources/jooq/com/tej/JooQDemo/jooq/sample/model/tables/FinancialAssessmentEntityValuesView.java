/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables;


import com.tej.JooQDemo.jooq.sample.model.FinanceService;
import com.tej.JooQDemo.jooq.sample.model.tables.records.FinancialAssessmentEntityValuesViewRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FinancialAssessmentEntityValuesView extends TableImpl<FinancialAssessmentEntityValuesViewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>finance_service.financial_assessment_entity_values_view</code>
     */
    public static final FinancialAssessmentEntityValuesView FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW = new FinancialAssessmentEntityValuesView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FinancialAssessmentEntityValuesViewRecord> getRecordType() {
        return FinancialAssessmentEntityValuesViewRecord.class;
    }

    /**
     * The column <code>finance_service.financial_assessment_entity_values_view.entity_attributes_id</code>.
     */
    public final TableField<FinancialAssessmentEntityValuesViewRecord, Long> ENTITY_ATTRIBUTES_ID = createField(DSL.name("entity_attributes_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>finance_service.financial_assessment_entity_values_view.display_order</code>.
     */
    public final TableField<FinancialAssessmentEntityValuesViewRecord, Long> DISPLAY_ORDER = createField(DSL.name("display_order"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>finance_service.financial_assessment_entity_values_view.entity_id</code>.
     */
    public final TableField<FinancialAssessmentEntityValuesViewRecord, Long> ENTITY_ID = createField(DSL.name("entity_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>finance_service.financial_assessment_entity_values_view.attribute_id</code>.
     */
    public final TableField<FinancialAssessmentEntityValuesViewRecord, Long> ATTRIBUTE_ID = createField(DSL.name("attribute_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>finance_service.financial_assessment_entity_values_view.name</code>.
     */
    public final TableField<FinancialAssessmentEntityValuesViewRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>finance_service.financial_assessment_entity_values_view.input_type_id</code>.
     */
    public final TableField<FinancialAssessmentEntityValuesViewRecord, Long> INPUT_TYPE_ID = createField(DSL.name("input_type_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>finance_service.financial_assessment_entity_values_view.description</code>.
     */
    public final TableField<FinancialAssessmentEntityValuesViewRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>finance_service.financial_assessment_entity_values_view.is_user_input</code>.
     */
    public final TableField<FinancialAssessmentEntityValuesViewRecord, Boolean> IS_USER_INPUT = createField(DSL.name("is_user_input"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>finance_service.financial_assessment_entity_values_view.suffix</code>.
     */
    public final TableField<FinancialAssessmentEntityValuesViewRecord, String> SUFFIX = createField(DSL.name("suffix"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>finance_service.financial_assessment_entity_values_view.prefix</code>.
     */
    public final TableField<FinancialAssessmentEntityValuesViewRecord, String> PREFIX = createField(DSL.name("prefix"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>finance_service.financial_assessment_entity_values_view.financial_assessment_id</code>.
     */
    public final TableField<FinancialAssessmentEntityValuesViewRecord, Long> FINANCIAL_ASSESSMENT_ID = createField(DSL.name("financial_assessment_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>finance_service.financial_assessment_entity_values_view.value</code>.
     */
    public final TableField<FinancialAssessmentEntityValuesViewRecord, Double> VALUE = createField(DSL.name("value"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>finance_service.financial_assessment_entity_values_view.target_value</code>.
     */
    public final TableField<FinancialAssessmentEntityValuesViewRecord, Double> TARGET_VALUE = createField(DSL.name("target_value"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>finance_service.financial_assessment_entity_values_view.attribute_option_id</code>.
     */
    public final TableField<FinancialAssessmentEntityValuesViewRecord, Long> ATTRIBUTE_OPTION_ID = createField(DSL.name("attribute_option_id"), SQLDataType.BIGINT, this, "");

    private FinancialAssessmentEntityValuesView(Name alias, Table<FinancialAssessmentEntityValuesViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private FinancialAssessmentEntityValuesView(Name alias, Table<FinancialAssessmentEntityValuesViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"financial_assessment_entity_values_view\" as  SELECT ea.id AS entity_attributes_id,\n    ea.display_order,\n    ea.entity_id,\n    attr.id AS attribute_id,\n    attr.name,\n    attr.input_type_id,\n    attr.description,\n    attr.is_user_input,\n    attr.suffix,\n    attr.prefix,\n    fav.financial_assessment_id,\n    fav.value,\n    fav.target_value,\n    fav.attribute_option_id\n   FROM ((finance_service.entity_attributes ea\n     LEFT JOIN finance_service.attribute attr ON ((ea.attribute_id = attr.id)))\n     LEFT JOIN finance_service.financial_assessment_attribute_values fav ON ((fav.entity_attribute_id = ea.id)));"));
    }

    /**
     * Create an aliased <code>finance_service.financial_assessment_entity_values_view</code> table reference
     */
    public FinancialAssessmentEntityValuesView(String alias) {
        this(DSL.name(alias), FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW);
    }

    /**
     * Create an aliased <code>finance_service.financial_assessment_entity_values_view</code> table reference
     */
    public FinancialAssessmentEntityValuesView(Name alias) {
        this(alias, FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW);
    }

    /**
     * Create a <code>finance_service.financial_assessment_entity_values_view</code> table reference
     */
    public FinancialAssessmentEntityValuesView() {
        this(DSL.name("financial_assessment_entity_values_view"), null);
    }

    public <O extends Record> FinancialAssessmentEntityValuesView(Table<O> child, ForeignKey<O, FinancialAssessmentEntityValuesViewRecord> key) {
        super(child, key, FINANCIAL_ASSESSMENT_ENTITY_VALUES_VIEW);
    }

    @Override
    public Schema getSchema() {
        return FinanceService.FINANCE_SERVICE;
    }

    @Override
    public FinancialAssessmentEntityValuesView as(String alias) {
        return new FinancialAssessmentEntityValuesView(DSL.name(alias), this);
    }

    @Override
    public FinancialAssessmentEntityValuesView as(Name alias) {
        return new FinancialAssessmentEntityValuesView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FinancialAssessmentEntityValuesView rename(String name) {
        return new FinancialAssessmentEntityValuesView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FinancialAssessmentEntityValuesView rename(Name name) {
        return new FinancialAssessmentEntityValuesView(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Long, Long, Long, Long, String, Long, String, Boolean, String, String, Long, Double, Double, Long> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
