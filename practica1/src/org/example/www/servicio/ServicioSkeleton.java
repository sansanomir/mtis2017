
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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.math.BigInteger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

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
    	
    	private boolean validarLlave(String llave){
        	try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM llaves")) {
      		  ResultSet rs = stmt.executeQuery();           		 
      		  while (rs.next()){
      			  if(rs.getString("llave").equals(llave)){
      				  return true;
      			  }
      		  }           		    
      		 
      		} catch (SQLException sqle) { 
      		  System.out.println("Error en la ejecución:" 
      		    + sqle.getErrorCode() + " " + sqle.getMessage());    
      		}
        	return false; 
        }
    	private boolean clienteExiste(int id){
    		try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM cliente WHERE idcliente = "+ Integer.toString(id))) {
        		  ResultSet rs = stmt.executeQuery();           		 
        		  while (rs.next())
        			  return true;
        		} catch (SQLException sqle) { 
        		  System.out.println("Error en la ejecución:" 
        		    + sqle.getErrorCode() + " " + sqle.getMessage());    
        		}
          	return false;
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
                
        private String validarIBAN(String cuenta){
        	boolean esValido = false;
    		int i = 2;
    		int caracterASCII = 0; 
    		int resto = 0;
    		int dc = 0;
    		String cadenaDc = "";
    		BigInteger cuentaNumero = new BigInteger("0"); 
    		BigInteger modo = new BigInteger("97");		
    		if(cuenta.length() != 24)
    			return "Error: El iban no tiene 24";
    		else{
    			if(cuenta.substring(0,1).toUpperCase().equals("E") 
    			&& cuenta.substring(1,2).toUpperCase().equals("S")) {
	    			do {
	    				caracterASCII = cuenta.codePointAt(i);
	    				esValido = (caracterASCII > 47 && caracterASCII < 58);
	    				i++;
	    			}
	    			while(i < cuenta.length() && esValido);     			    		
	    			if(esValido) {
	    				cuentaNumero = new BigInteger(cuenta.substring(4,24) + "142800");
	    				resto = cuentaNumero.mod(modo).intValue();
	    				dc = 98 - resto;
	    				cadenaDc = String.valueOf(dc);
	    			}		    			
	    			if(dc < 10)
	    				cadenaDc = "0" + cadenaDc;
	    			// Comparamos los caracteres 2 y 3 de la cuenta (dígito de control IBAN) con cadenaDc
	    			if(cuenta.substring(2,4).equals(cadenaDc))
	    				return "Ok";
	    			else
	    				return "Error: Los caracteres 2 y 3 no son los mismos";
    			}
    		}
    		return "Error";
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
                	 boolean existe = false;
                	 ConsultaCodigoPostalResponse resp = new ConsultaCodigoPostalResponse();
                	 
	            	 if (validarLlave(consultaCodigoPostal.getSoapKey())){
	            		 resp.setKeyValida(true);
	            		 String sql = "SELECT * FROM codigospostales WHERE codigo = " + consultaCodigoPostal.getCodigoPostal();
	                	 try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql)){
	                 		  ResultSet rs = stmt.executeQuery();           		 
	                 		  while (rs.next()){
	                 			  resp.setCodigoPostal(rs.getString("codigo"));
	                 			  resp.setPoblacion(rs.getString("poblacion"));
	                 			  resp.setProvincia(rs.getString("provincia"));
	                 			  existe = true;
	                 		  }           		                    		 
	                 		} catch (SQLException sqle) { 
	                 		  System.out.println("Error en la ejecución:" 
	                 		    + sqle.getErrorCode() + " " + sqle.getMessage());    
	                 		}    
	                	 if(!existe){
	                		 resp.setCodigoPostal("No encrontrado");
	                		 resp.setPoblacion("No encrontrado");
	                		 resp.setProvincia("No encrontrado");
	                	 }
	            	 }
	            	 else{
	            		 resp.setCodigoPostal("");
            			 resp.setPoblacion("");
            			 resp.setProvincia("");
            			 resp.setKeyValida(false);
	            	 }
	            	 return resp;                 
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
	            	 ValidarNIFResponse resp = new ValidarNIFResponse();
	            	 
	            	 if (validarLlave(validarNIF.getSoapKey())){
	            		 resp.setKeyValida(true);
	            		 resp.setOut(validarDNI(validarNIF.getNif()));
	            	 }
	            		 
	            	 else
	            		 resp.setKeyValida(false);
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
                	 ValidarIBANResponse resp = new ValidarIBANResponse();
                	 if(validarLlave(validarIBAN.getSoapKey())){
                		 resp.setOut(this.validarIBAN(validarIBAN.getIban()).substring(1).equals("k"));
                		 resp.setError(this.validarIBAN(validarIBAN.getIban()));
                		 resp.setKeyValida(true);
                	 }
                	 else{
                		 resp.setError("La key no es válida");
                		 resp.setKeyValida(false);
                	 }
	            	 return resp; 
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
                	 GenerarPresupuestoResponse resp = new GenerarPresupuestoResponse();
                	 
                	 if(validarLlave(generarPresupuesto.getSoapKey()) && clienteExiste(generarPresupuesto.getIdCliente())){
                		 resp.setKeyValida(true);
                		 boolean insertar = false;
                    	 Date fecha = generarPresupuesto.getFechaPresupuesto();
                    	 java.sql.Date fechaSql = new java.sql.Date(fecha.getTime());
                    	 String sql = "SELECT * FROM producto, presupuesto, cliente WHERE producto.referenciaproducto = presupuesto.referenciaproducto "
                    			 + "&& producto.referenciaproducto ='" + generarPresupuesto.getReferenciaProducto()+"'";
                     	 try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql)) {
                     		  ResultSet rs = stmt.executeQuery();                   		  
                     		  while (rs.next()){
                     			  if(generarPresupuesto.getCantidadProducto() <= rs.getInt("producto.stock")){  
                     				  insertar = true;
                     			  }
                     			  else
                     				 resp.setPresupuestoGeneradoCorrectamente(false);
                     		  }           		                    		 
                     		} catch (SQLException sqle) { 
                     		  System.out.println("Error en la ejecución:" 
                     		    + sqle.getErrorCode() + " " + sqle.getMessage());    
                     		}
    	                 	if(insertar){
    	                 		java.sql.Date fechaPresupuesto = new java.sql.Date(
    	                 				generarPresupuesto.getFechaPresupuesto().getYear(), 
    	                 				generarPresupuesto.getFechaPresupuesto().getMonth(),
    	                 				generarPresupuesto.getFechaPresupuesto().getDay());
    		                 	String sqlInsert = "INSERT INTO presupuesto (idcliente,referenciaproducto,cantidadproducto,fechadisponibilidad)"
    		                 				  		+ "VALUES ('"+ generarPresupuesto.getIdCliente()+"' , '"+ generarPresupuesto.getReferenciaProducto()
    		                 				  		+"' , '" + generarPresupuesto.getCantidadProducto() +"' , '" + fechaPresupuesto + "')";
    		                 	 try  {
    		                 		 Statement stmt = (Statement) con.createStatement();
    		                 		 stmt.executeUpdate(sqlInsert);  		                    		 
    		              		} catch (SQLException sqle) { 
    		              		  System.out.println("Error en la ejecución:" 
    		              		    + sqle.getErrorCode() + " " + sqle.getMessage());    
    		              		}
    		                 	String sql2 = "SELECT idpresupuesto from presupuesto ORDER BY idpresupuesto DESC LIMIT 1";
    		                 	 try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql2)) {
    		                 		  ResultSet rs = stmt.executeQuery();                   		  
    		                 		  while (rs.next()){
    		                 			  resp.setIdPresupuesto(rs.getInt("idpresupuesto"));
    		                 		  }           		                    		 
    		                 		} catch (SQLException sqle) { 
    		                 		  System.out.println("Error en la ejecución:" 
    		                 		    + sqle.getErrorCode() + " " + sqle.getMessage());    
    		                 		}
    		                 	 resp.setPresupuestoGeneradoCorrectamente(true);
	                     	}
		                 	else{
		                 		resp.setIdPresupuesto(-1);
		                		resp.setPresupuestoGeneradoCorrectamente(false);
		                 	}
                	 }
                	 else{
                		 resp.setKeyValida(false);
                		 resp.setIdPresupuesto(-1);
                		 resp.setPresupuestoGeneradoCorrectamente(false);                		 
                	 }               	 
                	 return resp;
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param solicitarPresupuesto 
             * @return solicitarPresupuestoResponse 
         * @throws ParseException 
         */
        
                 public org.example.www.servicio.SolicitarPresupuestoResponse solicitarPresupuesto
                  (
                  org.example.www.servicio.SolicitarPresupuesto solicitarPresupuesto
                  ) throws ParseException
            {              
                	 SolicitarPresupuestoResponse resp = new SolicitarPresupuestoResponse();             	 
                	 if(validarLlave(solicitarPresupuesto.getSoapKey())){
                		 boolean existe=false;
                		 resp.setKeyValida(true);
                    	 String sql = "select producto.precioproducto, producto.fechadisponibilidad "
                    	 		+ "from producto, proveedor, presupuesto "
                    	 		+ "where producto.idproveedor = proveedor.idproveedor "
                    	 		+ "&& producto.referenciaproducto = '" + solicitarPresupuesto.getReferenciaPieza()
                    	 		+ "' && proveedor.idproveedor =" + solicitarPresupuesto.getIdProveedor()
                    	 		+ "&& presupuesto.referenciaproducto = '"  + solicitarPresupuesto.getReferenciaPieza()+"'";
                    	 try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql)) {
                    		  ResultSet rs = stmt.executeQuery();           		 
                    		  while (rs.next()){
                    			  existe = true;
                    			  resp.setFechaDisponibilidadPieza(rs.getDate("producto.fechadisponibilidad"));
                    			  resp.setPrecioPieza(rs.getFloat("precioproducto"));
                    			  DateFormat format = new SimpleDateFormat("yyy-mm-dd");
                    			  Date cal = new Date();
                    			  resp.setDisponibilidadPieza(!(rs.getDate("producto.fechadisponibilidad").before(cal)));
                    		  }
                    		  if(!existe){
        						resp.setFechaDisponibilidadPieza(new java.sql.Date(0,0,0));
        						resp.setPrecioPieza(0);
        						resp.setDisponibilidadPieza(false);
                    		  }
                    		} catch (SQLException sqle) { 
                    		  System.out.println("Error en la ejecución:" 
                    		    + sqle.getErrorCode() + " " + sqle.getMessage());    
                    		}
                	 }
					 else{
						resp.setKeyValida(false);
						resp.setFechaDisponibilidadPieza(new java.sql.Date(0,0,0));
						resp.setPrecioPieza(0);
						resp.setDisponibilidadPieza(false);
                	 }
                	 return resp;
        }
     
    }
    