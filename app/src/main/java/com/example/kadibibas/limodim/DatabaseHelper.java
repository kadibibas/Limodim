package com.example.kadibibas.limodim;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Kadi Bibas on 21/05/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper
{
    public  static final String DATABASE_NAME = "Limudum.db";
    public  static final String TABLE_NAME = "Users.db";
    public  static final String COL_1 = "USER_ID";
    public  static final String COL_2 = "NAME";
    public  static final String COL_3 = "PASSWORD";
    public  static final String COL_4 = "EMAIL";
    public  static final String COL_5 = "PHONE";
    public  static final String COL_6 = "CITY";
    public DatabaseHelper(Context context)
    {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("create table" + TABLE_NAME + " (USER_ID INTEGER PRIMARY KAY AUTOINCREMENT, NAME TEXT, PASSWORD TEXT,EMAIL TEXT, PHONE INTEGER, CITY TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData (String name, String password,String email, String phone, String city)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, name);
        contentValues.put(COL_3, password);
        contentValues.put(COL_4, email);
        contentValues.put(COL_5, phone);
        contentValues.put(COL_6, city);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if(result == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
