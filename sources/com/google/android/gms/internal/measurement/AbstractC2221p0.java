package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.gms.internal.measurement.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2221p0 extends SQLiteOpenHelper {
    public AbstractC2221p0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i8) {
        this(context, str, null, 1, AbstractC2236r0.f16953a);
    }

    private AbstractC2221p0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i8, AbstractC2236r0 abstractC2236r0) {
        super(context, (str == null || AbstractC2178k0.a().a(str, abstractC2236r0, EnumC2213o0.SQLITE_OPEN_HELPER_TYPE).equals("")) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
