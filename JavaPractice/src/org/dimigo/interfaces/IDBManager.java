/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *    |_IDBManager
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @AUTHOR : USER
 * @VERSION : 1.0
 */
public interface IDBManager {
	String ORACLEDATABASE="ORACLE";
	String SYBASEDATABASE="SYBASE";
	void insert();
	void search();
	void update();
	void delete();
	static IDBManager getDBObject(String database){
		if(database==ORACLEDATABASE){
			return new OracleDB();
		}
		else{
			return new SybaseDB();
		}
	}
}
