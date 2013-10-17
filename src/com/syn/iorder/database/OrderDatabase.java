package com.syn.iorder.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class OrderDatabase extends SQLiteOpenHelper {
	private static final String DATABASE_NAME = "order.db";
	private static final int DATABASE_VERSION = 1;
	
	private static final String SQL_CREATE = 
			"CREATE table";
	public OrderDatabase(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(android.database.sqlite.SQLiteDatabase arg0) {
		
	}

	@Override
	public void onUpgrade(android.database.sqlite.SQLiteDatabase db,
			int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
	
}
