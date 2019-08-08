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
 * General Text Header
 * 
 * <p>Clase Java para DELVRY03.E1TXTH9 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1TXTH9">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FUNCTION" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TDOBJECT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TDOBNAME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TDID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TDSPRAS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TDTEXTTYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LANGUA_ISO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E1TXTP9" type="{}DELVRY03.E1TXTP9" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DELVRY03.E1TXTH9", propOrder = {
    "function",
    "tdobject",
    "tdobname",
    "tdid",
    "tdspras",
    "tdtexttype",
    "languaiso",
    "e1TXTP9"
})
public class DELVRY03E1TXTH9 {

    @XmlElement(name = "FUNCTION")
    protected String function;
    @XmlElement(name = "TDOBJECT")
    protected String tdobject;
    @XmlElement(name = "TDOBNAME")
    protected String tdobname;
    @XmlElement(name = "TDID")
    protected String tdid;
    @XmlElement(name = "TDSPRAS")
    protected String tdspras;
    @XmlElement(name = "TDTEXTTYPE")
    protected String tdtexttype;
    @XmlElement(name = "LANGUA_ISO")
    protected String languaiso;
    @XmlElement(name = "E1TXTP9")
    protected List<DELVRY03E1TXTP9> e1TXTP9;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad function.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNCTION() {
        return function;
    }

    /**
     * Define el valor de la propiedad function.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNCTION(String value) {
        this.function = value;
    }

    /**
     * Obtiene el valor de la propiedad tdobject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDOBJECT() {
        return tdobject;
    }

    /**
     * Define el valor de la propiedad tdobject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDOBJECT(String value) {
        this.tdobject = value;
    }

    /**
     * Obtiene el valor de la propiedad tdobname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDOBNAME() {
        return tdobname;
    }

    /**
     * Define el valor de la propiedad tdobname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDOBNAME(String value) {
        this.tdobname = value;
    }

    /**
     * Obtiene el valor de la propiedad tdid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDID() {
        return tdid;
    }

    /**
     * Define el valor de la propiedad tdid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDID(String value) {
        this.tdid = value;
    }

    /**
     * Obtiene el valor de la propiedad tdspras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDSPRAS() {
        return tdspras;
    }

    /**
     * Define el valor de la propiedad tdspras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDSPRAS(String value) {
        this.tdspras = value;
    }

    /**
     * Obtiene el valor de la propiedad tdtexttype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDTEXTTYPE() {
        return tdtexttype;
    }

    /**
     * Define el valor de la propiedad tdtexttype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDTEXTTYPE(String value) {
        this.tdtexttype = value;
    }

    /**
     * Obtiene el valor de la propiedad languaiso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGUAISO() {
        return languaiso;
    }

    /**
     * Define el valor de la propiedad languaiso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGUAISO(String value) {
        this.languaiso = value;
    }

    /**
     * Gets the value of the e1TXTP9 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1TXTP9 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1TXTP9().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1TXTP9 }
     * 
     * 
     */
    public List<DELVRY03E1TXTP9> getE1TXTP9() {
        if (e1TXTP9 == null) {
            e1TXTP9 = new ArrayList<DELVRY03E1TXTP9>();
        }
        return this.e1TXTP9;
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
