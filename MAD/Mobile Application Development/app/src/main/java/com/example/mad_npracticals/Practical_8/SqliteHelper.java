package com.example.mad_npracticals.Practical_8;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SqliteHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "mydb";
    private static final String TABLE_CONTACTS = "myDetail";
    private static final String KEY_FNAME = "fname";
    private static final String KEY_LNAME = "lname";
    private static final String KEY_AGE = "age";

    public SqliteHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }


    @Override

    public void onCreate(SQLiteDatabase db) {

        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_CONTACTS + "("

                + KEY_FNAME + " TEXT," + KEY_LNAME + " TEXT,"

                + KEY_AGE + " INTEGER" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);

    }


    @Override

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS);


// Create tables again onCreate(db);
    }


    public void addDetails(MyDetail myDetail) {
        ContentValues cv = new ContentValues();
        SQLiteDatabase db = this.getWritableDatabase();

        cv.put(KEY_FNAME, myDetail.getFname());
        cv.put(KEY_LNAME, myDetail.getLname());
        cv.put(KEY_AGE, myDetail.getAge());


        db.insert(TABLE_CONTACTS, null, cv);
        db.close();
    }

}

