
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
    	private Connection conA = null;
    	
    	public P1Skeleton() throws ClassNotFoundException, SQLException{
    		url = "jdbc:mysql://localhost:3311/proveedor1";
       	 	Class.forName("com.mysql.jdbc.Driver");
       	 	con = (Connection)DriverManager.getConnection(url,"root","root");
       	 	conA = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3311/almacen","root","root");
    	}
        
    	private int cantidadProductoAlmacen(String referencia){
    		int cantidad=-1;
    		String sql = "select * from producto where referenciaProducto = '"
               	 + referencia+"'";
        	 try (PreparedStatement stmt = (PreparedStatement) conA.prepareStatement(sql)) {
        		  ResultSet rs = stmt.executeQuery();  
        		  while (rs.next()){
        			  cantidad = rs.getInt("producto.stock");
        		  }           		                    		 
        		} catch (SQLException sqle) { 
        		  System.out.println("Error en la ejecución:" 
        		    + sqle.getErrorCode() + " " + sqle.getMessage());    
        		}
    		return cantidad;
    	}
    	
    	private float getPrecioProducto(String referencia){
        	float precio = -1;
        	String sqlc = "select * from producto where referenciaProducto = '"
               	 + referencia+"'";
	       	 try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sqlc)){
	        		  ResultSet rs = stmt.executeQuery();           		 
	        		  while (rs.next()){
	        			 precio= rs.getFloat("precio");
	        			 return precio;
	        		  }           		                    		 
	        		} catch (SQLException sqle) { 
	        		  System.out.println("Error en la ejecución:" 
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
                 		  System.out.println("Error en la ejecución:" 
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
	  	                 		  System.out.println("Error en la ejecución:" 
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
                	 resp.setOut(9999999);
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
                 		  System.out.println("Error en la ejecución:" 
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
                	 int cantAlmacen = cantidadProductoAlmacen(ordenarCompra.getReferenciaProducto());
                	 int cantidad=-1;               	 
                	 if(cantAlmacen != 0){
                		 String sqlc = "INSERT INTO producto"+
                	 "(referenciaProducto,precio, stock) VALUES(?,?,?)";
                		 try (PreparedStatement stmt = (PreparedStatement) conA.prepareStatement(sqlc)){
                			 stmt.setString(1,ordenarCompra.getReferenciaProducto());
                			 stmt.setFloat(2, getPrecioProducto(ordenarCompra.getReferenciaProducto()));
                			 stmt.setInt(3,ordenarCompra.getNumeroUnidades());
                			 stmt.executeUpdate();         		 
                    		  resp.setOut(true);
                    		  return resp;
                    		} catch (SQLException sqle) { 
                    		  System.out.println("Error en la ejecución:" 
                    		    + sqle.getErrorCode() + " " + sqle.getMessage());    
                    		}
                		 return resp;
                	 }
                	 else{
                    	 String sql = "UPDATE producto SET stock = ? "
    			                  + " WHERE referenciaProducto = ?";               	 
                     	 try (PreparedStatement stmt = (PreparedStatement) conA.prepareStatement(sql)) {
                     		 stmt.setInt(1,cantAlmacen + ordenarCompra.getNumeroUnidades());
                     		 stmt.setString(2,ordenarCompra.getReferenciaProducto());
                     		 stmt.executeUpdate();
                     		 resp.setOut(true);
                     		} catch (SQLException sqle) { 
                     		  System.out.println("Error en la ejecución:" 
                     		    + sqle.getErrorCode() + " " + sqle.getMessage());    
                     		}
                	 }
                	 return resp;
        }
     
    }
    