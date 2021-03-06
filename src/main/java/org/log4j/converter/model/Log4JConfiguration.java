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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "renderer",
    "appender",
    "plugin",
    "categoryOrLogger",
    "root",
    "categoryFactoryOrLoggerFactory"
})
@XmlRootElement(name = "log4j:configuration")
public class Log4JConfiguration {

    @XmlAttribute(name = "xmlns:log4j")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlnsLog4J;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String threshold;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String debug;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String reset;
    protected List<Renderer> renderer;
    protected List<Appender> appender;
    protected List<Plugin> plugin;
    @XmlElements({
        @XmlElement(name = "category", type = Category.class),
        @XmlElement(name = "logger", type = Logger.class)
    })
    protected List<Object> categoryOrLogger;
    protected Root root;
    @XmlElements({
        @XmlElement(name = "categoryFactory", type = CategoryFactory.class),
        @XmlElement(name = "loggerFactory", type = LoggerFactory.class)
    })
    protected List<Object> categoryFactoryOrLoggerFactory;

    /**
     * Gets the value of the xmlnsLog4J property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlnsLog4J() {
        if (xmlnsLog4J == null) {
            return "http://jakarta.apache.org/log4j/";
        } else {
            return xmlnsLog4J;
        }
    }

    /**
     * Sets the value of the xmlnsLog4J property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlnsLog4J(String value) {
        this.xmlnsLog4J = value;
    }

    /**
     * Gets the value of the threshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreshold() {
        if (threshold == null) {
            return "null";
        } else {
            return threshold;
        }
    }

    /**
     * Sets the value of the threshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreshold(String value) {
        this.threshold = value;
    }

    /**
     * Gets the value of the debug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebug() {
        if (debug == null) {
            return "null";
        } else {
            return debug;
        }
    }

    /**
     * Sets the value of the debug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebug(String value) {
        this.debug = value;
    }

    /**
     * Gets the value of the reset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReset() {
        if (reset == null) {
            return "false";
        } else {
            return reset;
        }
    }

    /**
     * Sets the value of the reset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReset(String value) {
        this.reset = value;
    }

    /**
     * Gets the value of the renderer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the renderer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRenderer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Renderer }
     * 
     * 
     */
    public List<Renderer> getRenderer() {
        if (renderer == null) {
            renderer = new ArrayList<Renderer>();
        }
        return this.renderer;
    }

    /**
     * Gets the value of the appender property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appender property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppender().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Appender }
     * 
     * 
     */
    public List<Appender> getAppender() {
        if (appender == null) {
            appender = new ArrayList<Appender>();
        }
        return this.appender;
    }

    /**
     * Gets the value of the plugin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plugin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlugin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Plugin }
     * 
     * 
     */
    public List<Plugin> getPlugin() {
        if (plugin == null) {
            plugin = new ArrayList<Plugin>();
        }
        return this.plugin;
    }

    /**
     * Gets the value of the categoryOrLogger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryOrLogger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryOrLogger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Category }
     * {@link Logger }
     * 
     * 
     */
    public List<Object> getCategoryOrLogger() {
        if (categoryOrLogger == null) {
            categoryOrLogger = new ArrayList<Object>();
        }
        return this.categoryOrLogger;
    }

    /**
     * Gets the value of the root property.
     * 
     * @return
     *     possible object is
     *     {@link Root }
     *     
     */
    public Root getRoot() {
        return root;
    }

    /**
     * Sets the value of the root property.
     * 
     * @param value
     *     allowed object is
     *     {@link Root }
     *     
     */
    public void setRoot(Root value) {
        this.root = value;
    }

    /**
     * Gets the value of the categoryFactoryOrLoggerFactory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryFactoryOrLoggerFactory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryFactoryOrLoggerFactory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryFactory }
     * {@link LoggerFactory }
     * 
     * 
     */
    public List<Object> getCategoryFactoryOrLoggerFactory() {
        if (categoryFactoryOrLoggerFactory == null) {
            categoryFactoryOrLoggerFactory = new ArrayList<Object>();
        }
        return this.categoryFactoryOrLoggerFactory;
    }

}
