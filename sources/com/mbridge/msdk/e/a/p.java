package com.mbridge.msdk.e.a;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.e.a.aa;
import com.mbridge.msdk.e.a.b;
import com.mbridge.msdk.e.a.r;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class p<T> implements Comparable<p<T>> {

    /* renamed from: a, reason: collision with root package name */
    private d f20058a;

    /* renamed from: b, reason: collision with root package name */
    private String f20059b;

    /* renamed from: c, reason: collision with root package name */
    private s f20060c;

    /* renamed from: d, reason: collision with root package name */
    private final aa.a f20061d;

    /* renamed from: e, reason: collision with root package name */
    private int f20062e;

    /* renamed from: f, reason: collision with root package name */
    private final String f20063f;

    /* renamed from: g, reason: collision with root package name */
    private final int f20064g;

    /* renamed from: h, reason: collision with root package name */
    private final int f20065h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f20066i;

    /* renamed from: j, reason: collision with root package name */
    private r.a f20067j;

    /* renamed from: k, reason: collision with root package name */
    private Integer f20068k;

    /* renamed from: l, reason: collision with root package name */
    private q f20069l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20070m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20071n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20072o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f20073p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20074q;

    /* renamed from: r, reason: collision with root package name */
    private v f20075r;

    /* renamed from: s, reason: collision with root package name */
    private b.a f20076s;

    /* renamed from: t, reason: collision with root package name */
    private a f20077t;

    /* loaded from: classes4.dex */
    interface a {
        void a(p<?> pVar);

        void a(p<?> pVar, r<?> rVar);
    }

    /* loaded from: classes4.dex */
    public enum b {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public p(int i8, String str) {
        this(i8, str, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract r<T> a(m mVar);

    protected Map<String, String> a() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(T t8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i8) {
        q qVar = this.f20069l;
        if (qVar != null) {
            qVar.a(this, i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(String str) {
        q qVar = this.f20069l;
        if (qVar != null) {
            qVar.b(this);
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        p pVar = (p) obj;
        b e8 = e();
        b e9 = pVar.e();
        if (e8 == e9) {
            return this.f20068k.intValue() - pVar.f20068k.intValue();
        }
        return e9.ordinal() - e8.ordinal();
    }

    public Map<String, String> d() {
        return Collections.emptyMap();
    }

    public b e() {
        return b.NORMAL;
    }

    public final int f() {
        return this.f20064g;
    }

    public final int g() {
        return this.f20062e;
    }

    public final int h() {
        return this.f20065h;
    }

    public final String i() {
        return this.f20063f;
    }

    public final String j() {
        if (!TextUtils.isEmpty(this.f20059b)) {
            return this.f20059b;
        }
        if (this.f20058a == null) {
            this.f20058a = new com.mbridge.msdk.e.a.a.d();
        }
        String a9 = this.f20058a.a(this);
        this.f20059b = a9;
        return a9;
    }

    public final s k() {
        return this.f20060c;
    }

    public final b.a l() {
        return this.f20076s;
    }

    public final boolean m() {
        boolean z8;
        synchronized (this.f20066i) {
            z8 = this.f20071n;
        }
        return z8;
    }

    public final String n() {
        return "application/x-www-form-urlencoded; charset=" + C.UTF8_NAME;
    }

    public final byte[] o() {
        Map<String, String> a9 = a();
        if (a9 != null && a9.size() > 0) {
            return a(a9, C.UTF8_NAME);
        }
        return null;
    }

    public final boolean p() {
        return this.f20070m;
    }

    public final boolean q() {
        return this.f20073p;
    }

    public final boolean r() {
        return this.f20074q;
    }

    public final int s() {
        return b().a();
    }

    public final void t() {
        synchronized (this.f20066i) {
            this.f20072o = true;
        }
    }

    public String toString() {
        String str;
        String str2 = "0x" + Integer.toHexString(this.f20065h);
        StringBuilder sb = new StringBuilder();
        if (m()) {
            str = "[X] ";
        } else {
            str = "[ ] ";
        }
        sb.append(str);
        sb.append(this.f20063f);
        sb.append(" ");
        sb.append(str2);
        sb.append(" ");
        sb.append(e());
        sb.append(" ");
        sb.append(this.f20068k);
        return sb.toString();
    }

    public final boolean u() {
        boolean z8;
        synchronized (this.f20066i) {
            z8 = this.f20072o;
        }
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v() {
        a aVar;
        synchronized (this.f20066i) {
            aVar = this.f20077t;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public p(int i8, String str, int i9) {
        Uri parse;
        String host;
        this.f20061d = null;
        this.f20066i = new Object();
        int i10 = 0;
        this.f20070m = false;
        this.f20071n = false;
        this.f20072o = false;
        this.f20073p = false;
        this.f20074q = false;
        this.f20076s = null;
        this.f20062e = i8;
        this.f20063f = str;
        this.f20064g = i9;
        this.f20075r = new f();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i10 = host.hashCode();
        }
        this.f20065h = i10;
    }

    public final void a(r.a aVar) {
        this.f20067j = aVar;
    }

    public final void a(int i8) {
        this.f20062e = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<?> b(boolean z8) {
        this.f20073p = z8;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<?> c(int i8) {
        this.f20068k = Integer.valueOf(i8);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<?> a(q qVar) {
        this.f20069l = qVar;
        return this;
    }

    public v b() {
        return this.f20075r;
    }

    public void c() {
        synchronized (this.f20066i) {
            this.f20071n = true;
            this.f20067j = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<?> a(b.a aVar) {
        this.f20076s = aVar;
        return this;
    }

    public final void b(z zVar) {
        r.a aVar;
        synchronized (this.f20066i) {
            aVar = this.f20067j;
        }
        if (aVar != null) {
            aVar.a(zVar);
        }
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            int i8 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i8++;
                if (entry.getKey() != null) {
                    sb.append(URLEncoder.encode(entry.getKey(), str));
                    sb.append('=');
                    sb.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str));
                    if (i8 <= map.size() - 1) {
                        sb.append('&');
                    }
                }
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e8) {
            throw new RuntimeException("Encoding not supported: " + str, e8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<?> c(boolean z8) {
        this.f20074q = z8;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<?> a(boolean z8) {
        this.f20070m = z8;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(a aVar) {
        synchronized (this.f20066i) {
            this.f20077t = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(r<?> rVar) {
        a aVar;
        synchronized (this.f20066i) {
            aVar = this.f20077t;
        }
        if (aVar != null) {
            aVar.a(this, rVar);
        }
    }
}
