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
 * Export Data Delivery Header
 * 
 * <p>Clase Java para DELVRY03.E1EDL33 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL33">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ALAND" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXPVZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZOLLA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZOLLB" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZOLL1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZOLL2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZOLL3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZOLL4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZOLL5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZOLL6" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KZGBE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KZABE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STGBE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STABE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CONTA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GRWCU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IEVER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PREV_DOC_NO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PREV_DOC_TYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E1EDL34" type="{}DELVRY03.E1EDL34" minOccurs="0"/>
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
@XmlType(name = "DELVRY03.E1EDL33", propOrder = {
    "aland",
    "expvz",
    "zolla",
    "zollb",
    "zoll1",
    "zoll2",
    "zoll3",
    "zoll4",
    "zoll5",
    "zoll6",
    "kzgbe",
    "kzabe",
    "stgbe",
    "stabe",
    "conta",
    "grwcu",
    "iever",
    "prevdocno",
    "prevdoctype",
    "e1EDL34"
})
public class DELVRY03E1EDL33 {

    @XmlElement(name = "ALAND")
    protected String aland;
    @XmlElement(name = "EXPVZ")
    protected String expvz;
    @XmlElement(name = "ZOLLA")
    protected String zolla;
    @XmlElement(name = "ZOLLB")
    protected String zollb;
    @XmlElement(name = "ZOLL1")
    protected String zoll1;
    @XmlElement(name = "ZOLL2")
    protected String zoll2;
    @XmlElement(name = "ZOLL3")
    protected String zoll3;
    @XmlElement(name = "ZOLL4")
    protected String zoll4;
    @XmlElement(name = "ZOLL5")
    protected String zoll5;
    @XmlElement(name = "ZOLL6")
    protected String zoll6;
    @XmlElement(name = "KZGBE")
    protected String kzgbe;
    @XmlElement(name = "KZABE")
    protected String kzabe;
    @XmlElement(name = "STGBE")
    protected String stgbe;
    @XmlElement(name = "STABE")
    protected String stabe;
    @XmlElement(name = "CONTA")
    protected String conta;
    @XmlElement(name = "GRWCU")
    protected String grwcu;
    @XmlElement(name = "IEVER")
    protected String iever;
    @XmlElement(name = "PREV_DOC_NO")
    protected String prevdocno;
    @XmlElement(name = "PREV_DOC_TYPE")
    protected String prevdoctype;
    @XmlElement(name = "E1EDL34")
    protected DELVRY03E1EDL34 e1EDL34;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad aland.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALAND() {
        return aland;
    }

    /**
     * Define el valor de la propiedad aland.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALAND(String value) {
        this.aland = value;
    }

    /**
     * Obtiene el valor de la propiedad expvz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPVZ() {
        return expvz;
    }

    /**
     * Define el valor de la propiedad expvz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPVZ(String value) {
        this.expvz = value;
    }

    /**
     * Obtiene el valor de la propiedad zolla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZOLLA() {
        return zolla;
    }

    /**
     * Define el valor de la propiedad zolla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZOLLA(String value) {
        this.zolla = value;
    }

    /**
     * Obtiene el valor de la propiedad zollb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZOLLB() {
        return zollb;
    }

    /**
     * Define el valor de la propiedad zollb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZOLLB(String value) {
        this.zollb = value;
    }

    /**
     * Obtiene el valor de la propiedad zoll1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZOLL1() {
        return zoll1;
    }

    /**
     * Define el valor de la propiedad zoll1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZOLL1(String value) {
        this.zoll1 = value;
    }

    /**
     * Obtiene el valor de la propiedad zoll2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZOLL2() {
        return zoll2;
    }

    /**
     * Define el valor de la propiedad zoll2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZOLL2(String value) {
        this.zoll2 = value;
    }

    /**
     * Obtiene el valor de la propiedad zoll3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZOLL3() {
        return zoll3;
    }

    /**
     * Define el valor de la propiedad zoll3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZOLL3(String value) {
        this.zoll3 = value;
    }

    /**
     * Obtiene el valor de la propiedad zoll4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZOLL4() {
        return zoll4;
    }

    /**
     * Define el valor de la propiedad zoll4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZOLL4(String value) {
        this.zoll4 = value;
    }

    /**
     * Obtiene el valor de la propiedad zoll5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZOLL5() {
        return zoll5;
    }

    /**
     * Define el valor de la propiedad zoll5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZOLL5(String value) {
        this.zoll5 = value;
    }

    /**
     * Obtiene el valor de la propiedad zoll6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZOLL6() {
        return zoll6;
    }

    /**
     * Define el valor de la propiedad zoll6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZOLL6(String value) {
        this.zoll6 = value;
    }

    /**
     * Obtiene el valor de la propiedad kzgbe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKZGBE() {
        return kzgbe;
    }

    /**
     * Define el valor de la propiedad kzgbe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKZGBE(String value) {
        this.kzgbe = value;
    }

    /**
     * Obtiene el valor de la propiedad kzabe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKZABE() {
        return kzabe;
    }

    /**
     * Define el valor de la propiedad kzabe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKZABE(String value) {
        this.kzabe = value;
    }

    /**
     * Obtiene el valor de la propiedad stgbe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTGBE() {
        return stgbe;
    }

    /**
     * Define el valor de la propiedad stgbe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTGBE(String value) {
        this.stgbe = value;
    }

    /**
     * Obtiene el valor de la propiedad stabe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTABE() {
        return stabe;
    }

    /**
     * Define el valor de la propiedad stabe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTABE(String value) {
        this.stabe = value;
    }

    /**
     * Obtiene el valor de la propiedad conta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTA() {
        return conta;
    }

    /**
     * Define el valor de la propiedad conta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTA(String value) {
        this.conta = value;
    }

    /**
     * Obtiene el valor de la propiedad grwcu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRWCU() {
        return grwcu;
    }

    /**
     * Define el valor de la propiedad grwcu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRWCU(String value) {
        this.grwcu = value;
    }

    /**
     * Obtiene el valor de la propiedad iever.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIEVER() {
        return iever;
    }

    /**
     * Define el valor de la propiedad iever.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIEVER(String value) {
        this.iever = value;
    }

    /**
     * Obtiene el valor de la propiedad prevdocno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREVDOCNO() {
        return prevdocno;
    }

    /**
     * Define el valor de la propiedad prevdocno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREVDOCNO(String value) {
        this.prevdocno = value;
    }

    /**
     * Obtiene el valor de la propiedad prevdoctype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREVDOCTYPE() {
        return prevdoctype;
    }

    /**
     * Define el valor de la propiedad prevdoctype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREVDOCTYPE(String value) {
        this.prevdoctype = value;
    }

    /**
     * Obtiene el valor de la propiedad e1EDL34.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDL34 }
     *     
     */
    public DELVRY03E1EDL34 getE1EDL34() {
        return e1EDL34;
    }

    /**
     * Define el valor de la propiedad e1EDL34.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDL34 }
     *     
     */
    public void setE1EDL34(DELVRY03E1EDL34 value) {
        this.e1EDL34 = value;
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
