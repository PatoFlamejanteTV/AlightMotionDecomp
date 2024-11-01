package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.core.content.PermissionChecker;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.b3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2100b3 implements InterfaceC2091a3 {

    /* renamed from: c, reason: collision with root package name */
    private static C2100b3 f16585c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f16586a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentObserver f16587b;

    private C2100b3() {
        this.f16586a = null;
        this.f16587b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2100b3 a(Context context) {
        C2100b3 c2100b3;
        C2100b3 c2100b32;
        synchronized (C2100b3.class) {
            try {
                if (f16585c == null) {
                    if (PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        c2100b32 = new C2100b3(context);
                    } else {
                        c2100b32 = new C2100b3();
                    }
                    f16585c = c2100b32;
                }
                c2100b3 = f16585c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2100b3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void b() {
        Context context;
        synchronized (C2100b3.class) {
            try {
                C2100b3 c2100b3 = f16585c;
                if (c2100b3 != null && (context = c2100b3.f16586a) != null && c2100b3.f16587b != null) {
                    context.getContentResolver().unregisterContentObserver(f16585c.f16587b);
                }
                f16585c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2091a3
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String c(final String str) {
        Context context = this.f16586a;
        if (context != null && !R2.b(context)) {
            try {
                return (String) Z2.a(new InterfaceC2109c3() { // from class: com.google.android.gms.internal.measurement.e3
                    @Override // com.google.android.gms.internal.measurement.InterfaceC2109c3
                    public final Object w() {
                        return C2100b3.this.d(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e8) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e8);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String d(String str) {
        return H2.a(this.f16586a.getContentResolver(), str, null);
    }

    private C2100b3(Context context) {
        this.f16586a = context;
        C2118d3 c2118d3 = new C2118d3(this, null);
        this.f16587b = c2118d3;
        context.getContentResolver().registerContentObserver(G2.f16308a, true, c2118d3);
    }
}
