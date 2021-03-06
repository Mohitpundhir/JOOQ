/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables;


import com.tej.JooQDemo.jooq.sample.model.FinanceService;
import com.tej.JooQDemo.jooq.sample.model.Keys;
import com.tej.JooQDemo.jooq.sample.model.tables.records.FinancialAssessmentEscalationRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FinancialAssessmentEscalation extends TableImpl<FinancialAssessmentEscalationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>finance_service.financial_assessment_escalation</code>
     */
    public static final FinancialAssessmentEscalation FINANCIAL_ASSESSMENT_ESCALATION = new FinancialAssessmentEscalation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FinancialAssessmentEscalationRecord> getRecordType() {
        return FinancialAssessmentEscalationRecord.class;
    }

    /**
     * The column <code>finance_service.financial_assessment_escalation.id</code>.
     */
    public final TableField<FinancialAssessmentEscalationRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>finance_service.financial_assessment_escalation.financial_assessment_id</code>.
     */
    public final TableField<FinancialAssessmentEscalationRecord, Long> FINANCIAL_ASSESSMENT_ID = createField(DSL.name("financial_assessment_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>finance_service.financial_assessment_escalation.model_group_id</code>.
     */
    public final TableField<FinancialAssessmentEscalationRecord, Long> MODEL_GROUP_ID = createField(DSL.name("model_group_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>finance_service.financial_assessment_escalation.year</code>.
     */
    public final TableField<FinancialAssessmentEscalationRecord, Integer> YEAR = createField(DSL.name("year"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>finance_service.financial_assessment_escalation.escalation_rate</code>.
     */
    public final TableField<FinancialAssessmentEscalationRecord, BigDecimal> ESCALATION_RATE = createField(DSL.name("escalation_rate"), SQLDataType.NUMERIC(7, 4), this, "");

    private FinancialAssessmentEscalation(Name alias, Table<FinancialAssessmentEscalationRecord> aliased) {
        this(alias, aliased, null);
    }

    private FinancialAssessmentEscalation(Name alias, Table<FinancialAssessmentEscalationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>finance_service.financial_assessment_escalation</code> table reference
     */
    public FinancialAssessmentEscalation(String alias) {
        this(DSL.name(alias), FINANCIAL_ASSESSMENT_ESCALATION);
    }

    /**
     * Create an aliased <code>finance_service.financial_assessment_escalation</code> table reference
     */
    public FinancialAssessmentEscalation(Name alias) {
        this(alias, FINANCIAL_ASSESSMENT_ESCALATION);
    }

    /**
     * Create a <code>finance_service.financial_assessment_escalation</code> table reference
     */
    public FinancialAssessmentEscalation() {
        this(DSL.name("financial_assessment_escalation"), null);
    }

    public <O extends Record> FinancialAssessmentEscalation(Table<O> child, ForeignKey<O, FinancialAssessmentEscalationRecord> key) {
        super(child, key, FINANCIAL_ASSESSMENT_ESCALATION);
    }

    @Override
    public Schema getSchema() {
        return FinanceService.FINANCE_SERVICE;
    }

    @Override
    public Identity<FinancialAssessmentEscalationRecord, Long> getIdentity() {
        return (Identity<FinancialAssessmentEscalationRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<FinancialAssessmentEscalationRecord> getPrimaryKey() {
        return Keys.FINANCIAL_ASSESSMENT_ESCALATION_PKEY;
    }

    @Override
    public List<UniqueKey<FinancialAssessmentEscalationRecord>> getKeys() {
        return Arrays.<UniqueKey<FinancialAssessmentEscalationRecord>>asList(Keys.FINANCIAL_ASSESSMENT_ESCALATION_PKEY);
    }

    @Override
    public List<ForeignKey<FinancialAssessmentEscalationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FinancialAssessmentEscalationRecord, ?>>asList(Keys.FINANCIAL_ASSESSMENT_ESCALATION__FK_FINANCIALASSESSMENTESCALATION_FINANCIALASSESSMENTID, Keys.FINANCIAL_ASSESSMENT_ESCALATION__FK_FINANCIALASSESSMENTESCALATION_MODELGROUPID);
    }

    private transient FinancialAssessment _financialAssessment;
    private transient ModelGroup _modelGroup;

    public FinancialAssessment financialAssessment() {
        if (_financialAssessment == null)
            _financialAssessment = new FinancialAssessment(this, Keys.FINANCIAL_ASSESSMENT_ESCALATION__FK_FINANCIALASSESSMENTESCALATION_FINANCIALASSESSMENTID);

        return _financialAssessment;
    }

    public ModelGroup modelGroup() {
        if (_modelGroup == null)
            _modelGroup = new ModelGroup(this, Keys.FINANCIAL_ASSESSMENT_ESCALATION__FK_FINANCIALASSESSMENTESCALATION_MODELGROUPID);

        return _modelGroup;
    }

    @Override
    public FinancialAssessmentEscalation as(String alias) {
        return new FinancialAssessmentEscalation(DSL.name(alias), this);
    }

    @Override
    public FinancialAssessmentEscalation as(Name alias) {
        return new FinancialAssessmentEscalation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FinancialAssessmentEscalation rename(String name) {
        return new FinancialAssessmentEscalation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FinancialAssessmentEscalation rename(Name name) {
        return new FinancialAssessmentEscalation(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, Long, Integer, BigDecimal> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
