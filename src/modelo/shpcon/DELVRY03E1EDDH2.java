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
 * IDOC: DG text header (delivery header)
 * 
 * <p>Clase Java para DELVRY03.E1EDDH2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDDH2">
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
 *         &lt;element name="PHRSEL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IDENTIFIER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="61"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LANGUA_PHR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E1EDDP2" type="{}DELVRY03.E1EDDP2" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DELVRY03.E1EDDH2", propOrder = {
    "function",
    "tdobject",
    "tdobname",
    "tdid",
    "tdtexttype",
    "languaiso",
    "phrsel",
    "identifier",
    "languaphr",
    "e1EDDP2"
})
public class DELVRY03E1EDDH2 {

    @XmlElement(name = "FUNCTION")
    protected String function;
    @XmlElement(name = "TDOBJECT")
    protected String tdobject;
    @XmlElement(name = "TDOBNAME")
    protected String tdobname;
    @XmlElement(name = "TDID")
    protected String tdid;
    @XmlElement(name = "TDTEXTTYPE")
    protected String tdtexttype;
    @XmlElement(name = "LANGUA_ISO")
    protected String languaiso;
    @XmlElement(name = "PHRSEL")
    protected String phrsel;
    @XmlElement(name = "IDENTIFIER")
    protected String identifier;
    @XmlElement(name = "LANGUA_PHR")
    protected String languaphr;
    @XmlElement(name = "E1EDDP2")
    protected List<DELVRY03E1EDDP2> e1EDDP2;
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
     * Obtiene el valor de la propiedad phrsel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHRSEL() {
        return phrsel;
    }

    /**
     * Define el valor de la propiedad phrsel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHRSEL(String value) {
        this.phrsel = value;
    }

    /**
     * Obtiene el valor de la propiedad identifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFIER() {
        return identifier;
    }

    /**
     * Define el valor de la propiedad identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFIER(String value) {
        this.identifier = value;
    }

    /**
     * Obtiene el valor de la propiedad languaphr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGUAPHR() {
        return languaphr;
    }

    /**
     * Define el valor de la propiedad languaphr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGUAPHR(String value) {
        this.languaphr = value;
    }

    /**
     * Gets the value of the e1EDDP2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDDP2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDDP2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDDP2 }
     * 
     * 
     */
    public List<DELVRY03E1EDDP2> getE1EDDP2() {
        if (e1EDDP2 == null) {
            e1EDDP2 = new ArrayList<DELVRY03E1EDDP2>();
        }
        return this.e1EDDP2;
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
