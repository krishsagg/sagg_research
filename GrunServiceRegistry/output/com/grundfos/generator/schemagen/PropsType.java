//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.03 at 02:47:35 PM IST 
//


package com.grundfos.generator.schemagen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.springframework.org/schema/beans}collectionType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.springframework.org/schema/beans}prop"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propsType", propOrder = {
    "prop"
})
@XmlSeeAlso({
    Props.class
})
public class PropsType
    extends CollectionType
{

    protected List<Prop> prop;

    /**
     * Gets the value of the prop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Prop }
     * 
     * 
     */
    public List<Prop> getProp() {
        if (prop == null) {
            prop = new ArrayList<Prop>();
        }
        return this.prop;
    }

}
