package M6;

import K6.q;
import K6.x;
import K6.z;
import com.mbridge.msdk.foundation.download.Command;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final x f6181a;

    /* renamed from: b, reason: collision with root package name */
    public final z f6182b;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final long f6183a;

        /* renamed from: b, reason: collision with root package name */
        final x f6184b;

        /* renamed from: c, reason: collision with root package name */
        final z f6185c;

        /* renamed from: d, reason: collision with root package name */
        private Date f6186d;

        /* renamed from: e, reason: collision with root package name */
        private String f6187e;

        /* renamed from: f, reason: collision with root package name */
        private Date f6188f;

        /* renamed from: g, reason: collision with root package name */
        private String f6189g;

        /* renamed from: h, reason: collision with root package name */
        private Date f6190h;

        /* renamed from: i, reason: collision with root package name */
        private long f6191i;

        /* renamed from: j, reason: collision with root package name */
        private long f6192j;

        /* renamed from: k, reason: collision with root package name */
        private String f6193k;

        /* renamed from: l, reason: collision with root package name */
        private int f6194l;

        public a(long j8, x xVar, z zVar) {
            this.f6194l = -1;
            this.f6183a = j8;
            this.f6184b = xVar;
            this.f6185c = zVar;
            if (zVar != null) {
                this.f6191i = zVar.F();
                this.f6192j = zVar.B();
                q p8 = zVar.p();
                int e8 = p8.e();
                for (int i8 = 0; i8 < e8; i8++) {
                    String c8 = p8.c(i8);
                    String f8 = p8.f(i8);
                    if ("Date".equalsIgnoreCase(c8)) {
                        this.f6186d = O6.d.b(f8);
                        this.f6187e = f8;
                    } else if ("Expires".equalsIgnoreCase(c8)) {
                        this.f6190h = O6.d.b(f8);
                    } else if ("Last-Modified".equalsIgnoreCase(c8)) {
                        this.f6188f = O6.d.b(f8);
                        this.f6189g = f8;
                    } else if (Command.HTTP_HEADER_ETAG.equalsIgnoreCase(c8)) {
                        this.f6193k = f8;
                    } else if ("Age".equalsIgnoreCase(c8)) {
                        this.f6194l = O6.e.f(f8, -1);
                    }
                }
            }
        }

        private long a() {
            Date date = this.f6186d;
            long j8 = 0;
            if (date != null) {
                j8 = Math.max(0L, this.f6192j - date.getTime());
            }
            int i8 = this.f6194l;
            if (i8 != -1) {
                j8 = Math.max(j8, TimeUnit.SECONDS.toMillis(i8));
            }
            long j9 = this.f6192j;
            return j8 + (j9 - this.f6191i) + (this.f6183a - j9);
        }

        private long b() {
            long j8;
            long j9;
            if (this.f6185c.b().e() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.e());
            }
            if (this.f6190h != null) {
                Date date = this.f6186d;
                if (date != null) {
                    j9 = date.getTime();
                } else {
                    j9 = this.f6192j;
                }
                long time = this.f6190h.getTime() - j9;
                if (time <= 0) {
                    return 0L;
                }
                return time;
            }
            if (this.f6188f == null || this.f6185c.E().i().x() != null) {
                return 0L;
            }
            Date date2 = this.f6186d;
            if (date2 != null) {
                j8 = date2.getTime();
            } else {
                j8 = this.f6191i;
            }
            long time2 = j8 - this.f6188f.getTime();
            if (time2 <= 0) {
                return 0L;
            }
            return time2 / 10;
        }

        private c d() {
            long j8;
            String str;
            if (this.f6185c == null) {
                return new c(this.f6184b, null);
            }
            if (this.f6184b.f() && this.f6185c.i() == null) {
                return new c(this.f6184b, null);
            }
            if (!c.a(this.f6185c, this.f6184b)) {
                return new c(this.f6184b, null);
            }
            K6.d b9 = this.f6184b.b();
            if (!b9.i() && !e(this.f6184b)) {
                K6.d b10 = this.f6185c.b();
                if (b10.b()) {
                    return new c(null, this.f6185c);
                }
                long a9 = a();
                long b11 = b();
                if (b9.e() != -1) {
                    b11 = Math.min(b11, TimeUnit.SECONDS.toMillis(b9.e()));
                }
                long j9 = 0;
                if (b9.g() != -1) {
                    j8 = TimeUnit.SECONDS.toMillis(b9.g());
                } else {
                    j8 = 0;
                }
                if (!b10.h() && b9.f() != -1) {
                    j9 = TimeUnit.SECONDS.toMillis(b9.f());
                }
                if (!b10.i()) {
                    long j10 = j8 + a9;
                    if (j10 < j9 + b11) {
                        z.a u8 = this.f6185c.u();
                        if (j10 >= b11) {
                            u8.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (a9 > 86400000 && f()) {
                            u8.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new c(null, u8.c());
                    }
                }
                String str2 = this.f6193k;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.f6188f != null) {
                        str2 = this.f6189g;
                    } else if (this.f6186d != null) {
                        str2 = this.f6187e;
                    } else {
                        return new c(this.f6184b, null);
                    }
                    str = "If-Modified-Since";
                }
                q.a d8 = this.f6184b.d().d();
                L6.a.f5408a.b(d8, str, str2);
                return new c(this.f6184b.h().d(d8.d()).a(), this.f6185c);
            }
            return new c(this.f6184b, null);
        }

        private static boolean e(x xVar) {
            if (xVar.c("If-Modified-Since") == null && xVar.c("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        private boolean f() {
            if (this.f6185c.b().e() == -1 && this.f6190h == null) {
                return true;
            }
            return false;
        }

        public c c() {
            c d8 = d();
            if (d8.f6181a != null && this.f6184b.b().k()) {
                return new c(null, null);
            }
            return d8;
        }
    }

    c(x xVar, z zVar) {
        this.f6181a = xVar;
        this.f6182b = zVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:            if (r3.b().c() == false) goto L33;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(K6.z r3, K6.x r4) {
        /*
            int r0 = r3.h()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.j(r0)
            if (r0 != 0) goto L5a
            K6.d r0 = r3.b()
            int r0 = r0.e()
            r1 = -1
            if (r0 != r1) goto L5a
            K6.d r0 = r3.b()
            boolean r0 = r0.d()
            if (r0 != 0) goto L5a
            K6.d r0 = r3.b()
            boolean r0 = r0.c()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            K6.d r3 = r3.b()
            boolean r3 = r3.j()
            if (r3 != 0) goto L6f
            K6.d r3 = r4.b()
            boolean r3 = r3.j()
            if (r3 != 0) goto L6f
            r2 = 1
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: M6.c.a(K6.z, K6.x):boolean");
    }
}
