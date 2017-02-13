
/**
 * ServicioMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
        package org.example.www.servicio;

        /**
        *  ServicioMessageReceiverInOut message receiver
        */

        public class ServicioMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ServicioSkeleton skel = (ServicioSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("consultaCodigoPostal".equals(methodName)){
                
                org.example.www.servicio.ConsultaCodigoPostalResponse consultaCodigoPostalResponse21 = null;
	                        org.example.www.servicio.ConsultaCodigoPostal wrappedParam =
                                                             (org.example.www.servicio.ConsultaCodigoPostal)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.servicio.ConsultaCodigoPostal.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               consultaCodigoPostalResponse21 =
                                                   
                                                   
                                                         skel.consultaCodigoPostal(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), consultaCodigoPostalResponse21, false, new javax.xml.namespace.QName("http://www.example.org/servicio/",
                                                    "consultaCodigoPostal"));
                                    } else 

            if("validarNIF".equals(methodName)){
                
                org.example.www.servicio.ValidarNIFResponse validarNIFResponse23 = null;
	                        org.example.www.servicio.ValidarNIF wrappedParam =
                                                             (org.example.www.servicio.ValidarNIF)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.servicio.ValidarNIF.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               validarNIFResponse23 =
                                                   
                                                   
                                                         skel.validarNIF(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), validarNIFResponse23, false, new javax.xml.namespace.QName("http://www.example.org/servicio/",
                                                    "validarNIF"));
                                    } else 

            if("validarIBAN".equals(methodName)){
                
                org.example.www.servicio.ValidarIBANResponse validarIBANResponse25 = null;
	                        org.example.www.servicio.ValidarIBAN wrappedParam =
                                                             (org.example.www.servicio.ValidarIBAN)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.servicio.ValidarIBAN.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               validarIBANResponse25 =
                                                   
                                                   
                                                         skel.validarIBAN(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), validarIBANResponse25, false, new javax.xml.namespace.QName("http://www.example.org/servicio/",
                                                    "validarIBAN"));
                                    } else 

            if("generarPresupuesto".equals(methodName)){
                
                org.example.www.servicio.GenerarPresupuestoResponse generarPresupuestoResponse27 = null;
	                        org.example.www.servicio.GenerarPresupuesto wrappedParam =
                                                             (org.example.www.servicio.GenerarPresupuesto)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.servicio.GenerarPresupuesto.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               generarPresupuestoResponse27 =
                                                   
                                                   
                                                         skel.generarPresupuesto(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), generarPresupuestoResponse27, false, new javax.xml.namespace.QName("http://www.example.org/servicio/",
                                                    "generarPresupuesto"));
                                    } else 

            if("solicitarPresupuesto".equals(methodName)){
                
                org.example.www.servicio.SolicitarPresupuestoResponse solicitarPresupuestoResponse29 = null;
	                        org.example.www.servicio.SolicitarPresupuesto wrappedParam =
                                                             (org.example.www.servicio.SolicitarPresupuesto)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.servicio.SolicitarPresupuesto.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               solicitarPresupuestoResponse29 =
                                                   
                                                   
                                                         skel.solicitarPresupuesto(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), solicitarPresupuestoResponse29, false, new javax.xml.namespace.QName("http://www.example.org/servicio/",
                                                    "solicitarPresupuesto"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.servicio.ConsultaCodigoPostal param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.servicio.ConsultaCodigoPostal.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.servicio.ConsultaCodigoPostalResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.servicio.ConsultaCodigoPostalResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.servicio.ValidarNIF param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.servicio.ValidarNIF.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.servicio.ValidarNIFResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.servicio.ValidarNIFResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.servicio.ValidarIBAN param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.servicio.ValidarIBAN.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.servicio.ValidarIBANResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.servicio.ValidarIBANResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.servicio.GenerarPresupuesto param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.servicio.GenerarPresupuesto.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.servicio.GenerarPresupuestoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.servicio.GenerarPresupuestoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.servicio.SolicitarPresupuesto param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.servicio.SolicitarPresupuesto.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.servicio.SolicitarPresupuestoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.servicio.SolicitarPresupuestoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.servicio.ConsultaCodigoPostalResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.servicio.ConsultaCodigoPostalResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.servicio.ConsultaCodigoPostalResponse wrapconsultaCodigoPostal(){
                                org.example.www.servicio.ConsultaCodigoPostalResponse wrappedElement = new org.example.www.servicio.ConsultaCodigoPostalResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.servicio.ValidarNIFResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.servicio.ValidarNIFResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.servicio.ValidarNIFResponse wrapvalidarNIF(){
                                org.example.www.servicio.ValidarNIFResponse wrappedElement = new org.example.www.servicio.ValidarNIFResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.servicio.ValidarIBANResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.servicio.ValidarIBANResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.servicio.ValidarIBANResponse wrapvalidarIBAN(){
                                org.example.www.servicio.ValidarIBANResponse wrappedElement = new org.example.www.servicio.ValidarIBANResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.servicio.GenerarPresupuestoResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.servicio.GenerarPresupuestoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.servicio.GenerarPresupuestoResponse wrapgenerarPresupuesto(){
                                org.example.www.servicio.GenerarPresupuestoResponse wrappedElement = new org.example.www.servicio.GenerarPresupuestoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.servicio.SolicitarPresupuestoResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.servicio.SolicitarPresupuestoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.servicio.SolicitarPresupuestoResponse wrapsolicitarPresupuesto(){
                                org.example.www.servicio.SolicitarPresupuestoResponse wrappedElement = new org.example.www.servicio.SolicitarPresupuestoResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.example.www.servicio.ConsultaCodigoPostal.class.equals(type)){
                
                        return org.example.www.servicio.ConsultaCodigoPostal.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.servicio.ConsultaCodigoPostalResponse.class.equals(type)){
                
                        return org.example.www.servicio.ConsultaCodigoPostalResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.servicio.GenerarPresupuesto.class.equals(type)){
                
                        return org.example.www.servicio.GenerarPresupuesto.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.servicio.GenerarPresupuestoResponse.class.equals(type)){
                
                        return org.example.www.servicio.GenerarPresupuestoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.servicio.SolicitarPresupuesto.class.equals(type)){
                
                        return org.example.www.servicio.SolicitarPresupuesto.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.servicio.SolicitarPresupuestoResponse.class.equals(type)){
                
                        return org.example.www.servicio.SolicitarPresupuestoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.servicio.ValidarIBAN.class.equals(type)){
                
                        return org.example.www.servicio.ValidarIBAN.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.servicio.ValidarIBANResponse.class.equals(type)){
                
                        return org.example.www.servicio.ValidarIBANResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.servicio.ValidarNIF.class.equals(type)){
                
                        return org.example.www.servicio.ValidarNIF.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.servicio.ValidarNIFResponse.class.equals(type)){
                
                        return org.example.www.servicio.ValidarNIFResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    