package c5;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3791p;
import q5.C3795t;

/* loaded from: classes5.dex */
public final class W {

    /* renamed from: h, reason: collision with root package name */
    public static final a f15707h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f15708a;

    /* renamed from: b, reason: collision with root package name */
    private long f15709b;

    /* renamed from: c, reason: collision with root package name */
    private String f15710c;

    /* renamed from: d, reason: collision with root package name */
    private String f15711d;

    /* renamed from: e, reason: collision with root package name */
    private String f15712e;

    /* renamed from: f, reason: collision with root package name */
    private int f15713f;

    /* renamed from: g, reason: collision with root package name */
    private String f15714g;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final W a(Cursor c8) {
            AbstractC3292y.i(c8, "c");
            W w8 = new W();
            w8.n(c8.getLong(0));
            w8.j(c8.getLong(1));
            w8.o(c8.getString(2));
            w8.m(c8.getString(3));
            w8.p(c8.getString(4));
            w8.k(c8.getInt(5));
            return w8;
        }

        public final W b(Cursor c8) {
            AbstractC3292y.i(c8, "c");
            W w8 = new W();
            w8.n(c8.getLong(0));
            w8.j(c8.getLong(1));
            w8.o(c8.getString(2));
            w8.m(c8.getString(3));
            w8.p(c8.getString(4));
            return w8;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public W(long j8, String name, String str, String str2, boolean z8) {
        AbstractC3292y.i(name, "name");
        this.f15708a = -1L;
        this.f15709b = j8;
        this.f15710c = name;
        this.f15711d = str;
        this.f15712e = str2;
        this.f15713f = z8 ? 1 : 0;
    }

    public final long a() {
        return this.f15709b;
    }

    public final int b() {
        return this.f15713f;
    }

    public final String c() {
        return this.f15714g;
    }

    public final String d() {
        return this.f15711d;
    }

    public final String e() {
        return this.f15710c;
    }

    public final String f() {
        return this.f15712e;
    }

    public final void g(Cursor c8) {
        AbstractC3292y.i(c8, "c");
        this.f15708a = c8.getLong(0);
        this.f15709b = c8.getLong(1);
        this.f15710c = c8.getString(2);
        this.f15711d = c8.getString(3);
        this.f15712e = c8.getString(4);
    }

    public final void h(Context context) {
        AbstractC3292y.i(context, "context");
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        if (a9.v0(this.f15709b) == null) {
            a9.N0(this);
            Bundle bundle = new Bundle();
            bundle.putString("type", "added");
            new C3795t(context).e("wishlist", bundle);
        }
        a9.i();
    }

    public final void i(Context context) {
        AbstractC3292y.i(context, "context");
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        a9.b1(this.f15709b);
        Bundle bundle = new Bundle();
        bundle.putString("type", "removed");
        new C3795t(context).e("wishlist", bundle);
        a9.i();
    }

    public final void j(long j8) {
        this.f15709b = j8;
    }

    public final void k(int i8) {
        this.f15713f = i8;
    }

    public final void l(String str) {
        this.f15714g = str;
    }

    public final void m(String str) {
        this.f15711d = str;
    }

    public final void n(long j8) {
        this.f15708a = j8;
    }

    public final void o(String str) {
        this.f15710c = str;
    }

    public final void p(String str) {
        this.f15712e = str;
    }

    public final void q(Context context, int i8) {
        AbstractC3292y.i(context, "context");
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        this.f15713f = i8;
        a9.u1(this.f15709b, i8);
        a9.i();
    }

    public String toString() {
        return "Wishlist(id=" + this.f15708a + ", programId=" + this.f15709b + ", name=" + this.f15710c + ", icon=" + this.f15711d + ", packagename=" + this.f15712e + ')';
    }

    public W() {
        this.f15708a = -1L;
        this.f15713f = 1;
    }
}
