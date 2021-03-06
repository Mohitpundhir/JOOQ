/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model;


import org.jooq.Sequence;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * Convenience access to all sequences in finance_service.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>finance_service.entity_attributes_id_seq</code>
     */
    public static final Sequence<Long> ENTITY_ATTRIBUTES_ID_SEQ = Internal.createSequence("entity_attributes_id_seq", FinanceService.FINANCE_SERVICE, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>finance_service.entity_new_id_seq</code>
     */
    public static final Sequence<Long> ENTITY_NEW_ID_SEQ = Internal.createSequence("entity_new_id_seq", FinanceService.FINANCE_SERVICE, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>finance_service.financial_assessment_attribute_values_id_seq</code>
     */
    public static final Sequence<Long> FINANCIAL_ASSESSMENT_ATTRIBUTE_VALUES_ID_SEQ = Internal.createSequence("financial_assessment_attribute_values_id_seq", FinanceService.FINANCE_SERVICE, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>finance_service.financial_assessment_escalation_id_seq</code>
     */
    public static final Sequence<Long> FINANCIAL_ASSESSMENT_ESCALATION_ID_SEQ = Internal.createSequence("financial_assessment_escalation_id_seq", FinanceService.FINANCE_SERVICE, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>finance_service.financial_assessment_id_seq</code>
     */
    public static final Sequence<Long> FINANCIAL_ASSESSMENT_ID_SEQ = Internal.createSequence("financial_assessment_id_seq", FinanceService.FINANCE_SERVICE, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>finance_service.financial_assessment_metrics_id_seq</code>
     */
    public static final Sequence<Long> FINANCIAL_ASSESSMENT_METRICS_ID_SEQ = Internal.createSequence("financial_assessment_metrics_id_seq", FinanceService.FINANCE_SERVICE, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);
}
