//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.16 at 06:08:29 ���� CST 
//


package org.log4j.converter.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "errorHandler",
    "param",
    "rollingPolicy",
    "triggeringPolicy",
    "connectionSource",
    "layout",
    "filter",
    "appenderRef"
})
@XmlRootElement(name = "appender")
public class Appender {

    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "class", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String clazz;
    protected ErrorHandler errorHandler;
    protected List<Param> param;
    protected RollingPolicy rollingPolicy;
    protected TriggeringPolicy triggeringPolicy;
    protected ConnectionSource connectionSource;
    protected Layout layout;
    protected List<Filter> filter;
    @XmlElement(name = "appender-ref")
    protected List<AppenderRef> appenderRef;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the errorHandler property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandler }
     *     
     */
    public ErrorHandler getErrorHandler() {
        return errorHandler;
    }

    /**
     * Sets the value of the errorHandler property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandler }
     *     
     */
    public void setErrorHandler(ErrorHandler value) {
        this.errorHandler = value;
    }

    /**
     * Gets the value of the param property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the param property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Param }
     * 
     * 
     */
    public List<Param> getParam() {
        if (param == null) {
            param = new ArrayList<Param>();
        }
        return this.param;
    }

    /**
     * Gets the value of the rollingPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link RollingPolicy }
     *     
     */
    public RollingPolicy getRollingPolicy() {
        return rollingPolicy;
    }

    /**
     * Sets the value of the rollingPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link RollingPolicy }
     *     
     */
    public void setRollingPolicy(RollingPolicy value) {
        this.rollingPolicy = value;
    }

    /**
     * Gets the value of the triggeringPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeringPolicy }
     *     
     */
    public TriggeringPolicy getTriggeringPolicy() {
        return triggeringPolicy;
    }

    /**
     * Sets the value of the triggeringPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeringPolicy }
     *     
     */
    public void setTriggeringPolicy(TriggeringPolicy value) {
        this.triggeringPolicy = value;
    }

    /**
     * Gets the value of the connectionSource property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionSource }
     *     
     */
    public ConnectionSource getConnectionSource() {
        return connectionSource;
    }

    /**
     * Sets the value of the connectionSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionSource }
     *     
     */
    public void setConnectionSource(ConnectionSource value) {
        this.connectionSource = value;
    }

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link Layout }
     *     
     */
    public Layout getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Layout }
     *     
     */
    public void setLayout(Layout value) {
        this.layout = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Filter }
     * 
     * 
     */
    public List<Filter> getFilter() {
        if (filter == null) {
            filter = new ArrayList<Filter>();
        }
        return this.filter;
    }

    /**
     * Gets the value of the appenderRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appenderRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppenderRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppenderRef }
     * 
     * 
     */
    public List<AppenderRef> getAppenderRef() {
        if (appenderRef == null) {
            appenderRef = new ArrayList<AppenderRef>();
        }
        return this.appenderRef;
    }

}
