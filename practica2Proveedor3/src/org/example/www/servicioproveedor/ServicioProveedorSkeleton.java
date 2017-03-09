
/**
 * ServicioProveedorSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
    package org.example.www.servicioproveedor;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
     *  ServicioProveedorSkeleton java skeleton for the axisService
     */
    public class ServicioProveedorSkeleton{
    	private String url= null;
    	private Connection con = null;
    	
    	public ServicioProveedorSkeleton() throws ClassNotFoundException, SQLException{
    		url = "jdbc:mysql://localhost:3311/proveedor3";
       	 	Class.forName("com.mysql.jdbc.Driver");
       	 	con = (Connection)DriverManager.getConnection(url,"root","root");
    	}
         
        /**
         * Auto generated method signature
         * 
                                     * @param ordenarCompra 
             * @return ordenarCompraResponse 
         */
        
                 public org.example.www.servicioproveedor.OrdenarCompraResponse ordenarCompra
                  (
                  org.example.www.servicioproveedor.OrdenarCompra ordenarCompra
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
	                 		 stmt.setInt(1,cantidad-ordenarCompra.getNumeroUnidades());
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
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param solicitarPresupuesto 
             * @return solicitarPresupuestoResponse 
         */
        
                 public org.example.www.servicioproveedor.SolicitarPresupuestoResponse solicitarPresupuesto
                  (
                  org.example.www.servicioproveedor.SolicitarPresupuesto solicitarPresupuesto
                  )
            {
            	 SolicitarPresupuestoResponse resp = new SolicitarPresupuestoResponse();
            	 resp.setOut(false);
            	 String sql = "select * from producto where referenciaProducto = '"
            	 + solicitarPresupuesto.getReferenciaProducto()+"'";
             	 try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql)) {
             		  ResultSet rs = stmt.executeQuery();  
             		  while (rs.next()){
             			  if(solicitarPresupuesto.getNumeroUnidades() <= rs.getInt("producto.stock")){
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