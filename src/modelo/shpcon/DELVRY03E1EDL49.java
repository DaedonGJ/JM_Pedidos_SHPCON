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
 * Express Delivery Company's Tracking Connection Data
 * 
 * <p>Clase Java para DELVRY03.E1EDL49 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL49">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XSITD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SHIPACCT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TRACKN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="XSIURL_SINGLE_TRACK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E1EDL50" type="{}DELVRY03.E1EDL50" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SEGMENT" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DELVRY03.E1EDL49", propOrder = {
    "xsitd",
    "shipacct",
    "trackn",
    "xsiurlsingletrack",
    "e1EDL50"
})
public class DELVRY03E1EDL49 {

    @XmlElement(name = "XSITD")
    protected String xsitd;
    @XmlElement(name = "SHIPACCT")
    protected String shipacct;
    @XmlElement(name = "TRACKN")
    protected String trackn;
    @XmlElement(name = "XSIURL_SINGLE_TRACK")
    protected String xsiurlsingletrack;
    @XmlElement(name = "E1EDL50")
    protected List<DELVRY03E1EDL50> e1EDL50;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad xsitd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXSITD() {
        return xsitd;
    }

    /**
     * Define el valor de la propiedad xsitd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXSITD(String value) {
        this.xsitd = value;
    }

    /**
     * Obtiene el valor de la propiedad shipacct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHIPACCT() {
        return shipacct;
    }

    /**
     * Define el valor de la propiedad shipacct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHIPACCT(String value) {
        this.shipacct = value;
    }

    /**
     * Obtiene el valor de la propiedad trackn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRACKN() {
        return trackn;
    }

    /**
     * Define el valor de la propiedad trackn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRACKN(String value) {
        this.trackn = value;
    }

    /**
     * Obtiene el valor de la propiedad xsiurlsingletrack.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXSIURLSINGLETRACK() {
        return xsiurlsingletrack;
    }

    /**
     * Define el valor de la propiedad xsiurlsingletrack.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXSIURLSINGLETRACK(String value) {
        this.xsiurlsingletrack = value;
    }

    /**
     * Gets the value of the e1EDL50 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL50 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL50().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL50 }
     * 
     * 
     */
    public List<DELVRY03E1EDL50> getE1EDL50() {
        if (e1EDL50 == null) {
            e1EDL50 = new ArrayList<DELVRY03E1EDL50>();
        }
        return this.e1EDL50;
    }

    /**
     * Obtiene el valor de la propiedad segment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENT() {
        if (segment == null) {
            return "1";
        } else {
            return segment;
        }
    }

    /**
     * Define el valor de la propiedad segment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENT(String value) {
        this.segment = value;
    }

}
