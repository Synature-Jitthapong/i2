package com.syn.iorder.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SettingDatabase extends SQLiteOpenHelper {
	
	private static final String DATABASE_NAME = "setting.db";
	private static final int DATABASE_VERSION = 1;

	private static final String SQL_CREATE = 
			"CREATE TABLE setting(" +
			" serv_ip TEXT NOT NULL, " +
			" backoffice TEXT NOT NULL " +
			");";
	
	public SettingDatabase(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(SQL_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE setting");
		onCreate(db);
	}

}
