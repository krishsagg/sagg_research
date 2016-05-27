
package com.example;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Sample {

    private String foo;
    private Integer bar;
    private Boolean baz;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The foo
     */
    public String getFoo() {
        return foo;
    }

    /**
     * 
     * @param foo
     *     The foo
     */
    public void setFoo(String foo) {
        this.foo = foo;
    }

    public Sample withFoo(String foo) {
        this.foo = foo;
        return this;
    }

    /**
     * 
     * @return
     *     The bar
     */
    public Integer getBar() {
        return bar;
    }

    /**
     * 
     * @param bar
     *     The bar
     */
    public void setBar(Integer bar) {
        this.bar = bar;
    }

    public Sample withBar(Integer bar) {
        this.bar = bar;
        return this;
    }

    /**
     * 
     * @return
     *     The baz
     */
    public Boolean getBaz() {
        return baz;
    }

    /**
     * 
     * @param baz
     *     The baz
     */
    public void setBaz(Boolean baz) {
        this.baz = baz;
    }

    public Sample withBaz(Boolean baz) {
        this.baz = baz;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Sample withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("foo".equals(name)) {
            if (value instanceof String) {
                setFoo(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"foo\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("bar".equals(name)) {
                if (value instanceof Integer) {
                    setBar(((Integer) value));
                } else {
                    throw new IllegalArgumentException(("property \"bar\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("baz".equals(name)) {
                    if (value instanceof Boolean) {
                        setBaz(((Boolean) value));
                    } else {
                        throw new IllegalArgumentException(("property \"baz\" is of type \"java.lang.Boolean\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("foo".equals(name)) {
            return getFoo();
        } else {
            if ("bar".equals(name)) {
                return getBar();
            } else {
                if ("baz".equals(name)) {
                    return getBaz();
                } else {
                    return notFoundValue;
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Sample.NOT_FOUND_VALUE);
        if (Sample.NOT_FOUND_VALUE!= value) {
            return ((T) value);
        } else {
            return ((T) getAdditionalProperties().get(name));
        }
    }

    public void set(String name, Object value) {
        if (!declaredProperty(name, value)) {
            getAdditionalProperties().put(name, ((Object) value));
        }
    }

    public Sample with(String name, Object value) {
        if (!declaredProperty(name, value)) {
            getAdditionalProperties().put(name, ((Object) value));
        }
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(foo).append(bar).append(baz).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sample) == false) {
            return false;
        }
        Sample rhs = ((Sample) other);
        return new EqualsBuilder().append(foo, rhs.foo).append(bar, rhs.bar).append(baz, rhs.baz).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
