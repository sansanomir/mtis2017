
/**
 * ServicioSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package org.example.www.servicio;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
     *  ServicioSkeleton java skeleton for the axisService
     */
    public class ServicioSkeleton{
    	
    	private String url= null;
    	private Connection con = null;
    	
    	public ServicioSkeleton() throws ClassNotFoundException, SQLException{
    		url = "jdbc:mysql://localhost:3311/mtis";
       	 	Class.forName("com.mysql.jdbc.Driver");
       	 	con = (Connection)DriverManager.getConnection(url,"root","root");
    	}
    	 
        private boolean validarDNI(String dni){
        	 if(dni.length() != 9 || !Character.isLetter(dni.charAt(8)))
     			return false;
        	 else{
        		 String parteNumerica = "";
        		 for(int i=0;i<dni.length()-1;i++){
        			 parteNumerica += dni.charAt(i);
        			 if(!Character.isDigit(dni.charAt(i)))
        				return false;            			 
        		 }
        		 int numero = Integer.parseInt(parteNumerica); 
        		 String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        		 if(letras.charAt(numero % 23) == dni.charAt(8))
        			 return true;
        	 }
        	 return false;
        }
        /**
         * Auto generated method signature
         * 
                                     * @param consultaCodigoPostal 
             * @return consultaCodigoPostalResponse 
         */
        
                 public org.example.www.servicio.ConsultaCodigoPostalResponse consultaCodigoPostal
                  (
                  org.example.www.servicio.ConsultaCodigoPostal consultaCodigoPostal
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#consultaCodigoPostal");
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param validarNIF 
             * @return validarNIFResponse 
         * @throws SQLException 
         * @throws ClassNotFoundException 
         */
        
                 public org.example.www.servicio.ValidarNIFResponse validarNIF
                  (
                  org.example.www.servicio.ValidarNIF validarNIF
                  ) throws SQLException, ClassNotFoundException
            {
                	 boolean claveCorrecta = false;
                	               
	            	 try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM llaves")) {
	            		  ResultSet rs = stmt.executeQuery();           		 
	            		  while (rs.next()){
	            			  if(rs.getString("llave").equals(validarNIF.getSoapKey())){
	            				  claveCorrecta = true;
	            			  }
	            		  }           		    
	            		 
	            		} catch (SQLException sqle) { 
	            		  System.out.println("Error en la ejecución:" 
	            		    + sqle.getErrorCode() + " " + sqle.getMessage());    
	            		}
	            	 ValidarNIFResponse resp = new ValidarNIFResponse();
	            	 resp.setOut(this.validarDNI(validarNIF.getNif()));
	            	 resp.setKeyValida(claveCorrecta);
	            	 return resp;                               
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param validarIBAN 
             * @return validarIBANResponse 
         */
        
                 public org.example.www.servicio.ValidarIBANResponse validarIBAN
                  (
                  org.example.www.servicio.ValidarIBAN validarIBAN
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#validarIBAN");
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param generarPresupuesto 
             * @return generarPresupuestoResponse 
         */
        
                 public org.example.www.servicio.GenerarPresupuestoResponse generarPresupuesto
                  (
                  org.example.www.servicio.GenerarPresupuesto generarPresupuesto
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#generarPresupuesto");
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param solicitarPresupuesto 
             * @return solicitarPresupuestoResponse 
         */
        
                 public org.example.www.servicio.SolicitarPresupuestoResponse solicitarPresupuesto
                  (
                  org.example.www.servicio.SolicitarPresupuesto solicitarPresupuesto
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#solicitarPresupuesto");
        }
     
    }
    