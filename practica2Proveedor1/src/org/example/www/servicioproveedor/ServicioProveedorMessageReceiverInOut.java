
/**
 * ServicioProveedorMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
        package org.example.www.servicioproveedor;

        /**
        *  ServicioProveedorMessageReceiverInOut message receiver
        */

        public class ServicioProveedorMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ServicioProveedorSkeleton skel = (ServicioProveedorSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("ordenarCompra".equals(methodName)){
                
                org.example.www.servicioproveedor.OrdenarCompraResponse ordenarCompraResponse13 = null;
	                        org.example.www.servicioproveedor.OrdenarCompra wrappedParam =
                                                             (org.example.www.servicioproveedor.OrdenarCompra)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.servicioproveedor.OrdenarCompra.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               ordenarCompraResponse13 =
                                                   
                                                   
                                                         skel.ordenarCompra(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), ordenarCompraResponse13, false, new javax.xml.namespace.QName("http://www.example.org/ServicioProveedor/",
                                                    "ordenarCompra"));
                                    } else 

            if("actualizarStock".equals(methodName)){
                
                org.example.www.servicioproveedor.ActualizarStockResponse actualizarStockResponse15 = null;
	                        org.example.www.servicioproveedor.ActualizarStock wrappedParam =
                                                             (org.example.www.servicioproveedor.ActualizarStock)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.servicioproveedor.ActualizarStock.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               actualizarStockResponse15 =
                                                   
                                                   
                                                         skel.actualizarStock(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), actualizarStockResponse15, false, new javax.xml.namespace.QName("http://www.example.org/ServicioProveedor/",
                                                    "actualizarStock"));
                                    } else 

            if("solicitarPresupuesto".equals(methodName)){
                
                org.example.www.servicioproveedor.SolicitarPresupuestoResponse solicitarPresupuestoResponse17 = null;
	                        org.example.www.servicioproveedor.SolicitarPresupuesto wrappedParam =
                                                             (org.example.www.servicioproveedor.SolicitarPresupuesto)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.servicioproveedor.SolicitarPresupuesto.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               solicitarPresupuestoResponse17 =
                                                   
                                                   
                                                         skel.solicitarPresupuesto(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), solicitarPresupuestoResponse17, false, new javax.xml.namespace.QName("http://www.example.org/ServicioProveedor/",
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
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.servicioproveedor.OrdenarCompra param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.servicioproveedor.OrdenarCompra.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.servicioproveedor.OrdenarCompraResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.servicioproveedor.OrdenarCompraResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.servicioproveedor.ActualizarStock param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.servicioproveedor.ActualizarStock.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.servicioproveedor.ActualizarStockResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.servicioproveedor.ActualizarStockResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.servicioproveedor.SolicitarPresupuesto param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.servicioproveedor.SolicitarPresupuesto.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.servicioproveedor.SolicitarPresupuestoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.servicioproveedor.SolicitarPresupuestoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.servicioproveedor.OrdenarCompraResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.servicioproveedor.OrdenarCompraResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.servicioproveedor.OrdenarCompraResponse wrapOrdenarCompra(){
                                org.example.www.servicioproveedor.OrdenarCompraResponse wrappedElement = new org.example.www.servicioproveedor.OrdenarCompraResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.servicioproveedor.ActualizarStockResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.servicioproveedor.ActualizarStockResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.servicioproveedor.ActualizarStockResponse wrapActualizarStock(){
                                org.example.www.servicioproveedor.ActualizarStockResponse wrappedElement = new org.example.www.servicioproveedor.ActualizarStockResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.servicioproveedor.SolicitarPresupuestoResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.servicioproveedor.SolicitarPresupuestoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.servicioproveedor.SolicitarPresupuestoResponse wrapSolicitarPresupuesto(){
                                org.example.www.servicioproveedor.SolicitarPresupuestoResponse wrappedElement = new org.example.www.servicioproveedor.SolicitarPresupuestoResponse();
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
        
                if (org.example.www.servicioproveedor.ActualizarStock.class.equals(type)){
                
                        return org.example.www.servicioproveedor.ActualizarStock.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.servicioproveedor.ActualizarStockResponse.class.equals(type)){
                
                        return org.example.www.servicioproveedor.ActualizarStockResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.servicioproveedor.OrdenarCompra.class.equals(type)){
                
                        return org.example.www.servicioproveedor.OrdenarCompra.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.servicioproveedor.OrdenarCompraResponse.class.equals(type)){
                
                        return org.example.www.servicioproveedor.OrdenarCompraResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.servicioproveedor.SolicitarPresupuesto.class.equals(type)){
                
                        return org.example.www.servicioproveedor.SolicitarPresupuesto.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.servicioproveedor.SolicitarPresupuestoResponse.class.equals(type)){
                
                        return org.example.www.servicioproveedor.SolicitarPresupuestoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    