package com.example.final_project;

import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObservable;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Data extends SQLiteOpenHelper {
    public static final String dbName = "mylist.db";
    public static final String tbName = "mylist_data";
    public static final String col1 = "ID";
    public static final String col2 = "item1";


    public Data(Context context) {super(context, dbName, null, 1);}
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String createTable = "CREATE TABLE" + tbName+"(ID Integer Primary Key Autoincrement,"+"ITEM1 Text)";
        db.execSQL( createTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        String a = "Drop table if EXIST" + tbName;
        db.execSQL(a);
        onCreate(db);

    }

    public boolean addData(String item1)
    {
        SQLiteDatabase dq = this.getWritableDatabase();
        ContentValues CV = new ContentValues();
        CV.put(col2, item1);

        long result = dq.insert(tbName, null, CV);
        if(result == -1)
        {
            return false;
        }
        else {
            return true;
        }
    }

    public Cursor getListContents()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT* FROM" + tbName, null);
        return data;
    }
}
