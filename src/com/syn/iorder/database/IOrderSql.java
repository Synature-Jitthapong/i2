package com.syn.iorder.database;

public class IOrderSql {
	public static final String TB_PROPERTY =
			"CREATE TABLE property ( " +
			" currency_symbol TEXT, " +
			" currency_code TEXT, " +
			" currency_name TEXT, " +
			" currency_format TEXT, " +
			" date_format TEXT, " +
			" time_format TEXT, " +
			" qty_format TEXT " +
			" );";
	
	public static final String TB_LANGUAGE = 
			"CREATE TABLE language( " +
			" lang_id INTEGER PRIMARY KEY DEFAULT 1, " +
			" lang_name TEXT, " +
			" lang_code TEXT DEFAULT en, " +
			" is_default INTEGER DEFAULT 0 " +
			");";
	
	public static final String TB_COMPUTER =
			"CREATE TABLE computer( " +
			" computer_id INTEGER DEFAULT 0, " +
			" computer_name TEXT " +
			"); ";
	
	public static final String TB_MENU_COMM = 
			"CREATE TABLE menu_comm( " +
			" menu_comm_id INTEGER PRIMARY KEY, " +
			" menu_comm_group_id INTEGER NOT NULL DEFAULT 0, " +
			" menu_comm_name_0 TEXT, " +
			" menu_comm_name_1 TEXT, " +
			" menu_comm_name_2 TEXT, " +
			" menu_comm_name_3 TEXT, " +
			" menu_com_ordering INTEGER " +
			");";
	
	public static final String TB_MENU_COMM_GROUP = 
			"CREATE TABLE menu_comm_group( " +
			" menu_comm_group_id INTEGER PRIMARY KEY, " +
			" menu_comm_group_name_0 TEXT, " +
			" menu_comm_group_name_1 TEXT " +
			"); ";
			
	public static final String TB_MENU_DEPT =
			"CREATE TABLE menu_dept( " +
			" menu_dept_id INTEGER PRIMARY KEY, " +
			" menu_group_id INTEGER, " +
			" menu_dept_name_0 TEXT, " +
			" menu_dept_name_1 TEXT, " +
			" menu_dept_name_2 TEXT, " +
			" menu_dept_name_3 TEXT, " +
			" menu_dept_ordering INTEGER DEFAULT 0, " +
			" activated INTEGER DEFAULT 0" +
			");";
	
	public static final String TB_ORDER = 
			"CREATE TABLE order(" +
			" order_id INTEGER PRIMARY KEY AUTOINCREMENT," +
			" order_status INTEGER NOT NULL DEFAULT 1, " +
			" order_time TEXT NOT NULL" +
			");"; 
	
	public static final String TB_ORDER_DETAIL = 
			"CREATE TABLE order_detail(" +
			" order_detail_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
			" order_id INTEGER NOT NULL, " +
			" order_qty REAL NOT NULL DEFAULT 1, " +
			" order_comm TEXT, " +
			" sale_mode INTEGER NOT NULL DEFAULT 1, " +
			" product_id INTEGER NOT NULL, " +
			" product_unit_price REAL DEFAULT 0 " +
			");";
	
	public static final String TB_ORDER_DETAIL_COMM = 
			"CREATE TABLE order_detail_comm(" +
			" comm_id INTEGER PRIMARY KEY, " +
			" order_detail_id INTEGER, " +
			" comm_qty REAL NOT NULL DEFAUT 0, " +
			" comm_price REAL NOT NULL DEFAULT 0" +
			");";
	
	public static final String TB_ORDER_SET = 
			"CREATE TABLE order_set(" +
			" order_set_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
			" order_detail_id INTEGER NOT NULL, " +
			" order_set_comm TEXT, " +
			" order_set_qty REAL NOT NULL DEFAULT 1, " +
			" product_id INTEGER NOT NULL, " +
			" product_unit_price REAL NOT NULL" +
			");";
	
	public static final String TB_ORDER_SET_COMM = 
			"CREATE TABLE order_set_comm(" +
			" comm_id INTEGER PRIMARY KEY, " +
			" order_set_id INTEGER NOT NULL, " +
			" comm_qty REAL NOT NULL DEFAULT 0, " +
			" comm_price REAL NOT NULL DEFAULT 0" +
			");";
}
