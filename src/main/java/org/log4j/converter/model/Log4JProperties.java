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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "log4JData"
})
@XmlRootElement(name = "log4j:properties")
public class Log4JProperties {

    @XmlElement(name = "log4j:data")
    protected List<Log4JData> log4JData;

    /**
     * Gets the value of the log4JData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the log4JData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLog4JData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Log4JData }
     * 
     * 
     */
    public List<Log4JData> getLog4JData() {
        if (log4JData == null) {
            log4JData = new ArrayList<Log4JData>();
        }
        return this.log4JData;
    }

}