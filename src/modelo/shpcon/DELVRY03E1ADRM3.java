//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.08.08 a las 01:36:33 PM CEST 
//


package modelo.shpcon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Central Address Segment Group, Main Segment
 * 
 * <p>Clase Java para DELVRY03.E1ADRM3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1ADRM3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PARTNER_Q" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ADDRES_T" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PARTNER_ID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="JURISDIC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LANGUAGE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FORMOFADDR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NAME1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NAME2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NAME3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NAME4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NAME_TEXT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NAME_CO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LOCATION" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BUILDING" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FLOOR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ROOM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STREET1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STREET2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STREET3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HOUSE_SUPL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HOUSE_RANG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POSTL_COD1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POSTL_COD3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POSTL_AREA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CITY1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CITY2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POSTL_PBOX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POSTL_COD2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POSTL_CITY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TELEPHONE1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TELEPHONE2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TELEFAX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TELEX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E_MAIL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COUNTRY1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COUNTRY2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REGION" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COUNTY_COD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COUNTY_TXT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TZCODE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TZDESC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
@XmlType(name = "DELVRY03.E1ADRM3", propOrder = {
    "partnerq",
    "addrest",
    "partnerid",
    "jurisdic",
    "language",
    "formofaddr",
    "name1",
    "name2",
    "name3",
    "name4",
    "nametext",
    "nameco",
    "location",
    "building",
    "floor",
    "room",
    "street1",
    "street2",
    "street3",
    "housesupl",
    "houserang",
    "postlcod1",
    "postlcod3",
    "postlarea",
    "city1",
    "city2",
    "postlpbox",
    "postlcod2",
    "postlcity",
    "telephone1",
    "telephone2",
    "telefax",
    "telex",
    "email",
    "country1",
    "country2",
    "region",
    "countycod",
    "countytxt",
    "tzcode",
    "tzdesc"
})
public class DELVRY03E1ADRM3 {

    @XmlElement(name = "PARTNER_Q")
    protected String partnerq;
    @XmlElement(name = "ADDRES_T")
    protected String addrest;
    @XmlElement(name = "PARTNER_ID")
    protected String partnerid;
    @XmlElement(name = "JURISDIC")
    protected String jurisdic;
    @XmlElement(name = "LANGUAGE")
    protected String language;
    @XmlElement(name = "FORMOFADDR")
    protected String formofaddr;
    @XmlElement(name = "NAME1")
    protected String name1;
    @XmlElement(name = "NAME2")
    protected String name2;
    @XmlElement(name = "NAME3")
    protected String name3;
    @XmlElement(name = "NAME4")
    protected String name4;
    @XmlElement(name = "NAME_TEXT")
    protected String nametext;
    @XmlElement(name = "NAME_CO")
    protected String nameco;
    @XmlElement(name = "LOCATION")
    protected String location;
    @XmlElement(name = "BUILDING")
    protected String building;
    @XmlElement(name = "FLOOR")
    protected String floor;
    @XmlElement(name = "ROOM")
    protected String room;
    @XmlElement(name = "STREET1")
    protected String street1;
    @XmlElement(name = "STREET2")
    protected String street2;
    @XmlElement(name = "STREET3")
    protected String street3;
    @XmlElement(name = "HOUSE_SUPL")
    protected String housesupl;
    @XmlElement(name = "HOUSE_RANG")
    protected String houserang;
    @XmlElement(name = "POSTL_COD1")
    protected String postlcod1;
    @XmlElement(name = "POSTL_COD3")
    protected String postlcod3;
    @XmlElement(name = "POSTL_AREA")
    protected String postlarea;
    @XmlElement(name = "CITY1")
    protected String city1;
    @XmlElement(name = "CITY2")
    protected String city2;
    @XmlElement(name = "POSTL_PBOX")
    protected String postlpbox;
    @XmlElement(name = "POSTL_COD2")
    protected String postlcod2;
    @XmlElement(name = "POSTL_CITY")
    protected String postlcity;
    @XmlElement(name = "TELEPHONE1")
    protected String telephone1;
    @XmlElement(name = "TELEPHONE2")
    protected String telephone2;
    @XmlElement(name = "TELEFAX")
    protected String telefax;
    @XmlElement(name = "TELEX")
    protected String telex;
    @XmlElement(name = "E_MAIL")
    protected String email;
    @XmlElement(name = "COUNTRY1")
    protected String country1;
    @XmlElement(name = "COUNTRY2")
    protected String country2;
    @XmlElement(name = "REGION")
    protected String region;
    @XmlElement(name = "COUNTY_COD")
    protected String countycod;
    @XmlElement(name = "COUNTY_TXT")
    protected String countytxt;
    @XmlElement(name = "TZCODE")
    protected String tzcode;
    @XmlElement(name = "TZDESC")
    protected String tzdesc;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad partnerq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTNERQ() {
        return partnerq;
    }

    /**
     * Define el valor de la propiedad partnerq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTNERQ(String value) {
        this.partnerq = value;
    }

    /**
     * Obtiene el valor de la propiedad addrest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDREST() {
        return addrest;
    }

    /**
     * Define el valor de la propiedad addrest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDREST(String value) {
        this.addrest = value;
    }

    /**
     * Obtiene el valor de la propiedad partnerid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTNERID() {
        return partnerid;
    }

    /**
     * Define el valor de la propiedad partnerid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTNERID(String value) {
        this.partnerid = value;
    }

    /**
     * Obtiene el valor de la propiedad jurisdic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJURISDIC() {
        return jurisdic;
    }

    /**
     * Define el valor de la propiedad jurisdic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJURISDIC(String value) {
        this.jurisdic = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGUAGE() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGUAGE(String value) {
        this.language = value;
    }

    /**
     * Obtiene el valor de la propiedad formofaddr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMOFADDR() {
        return formofaddr;
    }

    /**
     * Define el valor de la propiedad formofaddr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMOFADDR(String value) {
        this.formofaddr = value;
    }

    /**
     * Obtiene el valor de la propiedad name1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME1() {
        return name1;
    }

    /**
     * Define el valor de la propiedad name1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME1(String value) {
        this.name1 = value;
    }

    /**
     * Obtiene el valor de la propiedad name2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME2() {
        return name2;
    }

    /**
     * Define el valor de la propiedad name2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME2(String value) {
        this.name2 = value;
    }

    /**
     * Obtiene el valor de la propiedad name3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME3() {
        return name3;
    }

    /**
     * Define el valor de la propiedad name3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME3(String value) {
        this.name3 = value;
    }

    /**
     * Obtiene el valor de la propiedad name4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME4() {
        return name4;
    }

    /**
     * Define el valor de la propiedad name4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME4(String value) {
        this.name4 = value;
    }

    /**
     * Obtiene el valor de la propiedad nametext.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAMETEXT() {
        return nametext;
    }

    /**
     * Define el valor de la propiedad nametext.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAMETEXT(String value) {
        this.nametext = value;
    }

    /**
     * Obtiene el valor de la propiedad nameco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAMECO() {
        return nameco;
    }

    /**
     * Define el valor de la propiedad nameco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAMECO(String value) {
        this.nameco = value;
    }

    /**
     * Obtiene el valor de la propiedad location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATION() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATION(String value) {
        this.location = value;
    }

    /**
     * Obtiene el valor de la propiedad building.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUILDING() {
        return building;
    }

    /**
     * Define el valor de la propiedad building.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUILDING(String value) {
        this.building = value;
    }

    /**
     * Obtiene el valor de la propiedad floor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLOOR() {
        return floor;
    }

    /**
     * Define el valor de la propiedad floor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLOOR(String value) {
        this.floor = value;
    }

    /**
     * Obtiene el valor de la propiedad room.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROOM() {
        return room;
    }

    /**
     * Define el valor de la propiedad room.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROOM(String value) {
        this.room = value;
    }

    /**
     * Obtiene el valor de la propiedad street1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTREET1() {
        return street1;
    }

    /**
     * Define el valor de la propiedad street1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTREET1(String value) {
        this.street1 = value;
    }

    /**
     * Obtiene el valor de la propiedad street2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTREET2() {
        return street2;
    }

    /**
     * Define el valor de la propiedad street2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTREET2(String value) {
        this.street2 = value;
    }

    /**
     * Obtiene el valor de la propiedad street3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTREET3() {
        return street3;
    }

    /**
     * Define el valor de la propiedad street3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTREET3(String value) {
        this.street3 = value;
    }

    /**
     * Obtiene el valor de la propiedad housesupl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOUSESUPL() {
        return housesupl;
    }

    /**
     * Define el valor de la propiedad housesupl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOUSESUPL(String value) {
        this.housesupl = value;
    }

    /**
     * Obtiene el valor de la propiedad houserang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOUSERANG() {
        return houserang;
    }

    /**
     * Define el valor de la propiedad houserang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOUSERANG(String value) {
        this.houserang = value;
    }

    /**
     * Obtiene el valor de la propiedad postlcod1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTLCOD1() {
        return postlcod1;
    }

    /**
     * Define el valor de la propiedad postlcod1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTLCOD1(String value) {
        this.postlcod1 = value;
    }

    /**
     * Obtiene el valor de la propiedad postlcod3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTLCOD3() {
        return postlcod3;
    }

    /**
     * Define el valor de la propiedad postlcod3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTLCOD3(String value) {
        this.postlcod3 = value;
    }

    /**
     * Obtiene el valor de la propiedad postlarea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTLAREA() {
        return postlarea;
    }

    /**
     * Define el valor de la propiedad postlarea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTLAREA(String value) {
        this.postlarea = value;
    }

    /**
     * Obtiene el valor de la propiedad city1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITY1() {
        return city1;
    }

    /**
     * Define el valor de la propiedad city1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITY1(String value) {
        this.city1 = value;
    }

    /**
     * Obtiene el valor de la propiedad city2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITY2() {
        return city2;
    }

    /**
     * Define el valor de la propiedad city2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITY2(String value) {
        this.city2 = value;
    }

    /**
     * Obtiene el valor de la propiedad postlpbox.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTLPBOX() {
        return postlpbox;
    }

    /**
     * Define el valor de la propiedad postlpbox.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTLPBOX(String value) {
        this.postlpbox = value;
    }

    /**
     * Obtiene el valor de la propiedad postlcod2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTLCOD2() {
        return postlcod2;
    }

    /**
     * Define el valor de la propiedad postlcod2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTLCOD2(String value) {
        this.postlcod2 = value;
    }

    /**
     * Obtiene el valor de la propiedad postlcity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTLCITY() {
        return postlcity;
    }

    /**
     * Define el valor de la propiedad postlcity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTLCITY(String value) {
        this.postlcity = value;
    }

    /**
     * Obtiene el valor de la propiedad telephone1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEPHONE1() {
        return telephone1;
    }

    /**
     * Define el valor de la propiedad telephone1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEPHONE1(String value) {
        this.telephone1 = value;
    }

    /**
     * Obtiene el valor de la propiedad telephone2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEPHONE2() {
        return telephone2;
    }

    /**
     * Define el valor de la propiedad telephone2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEPHONE2(String value) {
        this.telephone2 = value;
    }

    /**
     * Obtiene el valor de la propiedad telefax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEFAX() {
        return telefax;
    }

    /**
     * Define el valor de la propiedad telefax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEFAX(String value) {
        this.telefax = value;
    }

    /**
     * Obtiene el valor de la propiedad telex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEX() {
        return telex;
    }

    /**
     * Define el valor de la propiedad telex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEX(String value) {
        this.telex = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAIL(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad country1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRY1() {
        return country1;
    }

    /**
     * Define el valor de la propiedad country1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRY1(String value) {
        this.country1 = value;
    }

    /**
     * Obtiene el valor de la propiedad country2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRY2() {
        return country2;
    }

    /**
     * Define el valor de la propiedad country2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRY2(String value) {
        this.country2 = value;
    }

    /**
     * Obtiene el valor de la propiedad region.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGION() {
        return region;
    }

    /**
     * Define el valor de la propiedad region.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGION(String value) {
        this.region = value;
    }

    /**
     * Obtiene el valor de la propiedad countycod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTYCOD() {
        return countycod;
    }

    /**
     * Define el valor de la propiedad countycod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTYCOD(String value) {
        this.countycod = value;
    }

    /**
     * Obtiene el valor de la propiedad countytxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTYTXT() {
        return countytxt;
    }

    /**
     * Define el valor de la propiedad countytxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTYTXT(String value) {
        this.countytxt = value;
    }

    /**
     * Obtiene el valor de la propiedad tzcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTZCODE() {
        return tzcode;
    }

    /**
     * Define el valor de la propiedad tzcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTZCODE(String value) {
        this.tzcode = value;
    }

    /**
     * Obtiene el valor de la propiedad tzdesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTZDESC() {
        return tzdesc;
    }

    /**
     * Define el valor de la propiedad tzdesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTZDESC(String value) {
        this.tzdesc = value;
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
