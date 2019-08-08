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
 * Routes
 * 
 * <p>Clase Java para DELVRY03.E1EDL28 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL28">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ROUTE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VSART" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VSAVL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VSANL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ROUID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DISTZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MEDST" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E1EDL29" type="{}DELVRY03.E1EDL29" minOccurs="0"/>
 *         &lt;element name="E1EDL30" type="{}DELVRY03.E1EDL30" maxOccurs="99" minOccurs="0"/>
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
@XmlType(name = "DELVRY03.E1EDL28", propOrder = {
    "route",
    "vsart",
    "vsavl",
    "vsanl",
    "rouid",
    "distz",
    "medst",
    "e1EDL29",
    "e1EDL30"
})
public class DELVRY03E1EDL28 {

    @XmlElement(name = "ROUTE")
    protected String route;
    @XmlElement(name = "VSART")
    protected String vsart;
    @XmlElement(name = "VSAVL")
    protected String vsavl;
    @XmlElement(name = "VSANL")
    protected String vsanl;
    @XmlElement(name = "ROUID")
    protected String rouid;
    @XmlElement(name = "DISTZ")
    protected String distz;
    @XmlElement(name = "MEDST")
    protected String medst;
    @XmlElement(name = "E1EDL29")
    protected DELVRY03E1EDL29 e1EDL29;
    @XmlElement(name = "E1EDL30")
    protected List<DELVRY03E1EDL30> e1EDL30;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad route.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROUTE() {
        return route;
    }

    /**
     * Define el valor de la propiedad route.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROUTE(String value) {
        this.route = value;
    }

    /**
     * Obtiene el valor de la propiedad vsart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSART() {
        return vsart;
    }

    /**
     * Define el valor de la propiedad vsart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSART(String value) {
        this.vsart = value;
    }

    /**
     * Obtiene el valor de la propiedad vsavl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSAVL() {
        return vsavl;
    }

    /**
     * Define el valor de la propiedad vsavl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSAVL(String value) {
        this.vsavl = value;
    }

    /**
     * Obtiene el valor de la propiedad vsanl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSANL() {
        return vsanl;
    }

    /**
     * Define el valor de la propiedad vsanl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSANL(String value) {
        this.vsanl = value;
    }

    /**
     * Obtiene el valor de la propiedad rouid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROUID() {
        return rouid;
    }

    /**
     * Define el valor de la propiedad rouid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROUID(String value) {
        this.rouid = value;
    }

    /**
     * Obtiene el valor de la propiedad distz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISTZ() {
        return distz;
    }

    /**
     * Define el valor de la propiedad distz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISTZ(String value) {
        this.distz = value;
    }

    /**
     * Obtiene el valor de la propiedad medst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEDST() {
        return medst;
    }

    /**
     * Define el valor de la propiedad medst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEDST(String value) {
        this.medst = value;
    }

    /**
     * Obtiene el valor de la propiedad e1EDL29.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDL29 }
     *     
     */
    public DELVRY03E1EDL29 getE1EDL29() {
        return e1EDL29;
    }

    /**
     * Define el valor de la propiedad e1EDL29.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDL29 }
     *     
     */
    public void setE1EDL29(DELVRY03E1EDL29 value) {
        this.e1EDL29 = value;
    }

    /**
     * Gets the value of the e1EDL30 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL30 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL30().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL30 }
     * 
     * 
     */
    public List<DELVRY03E1EDL30> getE1EDL30() {
        if (e1EDL30 == null) {
            e1EDL30 = new ArrayList<DELVRY03E1EDL30>();
        }
        return this.e1EDL30;
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
