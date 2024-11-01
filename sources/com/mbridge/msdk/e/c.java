package com.mbridge.msdk.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final b f20102a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20103b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f20104c = new Object();

    public c(b bVar, String str) {
        this.f20102a = bVar;
        this.f20103b = str;
    }

    private static boolean a(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase == null || !sQLiteDatabase.isOpen() || sQLiteDatabase.isReadOnly();
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        if (y.a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.beginTransaction();
        } catch (Exception e8) {
            if (a.f19988a) {
                Log.e("TrackManager", "beginTransaction: ", e8);
            }
        }
    }

    public final void b(List<i> list) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f20104c) {
            if (y.a(this.f20102a) || y.a((List<?>) list)) {
                return;
            }
            try {
                sQLiteDatabase = this.f20102a.getWritableDatabase();
            } catch (Exception e8) {
                if (a.f19988a) {
                    Log.e("TrackManager", "updateReportStateSuccess getWritableDatabase: " + e8.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (a(sQLiteDatabase)) {
                return;
            }
            try {
                try {
                    d(sQLiteDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", (Integer) 2);
                        sQLiteDatabase.update(this.f20103b, contentValues, "uuid = ?", new String[]{iVar.f()});
                    }
                    c(sQLiteDatabase);
                } catch (Exception e9) {
                    if (a.f19988a) {
                        Log.e("TrackManager", "updateReportStateSuccess: " + e9.getMessage());
                    }
                }
                b(sQLiteDatabase);
            } catch (Throwable th) {
                b(sQLiteDatabase);
                throw th;
            }
        }
    }

    public final void c(List<i> list) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f20104c) {
            if (y.a(this.f20102a) || y.a((List<?>) list)) {
                return;
            }
            try {
                sQLiteDatabase = this.f20102a.getWritableDatabase();
            } catch (Exception e8) {
                if (a.f19988a) {
                    Log.e("TrackManager", "updateReportStateFailed getWritableDatabase: " + e8.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (a(sQLiteDatabase)) {
                return;
            }
            try {
                try {
                    d(sQLiteDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", Integer.valueOf(iVar.e()));
                        contentValues.put("report_count", Integer.valueOf(iVar.d()));
                        sQLiteDatabase.update(this.f20103b, contentValues, "uuid = ?", new String[]{iVar.f()});
                    }
                    c(sQLiteDatabase);
                } catch (Exception e9) {
                    if (a.f19988a) {
                        Log.e("TrackManager", "updateReportStateFailed: " + e9.getMessage());
                    }
                }
                b(sQLiteDatabase);
            } catch (Throwable th) {
                b(sQLiteDatabase);
                throw th;
            }
        }
    }

    public final long a(i iVar) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f20104c) {
            long j8 = -1;
            if (y.a(this.f20102a)) {
                return -1L;
            }
            try {
                sQLiteDatabase = this.f20102a.getWritableDatabase();
            } catch (Exception e8) {
                if (a.f19988a) {
                    Log.e("TrackManager", "insert getWritableDatabase: " + e8.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (a(sQLiteDatabase)) {
                return -1L;
            }
            try {
                try {
                    d(sQLiteDatabase);
                    ContentValues contentValues = new ContentValues(16);
                    e c8 = iVar.c();
                    contentValues.put("name", c8.a());
                    contentValues.put("type", Integer.valueOf(c8.b()));
                    contentValues.put("time_stamp", Long.valueOf(c8.f()));
                    contentValues.put("properties", c8.d().toString());
                    contentValues.put("priority", Integer.valueOf(c8.c()));
                    contentValues.put("state", Integer.valueOf(iVar.e()));
                    contentValues.put("report_count", Integer.valueOf(iVar.d()));
                    contentValues.put("uuid", c8.e());
                    contentValues.put("ignore_max_timeout", Integer.valueOf(!c8.j() ? 1 : 0));
                    contentValues.put("ignore_max_retry_times", Integer.valueOf(!c8.k() ? 1 : 0));
                    contentValues.put("invalid_time", Long.valueOf(iVar.g()));
                    j8 = sQLiteDatabase.insert(this.f20103b, null, contentValues);
                    c(sQLiteDatabase);
                } finally {
                    b(sQLiteDatabase);
                }
            } catch (Exception e9) {
                if (a.f19988a) {
                    Log.e("TrackManager", "insert: " + e9.getMessage());
                }
            }
            return j8;
        }
    }

    public final int b() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f20104c) {
            int i8 = -1;
            if (y.a(this.f20102a)) {
                return -1;
            }
            try {
                sQLiteDatabase = this.f20102a.getWritableDatabase();
            } catch (Exception e8) {
                if (a.f19988a) {
                    Log.e("TrackManager", "deleteInvalidEvents getWritableDatabase: " + e8.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (a(sQLiteDatabase)) {
                return -1;
            }
            try {
                try {
                    d(sQLiteDatabase);
                    i8 = sQLiteDatabase.delete(this.f20103b, "state = ? OR state = ?", new String[]{String.valueOf(-1), String.valueOf(2)});
                    c(sQLiteDatabase);
                } catch (Exception e9) {
                    if (a.f19988a) {
                        Log.e("TrackManager", "deleteInvalidEvents: " + e9.getMessage());
                    }
                }
                return i8;
            } finally {
                b(sQLiteDatabase);
            }
        }
    }

    public final void c() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f20104c) {
            if (y.a(this.f20102a)) {
                return;
            }
            try {
                sQLiteDatabase = this.f20102a.getWritableDatabase();
            } catch (Exception e8) {
                if (a.f19988a) {
                    Log.e("TrackManager", "updateReportStateForReporting getWritableDatabase: " + e8.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (a(sQLiteDatabase)) {
                return;
            }
            try {
                try {
                    d(sQLiteDatabase);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", (Integer) 3);
                    sQLiteDatabase.update(this.f20103b, contentValues, "state = ?", new String[]{String.valueOf(1)});
                    c(sQLiteDatabase);
                } catch (Exception e9) {
                    if (a.f19988a) {
                        Log.e("TrackManager", "updateReportStateForReporting: " + e9.getMessage());
                    }
                }
            } finally {
                b(sQLiteDatabase);
            }
        }
    }

    public final List<i> a(int i8) {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        Cursor cursor;
        List<i> list;
        synchronized (this.f20104c) {
            Cursor cursor2 = null;
            List<i> list2 = null;
            cursor2 = null;
            if (y.a(this.f20102a)) {
                return null;
            }
            try {
                sQLiteDatabase = this.f20102a.getWritableDatabase();
            } catch (Exception e8) {
                if (a.f19988a) {
                    Log.e("TrackManager", "getAvailable getWritableDatabase: " + e8.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (a(sQLiteDatabase)) {
                return null;
            }
            try {
                try {
                    d(sQLiteDatabase);
                    cursor = sQLiteDatabase.query(this.f20103b, null, "state = ? OR state = ?", new String[]{String.valueOf(0), String.valueOf(3)}, null, null, "priority DESC", String.valueOf(i8));
                    try {
                        list2 = y.b(cursor);
                        c(sQLiteDatabase);
                        b(sQLiteDatabase);
                        y.a(cursor);
                    } catch (Exception e9) {
                        e = e9;
                        List<i> list3 = list2;
                        cursor2 = cursor;
                        list = list3;
                        if (a.f19988a) {
                            Log.e("TrackManager", "getAvailable: " + e.getMessage());
                        }
                        b(sQLiteDatabase);
                        y.a(cursor2);
                        list2 = list;
                        return list2;
                    } catch (Throwable th2) {
                        th = th2;
                        b(sQLiteDatabase);
                        y.a(cursor);
                        throw th;
                    }
                } catch (Throwable th3) {
                    Cursor cursor3 = cursor2;
                    th = th3;
                    cursor = cursor3;
                }
            } catch (Exception e10) {
                e = e10;
                list = null;
            }
            return list2;
        }
    }

    private static void b(SQLiteDatabase sQLiteDatabase) {
        if (y.a(sQLiteDatabase) || !sQLiteDatabase.inTransaction()) {
            return;
        }
        try {
            sQLiteDatabase.endTransaction();
        } catch (Exception e8) {
            if (a.f19988a) {
                Log.e("TrackManager", "endTransaction: ", e8);
            }
        }
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        if (y.a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e8) {
            if (a.f19988a) {
                Log.e("TrackManager", "transactionSuccess: ", e8);
            }
        }
    }

    public final int a() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f20104c) {
            int i8 = 0;
            if (y.a(this.f20102a)) {
                return 0;
            }
            Cursor cursor = null;
            try {
                sQLiteDatabase = this.f20102a.getWritableDatabase();
            } catch (Exception e8) {
                if (a.f19988a) {
                    Log.e("TrackManager", "getAvailableCount getWritableDatabase: " + e8.getMessage());
                }
                sQLiteDatabase = null;
            }
            try {
                if (a(sQLiteDatabase)) {
                    return 0;
                }
                try {
                    d(sQLiteDatabase);
                    cursor = sQLiteDatabase.query(this.f20103b, null, "state = ? OR state = ?", new String[]{String.valueOf(3), String.valueOf(0)}, null, null, null, null);
                    if (cursor != null && cursor.moveToNext()) {
                        i8 = Math.max(cursor.getCount(), 0);
                    }
                    c(sQLiteDatabase);
                    b(sQLiteDatabase);
                } catch (Exception e9) {
                    if (a.f19988a) {
                        Log.e("TrackManager", "getAvailableCount: " + e9.getMessage());
                    }
                    b(sQLiteDatabase);
                }
                y.a(cursor);
                return i8;
            } catch (Throwable th) {
                b(sQLiteDatabase);
                y.a(cursor);
                throw th;
            }
        }
    }

    public final void a(List<i> list) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f20104c) {
            if (y.a(this.f20102a) || y.a((List<?>) list)) {
                return;
            }
            try {
                sQLiteDatabase = this.f20102a.getWritableDatabase();
            } catch (Exception e8) {
                if (a.f19988a) {
                    Log.e("TrackManager", "updateReportStateReporting getWritableDatabase: " + e8.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (a(sQLiteDatabase)) {
                return;
            }
            try {
                try {
                    d(sQLiteDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", (Integer) 1);
                        sQLiteDatabase.update(this.f20103b, contentValues, "uuid = ?", new String[]{iVar.f()});
                    }
                    c(sQLiteDatabase);
                } catch (Exception e9) {
                    if (a.f19988a) {
                        Log.e("TrackManager", "updateReportStateReporting: " + e9.getMessage());
                    }
                }
                b(sQLiteDatabase);
            } catch (Throwable th) {
                b(sQLiteDatabase);
                throw th;
            }
        }
    }
}
