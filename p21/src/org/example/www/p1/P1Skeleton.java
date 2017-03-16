
/**
 * P1Skeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package org.example.www.p1;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
     *  P1Skeleton java skeleton for the axisService
     */
    public class P1Skeleton{
    	private String url= null;
    	private Connection con = null;
    	
    	public P1Skeleton() throws ClassNotFoundException, SQLException{
    		url = "jdbc:mysql://localhost:3311/proveedor1";
       	 	Class.forName("com.mysql.jdbc.Driver");
       	 	con = (Connection)DriverManager.getConnection(url,"root","root");
    	}
        
    	private float getPrecioProducto(String referencia){
        	float precio = -1;
        	String sqlc = "select * from producto where referenciaProducto = '"
               	 + referencia+"'";
	       	 try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sqlc)){
	        		  ResultSet rs = stmt.executeQuery();           		 
	        		  while (rs.next()){
	        			 precio= rs.getInt("precio");
	        			 return precio;
	        		  }           		                    		 
	        		} catch (SQLException sqle) { 
	        		  System.out.println("Error en la ejecuci�n:" 
	        		    + sqle.getErrorCode() + " " + sqle.getMessage());    
	        		}
        	return precio;
        }
         
        /**
         * Auto generated method signature
         * 
                                     * @param actualizarStock 
             * @return actualizarStockResponse 
         */
        
                 public org.example.www.p1.ActualizarStockResponse actualizarStock
                  (
                  org.example.www.p1.ActualizarStock actualizarStock
                  )
            {
                	 ActualizarStockResponse resp = new  ActualizarStockResponse();
                	 String sql = "select * from producto where referenciaProducto = '"
                	 + actualizarStock.getReferenciaProducto()+"'";
                	 int cantidadFinal=-1;

                 	 try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql)) {
                 		  ResultSet rs = stmt.executeQuery();  
                 		  while (rs.next()){
                 			  cantidadFinal = rs.getInt("producto.stock") - actualizarStock.getNumeroUnidades();
                 		  }           		                    		 
                 		} catch (SQLException sqle) { 
                 		  System.out.println("Error en la ejecuci�n:" 
                 		    + sqle.getErrorCode() + " " + sqle.getMessage());    
                 		}
                 		if(cantidadFinal ==-1){
                 			resp.setOut(false);
                 		}
                 		else{
                 			
                 			String sql1 = "UPDATE producto SET stock = ? "
  				                  + " WHERE referenciaProducto = ?";               	 
	  	                 	 try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql1)) {
	  	                 		 stmt.setInt(1,cantidadFinal);
	  	                 		 stmt.setString(2,actualizarStock.getReferenciaProducto());
	  	                 		 stmt.executeUpdate();
	  	                 		 resp.setOut(true);
	  	                 		 return resp;
	  	                 		} catch (SQLException sqle) { 
	  	                 		  System.out.println("Error en la ejecuci�n:" 
	  	                 		    + sqle.getErrorCode() + " " + sqle.getMessage());    
	  	                 		}
                 		}
                 			
                	 return resp;
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param solicitarPresupuesto 
             * @return solicitarPresupuestoResponse 
         */
        
                 public org.example.www.p1.SolicitarPresupuestoResponse solicitarPresupuesto
                  (
                  org.example.www.p1.SolicitarPresupuesto solicitarPresupuesto
                  )
            {
                	 SolicitarPresupuestoResponse resp = new SolicitarPresupuestoResponse();
                	 resp.setOut(-1);
                	 String sql = "select * from producto where referenciaProducto = '"
                	 + solicitarPresupuesto.getReferenciaProducto()+"'";
                 	 try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql)) {
                 		  ResultSet rs = stmt.executeQuery();  
                 		  while (rs.next()){
                 			  if(solicitarPresupuesto.getNumeroUnidades() <= rs.getInt("producto.stock")){				  
                 				  resp.setOut(solicitarPresupuesto.getNumeroUnidades()
                 						  *getPrecioProducto(solicitarPresupuesto.getReferenciaProducto()));
                 				  return resp;
                 			  }
                 		  }           		                    		 
                 		} catch (SQLException sqle) { 
                 		  System.out.println("Error en la ejecuci�n:" 
                 		    + sqle.getErrorCode() + " " + sqle.getMessage());    
                 		}
                	 return resp;
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param ordenarCompra 
             * @return ordenarCompraResponse 
         */
        
                 public org.example.www.p1.OrdenarCompraResponse ordenarCompra
                  (
                  org.example.www.p1.OrdenarCompra ordenarCompra
                  )
            {
                	 OrdenarCompraResponse resp = new OrdenarCompraResponse();
                	 resp.setOut(false);
                	 
                	 int cantidad=-1;
                	 String sqlc = "select * from producto where referenciaProducto = '"
                        	 + ordenarCompra.getReferenciaProducto()+"'";
                	 try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sqlc)){
                 		  ResultSet rs = stmt.executeQuery();           		 
                 		  while (rs.next()){
                 			 cantidad= rs.getInt("stock");
                 		  }           		                    		 
                 		} catch (SQLException sqle) { 
                 		  System.out.println("Error en la ejecuci�n:" 
                 		    + sqle.getErrorCode() + " " + sqle.getMessage());    
                 		}
                	 if(cantidad == -1){
                		 return resp;
                	 }
                	 else{
                    	 String sql = "UPDATE producto SET stock = ? "
    			                  + " WHERE referenciaProducto = ?";               	 
                     	 try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql)) {
                     		 stmt.setInt(1,cantidad-ordenarCompra.getNumeroUnidades());
                     		 stmt.setString(2,ordenarCompra.getReferenciaProducto());
                     		 stmt.executeUpdate();
                     		 resp.setOut(true);
                     		} catch (SQLException sqle) { 
                     		  System.out.println("Error en la ejecuci�n:" 
                     		    + sqle.getErrorCode() + " " + sqle.getMessage());    
                     		}
                	 }
                	 return resp;
        }
     
    }
    