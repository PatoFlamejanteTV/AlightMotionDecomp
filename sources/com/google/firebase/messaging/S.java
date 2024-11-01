package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.AbstractC2573e;
import java.util.Map;

/* loaded from: classes4.dex */
public final class S extends R.a {
    public static final Parcelable.Creator<S> CREATOR = new T();

    /* renamed from: a, reason: collision with root package name */
    Bundle f18563a;

    /* renamed from: b, reason: collision with root package name */
    private Map f18564b;

    /* renamed from: c, reason: collision with root package name */
    private b f18565c;

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f18566a;

        /* renamed from: b, reason: collision with root package name */
        private final String f18567b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f18568c;

        /* renamed from: d, reason: collision with root package name */
        private final String f18569d;

        /* renamed from: e, reason: collision with root package name */
        private final String f18570e;

        /* renamed from: f, reason: collision with root package name */
        private final String[] f18571f;

        /* renamed from: g, reason: collision with root package name */
        private final String f18572g;

        /* renamed from: h, reason: collision with root package name */
        private final String f18573h;

        /* renamed from: i, reason: collision with root package name */
        private final String f18574i;

        /* renamed from: j, reason: collision with root package name */
        private final String f18575j;

        /* renamed from: k, reason: collision with root package name */
        private final String f18576k;

        /* renamed from: l, reason: collision with root package name */
        private final String f18577l;

        /* renamed from: m, reason: collision with root package name */
        private final String f18578m;

        /* renamed from: n, reason: collision with root package name */
        private final Uri f18579n;

        /* renamed from: o, reason: collision with root package name */
        private final String f18580o;

        /* renamed from: p, reason: collision with root package name */
        private final Integer f18581p;

        /* renamed from: q, reason: collision with root package name */
        private final Integer f18582q;

        /* renamed from: r, reason: collision with root package name */
        private final Integer f18583r;

        /* renamed from: s, reason: collision with root package name */
        private final int[] f18584s;

        /* renamed from: t, reason: collision with root package name */
        private final Long f18585t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f18586u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f18587v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f18588w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f18589x;

        /* renamed from: y, reason: collision with root package name */
        private final boolean f18590y;

        /* renamed from: z, reason: collision with root package name */
        private final long[] f18591z;

        private static String[] b(J j8, String str) {
            Object[] g8 = j8.g(str);
            if (g8 == null) {
                return null;
            }
            String[] strArr = new String[g8.length];
            for (int i8 = 0; i8 < g8.length; i8++) {
                strArr[i8] = String.valueOf(g8[i8]);
            }
            return strArr;
        }

        public String a() {
            return this.f18569d;
        }

        public String c() {
            return this.f18566a;
        }

        private b(J j8) {
            this.f18566a = j8.p("gcm.n.title");
            this.f18567b = j8.h("gcm.n.title");
            this.f18568c = b(j8, "gcm.n.title");
            this.f18569d = j8.p("gcm.n.body");
            this.f18570e = j8.h("gcm.n.body");
            this.f18571f = b(j8, "gcm.n.body");
            this.f18572g = j8.p("gcm.n.icon");
            this.f18574i = j8.o();
            this.f18575j = j8.p("gcm.n.tag");
            this.f18576k = j8.p("gcm.n.color");
            this.f18577l = j8.p("gcm.n.click_action");
            this.f18578m = j8.p("gcm.n.android_channel_id");
            this.f18579n = j8.f();
            this.f18573h = j8.p("gcm.n.image");
            this.f18580o = j8.p("gcm.n.ticker");
            this.f18581p = j8.b("gcm.n.notification_priority");
            this.f18582q = j8.b("gcm.n.visibility");
            this.f18583r = j8.b("gcm.n.notification_count");
            this.f18586u = j8.a("gcm.n.sticky");
            this.f18587v = j8.a("gcm.n.local_only");
            this.f18588w = j8.a("gcm.n.default_sound");
            this.f18589x = j8.a("gcm.n.default_vibrate_timings");
            this.f18590y = j8.a("gcm.n.default_light_settings");
            this.f18585t = j8.j("gcm.n.event_time");
            this.f18584s = j8.e();
            this.f18591z = j8.q();
        }
    }

    public S(Bundle bundle) {
        this.f18563a = bundle;
    }

    public Map s() {
        if (this.f18564b == null) {
            this.f18564b = AbstractC2573e.a.a(this.f18563a);
        }
        return this.f18564b;
    }

    public b u() {
        if (this.f18565c == null && J.t(this.f18563a)) {
            this.f18565c = new b(new J(this.f18563a));
        }
        return this.f18565c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        T.c(this, parcel, i8);
    }
}
