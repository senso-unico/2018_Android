package Util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SqlHelper extends SQLiteOpenHelper {
    public SqlHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = " CREATE TABLE PCROOM "
        +" (id integer primary key autoincrement, "
        +" name text, address text, oldAddress text, longitude text, latitude text, cpu text, gpu text, ram text, monitor text, keyboard text, mouse text, phone_charge text, bool_smokingArea Boolean, bool_card Boolean, bool_parkinglot Boolean, bool_office Boolean, bool_print Boolean, bool_scanner Boolean, printPrice text, colorPrintPrice text, scannerPrice text) ";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = " DROP TABLE PCROOM ";
        db.execSQL(sql);
        onCreate(db);
    }
}
