package com.mbridge.msdk.foundation.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private a f20442a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a extends SQLiteOpenHelper {
        public a(Context context, String str, int i8) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i8);
            if (MBridgeConstans.DEBUG) {
                ad.a("DatabaseOpenHelper", "数据库： name :" + str + "  " + i8);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (MBridgeConstans.DEBUG) {
                ad.a("DatabaseOpenHelper", "数据库创建了");
            }
            g.this.a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
            g.this.a(sQLiteDatabase, i8, i9);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
            if (MBridgeConstans.DEBUG) {
                ad.a("DatabaseOpenHelper", "数据库升级了");
            }
            g.this.b(sQLiteDatabase, i8, i9);
        }
    }

    public g(Context context) {
        this.f20442a = new a(context, a(), b());
    }

    protected abstract String a();

    protected abstract void a(SQLiteDatabase sQLiteDatabase);

    protected abstract void a(SQLiteDatabase sQLiteDatabase, int i8, int i9);

    protected abstract int b();

    protected abstract void b(SQLiteDatabase sQLiteDatabase, int i8, int i9);

    public final SQLiteDatabase c() {
        return this.f20442a.getReadableDatabase();
    }

    public final synchronized SQLiteDatabase d() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f20442a.getWritableDatabase();
        } catch (Exception unused) {
            sQLiteDatabase = null;
        }
        return sQLiteDatabase;
    }
}
