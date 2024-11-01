package com.mbridge.msdk.foundation.same.net;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes4.dex */
public abstract class i<T> implements Comparable<i<T>> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f20978c = "i";

    /* renamed from: a, reason: collision with root package name */
    protected ConcurrentHashMap<String, String> f20979a;

    /* renamed from: b, reason: collision with root package name */
    protected e<T> f20980b;

    /* renamed from: d, reason: collision with root package name */
    private final int f20981d;

    /* renamed from: e, reason: collision with root package name */
    private final String f20982e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f20983f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f20984g;

    /* renamed from: h, reason: collision with root package name */
    private j f20985h;

    /* renamed from: i, reason: collision with root package name */
    private l f20986i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f20987j;

    /* renamed from: k, reason: collision with root package name */
    private int f20988k;

    public i(int i8, String str, e<T> eVar) {
        this.f20979a = new ConcurrentHashMap<>();
        this.f20984g = false;
        this.f20988k = 2;
        this.f20982e = str;
        this.f20981d = i8;
        this.f20980b = eVar;
        this.f20983f = false;
        this.f20986i = new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract k<T> a(com.mbridge.msdk.foundation.same.net.f.c cVar);

    public final void a() {
        this.f20984g = true;
    }

    public int b() {
        return this.f20988k;
    }

    public final void c() {
        e<T> eVar = this.f20980b;
        if (eVar != null) {
            eVar.onCancel();
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        i iVar = (i) obj;
        int b9 = b();
        int b10 = iVar.b();
        if (b9 == b10) {
            return this.f20987j.intValue() - iVar.f20987j.intValue();
        }
        return b10 - b9;
    }

    public final void d() {
        e<T> eVar = this.f20980b;
        if (eVar != null) {
            eVar.onFinish();
        }
    }

    public final void e() {
        e<T> eVar = this.f20980b;
        if (eVar != null) {
            eVar.onNetworking();
        }
    }

    public final void f() {
        e<T> eVar = this.f20980b;
        if (eVar != null) {
            eVar.onPreExecute();
        }
    }

    public final void g() {
        e<T> eVar = this.f20980b;
        if (eVar != null) {
            eVar.onRetry();
        }
    }

    public byte[] h() {
        return null;
    }

    public final int i() {
        try {
            return this.f20986i.f();
        } catch (Exception unused) {
            return 0;
        }
    }

    public final int j() {
        try {
            return this.f20986i.c();
        } catch (Exception unused) {
            return 10;
        }
    }

    public final Map<String, String> k() {
        return this.f20979a;
    }

    public final int l() {
        return this.f20981d;
    }

    public final int m() {
        try {
            return this.f20986i.d();
        } catch (Exception unused) {
            return 10;
        }
    }

    public final l n() {
        return this.f20986i;
    }

    public final int o() {
        try {
            return this.f20986i.a();
        } catch (Exception unused) {
            return 10;
        }
    }

    public final int p() {
        try {
            return this.f20986i.e();
        } catch (Exception unused) {
            return 10;
        }
    }

    public final boolean q() {
        return this.f20984g;
    }

    public final void r() {
        a("Charset", C.UTF8_NAME);
        if (this.f20983f) {
            a("Connection", "keep-alive");
        } else {
            a("Connection", CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        }
    }

    public final String s() {
        return this.f20982e;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f20984g) {
            str = "[X] ";
        } else {
            str = "[ ] ";
        }
        sb.append(str);
        sb.append(this.f20982e);
        sb.append(" ");
        sb.append(b());
        sb.append(" ");
        sb.append(this.f20987j);
        return sb.toString();
    }

    public final void a(int i8) {
        if (i8 < 1 || i8 > 4) {
            return;
        }
        this.f20988k = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> b(int i8) {
        this.f20987j = Integer.valueOf(i8);
        return this;
    }

    public final void a(long j8, long j9) {
        e<T> eVar = this.f20980b;
        if (eVar != null) {
            eVar.onProgressChange(j8, j9);
        }
    }

    public final void a(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        e<T> eVar = this.f20980b;
        if (eVar != null) {
            eVar.onError(aVar);
        }
    }

    public final void a(k<T> kVar) {
        e<T> eVar = this.f20980b;
        if (eVar != null) {
            eVar.onSuccess(kVar);
        }
    }

    public final void a(String str) {
        j jVar = this.f20985h;
        if (jVar != null) {
            jVar.b(this);
        }
    }

    public i(int i8, String str, e<T> eVar, boolean z8) {
        this.f20979a = new ConcurrentHashMap<>();
        this.f20984g = false;
        this.f20988k = 2;
        this.f20982e = str;
        this.f20981d = i8;
        this.f20980b = eVar;
        this.f20983f = z8;
        this.f20986i = new b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> a(l lVar) {
        this.f20986i = lVar;
        return this;
    }

    public byte[] a(com.mbridge.msdk.foundation.same.net.f.b bVar, c cVar) throws IOException, com.mbridge.msdk.foundation.same.net.b.a {
        if (bVar.a() != null) {
            return a(bVar);
        }
        return new byte[0];
    }

    private byte[] a(com.mbridge.msdk.foundation.same.net.f.b bVar) throws IOException, com.mbridge.msdk.foundation.same.net.b.a {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            InputStream a9 = bVar.a();
            try {
                if (com.mbridge.msdk.foundation.same.net.g.b.b(bVar.b()) && !(a9 instanceof GZIPInputStream)) {
                    a9 = new GZIPInputStream(a9);
                }
                if (a9 != null) {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = a9.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream2.write(bArr, 0, read);
                        }
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        try {
                            a9.close();
                            byteArrayOutputStream2.close();
                        } catch (IOException e8) {
                            ad.b(f20978c, e8.getMessage());
                        }
                        return byteArray;
                    } catch (Throwable th) {
                        inputStream = a9;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        th = th;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e9) {
                                ad.b(f20978c, e9.getMessage());
                                throw th;
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th;
                    }
                }
                throw new com.mbridge.msdk.foundation.same.net.b.a(7, null);
            } catch (Throwable th2) {
                th = th2;
                inputStream = a9;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    public i(int i8, String str) {
        this.f20979a = new ConcurrentHashMap<>();
        this.f20980b = null;
        this.f20984g = false;
        this.f20988k = 2;
        this.f20982e = str;
        this.f20981d = i8;
        this.f20983f = false;
        this.f20986i = new b();
    }

    public final void a(e<T> eVar) {
        this.f20980b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> a(j jVar) {
        this.f20985h = jVar;
        return this;
    }

    public final void a(String str, String str2) {
        this.f20979a.remove(str);
        this.f20979a.put(str, str2);
    }
}
