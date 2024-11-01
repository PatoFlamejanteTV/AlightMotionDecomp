package com.mbridge.msdk.e;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.e.w;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static x f20138a = null;

    /* renamed from: o, reason: collision with root package name */
    private static String f20139o = "";

    /* renamed from: b, reason: collision with root package name */
    private final String f20140b;

    /* renamed from: c, reason: collision with root package name */
    private final m f20141c;

    /* renamed from: d, reason: collision with root package name */
    private Context f20142d;

    /* renamed from: e, reason: collision with root package name */
    private w f20143e;

    /* renamed from: f, reason: collision with root package name */
    private JSONObject f20144f;

    /* renamed from: g, reason: collision with root package name */
    private List<String> f20145g;

    /* renamed from: h, reason: collision with root package name */
    private List<String> f20146h;

    /* renamed from: i, reason: collision with root package name */
    private volatile c f20147i;

    /* renamed from: j, reason: collision with root package name */
    private volatile l f20148j;

    /* renamed from: k, reason: collision with root package name */
    private volatile d f20149k;

    /* renamed from: l, reason: collision with root package name */
    private volatile j f20150l;

    /* renamed from: m, reason: collision with root package name */
    private volatile r f20151m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f20152n = true;

    /* renamed from: p, reason: collision with root package name */
    private n f20153p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(String str, m mVar) {
        this.f20140b = str;
        this.f20141c = mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        if (!y.a((Object) this.f20142d) && !y.a(this.f20143e)) {
            try {
                o().a();
                this.f20152n = false;
                if (TextUtils.isEmpty(f20139o)) {
                    f20139o = UUID.randomUUID().toString();
                }
                if (!y.a(f20138a)) {
                    try {
                        f20138a.a(b(), this.f20140b, this.f20141c);
                        t.a().b();
                    } catch (Exception e8) {
                        if (a.f19988a) {
                            Log.e("TrackManager", "track manager start exception", e8);
                        }
                    }
                }
                return f20139o;
            } catch (Exception e9) {
                if (a.f19988a) {
                    Log.e("TrackManager", "start error", e9);
                }
                this.f20152n = true;
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b() {
        if (TextUtils.isEmpty(f20139o)) {
            String uuid = UUID.randomUUID().toString();
            f20139o = uuid;
            return uuid;
        }
        return f20139o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c() {
        return this.f20140b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final w d() {
        w wVar = this.f20143e;
        if (wVar == null) {
            w a9 = new w.a().a();
            this.f20143e = a9;
            return a9;
        }
        return wVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context e() {
        return this.f20142d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject f() {
        JSONObject jSONObject = this.f20144f;
        if (jSONObject == null) {
            JSONObject jSONObject2 = new JSONObject();
            this.f20144f = jSONObject2;
            return jSONObject2;
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final c g() {
        String format;
        if (y.a(this.f20147i)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f20147i)) {
                        Context context = this.f20142d;
                        if (TextUtils.isEmpty(this.f20140b)) {
                            format = String.format("track_manager_%s.db", "default");
                        } else {
                            format = String.format("track_manager_%s.db", this.f20140b);
                        }
                        this.f20147i = new c(new b(context, format, "event_table"), "event_table");
                    }
                } finally {
                }
            }
        }
        return this.f20147i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final l h() {
        if (y.a(this.f20148j)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f20148j)) {
                        this.f20148j = new p(new g(g(), o(), i()));
                    }
                } finally {
                }
            }
        }
        return this.f20148j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j i() {
        if (y.a(this.f20150l)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f20150l)) {
                        this.f20150l = new j();
                    }
                } finally {
                }
            }
        }
        return this.f20150l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d j() {
        if (y.a(this.f20149k)) {
            this.f20149k = d().f20212h;
        }
        return this.f20149k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final m k() {
        return this.f20141c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int l() {
        if (d().f20205a < 0) {
            return 50;
        }
        return d().f20205a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int m() {
        return Math.max(d().f20206b, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int n() {
        return Math.max(d().f20209e, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r o() {
        if (y.a(this.f20151m)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f20151m)) {
                        this.f20151m = new r(this);
                    }
                } finally {
                }
            }
        }
        return this.f20151m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean p() throws IllegalStateException {
        if (!y.a(d())) {
            if (!y.a(j())) {
                if (!y.a(d().f20213i)) {
                    if (!y.a(d().f20211g) && !y.a(d().f20211g.c())) {
                        if (!TextUtils.isEmpty(d().f20211g.b())) {
                            return true;
                        }
                        throw new IllegalStateException("report url is null");
                    }
                    throw new IllegalStateException("networkStackConfig or stack can not be null");
                }
                throw new IllegalStateException("responseHandler can not be null");
            }
            throw new IllegalStateException("decorate can not be null");
        }
        throw new IllegalStateException("config can not be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final n q() {
        int i8;
        if (y.a(this.f20153p)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f20153p)) {
                        if (d().f20208d <= 0) {
                            i8 = 2;
                        } else {
                            i8 = d().f20208d;
                        }
                        this.f20153p = new n(i8, d().f20211g, d().f20213i, d().f20207c);
                    }
                } finally {
                }
            }
        }
        return this.f20153p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r() {
        return this.f20152n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Context context) {
        this.f20142d = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(w wVar) {
        this.f20143e = wVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(JSONObject jSONObject) {
        this.f20144f = jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(e eVar) {
        if (y.a(eVar)) {
            return false;
        }
        f fVar = d().f20214j;
        if (y.b(fVar)) {
            try {
                return fVar.a(eVar);
            } catch (Exception e8) {
                if (a.f19988a) {
                    Log.e("TrackManager", "event filter apply exception", e8);
                }
            }
        }
        String a9 = eVar.a();
        if (TextUtils.isEmpty(a9)) {
            return false;
        }
        if (this.f20146h != null) {
            try {
                return !r0.contains(a9);
            } catch (Exception e9) {
                if (a.f19988a) {
                    Log.e("TrackManager", "disallowTrackEventNames contains exception", e9);
                }
            }
        }
        List<String> list = this.f20145g;
        if (list != null) {
            try {
                return list.contains(a9);
            } catch (Exception e10) {
                if (a.f19988a) {
                    Log.e("TrackManager", "allowTrackEventNames contains exception", e10);
                }
            }
        }
        return true;
    }
}
