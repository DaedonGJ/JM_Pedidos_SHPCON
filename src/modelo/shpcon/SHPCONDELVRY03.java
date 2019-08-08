//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.08.08 a las 01:36:33 PM CEST 
//


package modelo.shpcon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Delivery interface
 * 
 * <p>Clase Java para SHPCON.DELVRY03 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SHPCON.DELVRY03">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EDI_DC40" type="{}EDI_DC40.SHPCON.DELVRY03"/>
 *         &lt;element name="E1EDL20" type="{}DELVRY03.E1EDL20" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BEGIN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SHPCON.DELVRY03", propOrder = {
    "edidc40",
    "e1EDL20"
})
public class SHPCONDELVRY03 {

    @XmlElement(name = "EDI_DC40", required = true)
    protected EDIDC40SHPCONDELVRY03 edidc40;
    @XmlElement(name = "E1EDL20", required = true)
    protected List<DELVRY03E1EDL20> e1EDL20;
    @XmlAttribute(name = "BEGIN", required = true)
    protected String begin;

    /**
     * Obtiene el valor de la propiedad edidc40.
     * 
     * @return
     *     possible object is
     *     {@link EDIDC40SHPCONDELVRY03 }
     *     
     */
    public EDIDC40SHPCONDELVRY03 getEDIDC40() {
        return edidc40;
    }

    /**
     * Define el valor de la propiedad edidc40.
     * 
     * @param value
     *     allowed object is
     *     {@link EDIDC40SHPCONDELVRY03 }
     *     
     */
    public void setEDIDC40(EDIDC40SHPCONDELVRY03 value) {
        this.edidc40 = value;
    }

    /**
     * Gets the value of the e1EDL20 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL20 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL20().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL20 }
     * 
     * 
     */
    public List<DELVRY03E1EDL20> getE1EDL20() {
        if (e1EDL20 == null) {
            e1EDL20 = new ArrayList<DELVRY03E1EDL20>();
        }
        return this.e1EDL20;
    }

    /**
     * Obtiene el valor de la propiedad begin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEGIN() {
        if (begin == null) {
            return "1";
        } else {
            return begin;
        }
    }

    /**
     * Define el valor de la propiedad begin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEGIN(String value) {
        this.begin = value;
    }

}
