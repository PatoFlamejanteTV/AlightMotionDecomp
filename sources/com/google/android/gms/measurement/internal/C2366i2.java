package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.AbstractC2221p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2366i2 extends AbstractC2221p0 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2345f2 f17849a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2366i2(C2345f2 c2345f2, Context context, String str) {
        super(context, str, null, 1);
        this.f17849a = c2345f2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e8) {
            throw e8;
        } catch (SQLiteException unused) {
            this.f17849a.a().G().a("Opening the local database failed, dropping and recreating it");
            if (!this.f17849a.w().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f17849a.a().G().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e9) {
                this.f17849a.a().G().b("Failed to open local database. Events will bypass local storage", e9);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC2446u.b(this.f17849a.a(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        AbstractC2446u.c(this.f17849a.a(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
    }
}
