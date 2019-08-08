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
 * DG header data (delivery)
 * 
 * <p>Clase Java para DELVRY03.E1EDD01 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDD01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NCDG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INR1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACTVTY_TOTAL_A2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXPL_NET_SUM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXPL_NET_SUM_U" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
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
@XmlType(name = "DELVRY03.E1EDD01", propOrder = {
    "ncdg",
    "inr1",
    "actvtytotala2",
    "explnetsum",
    "explnetsumu"
})
public class DELVRY03E1EDD01 {

    @XmlElement(name = "NCDG")
    protected String ncdg;
    @XmlElement(name = "INR1")
    protected String inr1;
    @XmlElement(name = "ACTVTY_TOTAL_A2")
    protected String actvtytotala2;
    @XmlElement(name = "EXPL_NET_SUM")
    protected String explnetsum;
    @XmlElement(name = "EXPL_NET_SUM_U")
    protected String explnetsumu;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad ncdg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCDG() {
        return ncdg;
    }

    /**
     * Define el valor de la propiedad ncdg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCDG(String value) {
        this.ncdg = value;
    }

    /**
     * Obtiene el valor de la propiedad inr1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINR1() {
        return inr1;
    }

    /**
     * Define el valor de la propiedad inr1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINR1(String value) {
        this.inr1 = value;
    }

    /**
     * Obtiene el valor de la propiedad actvtytotala2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTVTYTOTALA2() {
        return actvtytotala2;
    }

    /**
     * Define el valor de la propiedad actvtytotala2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTVTYTOTALA2(String value) {
        this.actvtytotala2 = value;
    }

    /**
     * Obtiene el valor de la propiedad explnetsum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPLNETSUM() {
        return explnetsum;
    }

    /**
     * Define el valor de la propiedad explnetsum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPLNETSUM(String value) {
        this.explnetsum = value;
    }

    /**
     * Obtiene el valor de la propiedad explnetsumu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPLNETSUMU() {
        return explnetsumu;
    }

    /**
     * Define el valor de la propiedad explnetsumu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPLNETSUMU(String value) {
        this.explnetsumu = value;
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
