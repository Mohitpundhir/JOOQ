/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables;


import com.tej.JooQDemo.jooq.sample.model.FinanceService;
import com.tej.JooQDemo.jooq.sample.model.Keys;
import com.tej.JooQDemo.jooq.sample.model.tables.records.AttributeRecord;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class Attribute extends TableImpl<AttributeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>finance_service.attribute</code>
     */
    public static final Attribute ATTRIBUTE = new Attribute();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AttributeRecord> getRecordType() {
        return AttributeRecord.class;
    }

    /**
     * The column <code>finance_service.attribute.id</code>.
     */
    public final TableField<AttributeRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>finance_service.attribute.name</code>.
     */
    public final TableField<AttributeRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>finance_service.attribute.description</code>.
     */
    public final TableField<AttributeRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>finance_service.attribute.input_type_id</code>.
     */
    public final TableField<AttributeRecord, Long> INPUT_TYPE_ID = createField(DSL.name("input_type_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>finance_service.attribute.default_value</code>.
     */
    public final TableField<AttributeRecord, Double> DEFAULT_VALUE = createField(DSL.name("default_value"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>finance_service.attribute.is_user_input</code>.
     */
    public final TableField<AttributeRecord, Boolean> IS_USER_INPUT = createField(DSL.name("is_user_input"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>finance_service.attribute.suffix</code>.
     */
    public final TableField<AttributeRecord, String> SUFFIX = createField(DSL.name("suffix"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>finance_service.attribute.prefix</code>.
     */
    public final TableField<AttributeRecord, String> PREFIX = createField(DSL.name("prefix"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>finance_service.attribute.attribute_group</code>.
     */
    public final TableField<AttributeRecord, String> ATTRIBUTE_GROUP = createField(DSL.name("attribute_group"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>finance_service.attribute.default_option_id</code>.
     */
    public final TableField<AttributeRecord, Long> DEFAULT_OPTION_ID = createField(DSL.name("default_option_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>finance_service.attribute.default_date</code>.
     */
    public final TableField<AttributeRecord, LocalDate> DEFAULT_DATE = createField(DSL.name("default_date"), SQLDataType.LOCALDATE, this, "");

    private Attribute(Name alias, Table<AttributeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Attribute(Name alias, Table<AttributeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>finance_service.attribute</code> table reference
     */
    public Attribute(String alias) {
        this(DSL.name(alias), ATTRIBUTE);
    }

    /**
     * Create an aliased <code>finance_service.attribute</code> table reference
     */
    public Attribute(Name alias) {
        this(alias, ATTRIBUTE);
    }

    /**
     * Create a <code>finance_service.attribute</code> table reference
     */
    public Attribute() {
        this(DSL.name("attribute"), null);
    }

    public <O extends Record> Attribute(Table<O> child, ForeignKey<O, AttributeRecord> key) {
        super(child, key, ATTRIBUTE);
    }

    @Override
    public Schema getSchema() {
        return FinanceService.FINANCE_SERVICE;
    }

    @Override
    public UniqueKey<AttributeRecord> getPrimaryKey() {
        return Keys.ATTRIBUTES_PKEY;
    }

    @Override
    public List<UniqueKey<AttributeRecord>> getKeys() {
        return Arrays.<UniqueKey<AttributeRecord>>asList(Keys.ATTRIBUTES_PKEY);
    }

    @Override
    public List<ForeignKey<AttributeRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AttributeRecord, ?>>asList(Keys.ATTRIBUTE__ATTRIBUTE_INPUT_TYPE_ID_FKEY);
    }

    private transient AttributeInputType _attributeInputType;

    public AttributeInputType attributeInputType() {
        if (_attributeInputType == null)
            _attributeInputType = new AttributeInputType(this, Keys.ATTRIBUTE__ATTRIBUTE_INPUT_TYPE_ID_FKEY);

        return _attributeInputType;
    }

    @Override
    public Attribute as(String alias) {
        return new Attribute(DSL.name(alias), this);
    }

    @Override
    public Attribute as(Name alias) {
        return new Attribute(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Attribute rename(String name) {
        return new Attribute(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Attribute rename(Name name) {
        return new Attribute(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, String, Long, Double, Boolean, String, String, String, Long, LocalDate> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
