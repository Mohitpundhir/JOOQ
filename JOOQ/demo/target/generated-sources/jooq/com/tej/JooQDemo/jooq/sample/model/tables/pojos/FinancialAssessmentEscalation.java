/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FinancialAssessmentEscalation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long       id;
    private Long       financialAssessmentId;
    private Long       modelGroupId;
    private Integer    year;
    private BigDecimal escalationRate;

    public FinancialAssessmentEscalation() {}

    public FinancialAssessmentEscalation(FinancialAssessmentEscalation value) {
        this.id = value.id;
        this.financialAssessmentId = value.financialAssessmentId;
        this.modelGroupId = value.modelGroupId;
        this.year = value.year;
        this.escalationRate = value.escalationRate;
    }

    public FinancialAssessmentEscalation(
        Long       id,
        Long       financialAssessmentId,
        Long       modelGroupId,
        Integer    year,
        BigDecimal escalationRate
    ) {
        this.id = id;
        this.financialAssessmentId = financialAssessmentId;
        this.modelGroupId = modelGroupId;
        this.year = year;
        this.escalationRate = escalationRate;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_escalation.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>finance_service.financial_assessment_escalation.id</code>.
     */
    public FinancialAssessmentEscalation setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_escalation.financial_assessment_id</code>.
     */
    public Long getFinancialAssessmentId() {
        return this.financialAssessmentId;
    }

    /**
     * Setter for <code>finance_service.financial_assessment_escalation.financial_assessment_id</code>.
     */
    public FinancialAssessmentEscalation setFinancialAssessmentId(Long financialAssessmentId) {
        this.financialAssessmentId = financialAssessmentId;
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_escalation.model_group_id</code>.
     */
    public Long getModelGroupId() {
        return this.modelGroupId;
    }

    /**
     * Setter for <code>finance_service.financial_assessment_escalation.model_group_id</code>.
     */
    public FinancialAssessmentEscalation setModelGroupId(Long modelGroupId) {
        this.modelGroupId = modelGroupId;
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_escalation.year</code>.
     */
    public Integer getYear() {
        return this.year;
    }

    /**
     * Setter for <code>finance_service.financial_assessment_escalation.year</code>.
     */
    public FinancialAssessmentEscalation setYear(Integer year) {
        this.year = year;
        return this;
    }

    /**
     * Getter for <code>finance_service.financial_assessment_escalation.escalation_rate</code>.
     */
    public BigDecimal getEscalationRate() {
        return this.escalationRate;
    }

    /**
     * Setter for <code>finance_service.financial_assessment_escalation.escalation_rate</code>.
     */
    public FinancialAssessmentEscalation setEscalationRate(BigDecimal escalationRate) {
        this.escalationRate = escalationRate;
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
        final FinancialAssessmentEscalation other = (FinancialAssessmentEscalation) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (financialAssessmentId == null) {
            if (other.financialAssessmentId != null)
                return false;
        }
        else if (!financialAssessmentId.equals(other.financialAssessmentId))
            return false;
        if (modelGroupId == null) {
            if (other.modelGroupId != null)
                return false;
        }
        else if (!modelGroupId.equals(other.modelGroupId))
            return false;
        if (year == null) {
            if (other.year != null)
                return false;
        }
        else if (!year.equals(other.year))
            return false;
        if (escalationRate == null) {
            if (other.escalationRate != null)
                return false;
        }
        else if (!escalationRate.equals(other.escalationRate))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.financialAssessmentId == null) ? 0 : this.financialAssessmentId.hashCode());
        result = prime * result + ((this.modelGroupId == null) ? 0 : this.modelGroupId.hashCode());
        result = prime * result + ((this.year == null) ? 0 : this.year.hashCode());
        result = prime * result + ((this.escalationRate == null) ? 0 : this.escalationRate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FinancialAssessmentEscalation (");

        sb.append(id);
        sb.append(", ").append(financialAssessmentId);
        sb.append(", ").append(modelGroupId);
        sb.append(", ").append(year);
        sb.append(", ").append(escalationRate);

        sb.append(")");
        return sb.toString();
    }
}
