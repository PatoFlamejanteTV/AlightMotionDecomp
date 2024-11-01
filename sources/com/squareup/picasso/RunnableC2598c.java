package com.squareup.picasso;

import U6.InterfaceC1451g;
import U6.L;
import U6.Z;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.squareup.picasso.q;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import m2.InterfaceC3361a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class RunnableC2598c implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    private static final Object f24462t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static final ThreadLocal f24463u = new a();

    /* renamed from: v, reason: collision with root package name */
    private static final AtomicInteger f24464v = new AtomicInteger();

    /* renamed from: w, reason: collision with root package name */
    private static final x f24465w = new b();

    /* renamed from: a, reason: collision with root package name */
    final int f24466a = f24464v.incrementAndGet();

    /* renamed from: b, reason: collision with root package name */
    final s f24467b;

    /* renamed from: c, reason: collision with root package name */
    final g f24468c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC3361a f24469d;

    /* renamed from: e, reason: collision with root package name */
    final z f24470e;

    /* renamed from: f, reason: collision with root package name */
    final String f24471f;

    /* renamed from: g, reason: collision with root package name */
    final v f24472g;

    /* renamed from: h, reason: collision with root package name */
    final int f24473h;

    /* renamed from: i, reason: collision with root package name */
    int f24474i;

    /* renamed from: j, reason: collision with root package name */
    final x f24475j;

    /* renamed from: k, reason: collision with root package name */
    AbstractC2596a f24476k;

    /* renamed from: l, reason: collision with root package name */
    List f24477l;

    /* renamed from: m, reason: collision with root package name */
    Bitmap f24478m;

    /* renamed from: n, reason: collision with root package name */
    Future f24479n;

    /* renamed from: o, reason: collision with root package name */
    s.e f24480o;

    /* renamed from: p, reason: collision with root package name */
    Exception f24481p;

    /* renamed from: q, reason: collision with root package name */
    int f24482q;

    /* renamed from: r, reason: collision with root package name */
    int f24483r;

    /* renamed from: s, reason: collision with root package name */
    s.f f24484s;

    /* renamed from: com.squareup.picasso.c$a */
    /* loaded from: classes4.dex */
    static class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* renamed from: com.squareup.picasso.c$b */
    /* loaded from: classes4.dex */
    static class b extends x {
        b() {
        }

        @Override // com.squareup.picasso.x
        public boolean c(v vVar) {
            return true;
        }

        @Override // com.squareup.picasso.x
        public x.a f(v vVar, int i8) {
            throw new IllegalStateException("Unrecognized type of request: " + vVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class RunnableC0442c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m2.e f24485a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RuntimeException f24486b;

        RunnableC0442c(m2.e eVar, RuntimeException runtimeException) {
            this.f24485a = eVar;
            this.f24486b = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("Transformation " + this.f24485a.key() + " crashed with exception.", this.f24486b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.c$d */
    /* loaded from: classes4.dex */
    public static class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ StringBuilder f24487a;

        d(StringBuilder sb) {
            this.f24487a = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.f24487a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.c$e */
    /* loaded from: classes4.dex */
    public static class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m2.e f24488a;

        e(m2.e eVar) {
            this.f24488a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f24488a.key() + " returned input Bitmap but recycled it.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.c$f */
    /* loaded from: classes4.dex */
    public static class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m2.e f24489a;

        f(m2.e eVar) {
            this.f24489a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f24489a.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    RunnableC2598c(s sVar, g gVar, InterfaceC3361a interfaceC3361a, z zVar, AbstractC2596a abstractC2596a, x xVar) {
        this.f24467b = sVar;
        this.f24468c = gVar;
        this.f24469d = interfaceC3361a;
        this.f24470e = zVar;
        this.f24476k = abstractC2596a;
        this.f24471f = abstractC2596a.d();
        this.f24472g = abstractC2596a.i();
        this.f24484s = abstractC2596a.h();
        this.f24473h = abstractC2596a.e();
        this.f24474i = abstractC2596a.f();
        this.f24475j = xVar;
        this.f24483r = xVar.e();
    }

    static Bitmap a(List list, Bitmap bitmap) {
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            m2.e eVar = (m2.e) list.get(i8);
            try {
                Bitmap a9 = eVar.a(bitmap);
                if (a9 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(eVar.key());
                    sb.append(" returned null after ");
                    sb.append(i8);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        sb.append(((m2.e) it.next()).key());
                        sb.append('\n');
                    }
                    s.f24554o.post(new d(sb));
                    return null;
                }
                if (a9 == bitmap && bitmap.isRecycled()) {
                    s.f24554o.post(new e(eVar));
                    return null;
                }
                if (a9 != bitmap && !bitmap.isRecycled()) {
                    s.f24554o.post(new f(eVar));
                    return null;
                }
                i8++;
                bitmap = a9;
            } catch (RuntimeException e8) {
                s.f24554o.post(new RunnableC0442c(eVar, e8));
                return null;
            }
        }
        return bitmap;
    }

    private s.f d() {
        boolean z8;
        s.f fVar = s.f.LOW;
        List list = this.f24477l;
        if (list != null && !list.isEmpty()) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC2596a abstractC2596a = this.f24476k;
        if (abstractC2596a == null && !z8) {
            return fVar;
        }
        if (abstractC2596a != null) {
            fVar = abstractC2596a.h();
        }
        if (z8) {
            int size = this.f24477l.size();
            for (int i8 = 0; i8 < size; i8++) {
                s.f h8 = ((AbstractC2596a) this.f24477l.get(i8)).h();
                if (h8.ordinal() > fVar.ordinal()) {
                    fVar = h8;
                }
            }
        }
        return fVar;
    }

    static Bitmap e(Z z8, v vVar) {
        InterfaceC1451g d8 = L.d(z8);
        boolean s8 = C.s(d8);
        boolean z9 = vVar.f24620r;
        BitmapFactory.Options d9 = x.d(vVar);
        boolean g8 = x.g(d9);
        if (!s8) {
            InputStream inputStream = d8.inputStream();
            if (g8) {
                m mVar = new m(inputStream);
                mVar.a(false);
                long g9 = mVar.g(1024);
                BitmapFactory.decodeStream(mVar, null, d9);
                x.b(vVar.f24610h, vVar.f24611i, d9, vVar);
                mVar.b(g9);
                mVar.a(true);
                inputStream = mVar;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, d9);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        byte[] readByteArray = d8.readByteArray();
        if (g8) {
            BitmapFactory.decodeByteArray(readByteArray, 0, readByteArray.length, d9);
            x.b(vVar.f24610h, vVar.f24611i, d9, vVar);
        }
        return BitmapFactory.decodeByteArray(readByteArray, 0, readByteArray.length, d9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RunnableC2598c g(s sVar, g gVar, InterfaceC3361a interfaceC3361a, z zVar, AbstractC2596a abstractC2596a) {
        v i8 = abstractC2596a.i();
        List i9 = sVar.i();
        int size = i9.size();
        for (int i10 = 0; i10 < size; i10++) {
            x xVar = (x) i9.get(i10);
            if (xVar.c(i8)) {
                return new RunnableC2598c(sVar, gVar, interfaceC3361a, zVar, abstractC2596a, xVar);
            }
        }
        return new RunnableC2598c(sVar, gVar, interfaceC3361a, zVar, abstractC2596a, f24465w);
    }

    static int l(int i8) {
        switch (i8) {
            case 3:
            case 4:
                return SubsamplingScaleImageView.ORIENTATION_180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return SubsamplingScaleImageView.ORIENTATION_270;
            default:
                return 0;
        }
    }

    static int m(int i8) {
        return (i8 == 2 || i8 == 7 || i8 == 4 || i8 == 5) ? -1 : 1;
    }

    private static boolean v(boolean z8, int i8, int i9, int i10, int i11) {
        return !z8 || (i10 != 0 && i8 > i10) || (i11 != 0 && i9 > i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static android.graphics.Bitmap y(com.squareup.picasso.v r26, android.graphics.Bitmap r27, int r28) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.RunnableC2598c.y(com.squareup.picasso.v, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    static void z(v vVar) {
        String a9 = vVar.a();
        StringBuilder sb = (StringBuilder) f24463u.get();
        sb.ensureCapacity(a9.length() + 8);
        sb.replace(8, sb.length(), a9);
        Thread.currentThread().setName(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(AbstractC2596a abstractC2596a) {
        boolean z8 = this.f24467b.f24568m;
        v vVar = abstractC2596a.f24446b;
        if (this.f24476k == null) {
            this.f24476k = abstractC2596a;
            if (z8) {
                List list = this.f24477l;
                if (list != null && !list.isEmpty()) {
                    C.u("Hunter", "joined", vVar.d(), C.l(this, "to "));
                    return;
                } else {
                    C.u("Hunter", "joined", vVar.d(), "to empty hunter");
                    return;
                }
            }
            return;
        }
        if (this.f24477l == null) {
            this.f24477l = new ArrayList(3);
        }
        this.f24477l.add(abstractC2596a);
        if (z8) {
            C.u("Hunter", "joined", vVar.d(), C.l(this, "to "));
        }
        s.f h8 = abstractC2596a.h();
        if (h8.ordinal() > this.f24484s.ordinal()) {
            this.f24484s = h8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        Future future;
        if (this.f24476k != null) {
            return false;
        }
        List list = this.f24477l;
        if ((list != null && !list.isEmpty()) || (future = this.f24479n) == null || !future.cancel(false)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(AbstractC2596a abstractC2596a) {
        boolean z8;
        if (this.f24476k == abstractC2596a) {
            this.f24476k = null;
            z8 = true;
        } else {
            List list = this.f24477l;
            if (list != null) {
                z8 = list.remove(abstractC2596a);
            } else {
                z8 = false;
            }
        }
        if (z8 && abstractC2596a.h() == this.f24484s) {
            this.f24484s = d();
        }
        if (this.f24467b.f24568m) {
            C.u("Hunter", "removed", abstractC2596a.f24446b.d(), C.l(this, "from "));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2596a h() {
        return this.f24476k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List i() {
        return this.f24477l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v j() {
        return this.f24472g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Exception k() {
        return this.f24481p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String n() {
        return this.f24471f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s.e o() {
        return this.f24480o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        return this.f24473h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s q() {
        return this.f24467b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s.f r() {
        return this.f24484s;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        z(this.f24472g);
                        if (this.f24467b.f24568m) {
                            C.t("Hunter", "executing", C.k(this));
                        }
                        Bitmap t8 = t();
                        this.f24478m = t8;
                        if (t8 == null) {
                            this.f24468c.e(this);
                        } else {
                            this.f24468c.d(this);
                        }
                    } catch (q.b e8) {
                        if (!p.a(e8.f24550b) || e8.f24549a != 504) {
                            this.f24481p = e8;
                        }
                        this.f24468c.e(this);
                    } catch (Exception e9) {
                        this.f24481p = e9;
                        this.f24468c.e(this);
                    }
                } catch (IOException e10) {
                    this.f24481p = e10;
                    this.f24468c.g(this);
                }
            } catch (OutOfMemoryError e11) {
                StringWriter stringWriter = new StringWriter();
                this.f24470e.a().a(new PrintWriter(stringWriter));
                this.f24481p = new RuntimeException(stringWriter.toString(), e11);
                this.f24468c.e(this);
            }
            Thread.currentThread().setName("Picasso-Idle");
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap s() {
        return this.f24478m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc A[Catch: all -> 0x00a7, TryCatch #1 {all -> 0x00a7, blocks: (B:43:0x009a, B:45:0x00a2, B:48:0x00c4, B:50:0x00cc, B:52:0x00da, B:53:0x00e9, B:57:0x00a9, B:59:0x00b7), top: B:42:0x009a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap t() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.RunnableC2598c.t():android.graphics.Bitmap");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u() {
        Future future = this.f24479n;
        if (future != null && future.isCancelled()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w(boolean z8, NetworkInfo networkInfo) {
        int i8 = this.f24483r;
        if (i8 > 0) {
            this.f24483r = i8 - 1;
            return this.f24475j.h(z8, networkInfo);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        return this.f24475j.i();
    }
}
