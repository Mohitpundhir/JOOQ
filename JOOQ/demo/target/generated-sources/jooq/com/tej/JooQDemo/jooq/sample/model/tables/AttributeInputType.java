/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables;


import com.tej.JooQDemo.jooq.sample.model.FinanceService;
import com.tej.JooQDemo.jooq.sample.model.Keys;
import com.tej.JooQDemo.jooq.sample.model.tables.records.AttributeInputTypeRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class AttributeInputType extends TableImpl<AttributeInputTypeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>finance_service.attribute_input_type</code>
     */
    public static final AttributeInputType ATTRIBUTE_INPUT_TYPE = new AttributeInputType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AttributeInputTypeRecord> getRecordType() {
        return AttributeInputTypeRecord.class;
    }

    /**
     * The column <code>finance_service.attribute_input_type.id</code>.
     */
    public final TableField<AttributeInputTypeRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>finance_service.attribute_input_type.input_type</code>.
     */
    public final TableField<AttributeInputTypeRecord, String> INPUT_TYPE = createField(DSL.name("input_type"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>finance_service.attribute_input_type.description</code>.
     */
    public final TableField<AttributeInputTypeRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR, this, "");

    private AttributeInputType(Name alias, Table<AttributeInputTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private AttributeInputType(Name alias, Table<AttributeInputTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>finance_service.attribute_input_type</code> table reference
     */
    public AttributeInputType(String alias) {
        this(DSL.name(alias), ATTRIBUTE_INPUT_TYPE);
    }

    /**
     * Create an aliased <code>finance_service.attribute_input_type</code> table reference
     */
    public AttributeInputType(Name alias) {
        this(alias, ATTRIBUTE_INPUT_TYPE);
    }

    /**
     * Create a <code>finance_service.attribute_input_type</code> table reference
     */
    public AttributeInputType() {
        this(DSL.name("attribute_input_type"), null);
    }

    public <O extends Record> AttributeInputType(Table<O> child, ForeignKey<O, AttributeInputTypeRecord> key) {
        super(child, key, ATTRIBUTE_INPUT_TYPE);
    }

    @Override
    public Schema getSchema() {
        return FinanceService.FINANCE_SERVICE;
    }

    @Override
    public UniqueKey<AttributeInputTypeRecord> getPrimaryKey() {
        return Keys.ATTRIBUTE_INPUT_TYPES_PKEY;
    }

    @Override
    public List<UniqueKey<AttributeInputTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<AttributeInputTypeRecord>>asList(Keys.ATTRIBUTE_INPUT_TYPES_PKEY);
    }

    @Override
    public AttributeInputType as(String alias) {
        return new AttributeInputType(DSL.name(alias), this);
    }

    @Override
    public AttributeInputType as(Name alias) {
        return new AttributeInputType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AttributeInputType rename(String name) {
        return new AttributeInputType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AttributeInputType rename(Name name) {
        return new AttributeInputType(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}