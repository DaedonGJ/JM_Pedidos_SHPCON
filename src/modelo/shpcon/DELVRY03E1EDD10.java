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
 * DG item data 1 (delivery)
 * 
 * <p>Clase Java para DELVRY03.E1EDD10 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDD10">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MOT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALDAT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGCAO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGNHM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TKUI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGNU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COLNO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGRES1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGRES2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGRES3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGREMP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGRERQ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGCL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGSC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SDBC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SLBE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LDBC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LWDG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EINU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EICN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EMSN1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EMSN2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MFAG1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MFAG2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HQTU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HQTUN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PIN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PINLQ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PGRO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HNU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HPN1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HPN2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HPN3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HPN4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HPN5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HPN6" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HPN7" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LAB1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LAB2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LAB3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LAB4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LAB5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LAB6" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LAB7" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LAB8" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LAB9" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LAB10" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PBI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGPTA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NHME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGSHE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PIMDG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SPPRO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MAPOL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXCEP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AGRNO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REGNO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SDGCL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TDGCL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LWDGN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="132"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RVLID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOS1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOS2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOS3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOS4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOS5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOS6" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOS7" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOS8" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOS9" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOSA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGTNA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGWOS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SCASE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EIMDG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSEPR1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSEPR2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSEPR3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSEPR4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSEPR5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSEPR6" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSEPR7" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSEPR8" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSEPR9" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSEPRA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSEPRB" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSEPRC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSEPRD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSEPRE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSEPRF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSEPRG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSEPRH" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MLOAR1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MLOAR2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MLOAR3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MLOAR4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MLOAR5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MLOAR6" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MLOAR7" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MLOAR8" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MLOAR9" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MLOARA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RSMLG1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RSMLG2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RSMLG3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ESMLG1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ESMLG2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ESMLG3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PPDG1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PPDG2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PPDG3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PPDG4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PPDG5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PPDG6" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PPDG7" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PPDG8" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PPDG9" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PPDGA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PPDGB" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PPDGC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PPDGE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PPDGF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PPDGG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LFDNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SUBPOS_NR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DG_NET_WEIGHT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DG_GROSS_WEIGHT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DG_WEIGHT_U" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E1EDD11" type="{}DELVRY03.E1EDD11" minOccurs="0"/>
 *         &lt;element name="E1EDD15" type="{}DELVRY03.E1EDD15" minOccurs="0"/>
 *         &lt;element name="E1EDD12" type="{}DELVRY03.E1EDD12" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="E1EDD13" type="{}DELVRY03.E1EDD13" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="E1EDDH3" type="{}DELVRY03.E1EDDH3" maxOccurs="99" minOccurs="0"/>
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
@XmlType(name = "DELVRY03.E1EDD10", propOrder = {
    "mot",
    "valdat",
    "dgcao",
    "dgnhm",
    "tkui",
    "dgnu",
    "colno",
    "dgres1",
    "dgres2",
    "dgres3",
    "dgremp",
    "dgrerq",
    "dgcl",
    "dgsc",
    "sdbc",
    "slbe",
    "ldbc",
    "lwdg",
    "einu",
    "eicn",
    "emsn1",
    "emsn2",
    "mfag1",
    "mfag2",
    "hqtu",
    "hqtun",
    "pin",
    "pinlq",
    "pgro",
    "hnu",
    "hpn1",
    "hpn2",
    "hpn3",
    "hpn4",
    "hpn5",
    "hpn6",
    "hpn7",
    "lab1",
    "lab2",
    "lab3",
    "lab4",
    "lab5",
    "lab6",
    "lab7",
    "lab8",
    "lab9",
    "lab10",
    "pbi",
    "dgpta",
    "nhme",
    "dgshe",
    "pimdg",
    "sppro",
    "mapol",
    "excep",
    "agrno",
    "regno",
    "sdgcl",
    "tdgcl",
    "lwdgn",
    "rvlid",
    "mos1",
    "mos2",
    "mos3",
    "mos4",
    "mos5",
    "mos6",
    "mos7",
    "mos8",
    "mos9",
    "mosa",
    "dgtna",
    "dgwos",
    "scase",
    "eimdg",
    "msepr1",
    "msepr2",
    "msepr3",
    "msepr4",
    "msepr5",
    "msepr6",
    "msepr7",
    "msepr8",
    "msepr9",
    "msepra",
    "mseprb",
    "mseprc",
    "mseprd",
    "msepre",
    "mseprf",
    "mseprg",
    "mseprh",
    "mloar1",
    "mloar2",
    "mloar3",
    "mloar4",
    "mloar5",
    "mloar6",
    "mloar7",
    "mloar8",
    "mloar9",
    "mloara",
    "rsmlg1",
    "rsmlg2",
    "rsmlg3",
    "esmlg1",
    "esmlg2",
    "esmlg3",
    "ppdg1",
    "ppdg2",
    "ppdg3",
    "ppdg4",
    "ppdg5",
    "ppdg6",
    "ppdg7",
    "ppdg8",
    "ppdg9",
    "ppdga",
    "ppdgb",
    "ppdgc",
    "ppdge",
    "ppdgf",
    "ppdgg",
    "lfdnr",
    "subposnr",
    "dgnetweight",
    "dggrossweight",
    "dgweightu",
    "e1EDD11",
    "e1EDD15",
    "e1EDD12",
    "e1EDD13",
    "e1EDDH3"
})
public class DELVRY03E1EDD10 {

    @XmlElement(name = "MOT")
    protected String mot;
    @XmlElement(name = "VALDAT")
    protected String valdat;
    @XmlElement(name = "DGCAO")
    protected String dgcao;
    @XmlElement(name = "DGNHM")
    protected String dgnhm;
    @XmlElement(name = "TKUI")
    protected String tkui;
    @XmlElement(name = "DGNU")
    protected String dgnu;
    @XmlElement(name = "COLNO")
    protected String colno;
    @XmlElement(name = "DGRES1")
    protected String dgres1;
    @XmlElement(name = "DGRES2")
    protected String dgres2;
    @XmlElement(name = "DGRES3")
    protected String dgres3;
    @XmlElement(name = "DGREMP")
    protected String dgremp;
    @XmlElement(name = "DGRERQ")
    protected String dgrerq;
    @XmlElement(name = "DGCL")
    protected String dgcl;
    @XmlElement(name = "DGSC")
    protected String dgsc;
    @XmlElement(name = "SDBC")
    protected String sdbc;
    @XmlElement(name = "SLBE")
    protected String slbe;
    @XmlElement(name = "LDBC")
    protected String ldbc;
    @XmlElement(name = "LWDG")
    protected String lwdg;
    @XmlElement(name = "EINU")
    protected String einu;
    @XmlElement(name = "EICN")
    protected String eicn;
    @XmlElement(name = "EMSN1")
    protected String emsn1;
    @XmlElement(name = "EMSN2")
    protected String emsn2;
    @XmlElement(name = "MFAG1")
    protected String mfag1;
    @XmlElement(name = "MFAG2")
    protected String mfag2;
    @XmlElement(name = "HQTU")
    protected String hqtu;
    @XmlElement(name = "HQTUN")
    protected String hqtun;
    @XmlElement(name = "PIN")
    protected String pin;
    @XmlElement(name = "PINLQ")
    protected String pinlq;
    @XmlElement(name = "PGRO")
    protected String pgro;
    @XmlElement(name = "HNU")
    protected String hnu;
    @XmlElement(name = "HPN1")
    protected String hpn1;
    @XmlElement(name = "HPN2")
    protected String hpn2;
    @XmlElement(name = "HPN3")
    protected String hpn3;
    @XmlElement(name = "HPN4")
    protected String hpn4;
    @XmlElement(name = "HPN5")
    protected String hpn5;
    @XmlElement(name = "HPN6")
    protected String hpn6;
    @XmlElement(name = "HPN7")
    protected String hpn7;
    @XmlElement(name = "LAB1")
    protected String lab1;
    @XmlElement(name = "LAB2")
    protected String lab2;
    @XmlElement(name = "LAB3")
    protected String lab3;
    @XmlElement(name = "LAB4")
    protected String lab4;
    @XmlElement(name = "LAB5")
    protected String lab5;
    @XmlElement(name = "LAB6")
    protected String lab6;
    @XmlElement(name = "LAB7")
    protected String lab7;
    @XmlElement(name = "LAB8")
    protected String lab8;
    @XmlElement(name = "LAB9")
    protected String lab9;
    @XmlElement(name = "LAB10")
    protected String lab10;
    @XmlElement(name = "PBI")
    protected String pbi;
    @XmlElement(name = "DGPTA")
    protected String dgpta;
    @XmlElement(name = "NHME")
    protected String nhme;
    @XmlElement(name = "DGSHE")
    protected String dgshe;
    @XmlElement(name = "PIMDG")
    protected String pimdg;
    @XmlElement(name = "SPPRO")
    protected String sppro;
    @XmlElement(name = "MAPOL")
    protected String mapol;
    @XmlElement(name = "EXCEP")
    protected String excep;
    @XmlElement(name = "AGRNO")
    protected String agrno;
    @XmlElement(name = "REGNO")
    protected String regno;
    @XmlElement(name = "SDGCL")
    protected String sdgcl;
    @XmlElement(name = "TDGCL")
    protected String tdgcl;
    @XmlElement(name = "LWDGN")
    protected String lwdgn;
    @XmlElement(name = "RVLID")
    protected String rvlid;
    @XmlElement(name = "MOS1")
    protected String mos1;
    @XmlElement(name = "MOS2")
    protected String mos2;
    @XmlElement(name = "MOS3")
    protected String mos3;
    @XmlElement(name = "MOS4")
    protected String mos4;
    @XmlElement(name = "MOS5")
    protected String mos5;
    @XmlElement(name = "MOS6")
    protected String mos6;
    @XmlElement(name = "MOS7")
    protected String mos7;
    @XmlElement(name = "MOS8")
    protected String mos8;
    @XmlElement(name = "MOS9")
    protected String mos9;
    @XmlElement(name = "MOSA")
    protected String mosa;
    @XmlElement(name = "DGTNA")
    protected String dgtna;
    @XmlElement(name = "DGWOS")
    protected String dgwos;
    @XmlElement(name = "SCASE")
    protected String scase;
    @XmlElement(name = "EIMDG")
    protected String eimdg;
    @XmlElement(name = "MSEPR1")
    protected String msepr1;
    @XmlElement(name = "MSEPR2")
    protected String msepr2;
    @XmlElement(name = "MSEPR3")
    protected String msepr3;
    @XmlElement(name = "MSEPR4")
    protected String msepr4;
    @XmlElement(name = "MSEPR5")
    protected String msepr5;
    @XmlElement(name = "MSEPR6")
    protected String msepr6;
    @XmlElement(name = "MSEPR7")
    protected String msepr7;
    @XmlElement(name = "MSEPR8")
    protected String msepr8;
    @XmlElement(name = "MSEPR9")
    protected String msepr9;
    @XmlElement(name = "MSEPRA")
    protected String msepra;
    @XmlElement(name = "MSEPRB")
    protected String mseprb;
    @XmlElement(name = "MSEPRC")
    protected String mseprc;
    @XmlElement(name = "MSEPRD")
    protected String mseprd;
    @XmlElement(name = "MSEPRE")
    protected String msepre;
    @XmlElement(name = "MSEPRF")
    protected String mseprf;
    @XmlElement(name = "MSEPRG")
    protected String mseprg;
    @XmlElement(name = "MSEPRH")
    protected String mseprh;
    @XmlElement(name = "MLOAR1")
    protected String mloar1;
    @XmlElement(name = "MLOAR2")
    protected String mloar2;
    @XmlElement(name = "MLOAR3")
    protected String mloar3;
    @XmlElement(name = "MLOAR4")
    protected String mloar4;
    @XmlElement(name = "MLOAR5")
    protected String mloar5;
    @XmlElement(name = "MLOAR6")
    protected String mloar6;
    @XmlElement(name = "MLOAR7")
    protected String mloar7;
    @XmlElement(name = "MLOAR8")
    protected String mloar8;
    @XmlElement(name = "MLOAR9")
    protected String mloar9;
    @XmlElement(name = "MLOARA")
    protected String mloara;
    @XmlElement(name = "RSMLG1")
    protected String rsmlg1;
    @XmlElement(name = "RSMLG2")
    protected String rsmlg2;
    @XmlElement(name = "RSMLG3")
    protected String rsmlg3;
    @XmlElement(name = "ESMLG1")
    protected String esmlg1;
    @XmlElement(name = "ESMLG2")
    protected String esmlg2;
    @XmlElement(name = "ESMLG3")
    protected String esmlg3;
    @XmlElement(name = "PPDG1")
    protected String ppdg1;
    @XmlElement(name = "PPDG2")
    protected String ppdg2;
    @XmlElement(name = "PPDG3")
    protected String ppdg3;
    @XmlElement(name = "PPDG4")
    protected String ppdg4;
    @XmlElement(name = "PPDG5")
    protected String ppdg5;
    @XmlElement(name = "PPDG6")
    protected String ppdg6;
    @XmlElement(name = "PPDG7")
    protected String ppdg7;
    @XmlElement(name = "PPDG8")
    protected String ppdg8;
    @XmlElement(name = "PPDG9")
    protected String ppdg9;
    @XmlElement(name = "PPDGA")
    protected String ppdga;
    @XmlElement(name = "PPDGB")
    protected String ppdgb;
    @XmlElement(name = "PPDGC")
    protected String ppdgc;
    @XmlElement(name = "PPDGE")
    protected String ppdge;
    @XmlElement(name = "PPDGF")
    protected String ppdgf;
    @XmlElement(name = "PPDGG")
    protected String ppdgg;
    @XmlElement(name = "LFDNR")
    protected String lfdnr;
    @XmlElement(name = "SUBPOS_NR")
    protected String subposnr;
    @XmlElement(name = "DG_NET_WEIGHT")
    protected String dgnetweight;
    @XmlElement(name = "DG_GROSS_WEIGHT")
    protected String dggrossweight;
    @XmlElement(name = "DG_WEIGHT_U")
    protected String dgweightu;
    @XmlElement(name = "E1EDD11")
    protected DELVRY03E1EDD11 e1EDD11;
    @XmlElement(name = "E1EDD15")
    protected DELVRY03E1EDD15 e1EDD15;
    @XmlElement(name = "E1EDD12")
    protected List<DELVRY03E1EDD12> e1EDD12;
    @XmlElement(name = "E1EDD13")
    protected List<DELVRY03E1EDD13> e1EDD13;
    @XmlElement(name = "E1EDDH3")
    protected List<DELVRY03E1EDDH3> e1EDDH3;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad mot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOT() {
        return mot;
    }

    /**
     * Define el valor de la propiedad mot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOT(String value) {
        this.mot = value;
    }

    /**
     * Obtiene el valor de la propiedad valdat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALDAT() {
        return valdat;
    }

    /**
     * Define el valor de la propiedad valdat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALDAT(String value) {
        this.valdat = value;
    }

    /**
     * Obtiene el valor de la propiedad dgcao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGCAO() {
        return dgcao;
    }

    /**
     * Define el valor de la propiedad dgcao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGCAO(String value) {
        this.dgcao = value;
    }

    /**
     * Obtiene el valor de la propiedad dgnhm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGNHM() {
        return dgnhm;
    }

    /**
     * Define el valor de la propiedad dgnhm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGNHM(String value) {
        this.dgnhm = value;
    }

    /**
     * Obtiene el valor de la propiedad tkui.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTKUI() {
        return tkui;
    }

    /**
     * Define el valor de la propiedad tkui.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTKUI(String value) {
        this.tkui = value;
    }

    /**
     * Obtiene el valor de la propiedad dgnu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGNU() {
        return dgnu;
    }

    /**
     * Define el valor de la propiedad dgnu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGNU(String value) {
        this.dgnu = value;
    }

    /**
     * Obtiene el valor de la propiedad colno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLNO() {
        return colno;
    }

    /**
     * Define el valor de la propiedad colno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLNO(String value) {
        this.colno = value;
    }

    /**
     * Obtiene el valor de la propiedad dgres1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGRES1() {
        return dgres1;
    }

    /**
     * Define el valor de la propiedad dgres1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGRES1(String value) {
        this.dgres1 = value;
    }

    /**
     * Obtiene el valor de la propiedad dgres2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGRES2() {
        return dgres2;
    }

    /**
     * Define el valor de la propiedad dgres2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGRES2(String value) {
        this.dgres2 = value;
    }

    /**
     * Obtiene el valor de la propiedad dgres3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGRES3() {
        return dgres3;
    }

    /**
     * Define el valor de la propiedad dgres3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGRES3(String value) {
        this.dgres3 = value;
    }

    /**
     * Obtiene el valor de la propiedad dgremp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGREMP() {
        return dgremp;
    }

    /**
     * Define el valor de la propiedad dgremp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGREMP(String value) {
        this.dgremp = value;
    }

    /**
     * Obtiene el valor de la propiedad dgrerq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGRERQ() {
        return dgrerq;
    }

    /**
     * Define el valor de la propiedad dgrerq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGRERQ(String value) {
        this.dgrerq = value;
    }

    /**
     * Obtiene el valor de la propiedad dgcl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGCL() {
        return dgcl;
    }

    /**
     * Define el valor de la propiedad dgcl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGCL(String value) {
        this.dgcl = value;
    }

    /**
     * Obtiene el valor de la propiedad dgsc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGSC() {
        return dgsc;
    }

    /**
     * Define el valor de la propiedad dgsc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGSC(String value) {
        this.dgsc = value;
    }

    /**
     * Obtiene el valor de la propiedad sdbc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDBC() {
        return sdbc;
    }

    /**
     * Define el valor de la propiedad sdbc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDBC(String value) {
        this.sdbc = value;
    }

    /**
     * Obtiene el valor de la propiedad slbe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLBE() {
        return slbe;
    }

    /**
     * Define el valor de la propiedad slbe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLBE(String value) {
        this.slbe = value;
    }

    /**
     * Obtiene el valor de la propiedad ldbc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLDBC() {
        return ldbc;
    }

    /**
     * Define el valor de la propiedad ldbc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLDBC(String value) {
        this.ldbc = value;
    }

    /**
     * Obtiene el valor de la propiedad lwdg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLWDG() {
        return lwdg;
    }

    /**
     * Define el valor de la propiedad lwdg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLWDG(String value) {
        this.lwdg = value;
    }

    /**
     * Obtiene el valor de la propiedad einu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEINU() {
        return einu;
    }

    /**
     * Define el valor de la propiedad einu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEINU(String value) {
        this.einu = value;
    }

    /**
     * Obtiene el valor de la propiedad eicn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEICN() {
        return eicn;
    }

    /**
     * Define el valor de la propiedad eicn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEICN(String value) {
        this.eicn = value;
    }

    /**
     * Obtiene el valor de la propiedad emsn1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMSN1() {
        return emsn1;
    }

    /**
     * Define el valor de la propiedad emsn1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMSN1(String value) {
        this.emsn1 = value;
    }

    /**
     * Obtiene el valor de la propiedad emsn2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMSN2() {
        return emsn2;
    }

    /**
     * Define el valor de la propiedad emsn2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMSN2(String value) {
        this.emsn2 = value;
    }

    /**
     * Obtiene el valor de la propiedad mfag1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFAG1() {
        return mfag1;
    }

    /**
     * Define el valor de la propiedad mfag1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFAG1(String value) {
        this.mfag1 = value;
    }

    /**
     * Obtiene el valor de la propiedad mfag2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFAG2() {
        return mfag2;
    }

    /**
     * Define el valor de la propiedad mfag2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFAG2(String value) {
        this.mfag2 = value;
    }

    /**
     * Obtiene el valor de la propiedad hqtu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHQTU() {
        return hqtu;
    }

    /**
     * Define el valor de la propiedad hqtu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHQTU(String value) {
        this.hqtu = value;
    }

    /**
     * Obtiene el valor de la propiedad hqtun.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHQTUN() {
        return hqtun;
    }

    /**
     * Define el valor de la propiedad hqtun.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHQTUN(String value) {
        this.hqtun = value;
    }

    /**
     * Obtiene el valor de la propiedad pin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * Define el valor de la propiedad pin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

    /**
     * Obtiene el valor de la propiedad pinlq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINLQ() {
        return pinlq;
    }

    /**
     * Define el valor de la propiedad pinlq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINLQ(String value) {
        this.pinlq = value;
    }

    /**
     * Obtiene el valor de la propiedad pgro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPGRO() {
        return pgro;
    }

    /**
     * Define el valor de la propiedad pgro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPGRO(String value) {
        this.pgro = value;
    }

    /**
     * Obtiene el valor de la propiedad hnu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHNU() {
        return hnu;
    }

    /**
     * Define el valor de la propiedad hnu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHNU(String value) {
        this.hnu = value;
    }

    /**
     * Obtiene el valor de la propiedad hpn1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPN1() {
        return hpn1;
    }

    /**
     * Define el valor de la propiedad hpn1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPN1(String value) {
        this.hpn1 = value;
    }

    /**
     * Obtiene el valor de la propiedad hpn2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPN2() {
        return hpn2;
    }

    /**
     * Define el valor de la propiedad hpn2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPN2(String value) {
        this.hpn2 = value;
    }

    /**
     * Obtiene el valor de la propiedad hpn3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPN3() {
        return hpn3;
    }

    /**
     * Define el valor de la propiedad hpn3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPN3(String value) {
        this.hpn3 = value;
    }

    /**
     * Obtiene el valor de la propiedad hpn4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPN4() {
        return hpn4;
    }

    /**
     * Define el valor de la propiedad hpn4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPN4(String value) {
        this.hpn4 = value;
    }

    /**
     * Obtiene el valor de la propiedad hpn5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPN5() {
        return hpn5;
    }

    /**
     * Define el valor de la propiedad hpn5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPN5(String value) {
        this.hpn5 = value;
    }

    /**
     * Obtiene el valor de la propiedad hpn6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPN6() {
        return hpn6;
    }

    /**
     * Define el valor de la propiedad hpn6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPN6(String value) {
        this.hpn6 = value;
    }

    /**
     * Obtiene el valor de la propiedad hpn7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPN7() {
        return hpn7;
    }

    /**
     * Define el valor de la propiedad hpn7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPN7(String value) {
        this.hpn7 = value;
    }

    /**
     * Obtiene el valor de la propiedad lab1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAB1() {
        return lab1;
    }

    /**
     * Define el valor de la propiedad lab1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAB1(String value) {
        this.lab1 = value;
    }

    /**
     * Obtiene el valor de la propiedad lab2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAB2() {
        return lab2;
    }

    /**
     * Define el valor de la propiedad lab2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAB2(String value) {
        this.lab2 = value;
    }

    /**
     * Obtiene el valor de la propiedad lab3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAB3() {
        return lab3;
    }

    /**
     * Define el valor de la propiedad lab3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAB3(String value) {
        this.lab3 = value;
    }

    /**
     * Obtiene el valor de la propiedad lab4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAB4() {
        return lab4;
    }

    /**
     * Define el valor de la propiedad lab4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAB4(String value) {
        this.lab4 = value;
    }

    /**
     * Obtiene el valor de la propiedad lab5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAB5() {
        return lab5;
    }

    /**
     * Define el valor de la propiedad lab5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAB5(String value) {
        this.lab5 = value;
    }

    /**
     * Obtiene el valor de la propiedad lab6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAB6() {
        return lab6;
    }

    /**
     * Define el valor de la propiedad lab6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAB6(String value) {
        this.lab6 = value;
    }

    /**
     * Obtiene el valor de la propiedad lab7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAB7() {
        return lab7;
    }

    /**
     * Define el valor de la propiedad lab7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAB7(String value) {
        this.lab7 = value;
    }

    /**
     * Obtiene el valor de la propiedad lab8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAB8() {
        return lab8;
    }

    /**
     * Define el valor de la propiedad lab8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAB8(String value) {
        this.lab8 = value;
    }

    /**
     * Obtiene el valor de la propiedad lab9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAB9() {
        return lab9;
    }

    /**
     * Define el valor de la propiedad lab9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAB9(String value) {
        this.lab9 = value;
    }

    /**
     * Obtiene el valor de la propiedad lab10.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAB10() {
        return lab10;
    }

    /**
     * Define el valor de la propiedad lab10.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAB10(String value) {
        this.lab10 = value;
    }

    /**
     * Obtiene el valor de la propiedad pbi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPBI() {
        return pbi;
    }

    /**
     * Define el valor de la propiedad pbi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPBI(String value) {
        this.pbi = value;
    }

    /**
     * Obtiene el valor de la propiedad dgpta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGPTA() {
        return dgpta;
    }

    /**
     * Define el valor de la propiedad dgpta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGPTA(String value) {
        this.dgpta = value;
    }

    /**
     * Obtiene el valor de la propiedad nhme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNHME() {
        return nhme;
    }

    /**
     * Define el valor de la propiedad nhme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNHME(String value) {
        this.nhme = value;
    }

    /**
     * Obtiene el valor de la propiedad dgshe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGSHE() {
        return dgshe;
    }

    /**
     * Define el valor de la propiedad dgshe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGSHE(String value) {
        this.dgshe = value;
    }

    /**
     * Obtiene el valor de la propiedad pimdg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIMDG() {
        return pimdg;
    }

    /**
     * Define el valor de la propiedad pimdg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIMDG(String value) {
        this.pimdg = value;
    }

    /**
     * Obtiene el valor de la propiedad sppro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPPRO() {
        return sppro;
    }

    /**
     * Define el valor de la propiedad sppro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPPRO(String value) {
        this.sppro = value;
    }

    /**
     * Obtiene el valor de la propiedad mapol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAPOL() {
        return mapol;
    }

    /**
     * Define el valor de la propiedad mapol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAPOL(String value) {
        this.mapol = value;
    }

    /**
     * Obtiene el valor de la propiedad excep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXCEP() {
        return excep;
    }

    /**
     * Define el valor de la propiedad excep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXCEP(String value) {
        this.excep = value;
    }

    /**
     * Obtiene el valor de la propiedad agrno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRNO() {
        return agrno;
    }

    /**
     * Define el valor de la propiedad agrno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRNO(String value) {
        this.agrno = value;
    }

    /**
     * Obtiene el valor de la propiedad regno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGNO() {
        return regno;
    }

    /**
     * Define el valor de la propiedad regno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGNO(String value) {
        this.regno = value;
    }

    /**
     * Obtiene el valor de la propiedad sdgcl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDGCL() {
        return sdgcl;
    }

    /**
     * Define el valor de la propiedad sdgcl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDGCL(String value) {
        this.sdgcl = value;
    }

    /**
     * Obtiene el valor de la propiedad tdgcl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDGCL() {
        return tdgcl;
    }

    /**
     * Define el valor de la propiedad tdgcl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDGCL(String value) {
        this.tdgcl = value;
    }

    /**
     * Obtiene el valor de la propiedad lwdgn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLWDGN() {
        return lwdgn;
    }

    /**
     * Define el valor de la propiedad lwdgn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLWDGN(String value) {
        this.lwdgn = value;
    }

    /**
     * Obtiene el valor de la propiedad rvlid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRVLID() {
        return rvlid;
    }

    /**
     * Define el valor de la propiedad rvlid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRVLID(String value) {
        this.rvlid = value;
    }

    /**
     * Obtiene el valor de la propiedad mos1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOS1() {
        return mos1;
    }

    /**
     * Define el valor de la propiedad mos1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOS1(String value) {
        this.mos1 = value;
    }

    /**
     * Obtiene el valor de la propiedad mos2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOS2() {
        return mos2;
    }

    /**
     * Define el valor de la propiedad mos2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOS2(String value) {
        this.mos2 = value;
    }

    /**
     * Obtiene el valor de la propiedad mos3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOS3() {
        return mos3;
    }

    /**
     * Define el valor de la propiedad mos3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOS3(String value) {
        this.mos3 = value;
    }

    /**
     * Obtiene el valor de la propiedad mos4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOS4() {
        return mos4;
    }

    /**
     * Define el valor de la propiedad mos4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOS4(String value) {
        this.mos4 = value;
    }

    /**
     * Obtiene el valor de la propiedad mos5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOS5() {
        return mos5;
    }

    /**
     * Define el valor de la propiedad mos5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOS5(String value) {
        this.mos5 = value;
    }

    /**
     * Obtiene el valor de la propiedad mos6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOS6() {
        return mos6;
    }

    /**
     * Define el valor de la propiedad mos6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOS6(String value) {
        this.mos6 = value;
    }

    /**
     * Obtiene el valor de la propiedad mos7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOS7() {
        return mos7;
    }

    /**
     * Define el valor de la propiedad mos7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOS7(String value) {
        this.mos7 = value;
    }

    /**
     * Obtiene el valor de la propiedad mos8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOS8() {
        return mos8;
    }

    /**
     * Define el valor de la propiedad mos8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOS8(String value) {
        this.mos8 = value;
    }

    /**
     * Obtiene el valor de la propiedad mos9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOS9() {
        return mos9;
    }

    /**
     * Define el valor de la propiedad mos9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOS9(String value) {
        this.mos9 = value;
    }

    /**
     * Obtiene el valor de la propiedad mosa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOSA() {
        return mosa;
    }

    /**
     * Define el valor de la propiedad mosa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOSA(String value) {
        this.mosa = value;
    }

    /**
     * Obtiene el valor de la propiedad dgtna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGTNA() {
        return dgtna;
    }

    /**
     * Define el valor de la propiedad dgtna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGTNA(String value) {
        this.dgtna = value;
    }

    /**
     * Obtiene el valor de la propiedad dgwos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGWOS() {
        return dgwos;
    }

    /**
     * Define el valor de la propiedad dgwos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGWOS(String value) {
        this.dgwos = value;
    }

    /**
     * Obtiene el valor de la propiedad scase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCASE() {
        return scase;
    }

    /**
     * Define el valor de la propiedad scase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCASE(String value) {
        this.scase = value;
    }

    /**
     * Obtiene el valor de la propiedad eimdg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIMDG() {
        return eimdg;
    }

    /**
     * Define el valor de la propiedad eimdg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIMDG(String value) {
        this.eimdg = value;
    }

    /**
     * Obtiene el valor de la propiedad msepr1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSEPR1() {
        return msepr1;
    }

    /**
     * Define el valor de la propiedad msepr1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSEPR1(String value) {
        this.msepr1 = value;
    }

    /**
     * Obtiene el valor de la propiedad msepr2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSEPR2() {
        return msepr2;
    }

    /**
     * Define el valor de la propiedad msepr2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSEPR2(String value) {
        this.msepr2 = value;
    }

    /**
     * Obtiene el valor de la propiedad msepr3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSEPR3() {
        return msepr3;
    }

    /**
     * Define el valor de la propiedad msepr3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSEPR3(String value) {
        this.msepr3 = value;
    }

    /**
     * Obtiene el valor de la propiedad msepr4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSEPR4() {
        return msepr4;
    }

    /**
     * Define el valor de la propiedad msepr4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSEPR4(String value) {
        this.msepr4 = value;
    }

    /**
     * Obtiene el valor de la propiedad msepr5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSEPR5() {
        return msepr5;
    }

    /**
     * Define el valor de la propiedad msepr5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSEPR5(String value) {
        this.msepr5 = value;
    }

    /**
     * Obtiene el valor de la propiedad msepr6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSEPR6() {
        return msepr6;
    }

    /**
     * Define el valor de la propiedad msepr6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSEPR6(String value) {
        this.msepr6 = value;
    }

    /**
     * Obtiene el valor de la propiedad msepr7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSEPR7() {
        return msepr7;
    }

    /**
     * Define el valor de la propiedad msepr7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSEPR7(String value) {
        this.msepr7 = value;
    }

    /**
     * Obtiene el valor de la propiedad msepr8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSEPR8() {
        return msepr8;
    }

    /**
     * Define el valor de la propiedad msepr8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSEPR8(String value) {
        this.msepr8 = value;
    }

    /**
     * Obtiene el valor de la propiedad msepr9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSEPR9() {
        return msepr9;
    }

    /**
     * Define el valor de la propiedad msepr9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSEPR9(String value) {
        this.msepr9 = value;
    }

    /**
     * Obtiene el valor de la propiedad msepra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSEPRA() {
        return msepra;
    }

    /**
     * Define el valor de la propiedad msepra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSEPRA(String value) {
        this.msepra = value;
    }

    /**
     * Obtiene el valor de la propiedad mseprb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSEPRB() {
        return mseprb;
    }

    /**
     * Define el valor de la propiedad mseprb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSEPRB(String value) {
        this.mseprb = value;
    }

    /**
     * Obtiene el valor de la propiedad mseprc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSEPRC() {
        return mseprc;
    }

    /**
     * Define el valor de la propiedad mseprc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSEPRC(String value) {
        this.mseprc = value;
    }

    /**
     * Obtiene el valor de la propiedad mseprd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSEPRD() {
        return mseprd;
    }

    /**
     * Define el valor de la propiedad mseprd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSEPRD(String value) {
        this.mseprd = value;
    }

    /**
     * Obtiene el valor de la propiedad msepre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSEPRE() {
        return msepre;
    }

    /**
     * Define el valor de la propiedad msepre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSEPRE(String value) {
        this.msepre = value;
    }

    /**
     * Obtiene el valor de la propiedad mseprf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSEPRF() {
        return mseprf;
    }

    /**
     * Define el valor de la propiedad mseprf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSEPRF(String value) {
        this.mseprf = value;
    }

    /**
     * Obtiene el valor de la propiedad mseprg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSEPRG() {
        return mseprg;
    }

    /**
     * Define el valor de la propiedad mseprg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSEPRG(String value) {
        this.mseprg = value;
    }

    /**
     * Obtiene el valor de la propiedad mseprh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSEPRH() {
        return mseprh;
    }

    /**
     * Define el valor de la propiedad mseprh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSEPRH(String value) {
        this.mseprh = value;
    }

    /**
     * Obtiene el valor de la propiedad mloar1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMLOAR1() {
        return mloar1;
    }

    /**
     * Define el valor de la propiedad mloar1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMLOAR1(String value) {
        this.mloar1 = value;
    }

    /**
     * Obtiene el valor de la propiedad mloar2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMLOAR2() {
        return mloar2;
    }

    /**
     * Define el valor de la propiedad mloar2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMLOAR2(String value) {
        this.mloar2 = value;
    }

    /**
     * Obtiene el valor de la propiedad mloar3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMLOAR3() {
        return mloar3;
    }

    /**
     * Define el valor de la propiedad mloar3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMLOAR3(String value) {
        this.mloar3 = value;
    }

    /**
     * Obtiene el valor de la propiedad mloar4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMLOAR4() {
        return mloar4;
    }

    /**
     * Define el valor de la propiedad mloar4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMLOAR4(String value) {
        this.mloar4 = value;
    }

    /**
     * Obtiene el valor de la propiedad mloar5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMLOAR5() {
        return mloar5;
    }

    /**
     * Define el valor de la propiedad mloar5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMLOAR5(String value) {
        this.mloar5 = value;
    }

    /**
     * Obtiene el valor de la propiedad mloar6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMLOAR6() {
        return mloar6;
    }

    /**
     * Define el valor de la propiedad mloar6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMLOAR6(String value) {
        this.mloar6 = value;
    }

    /**
     * Obtiene el valor de la propiedad mloar7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMLOAR7() {
        return mloar7;
    }

    /**
     * Define el valor de la propiedad mloar7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMLOAR7(String value) {
        this.mloar7 = value;
    }

    /**
     * Obtiene el valor de la propiedad mloar8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMLOAR8() {
        return mloar8;
    }

    /**
     * Define el valor de la propiedad mloar8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMLOAR8(String value) {
        this.mloar8 = value;
    }

    /**
     * Obtiene el valor de la propiedad mloar9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMLOAR9() {
        return mloar9;
    }

    /**
     * Define el valor de la propiedad mloar9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMLOAR9(String value) {
        this.mloar9 = value;
    }

    /**
     * Obtiene el valor de la propiedad mloara.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMLOARA() {
        return mloara;
    }

    /**
     * Define el valor de la propiedad mloara.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMLOARA(String value) {
        this.mloara = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmlg1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSMLG1() {
        return rsmlg1;
    }

    /**
     * Define el valor de la propiedad rsmlg1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSMLG1(String value) {
        this.rsmlg1 = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmlg2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSMLG2() {
        return rsmlg2;
    }

    /**
     * Define el valor de la propiedad rsmlg2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSMLG2(String value) {
        this.rsmlg2 = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmlg3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSMLG3() {
        return rsmlg3;
    }

    /**
     * Define el valor de la propiedad rsmlg3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSMLG3(String value) {
        this.rsmlg3 = value;
    }

    /**
     * Obtiene el valor de la propiedad esmlg1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESMLG1() {
        return esmlg1;
    }

    /**
     * Define el valor de la propiedad esmlg1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESMLG1(String value) {
        this.esmlg1 = value;
    }

    /**
     * Obtiene el valor de la propiedad esmlg2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESMLG2() {
        return esmlg2;
    }

    /**
     * Define el valor de la propiedad esmlg2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESMLG2(String value) {
        this.esmlg2 = value;
    }

    /**
     * Obtiene el valor de la propiedad esmlg3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESMLG3() {
        return esmlg3;
    }

    /**
     * Define el valor de la propiedad esmlg3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESMLG3(String value) {
        this.esmlg3 = value;
    }

    /**
     * Obtiene el valor de la propiedad ppdg1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPDG1() {
        return ppdg1;
    }

    /**
     * Define el valor de la propiedad ppdg1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPDG1(String value) {
        this.ppdg1 = value;
    }

    /**
     * Obtiene el valor de la propiedad ppdg2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPDG2() {
        return ppdg2;
    }

    /**
     * Define el valor de la propiedad ppdg2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPDG2(String value) {
        this.ppdg2 = value;
    }

    /**
     * Obtiene el valor de la propiedad ppdg3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPDG3() {
        return ppdg3;
    }

    /**
     * Define el valor de la propiedad ppdg3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPDG3(String value) {
        this.ppdg3 = value;
    }

    /**
     * Obtiene el valor de la propiedad ppdg4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPDG4() {
        return ppdg4;
    }

    /**
     * Define el valor de la propiedad ppdg4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPDG4(String value) {
        this.ppdg4 = value;
    }

    /**
     * Obtiene el valor de la propiedad ppdg5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPDG5() {
        return ppdg5;
    }

    /**
     * Define el valor de la propiedad ppdg5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPDG5(String value) {
        this.ppdg5 = value;
    }

    /**
     * Obtiene el valor de la propiedad ppdg6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPDG6() {
        return ppdg6;
    }

    /**
     * Define el valor de la propiedad ppdg6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPDG6(String value) {
        this.ppdg6 = value;
    }

    /**
     * Obtiene el valor de la propiedad ppdg7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPDG7() {
        return ppdg7;
    }

    /**
     * Define el valor de la propiedad ppdg7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPDG7(String value) {
        this.ppdg7 = value;
    }

    /**
     * Obtiene el valor de la propiedad ppdg8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPDG8() {
        return ppdg8;
    }

    /**
     * Define el valor de la propiedad ppdg8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPDG8(String value) {
        this.ppdg8 = value;
    }

    /**
     * Obtiene el valor de la propiedad ppdg9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPDG9() {
        return ppdg9;
    }

    /**
     * Define el valor de la propiedad ppdg9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPDG9(String value) {
        this.ppdg9 = value;
    }

    /**
     * Obtiene el valor de la propiedad ppdga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPDGA() {
        return ppdga;
    }

    /**
     * Define el valor de la propiedad ppdga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPDGA(String value) {
        this.ppdga = value;
    }

    /**
     * Obtiene el valor de la propiedad ppdgb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPDGB() {
        return ppdgb;
    }

    /**
     * Define el valor de la propiedad ppdgb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPDGB(String value) {
        this.ppdgb = value;
    }

    /**
     * Obtiene el valor de la propiedad ppdgc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPDGC() {
        return ppdgc;
    }

    /**
     * Define el valor de la propiedad ppdgc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPDGC(String value) {
        this.ppdgc = value;
    }

    /**
     * Obtiene el valor de la propiedad ppdge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPDGE() {
        return ppdge;
    }

    /**
     * Define el valor de la propiedad ppdge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPDGE(String value) {
        this.ppdge = value;
    }

    /**
     * Obtiene el valor de la propiedad ppdgf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPDGF() {
        return ppdgf;
    }

    /**
     * Define el valor de la propiedad ppdgf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPDGF(String value) {
        this.ppdgf = value;
    }

    /**
     * Obtiene el valor de la propiedad ppdgg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPDGG() {
        return ppdgg;
    }

    /**
     * Define el valor de la propiedad ppdgg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPDGG(String value) {
        this.ppdgg = value;
    }

    /**
     * Obtiene el valor de la propiedad lfdnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLFDNR() {
        return lfdnr;
    }

    /**
     * Define el valor de la propiedad lfdnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLFDNR(String value) {
        this.lfdnr = value;
    }

    /**
     * Obtiene el valor de la propiedad subposnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBPOSNR() {
        return subposnr;
    }

    /**
     * Define el valor de la propiedad subposnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBPOSNR(String value) {
        this.subposnr = value;
    }

    /**
     * Obtiene el valor de la propiedad dgnetweight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGNETWEIGHT() {
        return dgnetweight;
    }

    /**
     * Define el valor de la propiedad dgnetweight.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGNETWEIGHT(String value) {
        this.dgnetweight = value;
    }

    /**
     * Obtiene el valor de la propiedad dggrossweight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGGROSSWEIGHT() {
        return dggrossweight;
    }

    /**
     * Define el valor de la propiedad dggrossweight.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGGROSSWEIGHT(String value) {
        this.dggrossweight = value;
    }

    /**
     * Obtiene el valor de la propiedad dgweightu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGWEIGHTU() {
        return dgweightu;
    }

    /**
     * Define el valor de la propiedad dgweightu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGWEIGHTU(String value) {
        this.dgweightu = value;
    }

    /**
     * Obtiene el valor de la propiedad e1EDD11.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDD11 }
     *     
     */
    public DELVRY03E1EDD11 getE1EDD11() {
        return e1EDD11;
    }

    /**
     * Define el valor de la propiedad e1EDD11.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDD11 }
     *     
     */
    public void setE1EDD11(DELVRY03E1EDD11 value) {
        this.e1EDD11 = value;
    }

    /**
     * Obtiene el valor de la propiedad e1EDD15.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDD15 }
     *     
     */
    public DELVRY03E1EDD15 getE1EDD15() {
        return e1EDD15;
    }

    /**
     * Define el valor de la propiedad e1EDD15.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDD15 }
     *     
     */
    public void setE1EDD15(DELVRY03E1EDD15 value) {
        this.e1EDD15 = value;
    }

    /**
     * Gets the value of the e1EDD12 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDD12 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDD12().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDD12 }
     * 
     * 
     */
    public List<DELVRY03E1EDD12> getE1EDD12() {
        if (e1EDD12 == null) {
            e1EDD12 = new ArrayList<DELVRY03E1EDD12>();
        }
        return this.e1EDD12;
    }

    /**
     * Gets the value of the e1EDD13 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDD13 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDD13().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDD13 }
     * 
     * 
     */
    public List<DELVRY03E1EDD13> getE1EDD13() {
        if (e1EDD13 == null) {
            e1EDD13 = new ArrayList<DELVRY03E1EDD13>();
        }
        return this.e1EDD13;
    }

    /**
     * Gets the value of the e1EDDH3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDDH3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDDH3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDDH3 }
     * 
     * 
     */
    public List<DELVRY03E1EDDH3> getE1EDDH3() {
        if (e1EDDH3 == null) {
            e1EDDH3 = new ArrayList<DELVRY03E1EDDH3>();
        }
        return this.e1EDDH3;
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
