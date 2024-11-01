package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.u4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2451u4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f18071a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2430r4 f18072b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18073c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f18074d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2437s4 f18075e;

    public RunnableC2451u4(C2437s4 c2437s4, String str, URL url, byte[] bArr, Map map, InterfaceC2430r4 interfaceC2430r4) {
        this.f18075e = c2437s4;
        AbstractC1396p.f(str);
        AbstractC1396p.l(url);
        AbstractC1396p.l(interfaceC2430r4);
        this.f18071a = url;
        this.f18072b = interfaceC2430r4;
        this.f18073c = str;
        this.f18074d = null;
    }

    private final void b(final int i8, final Exception exc, final byte[] bArr, final Map map) {
        this.f18075e.f().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.t4
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC2451u4.this.a(i8, exc, bArr, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i8, Exception exc, byte[] bArr, Map map) {
        this.f18072b.a(this.f18073c, i8, exc, bArr, map);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        byte[] s8;
        this.f18075e.i();
        int i8 = 0;
        try {
            URLConnection b9 = com.google.android.gms.internal.measurement.D0.a().b(this.f18071a, "client-measurement");
            if (b9 instanceof HttpURLConnection) {
                httpURLConnection = (HttpURLConnection) b9;
                httpURLConnection.setDefaultUseCaches(false);
                httpURLConnection.setConnectTimeout(MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
                httpURLConnection.setReadTimeout(61000);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoInput(true);
                try {
                    i8 = httpURLConnection.getResponseCode();
                    map = httpURLConnection.getHeaderFields();
                } catch (IOException e8) {
                    e = e8;
                    map = null;
                } catch (Throwable th) {
                    th = th;
                    map = null;
                }
                try {
                    C2437s4 c2437s4 = this.f18075e;
                    s8 = C2437s4.s(httpURLConnection);
                    httpURLConnection.disconnect();
                    b(i8, null, s8, map);
                    return;
                } catch (IOException e9) {
                    e = e9;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    b(i8, e, null, map);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    b(i8, null, null, map);
                    throw th;
                }
            }
            throw new IOException("Failed to obtain HTTP connection");
        } catch (IOException e10) {
            e = e10;
            httpURLConnection = null;
            map = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            map = null;
        }
    }
}
