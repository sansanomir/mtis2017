
/**
 * ServicioAlmacenSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package org.example.www.servicioalmacen;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
     *  ServicioAlmacenSkeleton java skeleton for the axisService
     */
    public class ServicioAlmacenSkeleton{
    	private String url= null;
    	private Connection con = null;
    	
    	public ServicioAlmacenSkeleton() throws ClassNotFoundException, SQLException{
    		url = "jdbc:mysql://localhost:3311/almacen";
       	 	Class.forName("com.mysql.jdbc.Driver");
       	 	con = (Connection)DriverManager.getConnection(url,"root","root");
    	}
         
        /**
         * Auto generated method signature
         * 
                                     * @param actualizarStock 
             * @return actualizarStockResponse 
         */
        
                 public org.example.www.servicioalmacen.ActualizarStockResponse actualizarStock
                  (
                  org.example.www.servicioalmacen.ActualizarStock actualizarStock
                  )
            {
                	 ActualizarStockResponse resp = new ActualizarStockResponse();
                	 resp.setOut(false);
                	 
                	 int cantidad=-1;
                	 String sqlc = "select * from producto where referenciaProducto = '"
                        	 + actualizarStock.getReferenciaProducto()+"'";
                	 try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sqlc)){
                 		  ResultSet rs = stmt.executeQuery();           		 
                 		  while (rs.next()){
                 			 cantidad= rs.getInt("stock");
                 		  }           		                    		 
                 		} catch (SQLException sqle) { 
                 		  System.out.println("Error en la ejecución:" 
                 		    + sqle.getErrorCode() + " " + sqle.getMessage());    
                 		}
                	 if(cantidad == -1){
                		 return resp;
                	 }
                	 else{
	                	 String sql = "UPDATE producto SET stock = ? "
				                  + " WHERE referenciaProducto = ?";               	 
	                 	 try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql)) {
	                 		 stmt.setInt(1,cantidad-actualizarStock.getNumeroUnidades());
	                 		 stmt.setString(2,actualizarStock.getReferenciaProducto());
	                 		 stmt.executeUpdate();
	                 		 resp.setOut(true);
	                 		} catch (SQLException sqle) { 
	                 		  System.out.println("Error en la ejecución:" 
	                 		    + sqle.getErrorCode() + " " + sqle.getMessage());    
	                 		}
                	 }
                	 return resp;      
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param comprobarStock 
             * @return comprobarStockResponse 
         */
        
                 public org.example.www.servicioalmacen.ComprobarStockResponse comprobarStock
                  (
                  org.example.www.servicioalmacen.ComprobarStock comprobarStock
                  )
            {
                	 ComprobarStockResponse resp = new ComprobarStockResponse();
                	 resp.setOut(false);
                	 String sql = "select * from producto where referenciaProducto = '"
                	 + comprobarStock.getReferenciaProducto()+"'";
                 	 try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql)) {
                 		  ResultSet rs = stmt.executeQuery();  
                 		  while (rs.next()){
                 			  if(comprobarStock.getNumeroUnidades() <= rs.getInt("producto.stock")){
                 				  resp.setOut(true);
                 				  return resp;
                 			  }
                 		  }           		                    		 
                 		} catch (SQLException sqle) { 
                 		  System.out.println("Error en la ejecución:" 
                 		    + sqle.getErrorCode() + " " + sqle.getMessage());    
                 		}
                	 return resp;              
        }
     
    }
    