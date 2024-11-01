package com.google.firebase.messaging;

import M.C1325c;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import c1.InterfaceC2009b;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import q0.AbstractC3628n;
import q0.InterfaceC3617c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class D {

    /* renamed from: a, reason: collision with root package name */
    private final A0.f f18518a;

    /* renamed from: b, reason: collision with root package name */
    private final I f18519b;

    /* renamed from: c, reason: collision with root package name */
    private final C1325c f18520c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2009b f18521d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC2009b f18522e;

    /* renamed from: f, reason: collision with root package name */
    private final d1.e f18523f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D(A0.f fVar, I i8, InterfaceC2009b interfaceC2009b, InterfaceC2009b interfaceC2009b2, d1.e eVar) {
        this(fVar, i8, new C1325c(fVar.k()), interfaceC2009b, interfaceC2009b2, eVar);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task c(Task task) {
        return task.g(new androidx.privacysandbox.ads.adservices.adid.g(), new InterfaceC3617c() { // from class: com.google.firebase.messaging.C
            @Override // q0.InterfaceC3617c
            public final Object a(Task task2) {
                String i8;
                i8 = D.this.i(task2);
                return i8;
            }
        });
    }

    private String d() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f18518a.m().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String g(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString(CampaignEx.JSON_NATIVE_VIDEO_ERROR);
            if (!"RST".equals(string3)) {
                if (string3 != null) {
                    throw new IOException(string3);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(String str) {
        if (!"SERVICE_NOT_AVAILABLE".equals(str) && !"INTERNAL_SERVER_ERROR".equals(str) && !"InternalServerError".equals(str)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i(Task task) {
        return g((Bundle) task.k(IOException.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "scope"
            r5.putString(r1, r4)
            java.lang.String r4 = "sender"
            r5.putString(r4, r3)
            java.lang.String r4 = "subtype"
            r5.putString(r4, r3)
            A0.f r3 = r2.f18518a
            A0.o r3 = r3.n()
            java.lang.String r3 = r3.c()
            java.lang.String r4 = "gmp_app_id"
            r5.putString(r4, r3)
            com.google.firebase.messaging.I r3 = r2.f18519b
            int r3 = r3.d()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "gmsv"
            r5.putString(r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "osv"
            r5.putString(r4, r3)
            com.google.firebase.messaging.I r3 = r2.f18519b
            java.lang.String r3 = r3.a()
            java.lang.String r4 = "app_ver"
            r5.putString(r4, r3)
            com.google.firebase.messaging.I r3 = r2.f18519b
            java.lang.String r3 = r3.b()
            java.lang.String r4 = "app_ver_name"
            r5.putString(r4, r3)
            java.lang.String r3 = "firebase-app-name-hash"
            java.lang.String r4 = r2.d()
            r5.putString(r3, r4)
            d1.e r3 = r2.f18523f     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            r4 = 0
            com.google.android.gms.tasks.Task r3 = r3.a(r4)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            java.lang.Object r3 = q0.AbstractC3628n.a(r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            com.google.firebase.installations.g r3 = (com.google.firebase.installations.g) r3     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            java.lang.String r3 = r3.b()     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            if (r4 != 0) goto L7a
            java.lang.String r4 = "Goog-Firebase-Installations-Auth"
            r5.putString(r4, r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            goto L85
        L76:
            r3 = move-exception
            goto L80
        L78:
            r3 = move-exception
            goto L80
        L7a:
            java.lang.String r3 = "FIS auth token is empty"
            android.util.Log.w(r0, r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            goto L85
        L80:
            java.lang.String r4 = "Failed to get FIS auth token"
            android.util.Log.e(r0, r4, r3)
        L85:
            d1.e r3 = r2.f18523f
            com.google.android.gms.tasks.Task r3 = r3.getId()
            java.lang.Object r3 = q0.AbstractC3628n.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "appid"
            r5.putString(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fcm-"
            r3.append(r4)
            java.lang.String r4 = "24.0.2"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "cliv"
            r5.putString(r4, r3)
            c1.b r3 = r2.f18522e
            java.lang.Object r3 = r3.get()
            a1.j r3 = (a1.InterfaceC1660j) r3
            c1.b r4 = r2.f18521d
            java.lang.Object r4 = r4.get()
            k1.i r4 = (k1.i) r4
            if (r3 == 0) goto Le2
            if (r4 == 0) goto Le2
            java.lang.String r0 = "fire-iid"
            a1.j$a r3 = r3.b(r0)
            a1.j$a r0 = a1.InterfaceC1660j.a.NONE
            if (r3 == r0) goto Le2
            int r3 = r3.b()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r0 = "Firebase-Client-Log-Type"
            r5.putString(r0, r3)
            java.lang.String r3 = "Firebase-Client"
            java.lang.String r4 = r4.a()
            r5.putString(r3, r4)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.D.j(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    private Task l(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f18520c.c(bundle);
        } catch (InterruptedException | ExecutionException e8) {
            return AbstractC3628n.d(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task e() {
        return this.f18520c.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task f() {
        return c(l(I.c(this.f18518a), "*", new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task k(boolean z8) {
        return this.f18520c.d(z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return c(l(str, "/topics/" + str2, bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task n(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return c(l(str, "/topics/" + str2, bundle));
    }

    D(A0.f fVar, I i8, C1325c c1325c, InterfaceC2009b interfaceC2009b, InterfaceC2009b interfaceC2009b2, d1.e eVar) {
        this.f18518a = fVar;
        this.f18519b = i8;
        this.f18520c = c1325c;
        this.f18521d = interfaceC2009b;
        this.f18522e = interfaceC2009b2;
        this.f18523f = eVar;
    }
}
