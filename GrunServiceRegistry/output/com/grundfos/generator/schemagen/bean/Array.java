//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.03 at 03:01:40 PM IST 
//


package com.grundfos.generator.schemagen.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.springframework.org/schema/beans}listOrSetType">
 *       &lt;attribute name="merge" type="{http://www.springframework.org/schema/beans}defaultable-boolean" default="default" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "array")
public class Array
    extends ListOrSetType
{

    @XmlAttribute(name = "merge")
    protected DefaultableBoolean merge;

    /**
     * Gets the value of the merge property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultableBoolean }
     *     
     */
    public DefaultableBoolean getMerge() {
        if (merge == null) {
            return DefaultableBoolean.DEFAULT;
        } else {
            return merge;
        }
    }

    /**
     * Sets the value of the merge property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultableBoolean }
     *     
     */
    public void setMerge(DefaultableBoolean value) {
        this.merge = value;
    }

}
