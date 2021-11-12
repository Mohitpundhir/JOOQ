/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables;


import com.tej.JooQDemo.jooq.sample.model.FinanceService;
import com.tej.JooQDemo.jooq.sample.model.Keys;
import com.tej.JooQDemo.jooq.sample.model.tables.records.ModelTemplateDefinitionRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class ModelTemplateDefinition extends TableImpl<ModelTemplateDefinitionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>finance_service.model_template_definition</code>
     */
    public static final ModelTemplateDefinition MODEL_TEMPLATE_DEFINITION = new ModelTemplateDefinition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ModelTemplateDefinitionRecord> getRecordType() {
        return ModelTemplateDefinitionRecord.class;
    }

    /**
     * The column <code>finance_service.model_template_definition.id</code>.
     */
    public final TableField<ModelTemplateDefinitionRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>finance_service.model_template_definition.display_name</code>.
     */
    public final TableField<ModelTemplateDefinitionRecord, String> DISPLAY_NAME = createField(DSL.name("display_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>finance_service.model_template_definition.level</code>.
     */
    public final TableField<ModelTemplateDefinitionRecord, Long> LEVEL = createField(DSL.name("level"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>finance_service.model_template_definition.parent_id</code>.
     */
    public final TableField<ModelTemplateDefinitionRecord, Long> PARENT_ID = createField(DSL.name("parent_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>finance_service.model_template_definition.model_template_id</code>.
     */
    public final TableField<ModelTemplateDefinitionRecord, Long> MODEL_TEMPLATE_ID = createField(DSL.name("model_template_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>finance_service.model_template_definition.display_order</code>.
     */
    public final TableField<ModelTemplateDefinitionRecord, Long> DISPLAY_ORDER = createField(DSL.name("display_order"), SQLDataType.BIGINT, this, "");

    private ModelTemplateDefinition(Name alias, Table<ModelTemplateDefinitionRecord> aliased) {
        this(alias, aliased, null);
    }

    private ModelTemplateDefinition(Name alias, Table<ModelTemplateDefinitionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>finance_service.model_template_definition</code> table reference
     */
    public ModelTemplateDefinition(String alias) {
        this(DSL.name(alias), MODEL_TEMPLATE_DEFINITION);
    }

    /**
     * Create an aliased <code>finance_service.model_template_definition</code> table reference
     */
    public ModelTemplateDefinition(Name alias) {
        this(alias, MODEL_TEMPLATE_DEFINITION);
    }

    /**
     * Create a <code>finance_service.model_template_definition</code> table reference
     */
    public ModelTemplateDefinition() {
        this(DSL.name("model_template_definition"), null);
    }

    public <O extends Record> ModelTemplateDefinition(Table<O> child, ForeignKey<O, ModelTemplateDefinitionRecord> key) {
        super(child, key, MODEL_TEMPLATE_DEFINITION);
    }

    @Override
    public Schema getSchema() {
        return FinanceService.FINANCE_SERVICE;
    }

    @Override
    public UniqueKey<ModelTemplateDefinitionRecord> getPrimaryKey() {
        return Keys.MODEL_TEMPLATE_DEFINITION_PKEY;
    }

    @Override
    public List<UniqueKey<ModelTemplateDefinitionRecord>> getKeys() {
        return Arrays.<UniqueKey<ModelTemplateDefinitionRecord>>asList(Keys.MODEL_TEMPLATE_DEFINITION_PKEY);
    }

    @Override
    public List<ForeignKey<ModelTemplateDefinitionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ModelTemplateDefinitionRecord, ?>>asList(Keys.MODEL_TEMPLATE_DEFINITION__MODEL_TEMPLATE_DEFINITION_MODEL_TEMPLATE_ID_FKEY);
    }

    private transient ModelTemplate _modelTemplate;

    public ModelTemplate modelTemplate() {
        if (_modelTemplate == null)
            _modelTemplate = new ModelTemplate(this, Keys.MODEL_TEMPLATE_DEFINITION__MODEL_TEMPLATE_DEFINITION_MODEL_TEMPLATE_ID_FKEY);

        return _modelTemplate;
    }

    @Override
    public ModelTemplateDefinition as(String alias) {
        return new ModelTemplateDefinition(DSL.name(alias), this);
    }

    @Override
    public ModelTemplateDefinition as(Name alias) {
        return new ModelTemplateDefinition(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ModelTemplateDefinition rename(String name) {
        return new ModelTemplateDefinition(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ModelTemplateDefinition rename(Name name) {
        return new ModelTemplateDefinition(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, Long, Long, Long, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
