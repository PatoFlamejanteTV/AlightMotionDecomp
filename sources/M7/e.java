package M7;

import android.content.SharedPreferences;
import androidx.core.os.EnvironmentCompat;
import com.mbridge.msdk.MBridgeConstans;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class e {

    /* renamed from: q, reason: collision with root package name */
    private static final String f6294q = b.i(e.class);

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f6295r = Pattern.compile("^(\\w+)(?:://)(.+?)$");

    /* renamed from: s, reason: collision with root package name */
    private static final Pattern f6296s = Pattern.compile("^[0-9a-f]{16}$");

    /* renamed from: a, reason: collision with root package name */
    private final b f6297a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6298b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6299c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6300d;

    /* renamed from: f, reason: collision with root package name */
    private final N7.e f6302f;

    /* renamed from: g, reason: collision with root package name */
    private final String f6303g;

    /* renamed from: i, reason: collision with root package name */
    private final d f6305i;

    /* renamed from: j, reason: collision with root package name */
    private d f6306j;

    /* renamed from: k, reason: collision with root package name */
    private long f6307k;

    /* renamed from: l, reason: collision with root package name */
    private long f6308l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6309m;

    /* renamed from: n, reason: collision with root package name */
    private SharedPreferences f6310n;

    /* renamed from: o, reason: collision with root package name */
    private final LinkedHashSet f6311o;

    /* renamed from: p, reason: collision with root package name */
    private N7.d f6312p;

    /* renamed from: e, reason: collision with root package name */
    private final Object f6301e = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Random f6304h = new Random(new Date().getTime());

    /* JADX INFO: Access modifiers changed from: protected */
    public e(b bVar, f fVar) {
        String str;
        d dVar = new d();
        this.f6305i = dVar;
        this.f6307k = 1800000L;
        this.f6308l = 0L;
        this.f6311o = new LinkedHashSet();
        this.f6297a = bVar;
        this.f6298b = fVar.c();
        this.f6299c = fVar.e();
        this.f6303g = fVar.f();
        this.f6300d = fVar.d();
        new a(bVar).a(this);
        this.f6309m = g().getBoolean("tracker.optout", false);
        N7.e a9 = bVar.e().a(this);
        this.f6302f = a9;
        a9.b(b());
        dVar.c(c.USER_ID, g().getString("tracker.userid", null));
        String string = g().getString("tracker.visitorid", null);
        if (string == null) {
            string = j();
            g().edit().putString("tracker.visitorid", string).apply();
        }
        dVar.c(c.VISITOR_ID, string);
        dVar.c(c.SESSION_START, "1");
        P7.d d8 = bVar.d();
        int[] a10 = d8.a();
        if (a10 != null) {
            str = String.format("%sx%s", Integer.valueOf(a10[0]), Integer.valueOf(a10[1]));
        } else {
            str = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        dVar.c(c.SCREEN_RESOLUTION, str);
        dVar.c(c.USER_AGENT, d8.b());
        dVar.c(c.LANGUAGE, d8.c());
        dVar.c(c.URL_PATH, fVar.d());
    }

    private void h(d dVar) {
        dVar.f(c.SITE_ID, this.f6299c);
        dVar.h(c.RECORD, "1");
        dVar.h(c.API_VERSION, "1");
        dVar.f(c.RANDOM_NUMBER, this.f6304h.nextInt(100000));
        dVar.h(c.DATETIME_OF_REQUEST, new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.US).format(new Date()));
        dVar.h(c.SEND_IMAGE, MBridgeConstans.ENDCARD_URL_TYPE_PL);
        c cVar = c.VISITOR_ID;
        dVar.h(cVar, this.f6305i.a(cVar));
        c cVar2 = c.USER_ID;
        dVar.h(cVar2, this.f6305i.a(cVar2));
        c cVar3 = c.SCREEN_RESOLUTION;
        dVar.h(cVar3, this.f6305i.a(cVar3));
        c cVar4 = c.USER_AGENT;
        dVar.h(cVar4, this.f6305i.a(cVar4));
        c cVar5 = c.LANGUAGE;
        dVar.h(cVar5, this.f6305i.a(cVar5));
        c cVar6 = c.URL_PATH;
        String a9 = dVar.a(cVar6);
        if (a9 == null) {
            a9 = this.f6305i.a(cVar6);
        } else if (!f6295r.matcher(a9).matches()) {
            StringBuilder sb = new StringBuilder(this.f6300d);
            if (!this.f6300d.endsWith("/") && !a9.startsWith("/")) {
                sb.append("/");
            } else if (this.f6300d.endsWith("/") && a9.startsWith("/")) {
                a9 = a9.substring(1);
            }
            sb.append(a9);
            a9 = sb.toString();
        }
        this.f6305i.c(cVar6, a9);
        dVar.c(cVar6, a9);
    }

    private void i(d dVar) {
        long j8;
        long j9;
        long j10;
        SharedPreferences g8 = g();
        synchronized (g8) {
            try {
                SharedPreferences.Editor edit = g8.edit();
                j8 = g().getLong("tracker.visitcount", 0L) + 1;
                edit.putLong("tracker.visitcount", j8);
                j9 = g8.getLong("tracker.firstvisit", -1L);
                if (j9 == -1) {
                    j9 = System.currentTimeMillis() / 1000;
                    edit.putLong("tracker.firstvisit", j9);
                }
                j10 = g8.getLong("tracker.previousvisit", -1L);
                edit.putLong("tracker.previousvisit", System.currentTimeMillis() / 1000);
                edit.apply();
            } catch (Throwable th) {
                throw th;
            }
        }
        d dVar2 = this.f6305i;
        c cVar = c.FIRST_VISIT_TIMESTAMP;
        dVar2.g(cVar, j9);
        d dVar3 = this.f6305i;
        c cVar2 = c.TOTAL_NUMBER_OF_VISITS;
        dVar3.g(cVar2, j8);
        if (j10 != -1) {
            this.f6305i.g(c.PREVIOUS_VISIT_TIMESTAMP, j10);
        }
        c cVar3 = c.SESSION_START;
        dVar.h(cVar3, this.f6305i.a(cVar3));
        dVar.h(cVar, this.f6305i.a(cVar));
        dVar.h(cVar2, this.f6305i.a(cVar2));
        c cVar4 = c.PREVIOUS_VISIT_TIMESTAMP;
        dVar.h(cVar4, this.f6305i.a(cVar4));
    }

    public static String j() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 16);
    }

    public String a() {
        return this.f6298b;
    }

    public N7.d b() {
        if (this.f6312p == null) {
            N7.d b9 = N7.d.b(g().getString("tracker.dispatcher.mode", null));
            this.f6312p = b9;
            if (b9 == null) {
                this.f6312p = N7.d.ALWAYS;
            }
        }
        return this.f6312p;
    }

    public b c() {
        return this.f6297a;
    }

    public String d() {
        return this.f6303g;
    }

    public long e() {
        return g().getLong("tracker.cache.age", 86400000L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f6299c != eVar.f6299c || !this.f6298b.equals(eVar.f6298b)) {
            return false;
        }
        return this.f6303g.equals(eVar.f6303g);
    }

    public long f() {
        return g().getLong("tracker.cache.size", 4194304L);
    }

    public SharedPreferences g() {
        if (this.f6310n == null) {
            this.f6310n = this.f6297a.h(this);
        }
        return this.f6310n;
    }

    public int hashCode() {
        return (((this.f6298b.hashCode() * 31) + this.f6299c) * 31) + this.f6303g.hashCode();
    }

    public e k(d dVar) {
        synchronized (this.f6301e) {
            try {
                if (System.currentTimeMillis() - this.f6308l > this.f6307k) {
                    this.f6308l = System.currentTimeMillis();
                    i(dVar);
                }
                h(dVar);
                Iterator it = this.f6311o.iterator();
                if (!it.hasNext()) {
                    this.f6306j = dVar;
                    if (!this.f6309m) {
                        this.f6302f.a(dVar);
                        V7.a.b(f6294q).a("Event added to the queue: %s", dVar);
                    } else {
                        V7.a.b(f6294q).a("Event omitted due to opt out: %s", dVar);
                    }
                } else {
                    android.support.v4.media.a.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }
}
