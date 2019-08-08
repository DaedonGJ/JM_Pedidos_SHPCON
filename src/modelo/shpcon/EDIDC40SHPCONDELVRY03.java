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
 * <p>Clase Java para EDI_DC40.SHPCON.DELVRY03 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EDI_DC40.SHPCON.DELVRY03">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TABNAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MANDT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DOCNUM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DOCREL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STATUS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DIRECT">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OUTMOD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXPRSS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TEST" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IDOCTYP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CIMTYP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MESTYP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MESCOD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MESFCT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STDVRS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STDMES" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SNDPOR">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SNDPRT">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SNDPFC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SNDPRN">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SNDSAD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="21"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SNDLAD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RCVPOR">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RCVPRT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RCVPFC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RCVPRN">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RCVSAD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="21"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RCVLAD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CREDAT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CRETIM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REFINT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REFGRP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REFMES" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ARCKEY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SERIAL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
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
@XmlType(name = "EDI_DC40.SHPCON.DELVRY03", propOrder = {
    "tabnam",
    "mandt",
    "docnum",
    "docrel",
    "status",
    "direct",
    "outmod",
    "exprss",
    "test",
    "idoctyp",
    "cimtyp",
    "mestyp",
    "mescod",
    "mesfct",
    "std",
    "stdvrs",
    "stdmes",
    "sndpor",
    "sndprt",
    "sndpfc",
    "sndprn",
    "sndsad",
    "sndlad",
    "rcvpor",
    "rcvprt",
    "rcvpfc",
    "rcvprn",
    "rcvsad",
    "rcvlad",
    "credat",
    "cretim",
    "refint",
    "refgrp",
    "refmes",
    "arckey",
    "serial"
})
public class EDIDC40SHPCONDELVRY03 {

    @XmlElement(name = "TABNAM", required = true)
    protected String tabnam;
    @XmlElement(name = "MANDT")
    protected String mandt;
    @XmlElement(name = "DOCNUM")
    protected String docnum;
    @XmlElement(name = "DOCREL")
    protected String docrel;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "DIRECT", required = true)
    protected String direct;
    @XmlElement(name = "OUTMOD")
    protected String outmod;
    @XmlElement(name = "EXPRSS")
    protected String exprss;
    @XmlElement(name = "TEST")
    protected String test;
    @XmlElement(name = "IDOCTYP", required = true)
    protected String idoctyp;
    @XmlElement(name = "CIMTYP")
    protected String cimtyp;
    @XmlElement(name = "MESTYP", required = true)
    protected String mestyp;
    @XmlElement(name = "MESCOD")
    protected String mescod;
    @XmlElement(name = "MESFCT")
    protected String mesfct;
    @XmlElement(name = "STD")
    protected String std;
    @XmlElement(name = "STDVRS")
    protected String stdvrs;
    @XmlElement(name = "STDMES")
    protected String stdmes;
    @XmlElement(name = "SNDPOR", required = true)
    protected String sndpor;
    @XmlElement(name = "SNDPRT", required = true)
    protected String sndprt;
    @XmlElement(name = "SNDPFC")
    protected String sndpfc;
    @XmlElement(name = "SNDPRN", required = true)
    protected String sndprn;
    @XmlElement(name = "SNDSAD")
    protected String sndsad;
    @XmlElement(name = "SNDLAD")
    protected String sndlad;
    @XmlElement(name = "RCVPOR", required = true)
    protected String rcvpor;
    @XmlElement(name = "RCVPRT")
    protected String rcvprt;
    @XmlElement(name = "RCVPFC")
    protected String rcvpfc;
    @XmlElement(name = "RCVPRN", required = true)
    protected String rcvprn;
    @XmlElement(name = "RCVSAD")
    protected String rcvsad;
    @XmlElement(name = "RCVLAD")
    protected String rcvlad;
    @XmlElement(name = "CREDAT")
    protected String credat;
    @XmlElement(name = "CRETIM")
    protected String cretim;
    @XmlElement(name = "REFINT")
    protected String refint;
    @XmlElement(name = "REFGRP")
    protected String refgrp;
    @XmlElement(name = "REFMES")
    protected String refmes;
    @XmlElement(name = "ARCKEY")
    protected String arckey;
    @XmlElement(name = "SERIAL")
    protected String serial;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad tabnam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTABNAM() {
        return tabnam;
    }

    /**
     * Define el valor de la propiedad tabnam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTABNAM(String value) {
        this.tabnam = value;
    }

    /**
     * Obtiene el valor de la propiedad mandt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANDT() {
        return mandt;
    }

    /**
     * Define el valor de la propiedad mandt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANDT(String value) {
        this.mandt = value;
    }

    /**
     * Obtiene el valor de la propiedad docnum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCNUM() {
        return docnum;
    }

    /**
     * Define el valor de la propiedad docnum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCNUM(String value) {
        this.docnum = value;
    }

    /**
     * Obtiene el valor de la propiedad docrel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCREL() {
        return docrel;
    }

    /**
     * Define el valor de la propiedad docrel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCREL(String value) {
        this.docrel = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad direct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRECT() {
        return direct;
    }

    /**
     * Define el valor de la propiedad direct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRECT(String value) {
        this.direct = value;
    }

    /**
     * Obtiene el valor de la propiedad outmod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOUTMOD() {
        return outmod;
    }

    /**
     * Define el valor de la propiedad outmod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOUTMOD(String value) {
        this.outmod = value;
    }

    /**
     * Obtiene el valor de la propiedad exprss.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPRSS() {
        return exprss;
    }

    /**
     * Define el valor de la propiedad exprss.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPRSS(String value) {
        this.exprss = value;
    }

    /**
     * Obtiene el valor de la propiedad test.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEST() {
        return test;
    }

    /**
     * Define el valor de la propiedad test.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEST(String value) {
        this.test = value;
    }

    /**
     * Obtiene el valor de la propiedad idoctyp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDOCTYP() {
        return idoctyp;
    }

    /**
     * Define el valor de la propiedad idoctyp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDOCTYP(String value) {
        this.idoctyp = value;
    }

    /**
     * Obtiene el valor de la propiedad cimtyp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIMTYP() {
        return cimtyp;
    }

    /**
     * Define el valor de la propiedad cimtyp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIMTYP(String value) {
        this.cimtyp = value;
    }

    /**
     * Obtiene el valor de la propiedad mestyp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESTYP() {
        return mestyp;
    }

    /**
     * Define el valor de la propiedad mestyp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESTYP(String value) {
        this.mestyp = value;
    }

    /**
     * Obtiene el valor de la propiedad mescod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESCOD() {
        return mescod;
    }

    /**
     * Define el valor de la propiedad mescod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESCOD(String value) {
        this.mescod = value;
    }

    /**
     * Obtiene el valor de la propiedad mesfct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESFCT() {
        return mesfct;
    }

    /**
     * Define el valor de la propiedad mesfct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESFCT(String value) {
        this.mesfct = value;
    }

    /**
     * Obtiene el valor de la propiedad std.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTD() {
        return std;
    }

    /**
     * Define el valor de la propiedad std.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTD(String value) {
        this.std = value;
    }

    /**
     * Obtiene el valor de la propiedad stdvrs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTDVRS() {
        return stdvrs;
    }

    /**
     * Define el valor de la propiedad stdvrs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTDVRS(String value) {
        this.stdvrs = value;
    }

    /**
     * Obtiene el valor de la propiedad stdmes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTDMES() {
        return stdmes;
    }

    /**
     * Define el valor de la propiedad stdmes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTDMES(String value) {
        this.stdmes = value;
    }

    /**
     * Obtiene el valor de la propiedad sndpor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDPOR() {
        return sndpor;
    }

    /**
     * Define el valor de la propiedad sndpor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDPOR(String value) {
        this.sndpor = value;
    }

    /**
     * Obtiene el valor de la propiedad sndprt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDPRT() {
        return sndprt;
    }

    /**
     * Define el valor de la propiedad sndprt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDPRT(String value) {
        this.sndprt = value;
    }

    /**
     * Obtiene el valor de la propiedad sndpfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDPFC() {
        return sndpfc;
    }

    /**
     * Define el valor de la propiedad sndpfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDPFC(String value) {
        this.sndpfc = value;
    }

    /**
     * Obtiene el valor de la propiedad sndprn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDPRN() {
        return sndprn;
    }

    /**
     * Define el valor de la propiedad sndprn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDPRN(String value) {
        this.sndprn = value;
    }

    /**
     * Obtiene el valor de la propiedad sndsad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDSAD() {
        return sndsad;
    }

    /**
     * Define el valor de la propiedad sndsad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDSAD(String value) {
        this.sndsad = value;
    }

    /**
     * Obtiene el valor de la propiedad sndlad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNDLAD() {
        return sndlad;
    }

    /**
     * Define el valor de la propiedad sndlad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNDLAD(String value) {
        this.sndlad = value;
    }

    /**
     * Obtiene el valor de la propiedad rcvpor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVPOR() {
        return rcvpor;
    }

    /**
     * Define el valor de la propiedad rcvpor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVPOR(String value) {
        this.rcvpor = value;
    }

    /**
     * Obtiene el valor de la propiedad rcvprt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVPRT() {
        return rcvprt;
    }

    /**
     * Define el valor de la propiedad rcvprt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVPRT(String value) {
        this.rcvprt = value;
    }

    /**
     * Obtiene el valor de la propiedad rcvpfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVPFC() {
        return rcvpfc;
    }

    /**
     * Define el valor de la propiedad rcvpfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVPFC(String value) {
        this.rcvpfc = value;
    }

    /**
     * Obtiene el valor de la propiedad rcvprn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVPRN() {
        return rcvprn;
    }

    /**
     * Define el valor de la propiedad rcvprn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVPRN(String value) {
        this.rcvprn = value;
    }

    /**
     * Obtiene el valor de la propiedad rcvsad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVSAD() {
        return rcvsad;
    }

    /**
     * Define el valor de la propiedad rcvsad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVSAD(String value) {
        this.rcvsad = value;
    }

    /**
     * Obtiene el valor de la propiedad rcvlad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCVLAD() {
        return rcvlad;
    }

    /**
     * Define el valor de la propiedad rcvlad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCVLAD(String value) {
        this.rcvlad = value;
    }

    /**
     * Obtiene el valor de la propiedad credat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDAT() {
        return credat;
    }

    /**
     * Define el valor de la propiedad credat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDAT(String value) {
        this.credat = value;
    }

    /**
     * Obtiene el valor de la propiedad cretim.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRETIM() {
        return cretim;
    }

    /**
     * Define el valor de la propiedad cretim.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRETIM(String value) {
        this.cretim = value;
    }

    /**
     * Obtiene el valor de la propiedad refint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFINT() {
        return refint;
    }

    /**
     * Define el valor de la propiedad refint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFINT(String value) {
        this.refint = value;
    }

    /**
     * Obtiene el valor de la propiedad refgrp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFGRP() {
        return refgrp;
    }

    /**
     * Define el valor de la propiedad refgrp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFGRP(String value) {
        this.refgrp = value;
    }

    /**
     * Obtiene el valor de la propiedad refmes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFMES() {
        return refmes;
    }

    /**
     * Define el valor de la propiedad refmes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFMES(String value) {
        this.refmes = value;
    }

    /**
     * Obtiene el valor de la propiedad arckey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARCKEY() {
        return arckey;
    }

    /**
     * Define el valor de la propiedad arckey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARCKEY(String value) {
        this.arckey = value;
    }

    /**
     * Obtiene el valor de la propiedad serial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERIAL() {
        return serial;
    }

    /**
     * Define el valor de la propiedad serial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERIAL(String value) {
        this.serial = value;
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
