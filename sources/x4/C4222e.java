package x4;

import Q5.I;
import Q5.r;
import Q5.s;
import Q5.t;
import Q5.x;
import a6.AbstractC1677b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.C3472p;

/* renamed from: x4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4222e {

    /* renamed from: a, reason: collision with root package name */
    private static final a f40992a = new a(null);

    /* renamed from: x4.e$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.e$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f40993a;

        /* renamed from: b, reason: collision with root package name */
        Object f40994b;

        /* renamed from: c, reason: collision with root package name */
        Object f40995c;

        /* renamed from: d, reason: collision with root package name */
        int f40996d;

        /* renamed from: e, reason: collision with root package name */
        int f40997e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f40998f;

        /* renamed from: h, reason: collision with root package name */
        int f41000h;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40998f = obj;
            this.f41000h |= Integer.MIN_VALUE;
            return C4222e.this.c(null, 0, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BitmapFactory.Options f41001a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputStream f41002b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(BitmapFactory.Options options, InputStream inputStream) {
            super(1);
            this.f41001a = options;
            this.f41002b = inputStream;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f8786a;
        }

        public final void invoke(Throwable th) {
            InputStream inputStream = this.f41002b;
            try {
                s.a aVar = s.f8810b;
                inputStream.close();
                s.b(I.f8786a);
            } catch (Throwable th2) {
                s.a aVar2 = s.f8810b;
                s.b(t.a(th2));
            }
        }
    }

    private final int b(BitmapFactory.Options options, int i8, int i9) {
        r a9 = x.a(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int intValue = ((Number) a9.a()).intValue();
        int intValue2 = ((Number) a9.b()).intValue();
        int i10 = 1;
        if (intValue > i9 || intValue2 > i8) {
            int i11 = intValue / 2;
            int i12 = intValue2 / 2;
            while (i11 / i10 >= i9 && i12 / i10 >= i8) {
                i10 *= 2;
            }
        }
        return i10;
    }

    private final Object e(BitmapFactory.Options options, String str, U5.d dVar) {
        Object b9;
        C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
        c3472p.B();
        try {
            s.a aVar = s.f8810b;
            InputStream f8 = f(new URL(str));
            c3472p.f(new c(options, f8));
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(f8, null, options);
                AbstractC1677b.a(f8, null);
                b9 = s.b(decodeStream);
            } finally {
            }
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b9);
        if (e8 == null) {
            c3472p.resumeWith(s.b((Bitmap) b9));
        } else {
            c3472p.resumeWith(s.b(t.a(e8)));
        }
        Object y8 = c3472p.y();
        if (y8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputStream f(URL url) {
        URLConnection openConnection = url.openConnection();
        AbstractC3292y.h(openConnection, "openConnection(...)");
        openConnection.setConnectTimeout(10000);
        openConnection.setReadTimeout(10000);
        InputStream inputStream = openConnection.getInputStream();
        AbstractC3292y.h(inputStream, "getInputStream(...)");
        return inputStream;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r6, int r7, int r8, U5.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof x4.C4222e.b
            if (r0 == 0) goto L13
            r0 = r9
            x4.e$b r0 = (x4.C4222e.b) r0
            int r1 = r0.f41000h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41000h = r1
            goto L18
        L13:
            x4.e$b r0 = new x4.e$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f40998f
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f41000h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Q5.t.b(r9)
            goto L81
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r8 = r0.f40997e
            int r7 = r0.f40996d
            java.lang.Object r6 = r0.f40995c
            android.graphics.BitmapFactory$Options r6 = (android.graphics.BitmapFactory.Options) r6
            java.lang.Object r2 = r0.f40994b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f40993a
            x4.e r4 = (x4.C4222e) r4
            Q5.t.b(r9)
            goto L68
        L48:
            Q5.t.b(r9)
            android.graphics.BitmapFactory$Options r9 = new android.graphics.BitmapFactory$Options
            r9.<init>()
            r9.inJustDecodeBounds = r4
            r0.f40993a = r5
            r0.f40994b = r6
            r0.f40995c = r9
            r0.f40996d = r7
            r0.f40997e = r8
            r0.f41000h = r4
            java.lang.Object r2 = r5.e(r9, r6, r0)
            if (r2 != r1) goto L65
            return r1
        L65:
            r4 = r5
            r2 = r6
            r6 = r9
        L68:
            int r7 = r4.b(r6, r7, r8)
            r6.inSampleSize = r7
            r7 = 0
            r6.inJustDecodeBounds = r7
            r7 = 0
            r0.f40993a = r7
            r0.f40994b = r7
            r0.f40995c = r7
            r0.f41000h = r3
            java.lang.Object r9 = r4.e(r6, r2, r0)
            if (r9 != r1) goto L81
            return r1
        L81:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C4222e.c(java.lang.String, int, int, U5.d):java.lang.Object");
    }

    public final Object d(String str, U5.d dVar) {
        Object e8 = e(new BitmapFactory.Options(), str, dVar);
        if (e8 == V5.b.e()) {
            return e8;
        }
        return (Bitmap) e8;
    }
}
