/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables;


import com.tej.JooQDemo.jooq.sample.model.FinanceService;
import com.tej.JooQDemo.jooq.sample.model.Keys;
import com.tej.JooQDemo.jooq.sample.model.tables.records.TemplateDefinitionRecord;

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
public class TemplateDefinition extends TableImpl<TemplateDefinitionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>finance_service.template_definition</code>
     */
    public static final TemplateDefinition TEMPLATE_DEFINITION = new TemplateDefinition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TemplateDefinitionRecord> getRecordType() {
        return TemplateDefinitionRecord.class;
    }

    /**
     * The column <code>finance_service.template_definition.id</code>.
     */
    public final TableField<TemplateDefinitionRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>finance_service.template_definition.name</code>.
     */
    public final TableField<TemplateDefinitionRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>finance_service.template_definition.description</code>.
     */
    public final TableField<TemplateDefinitionRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR, this, "");

    private TemplateDefinition(Name alias, Table<TemplateDefinitionRecord> aliased) {
        this(alias, aliased, null);
    }

    private TemplateDefinition(Name alias, Table<TemplateDefinitionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>finance_service.template_definition</code> table reference
     */
    public TemplateDefinition(String alias) {
        this(DSL.name(alias), TEMPLATE_DEFINITION);
    }

    /**
     * Create an aliased <code>finance_service.template_definition</code> table reference
     */
    public TemplateDefinition(Name alias) {
        this(alias, TEMPLATE_DEFINITION);
    }

    /**
     * Create a <code>finance_service.template_definition</code> table reference
     */
    public TemplateDefinition() {
        this(DSL.name("template_definition"), null);
    }

    public <O extends Record> TemplateDefinition(Table<O> child, ForeignKey<O, TemplateDefinitionRecord> key) {
        super(child, key, TEMPLATE_DEFINITION);
    }

    @Override
    public Schema getSchema() {
        return FinanceService.FINANCE_SERVICE;
    }

    @Override
    public UniqueKey<TemplateDefinitionRecord> getPrimaryKey() {
        return Keys.TEMPLATE_DEFINITION_PKEY;
    }

    @Override
    public List<UniqueKey<TemplateDefinitionRecord>> getKeys() {
        return Arrays.<UniqueKey<TemplateDefinitionRecord>>asList(Keys.TEMPLATE_DEFINITION_PKEY);
    }

    @Override
    public TemplateDefinition as(String alias) {
        return new TemplateDefinition(DSL.name(alias), this);
    }

    @Override
    public TemplateDefinition as(Name alias) {
        return new TemplateDefinition(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TemplateDefinition rename(String name) {
        return new TemplateDefinition(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TemplateDefinition rename(Name name) {
        return new TemplateDefinition(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}