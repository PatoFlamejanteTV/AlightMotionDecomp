package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.exifinterface.media.ExifInterface;

/* renamed from: com.google.android.gms.measurement.internal.f2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2345f2 extends AbstractC2477y2 {

    /* renamed from: c, reason: collision with root package name */
    private final C2366i2 f17799c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17800d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2345f2(S2 s22) {
        super(s22);
        this.f17799c = new C2366i2(this, w(), "google_app_measurement_local.db");
    }

    private static long B(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{ExifInterface.GPS_MEASUREMENT_3D}, null, null, "rowid desc", "1");
            if (cursor.moveToFirst()) {
                long j8 = cursor.getLong(0);
                cursor.close();
                return j8;
            }
            cursor.close();
            return -1L;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[Catch: all -> 0x0056, SQLiteException -> 0x005a, SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bc, TRY_ENTER, TryCatch #6 {SQLiteDatabaseLockedException -> 0x00bc, SQLiteFullException -> 0x005c, SQLiteException -> 0x005a, all -> 0x0056, blocks: (B:74:0x004b, B:76:0x0051, B:17:0x006b, B:19:0x008f, B:20:0x00a9), top: B:73:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean D(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2345f2.D(int, byte[]):boolean");
    }

    private final SQLiteDatabase K() {
        if (this.f17800d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f17799c.getWritableDatabase();
        if (writableDatabase == null) {
            this.f17800d = true;
            return null;
        }
        return writableDatabase;
    }

    private final boolean L() {
        return w().getDatabasePath("google_app_measurement_local.db").exists();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2477y2
    protected final boolean A() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List C(int r22) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2345f2.C(int):java.util.List");
    }

    public final boolean E(C2335e c2335e) {
        g();
        byte[] q02 = d6.q0(c2335e);
        if (q02.length > 131072) {
            a().I().a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return D(2, q02);
    }

    public final boolean F(E e8) {
        Parcel obtain = Parcel.obtain();
        e8.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            a().I().a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return D(0, marshall);
    }

    public final boolean G(Y5 y52) {
        Parcel obtain = Parcel.obtain();
        y52.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            a().I().a("User property too long for local database. Sending directly to service");
            return false;
        }
        return D(1, marshall);
    }

    public final void H() {
        int delete;
        k();
        try {
            SQLiteDatabase K8 = K();
            if (K8 != null && (delete = K8.delete("messages", null, null)) > 0) {
                a().K().b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e8) {
            a().G().b("Error resetting local analytics data. error", e8);
        }
    }

    public final boolean I() {
        return D(3, new byte[0]);
    }

    public final boolean J() {
        k();
        if (this.f17800d || !L()) {
            return false;
        }
        int i8 = 5;
        for (int i9 = 0; i9 < 5; i9++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase K8 = K();
                    if (K8 == null) {
                        this.f17800d = true;
                        if (K8 != null) {
                            K8.close();
                        }
                        return false;
                    }
                    K8.beginTransaction();
                    K8.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    K8.setTransactionSuccessful();
                    K8.endTransaction();
                    K8.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i8);
                    i8 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e8) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    a().G().b("Error deleting app launch break from local database", e8);
                    this.f17800d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteFullException e9) {
                a().G().b("Error deleting app launch break from local database", e9);
                this.f17800d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        a().L().a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2401n2 a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2349g b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2467x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2359h2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2484z2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1, com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1, com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1, com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2474y l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2352g2 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2345f2 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ F3 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2465w4 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ F4 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2418p5 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ Context w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ V.d x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2321c y() {
        return super.y();
    }
}
