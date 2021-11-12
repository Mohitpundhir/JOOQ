/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TemplateDefinition implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long   id;
    private String name;
    private String description;

    public TemplateDefinition() {}

    public TemplateDefinition(TemplateDefinition value) {
        this.id = value.id;
        this.name = value.name;
        this.description = value.description;
    }

    public TemplateDefinition(
        Long   id,
        String name,
        String description
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Getter for <code>finance_service.template_definition.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>finance_service.template_definition.id</code>.
     */
    public TemplateDefinition setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>finance_service.template_definition.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>finance_service.template_definition.name</code>.
     */
    public TemplateDefinition setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>finance_service.template_definition.description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>finance_service.template_definition.description</code>.
     */
    public TemplateDefinition setDescription(String description) {
        this.description = description;
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
        final TemplateDefinition other = (TemplateDefinition) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TemplateDefinition (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}
