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
 * Repack Handling Units
 * 
 * <p>Clase Java para DELVRY03.E1EDL54 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL54">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SOURCEHU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DESTHU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PACKHU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PACK_QTY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BASE_UOM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATERIAL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="18"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BATCH" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PLANT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STGE_LOC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STOCK_CAT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SPEC_STOCK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SP_STCK_NO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DELIV_NUMB" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DELIV_ITEM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATERIAL_EXTERNAL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATERIAL_VERSION" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATERIAL_GUID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
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
@XmlType(name = "DELVRY03.E1EDL54", propOrder = {
    "sourcehu",
    "desthu",
    "packhu",
    "packqty",
    "baseuom",
    "material",
    "batch",
    "plant",
    "stgeloc",
    "stockcat",
    "specstock",
    "spstckno",
    "delivnumb",
    "delivitem",
    "materialexternal",
    "materialversion",
    "materialguid"
})
public class DELVRY03E1EDL54 {

    @XmlElement(name = "SOURCEHU")
    protected String sourcehu;
    @XmlElement(name = "DESTHU")
    protected String desthu;
    @XmlElement(name = "PACKHU")
    protected String packhu;
    @XmlElement(name = "PACK_QTY")
    protected String packqty;
    @XmlElement(name = "BASE_UOM")
    protected String baseuom;
    @XmlElement(name = "MATERIAL")
    protected String material;
    @XmlElement(name = "BATCH")
    protected String batch;
    @XmlElement(name = "PLANT")
    protected String plant;
    @XmlElement(name = "STGE_LOC")
    protected String stgeloc;
    @XmlElement(name = "STOCK_CAT")
    protected String stockcat;
    @XmlElement(name = "SPEC_STOCK")
    protected String specstock;
    @XmlElement(name = "SP_STCK_NO")
    protected String spstckno;
    @XmlElement(name = "DELIV_NUMB")
    protected String delivnumb;
    @XmlElement(name = "DELIV_ITEM")
    protected String delivitem;
    @XmlElement(name = "MATERIAL_EXTERNAL")
    protected String materialexternal;
    @XmlElement(name = "MATERIAL_VERSION")
    protected String materialversion;
    @XmlElement(name = "MATERIAL_GUID")
    protected String materialguid;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad sourcehu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCEHU() {
        return sourcehu;
    }

    /**
     * Define el valor de la propiedad sourcehu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCEHU(String value) {
        this.sourcehu = value;
    }

    /**
     * Obtiene el valor de la propiedad desthu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTHU() {
        return desthu;
    }

    /**
     * Define el valor de la propiedad desthu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTHU(String value) {
        this.desthu = value;
    }

    /**
     * Obtiene el valor de la propiedad packhu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACKHU() {
        return packhu;
    }

    /**
     * Define el valor de la propiedad packhu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACKHU(String value) {
        this.packhu = value;
    }

    /**
     * Obtiene el valor de la propiedad packqty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACKQTY() {
        return packqty;
    }

    /**
     * Define el valor de la propiedad packqty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACKQTY(String value) {
        this.packqty = value;
    }

    /**
     * Obtiene el valor de la propiedad baseuom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBASEUOM() {
        return baseuom;
    }

    /**
     * Define el valor de la propiedad baseuom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBASEUOM(String value) {
        this.baseuom = value;
    }

    /**
     * Obtiene el valor de la propiedad material.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATERIAL() {
        return material;
    }

    /**
     * Define el valor de la propiedad material.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATERIAL(String value) {
        this.material = value;
    }

    /**
     * Obtiene el valor de la propiedad batch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBATCH() {
        return batch;
    }

    /**
     * Define el valor de la propiedad batch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBATCH(String value) {
        this.batch = value;
    }

    /**
     * Obtiene el valor de la propiedad plant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLANT() {
        return plant;
    }

    /**
     * Define el valor de la propiedad plant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLANT(String value) {
        this.plant = value;
    }

    /**
     * Obtiene el valor de la propiedad stgeloc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTGELOC() {
        return stgeloc;
    }

    /**
     * Define el valor de la propiedad stgeloc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTGELOC(String value) {
        this.stgeloc = value;
    }

    /**
     * Obtiene el valor de la propiedad stockcat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOCKCAT() {
        return stockcat;
    }

    /**
     * Define el valor de la propiedad stockcat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOCKCAT(String value) {
        this.stockcat = value;
    }

    /**
     * Obtiene el valor de la propiedad specstock.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPECSTOCK() {
        return specstock;
    }

    /**
     * Define el valor de la propiedad specstock.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPECSTOCK(String value) {
        this.specstock = value;
    }

    /**
     * Obtiene el valor de la propiedad spstckno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPSTCKNO() {
        return spstckno;
    }

    /**
     * Define el valor de la propiedad spstckno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPSTCKNO(String value) {
        this.spstckno = value;
    }

    /**
     * Obtiene el valor de la propiedad delivnumb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVNUMB() {
        return delivnumb;
    }

    /**
     * Define el valor de la propiedad delivnumb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVNUMB(String value) {
        this.delivnumb = value;
    }

    /**
     * Obtiene el valor de la propiedad delivitem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVITEM() {
        return delivitem;
    }

    /**
     * Define el valor de la propiedad delivitem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVITEM(String value) {
        this.delivitem = value;
    }

    /**
     * Obtiene el valor de la propiedad materialexternal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATERIALEXTERNAL() {
        return materialexternal;
    }

    /**
     * Define el valor de la propiedad materialexternal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATERIALEXTERNAL(String value) {
        this.materialexternal = value;
    }

    /**
     * Obtiene el valor de la propiedad materialversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATERIALVERSION() {
        return materialversion;
    }

    /**
     * Define el valor de la propiedad materialversion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATERIALVERSION(String value) {
        this.materialversion = value;
    }

    /**
     * Obtiene el valor de la propiedad materialguid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATERIALGUID() {
        return materialguid;
    }

    /**
     * Define el valor de la propiedad materialguid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATERIALGUID(String value) {
        this.materialguid = value;
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
