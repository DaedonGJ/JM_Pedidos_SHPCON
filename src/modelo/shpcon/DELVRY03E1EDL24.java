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
 * Delivery Item
 * 
 * <p>Clase Java para DELVRY03.E1EDL24 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL24">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POSNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="18"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATWA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="18"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ARKTX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ORKTX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SUGRD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SUDRU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATKL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WERKS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LGORT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CHARG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KDMAT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="22"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LFIMG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VRKME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LGMNG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MEINS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NTGEW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BRGEW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GEWEI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VOLUM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VOLEH" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LGPBE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HIPOS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HIEVW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LADGR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TRAGR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VKBUR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VKGRP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VTWEG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SPART" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GRKOR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EAN11" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="18"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SERNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AESKD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EMPST" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MFRGR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VBRST" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LABNK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ABRDT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MFRPN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MFRNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ABRVW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KDMAT35" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KANNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POSEX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LIEFFZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="USR01" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="USR02" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="USR03" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="USR04" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="USR05" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATNR_EXTERNAL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATNR_VERSION" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATNR_GUID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATWA_EXTERNAL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATWA_VERSION" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATWA_GUID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZUDAT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VFDAT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RMA_NUMBER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RMA_COMPLETE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXPIRY_DATE_EXT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VGBEL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VGPOS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FOLLOW_UP_CODE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ORMNG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COMPL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HOLD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MAX_ERR_TYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LICHN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RECIPIENT_CREATE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXPIRY_DATE_EXT_B" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E1EDL25" type="{}DELVRY03.E1EDL25" minOccurs="0"/>
 *         &lt;element name="E1EDL26" type="{}DELVRY03.E1EDL26" minOccurs="0"/>
 *         &lt;element name="E1EDL52" type="{}DELVRY03.E1EDL52" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="E1EDL53" type="{}DELVRY03.E1EDL53" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="E1EDD10" type="{}DELVRY03.E1EDD10" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="E1EDD14" type="{}DELVRY03.E1EDD14" minOccurs="0"/>
 *         &lt;element name="E1EDL19" type="{}DELVRY03.E1EDL19" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="E1EDL11" type="{}DELVRY03.E1EDL11" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="E1EDL15" type="{}DELVRY03.E1EDL15" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="E1EDL35" type="{}DELVRY03.E1EDL35" minOccurs="0"/>
 *         &lt;element name="E1EDL43" type="{}DELVRY03.E1EDL43" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="E1EDL41" type="{}DELVRY03.E1EDL41" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="E1TXTH9" type="{}DELVRY03.E1TXTH9" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="E1EDL12" type="{}DELVRY03.E1EDL12" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DELVRY03.E1EDL24", propOrder = {
    "posnr",
    "matnr",
    "matwa",
    "arktx",
    "orktx",
    "sugrd",
    "sudru",
    "matkl",
    "werks",
    "lgort",
    "charg",
    "kdmat",
    "lfimg",
    "vrkme",
    "lgmng",
    "meins",
    "ntgew",
    "brgew",
    "gewei",
    "volum",
    "voleh",
    "lgpbe",
    "hipos",
    "hievw",
    "ladgr",
    "tragr",
    "vkbur",
    "vkgrp",
    "vtweg",
    "spart",
    "grkor",
    "ean11",
    "sernr",
    "aeskd",
    "empst",
    "mfrgr",
    "vbrst",
    "labnk",
    "abrdt",
    "mfrpn",
    "mfrnr",
    "abrvw",
    "kdmat35",
    "kannr",
    "posex",
    "lieffz",
    "usr01",
    "usr02",
    "usr03",
    "usr04",
    "usr05",
    "matnrexternal",
    "matnrversion",
    "matnrguid",
    "matwaexternal",
    "matwaversion",
    "matwaguid",
    "zudat",
    "vfdat",
    "rmanumber",
    "rmacomplete",
    "expirydateext",
    "vgbel",
    "vgpos",
    "followupcode",
    "ormng",
    "compl",
    "hold",
    "maxerrtype",
    "lichn",
    "recipientcreate",
    "expirydateextb",
    "e1EDL25",
    "e1EDL26",
    "e1EDL52",
    "e1EDL53",
    "e1EDD10",
    "e1EDD14",
    "e1EDL19",
    "e1EDL11",
    "e1EDL15",
    "e1EDL35",
    "e1EDL43",
    "e1EDL41",
    "e1TXTH9",
    "e1EDL12"
})
public class DELVRY03E1EDL24 {

    @XmlElement(name = "POSNR")
    protected String posnr;
    @XmlElement(name = "MATNR")
    protected String matnr;
    @XmlElement(name = "MATWA")
    protected String matwa;
    @XmlElement(name = "ARKTX")
    protected String arktx;
    @XmlElement(name = "ORKTX")
    protected String orktx;
    @XmlElement(name = "SUGRD")
    protected String sugrd;
    @XmlElement(name = "SUDRU")
    protected String sudru;
    @XmlElement(name = "MATKL")
    protected String matkl;
    @XmlElement(name = "WERKS")
    protected String werks;
    @XmlElement(name = "LGORT")
    protected String lgort;
    @XmlElement(name = "CHARG")
    protected String charg;
    @XmlElement(name = "KDMAT")
    protected String kdmat;
    @XmlElement(name = "LFIMG")
    protected String lfimg;
    @XmlElement(name = "VRKME")
    protected String vrkme;
    @XmlElement(name = "LGMNG")
    protected String lgmng;
    @XmlElement(name = "MEINS")
    protected String meins;
    @XmlElement(name = "NTGEW")
    protected String ntgew;
    @XmlElement(name = "BRGEW")
    protected String brgew;
    @XmlElement(name = "GEWEI")
    protected String gewei;
    @XmlElement(name = "VOLUM")
    protected String volum;
    @XmlElement(name = "VOLEH")
    protected String voleh;
    @XmlElement(name = "LGPBE")
    protected String lgpbe;
    @XmlElement(name = "HIPOS")
    protected String hipos;
    @XmlElement(name = "HIEVW")
    protected String hievw;
    @XmlElement(name = "LADGR")
    protected String ladgr;
    @XmlElement(name = "TRAGR")
    protected String tragr;
    @XmlElement(name = "VKBUR")
    protected String vkbur;
    @XmlElement(name = "VKGRP")
    protected String vkgrp;
    @XmlElement(name = "VTWEG")
    protected String vtweg;
    @XmlElement(name = "SPART")
    protected String spart;
    @XmlElement(name = "GRKOR")
    protected String grkor;
    @XmlElement(name = "EAN11")
    protected String ean11;
    @XmlElement(name = "SERNR")
    protected String sernr;
    @XmlElement(name = "AESKD")
    protected String aeskd;
    @XmlElement(name = "EMPST")
    protected String empst;
    @XmlElement(name = "MFRGR")
    protected String mfrgr;
    @XmlElement(name = "VBRST")
    protected String vbrst;
    @XmlElement(name = "LABNK")
    protected String labnk;
    @XmlElement(name = "ABRDT")
    protected String abrdt;
    @XmlElement(name = "MFRPN")
    protected String mfrpn;
    @XmlElement(name = "MFRNR")
    protected String mfrnr;
    @XmlElement(name = "ABRVW")
    protected String abrvw;
    @XmlElement(name = "KDMAT35")
    protected String kdmat35;
    @XmlElement(name = "KANNR")
    protected String kannr;
    @XmlElement(name = "POSEX")
    protected String posex;
    @XmlElement(name = "LIEFFZ")
    protected String lieffz;
    @XmlElement(name = "USR01")
    protected String usr01;
    @XmlElement(name = "USR02")
    protected String usr02;
    @XmlElement(name = "USR03")
    protected String usr03;
    @XmlElement(name = "USR04")
    protected String usr04;
    @XmlElement(name = "USR05")
    protected String usr05;
    @XmlElement(name = "MATNR_EXTERNAL")
    protected String matnrexternal;
    @XmlElement(name = "MATNR_VERSION")
    protected String matnrversion;
    @XmlElement(name = "MATNR_GUID")
    protected String matnrguid;
    @XmlElement(name = "MATWA_EXTERNAL")
    protected String matwaexternal;
    @XmlElement(name = "MATWA_VERSION")
    protected String matwaversion;
    @XmlElement(name = "MATWA_GUID")
    protected String matwaguid;
    @XmlElement(name = "ZUDAT")
    protected String zudat;
    @XmlElement(name = "VFDAT")
    protected String vfdat;
    @XmlElement(name = "RMA_NUMBER")
    protected String rmanumber;
    @XmlElement(name = "RMA_COMPLETE")
    protected String rmacomplete;
    @XmlElement(name = "EXPIRY_DATE_EXT")
    protected String expirydateext;
    @XmlElement(name = "VGBEL")
    protected String vgbel;
    @XmlElement(name = "VGPOS")
    protected String vgpos;
    @XmlElement(name = "FOLLOW_UP_CODE")
    protected String followupcode;
    @XmlElement(name = "ORMNG")
    protected String ormng;
    @XmlElement(name = "COMPL")
    protected String compl;
    @XmlElement(name = "HOLD")
    protected String hold;
    @XmlElement(name = "MAX_ERR_TYPE")
    protected String maxerrtype;
    @XmlElement(name = "LICHN")
    protected String lichn;
    @XmlElement(name = "RECIPIENT_CREATE")
    protected String recipientcreate;
    @XmlElement(name = "EXPIRY_DATE_EXT_B")
    protected String expirydateextb;
    @XmlElement(name = "E1EDL25")
    protected DELVRY03E1EDL25 e1EDL25;
    @XmlElement(name = "E1EDL26")
    protected DELVRY03E1EDL26 e1EDL26;
    @XmlElement(name = "E1EDL52")
    protected List<DELVRY03E1EDL52> e1EDL52;
    @XmlElement(name = "E1EDL53")
    protected List<DELVRY03E1EDL53> e1EDL53;
    @XmlElement(name = "E1EDD10")
    protected List<DELVRY03E1EDD10> e1EDD10;
    @XmlElement(name = "E1EDD14")
    protected DELVRY03E1EDD14 e1EDD14;
    @XmlElement(name = "E1EDL19")
    protected List<DELVRY03E1EDL19> e1EDL19;
    @XmlElement(name = "E1EDL11")
    protected List<DELVRY03E1EDL11> e1EDL11;
    @XmlElement(name = "E1EDL15")
    protected List<DELVRY03E1EDL15> e1EDL15;
    @XmlElement(name = "E1EDL35")
    protected DELVRY03E1EDL35 e1EDL35;
    @XmlElement(name = "E1EDL43")
    protected List<DELVRY03E1EDL43> e1EDL43;
    @XmlElement(name = "E1EDL41")
    protected List<DELVRY03E1EDL41> e1EDL41;
    @XmlElement(name = "E1TXTH9")
    protected List<DELVRY03E1TXTH9> e1TXTH9;
    @XmlElement(name = "E1EDL12")
    protected List<DELVRY03E1EDL12> e1EDL12;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad posnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSNR() {
        return posnr;
    }

    /**
     * Define el valor de la propiedad posnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSNR(String value) {
        this.posnr = value;
    }

    /**
     * Obtiene el valor de la propiedad matnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATNR() {
        return matnr;
    }

    /**
     * Define el valor de la propiedad matnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATNR(String value) {
        this.matnr = value;
    }

    /**
     * Obtiene el valor de la propiedad matwa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATWA() {
        return matwa;
    }

    /**
     * Define el valor de la propiedad matwa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATWA(String value) {
        this.matwa = value;
    }

    /**
     * Obtiene el valor de la propiedad arktx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARKTX() {
        return arktx;
    }

    /**
     * Define el valor de la propiedad arktx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARKTX(String value) {
        this.arktx = value;
    }

    /**
     * Obtiene el valor de la propiedad orktx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORKTX() {
        return orktx;
    }

    /**
     * Define el valor de la propiedad orktx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORKTX(String value) {
        this.orktx = value;
    }

    /**
     * Obtiene el valor de la propiedad sugrd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUGRD() {
        return sugrd;
    }

    /**
     * Define el valor de la propiedad sugrd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUGRD(String value) {
        this.sugrd = value;
    }

    /**
     * Obtiene el valor de la propiedad sudru.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUDRU() {
        return sudru;
    }

    /**
     * Define el valor de la propiedad sudru.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUDRU(String value) {
        this.sudru = value;
    }

    /**
     * Obtiene el valor de la propiedad matkl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATKL() {
        return matkl;
    }

    /**
     * Define el valor de la propiedad matkl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATKL(String value) {
        this.matkl = value;
    }

    /**
     * Obtiene el valor de la propiedad werks.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWERKS() {
        return werks;
    }

    /**
     * Define el valor de la propiedad werks.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWERKS(String value) {
        this.werks = value;
    }

    /**
     * Obtiene el valor de la propiedad lgort.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGORT() {
        return lgort;
    }

    /**
     * Define el valor de la propiedad lgort.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGORT(String value) {
        this.lgort = value;
    }

    /**
     * Obtiene el valor de la propiedad charg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHARG() {
        return charg;
    }

    /**
     * Define el valor de la propiedad charg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHARG(String value) {
        this.charg = value;
    }

    /**
     * Obtiene el valor de la propiedad kdmat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDMAT() {
        return kdmat;
    }

    /**
     * Define el valor de la propiedad kdmat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDMAT(String value) {
        this.kdmat = value;
    }

    /**
     * Obtiene el valor de la propiedad lfimg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLFIMG() {
        return lfimg;
    }

    /**
     * Define el valor de la propiedad lfimg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLFIMG(String value) {
        this.lfimg = value;
    }

    /**
     * Obtiene el valor de la propiedad vrkme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVRKME() {
        return vrkme;
    }

    /**
     * Define el valor de la propiedad vrkme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVRKME(String value) {
        this.vrkme = value;
    }

    /**
     * Obtiene el valor de la propiedad lgmng.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGMNG() {
        return lgmng;
    }

    /**
     * Define el valor de la propiedad lgmng.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGMNG(String value) {
        this.lgmng = value;
    }

    /**
     * Obtiene el valor de la propiedad meins.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEINS() {
        return meins;
    }

    /**
     * Define el valor de la propiedad meins.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEINS(String value) {
        this.meins = value;
    }

    /**
     * Obtiene el valor de la propiedad ntgew.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTGEW() {
        return ntgew;
    }

    /**
     * Define el valor de la propiedad ntgew.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTGEW(String value) {
        this.ntgew = value;
    }

    /**
     * Obtiene el valor de la propiedad brgew.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRGEW() {
        return brgew;
    }

    /**
     * Define el valor de la propiedad brgew.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRGEW(String value) {
        this.brgew = value;
    }

    /**
     * Obtiene el valor de la propiedad gewei.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGEWEI() {
        return gewei;
    }

    /**
     * Define el valor de la propiedad gewei.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGEWEI(String value) {
        this.gewei = value;
    }

    /**
     * Obtiene el valor de la propiedad volum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOLUM() {
        return volum;
    }

    /**
     * Define el valor de la propiedad volum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOLUM(String value) {
        this.volum = value;
    }

    /**
     * Obtiene el valor de la propiedad voleh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOLEH() {
        return voleh;
    }

    /**
     * Define el valor de la propiedad voleh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOLEH(String value) {
        this.voleh = value;
    }

    /**
     * Obtiene el valor de la propiedad lgpbe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGPBE() {
        return lgpbe;
    }

    /**
     * Define el valor de la propiedad lgpbe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGPBE(String value) {
        this.lgpbe = value;
    }

    /**
     * Obtiene el valor de la propiedad hipos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHIPOS() {
        return hipos;
    }

    /**
     * Define el valor de la propiedad hipos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHIPOS(String value) {
        this.hipos = value;
    }

    /**
     * Obtiene el valor de la propiedad hievw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHIEVW() {
        return hievw;
    }

    /**
     * Define el valor de la propiedad hievw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHIEVW(String value) {
        this.hievw = value;
    }

    /**
     * Obtiene el valor de la propiedad ladgr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLADGR() {
        return ladgr;
    }

    /**
     * Define el valor de la propiedad ladgr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLADGR(String value) {
        this.ladgr = value;
    }

    /**
     * Obtiene el valor de la propiedad tragr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAGR() {
        return tragr;
    }

    /**
     * Define el valor de la propiedad tragr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAGR(String value) {
        this.tragr = value;
    }

    /**
     * Obtiene el valor de la propiedad vkbur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVKBUR() {
        return vkbur;
    }

    /**
     * Define el valor de la propiedad vkbur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVKBUR(String value) {
        this.vkbur = value;
    }

    /**
     * Obtiene el valor de la propiedad vkgrp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVKGRP() {
        return vkgrp;
    }

    /**
     * Define el valor de la propiedad vkgrp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVKGRP(String value) {
        this.vkgrp = value;
    }

    /**
     * Obtiene el valor de la propiedad vtweg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTWEG() {
        return vtweg;
    }

    /**
     * Define el valor de la propiedad vtweg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTWEG(String value) {
        this.vtweg = value;
    }

    /**
     * Obtiene el valor de la propiedad spart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPART() {
        return spart;
    }

    /**
     * Define el valor de la propiedad spart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPART(String value) {
        this.spart = value;
    }

    /**
     * Obtiene el valor de la propiedad grkor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRKOR() {
        return grkor;
    }

    /**
     * Define el valor de la propiedad grkor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRKOR(String value) {
        this.grkor = value;
    }

    /**
     * Obtiene el valor de la propiedad ean11.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAN11() {
        return ean11;
    }

    /**
     * Define el valor de la propiedad ean11.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAN11(String value) {
        this.ean11 = value;
    }

    /**
     * Obtiene el valor de la propiedad sernr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERNR() {
        return sernr;
    }

    /**
     * Define el valor de la propiedad sernr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERNR(String value) {
        this.sernr = value;
    }

    /**
     * Obtiene el valor de la propiedad aeskd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAESKD() {
        return aeskd;
    }

    /**
     * Define el valor de la propiedad aeskd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAESKD(String value) {
        this.aeskd = value;
    }

    /**
     * Obtiene el valor de la propiedad empst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPST() {
        return empst;
    }

    /**
     * Define el valor de la propiedad empst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPST(String value) {
        this.empst = value;
    }

    /**
     * Obtiene el valor de la propiedad mfrgr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFRGR() {
        return mfrgr;
    }

    /**
     * Define el valor de la propiedad mfrgr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFRGR(String value) {
        this.mfrgr = value;
    }

    /**
     * Obtiene el valor de la propiedad vbrst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVBRST() {
        return vbrst;
    }

    /**
     * Define el valor de la propiedad vbrst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVBRST(String value) {
        this.vbrst = value;
    }

    /**
     * Obtiene el valor de la propiedad labnk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABNK() {
        return labnk;
    }

    /**
     * Define el valor de la propiedad labnk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABNK(String value) {
        this.labnk = value;
    }

    /**
     * Obtiene el valor de la propiedad abrdt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABRDT() {
        return abrdt;
    }

    /**
     * Define el valor de la propiedad abrdt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABRDT(String value) {
        this.abrdt = value;
    }

    /**
     * Obtiene el valor de la propiedad mfrpn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFRPN() {
        return mfrpn;
    }

    /**
     * Define el valor de la propiedad mfrpn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFRPN(String value) {
        this.mfrpn = value;
    }

    /**
     * Obtiene el valor de la propiedad mfrnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFRNR() {
        return mfrnr;
    }

    /**
     * Define el valor de la propiedad mfrnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFRNR(String value) {
        this.mfrnr = value;
    }

    /**
     * Obtiene el valor de la propiedad abrvw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABRVW() {
        return abrvw;
    }

    /**
     * Define el valor de la propiedad abrvw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABRVW(String value) {
        this.abrvw = value;
    }

    /**
     * Obtiene el valor de la propiedad kdmat35.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDMAT35() {
        return kdmat35;
    }

    /**
     * Define el valor de la propiedad kdmat35.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDMAT35(String value) {
        this.kdmat35 = value;
    }

    /**
     * Obtiene el valor de la propiedad kannr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKANNR() {
        return kannr;
    }

    /**
     * Define el valor de la propiedad kannr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKANNR(String value) {
        this.kannr = value;
    }

    /**
     * Obtiene el valor de la propiedad posex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSEX() {
        return posex;
    }

    /**
     * Define el valor de la propiedad posex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSEX(String value) {
        this.posex = value;
    }

    /**
     * Obtiene el valor de la propiedad lieffz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIEFFZ() {
        return lieffz;
    }

    /**
     * Define el valor de la propiedad lieffz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIEFFZ(String value) {
        this.lieffz = value;
    }

    /**
     * Obtiene el valor de la propiedad usr01.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSR01() {
        return usr01;
    }

    /**
     * Define el valor de la propiedad usr01.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSR01(String value) {
        this.usr01 = value;
    }

    /**
     * Obtiene el valor de la propiedad usr02.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSR02() {
        return usr02;
    }

    /**
     * Define el valor de la propiedad usr02.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSR02(String value) {
        this.usr02 = value;
    }

    /**
     * Obtiene el valor de la propiedad usr03.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSR03() {
        return usr03;
    }

    /**
     * Define el valor de la propiedad usr03.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSR03(String value) {
        this.usr03 = value;
    }

    /**
     * Obtiene el valor de la propiedad usr04.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSR04() {
        return usr04;
    }

    /**
     * Define el valor de la propiedad usr04.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSR04(String value) {
        this.usr04 = value;
    }

    /**
     * Obtiene el valor de la propiedad usr05.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSR05() {
        return usr05;
    }

    /**
     * Define el valor de la propiedad usr05.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSR05(String value) {
        this.usr05 = value;
    }

    /**
     * Obtiene el valor de la propiedad matnrexternal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATNREXTERNAL() {
        return matnrexternal;
    }

    /**
     * Define el valor de la propiedad matnrexternal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATNREXTERNAL(String value) {
        this.matnrexternal = value;
    }

    /**
     * Obtiene el valor de la propiedad matnrversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATNRVERSION() {
        return matnrversion;
    }

    /**
     * Define el valor de la propiedad matnrversion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATNRVERSION(String value) {
        this.matnrversion = value;
    }

    /**
     * Obtiene el valor de la propiedad matnrguid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATNRGUID() {
        return matnrguid;
    }

    /**
     * Define el valor de la propiedad matnrguid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATNRGUID(String value) {
        this.matnrguid = value;
    }

    /**
     * Obtiene el valor de la propiedad matwaexternal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATWAEXTERNAL() {
        return matwaexternal;
    }

    /**
     * Define el valor de la propiedad matwaexternal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATWAEXTERNAL(String value) {
        this.matwaexternal = value;
    }

    /**
     * Obtiene el valor de la propiedad matwaversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATWAVERSION() {
        return matwaversion;
    }

    /**
     * Define el valor de la propiedad matwaversion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATWAVERSION(String value) {
        this.matwaversion = value;
    }

    /**
     * Obtiene el valor de la propiedad matwaguid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATWAGUID() {
        return matwaguid;
    }

    /**
     * Define el valor de la propiedad matwaguid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATWAGUID(String value) {
        this.matwaguid = value;
    }

    /**
     * Obtiene el valor de la propiedad zudat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZUDAT() {
        return zudat;
    }

    /**
     * Define el valor de la propiedad zudat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZUDAT(String value) {
        this.zudat = value;
    }

    /**
     * Obtiene el valor de la propiedad vfdat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVFDAT() {
        return vfdat;
    }

    /**
     * Define el valor de la propiedad vfdat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVFDAT(String value) {
        this.vfdat = value;
    }

    /**
     * Obtiene el valor de la propiedad rmanumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMANUMBER() {
        return rmanumber;
    }

    /**
     * Define el valor de la propiedad rmanumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMANUMBER(String value) {
        this.rmanumber = value;
    }

    /**
     * Obtiene el valor de la propiedad rmacomplete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMACOMPLETE() {
        return rmacomplete;
    }

    /**
     * Define el valor de la propiedad rmacomplete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMACOMPLETE(String value) {
        this.rmacomplete = value;
    }

    /**
     * Obtiene el valor de la propiedad expirydateext.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPIRYDATEEXT() {
        return expirydateext;
    }

    /**
     * Define el valor de la propiedad expirydateext.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPIRYDATEEXT(String value) {
        this.expirydateext = value;
    }

    /**
     * Obtiene el valor de la propiedad vgbel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVGBEL() {
        return vgbel;
    }

    /**
     * Define el valor de la propiedad vgbel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVGBEL(String value) {
        this.vgbel = value;
    }

    /**
     * Obtiene el valor de la propiedad vgpos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVGPOS() {
        return vgpos;
    }

    /**
     * Define el valor de la propiedad vgpos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVGPOS(String value) {
        this.vgpos = value;
    }

    /**
     * Obtiene el valor de la propiedad followupcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOLLOWUPCODE() {
        return followupcode;
    }

    /**
     * Define el valor de la propiedad followupcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOLLOWUPCODE(String value) {
        this.followupcode = value;
    }

    /**
     * Obtiene el valor de la propiedad ormng.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORMNG() {
        return ormng;
    }

    /**
     * Define el valor de la propiedad ormng.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORMNG(String value) {
        this.ormng = value;
    }

    /**
     * Obtiene el valor de la propiedad compl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPL() {
        return compl;
    }

    /**
     * Define el valor de la propiedad compl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPL(String value) {
        this.compl = value;
    }

    /**
     * Obtiene el valor de la propiedad hold.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOLD() {
        return hold;
    }

    /**
     * Define el valor de la propiedad hold.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOLD(String value) {
        this.hold = value;
    }

    /**
     * Obtiene el valor de la propiedad maxerrtype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAXERRTYPE() {
        return maxerrtype;
    }

    /**
     * Define el valor de la propiedad maxerrtype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAXERRTYPE(String value) {
        this.maxerrtype = value;
    }

    /**
     * Obtiene el valor de la propiedad lichn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLICHN() {
        return lichn;
    }

    /**
     * Define el valor de la propiedad lichn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLICHN(String value) {
        this.lichn = value;
    }

    /**
     * Obtiene el valor de la propiedad recipientcreate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECIPIENTCREATE() {
        return recipientcreate;
    }

    /**
     * Define el valor de la propiedad recipientcreate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECIPIENTCREATE(String value) {
        this.recipientcreate = value;
    }

    /**
     * Obtiene el valor de la propiedad expirydateextb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPIRYDATEEXTB() {
        return expirydateextb;
    }

    /**
     * Define el valor de la propiedad expirydateextb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPIRYDATEEXTB(String value) {
        this.expirydateextb = value;
    }

    /**
     * Obtiene el valor de la propiedad e1EDL25.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDL25 }
     *     
     */
    public DELVRY03E1EDL25 getE1EDL25() {
        return e1EDL25;
    }

    /**
     * Define el valor de la propiedad e1EDL25.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDL25 }
     *     
     */
    public void setE1EDL25(DELVRY03E1EDL25 value) {
        this.e1EDL25 = value;
    }

    /**
     * Obtiene el valor de la propiedad e1EDL26.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDL26 }
     *     
     */
    public DELVRY03E1EDL26 getE1EDL26() {
        return e1EDL26;
    }

    /**
     * Define el valor de la propiedad e1EDL26.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDL26 }
     *     
     */
    public void setE1EDL26(DELVRY03E1EDL26 value) {
        this.e1EDL26 = value;
    }

    /**
     * Gets the value of the e1EDL52 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL52 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL52().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL52 }
     * 
     * 
     */
    public List<DELVRY03E1EDL52> getE1EDL52() {
        if (e1EDL52 == null) {
            e1EDL52 = new ArrayList<DELVRY03E1EDL52>();
        }
        return this.e1EDL52;
    }

    /**
     * Gets the value of the e1EDL53 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL53 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL53().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL53 }
     * 
     * 
     */
    public List<DELVRY03E1EDL53> getE1EDL53() {
        if (e1EDL53 == null) {
            e1EDL53 = new ArrayList<DELVRY03E1EDL53>();
        }
        return this.e1EDL53;
    }

    /**
     * Gets the value of the e1EDD10 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDD10 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDD10().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDD10 }
     * 
     * 
     */
    public List<DELVRY03E1EDD10> getE1EDD10() {
        if (e1EDD10 == null) {
            e1EDD10 = new ArrayList<DELVRY03E1EDD10>();
        }
        return this.e1EDD10;
    }

    /**
     * Obtiene el valor de la propiedad e1EDD14.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDD14 }
     *     
     */
    public DELVRY03E1EDD14 getE1EDD14() {
        return e1EDD14;
    }

    /**
     * Define el valor de la propiedad e1EDD14.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDD14 }
     *     
     */
    public void setE1EDD14(DELVRY03E1EDD14 value) {
        this.e1EDD14 = value;
    }

    /**
     * Gets the value of the e1EDL19 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL19 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL19().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL19 }
     * 
     * 
     */
    public List<DELVRY03E1EDL19> getE1EDL19() {
        if (e1EDL19 == null) {
            e1EDL19 = new ArrayList<DELVRY03E1EDL19>();
        }
        return this.e1EDL19;
    }

    /**
     * Gets the value of the e1EDL11 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL11 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL11().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL11 }
     * 
     * 
     */
    public List<DELVRY03E1EDL11> getE1EDL11() {
        if (e1EDL11 == null) {
            e1EDL11 = new ArrayList<DELVRY03E1EDL11>();
        }
        return this.e1EDL11;
    }

    /**
     * Gets the value of the e1EDL15 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL15 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL15().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL15 }
     * 
     * 
     */
    public List<DELVRY03E1EDL15> getE1EDL15() {
        if (e1EDL15 == null) {
            e1EDL15 = new ArrayList<DELVRY03E1EDL15>();
        }
        return this.e1EDL15;
    }

    /**
     * Obtiene el valor de la propiedad e1EDL35.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDL35 }
     *     
     */
    public DELVRY03E1EDL35 getE1EDL35() {
        return e1EDL35;
    }

    /**
     * Define el valor de la propiedad e1EDL35.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDL35 }
     *     
     */
    public void setE1EDL35(DELVRY03E1EDL35 value) {
        this.e1EDL35 = value;
    }

    /**
     * Gets the value of the e1EDL43 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL43 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL43().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL43 }
     * 
     * 
     */
    public List<DELVRY03E1EDL43> getE1EDL43() {
        if (e1EDL43 == null) {
            e1EDL43 = new ArrayList<DELVRY03E1EDL43>();
        }
        return this.e1EDL43;
    }

    /**
     * Gets the value of the e1EDL41 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL41 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL41().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL41 }
     * 
     * 
     */
    public List<DELVRY03E1EDL41> getE1EDL41() {
        if (e1EDL41 == null) {
            e1EDL41 = new ArrayList<DELVRY03E1EDL41>();
        }
        return this.e1EDL41;
    }

    /**
     * Gets the value of the e1TXTH9 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1TXTH9 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1TXTH9().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1TXTH9 }
     * 
     * 
     */
    public List<DELVRY03E1TXTH9> getE1TXTH9() {
        if (e1TXTH9 == null) {
            e1TXTH9 = new ArrayList<DELVRY03E1TXTH9>();
        }
        return this.e1TXTH9;
    }

    /**
     * Gets the value of the e1EDL12 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL12 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL12().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL12 }
     * 
     * 
     */
    public List<DELVRY03E1EDL12> getE1EDL12() {
        if (e1EDL12 == null) {
            e1EDL12 = new ArrayList<DELVRY03E1EDL12>();
        }
        return this.e1EDL12;
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
