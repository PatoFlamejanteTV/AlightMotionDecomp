package c5;

import android.content.Context;
import android.database.Cursor;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3791p;

/* renamed from: c5.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2032B {

    /* renamed from: g, reason: collision with root package name */
    public static final a f15560g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private int f15561a = -1;

    /* renamed from: b, reason: collision with root package name */
    private String f15562b;

    /* renamed from: c, reason: collision with root package name */
    private String f15563c;

    /* renamed from: d, reason: collision with root package name */
    private String f15564d;

    /* renamed from: e, reason: collision with root package name */
    private String f15565e;

    /* renamed from: f, reason: collision with root package name */
    private String f15566f;

    /* renamed from: c5.B$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final C2032B a(Context context) {
            AbstractC3292y.i(context, "context");
            C3791p a9 = C3791p.f37286s.a(context);
            a9.a();
            C2032B h02 = a9.h0();
            a9.i();
            return h02;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public final String a() {
        return this.f15565e;
    }

    public final String b() {
        return this.f15566f;
    }

    public final int c() {
        return this.f15561a;
    }

    public final String d() {
        return this.f15564d;
    }

    public final String e() {
        return this.f15562b;
    }

    public final String f() {
        return this.f15563c;
    }

    public final void g(Cursor c8) {
        AbstractC3292y.i(c8, "c");
        this.f15561a = c8.getInt(0);
        this.f15562b = c8.getString(1);
        this.f15563c = c8.getString(2);
        this.f15564d = c8.getString(3);
        this.f15565e = c8.getString(4);
        this.f15566f = c8.getString(5);
    }

    public final void h(Context context) {
        AbstractC3292y.i(context, "context");
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        a9.H0(this);
        if (a9.j() > 100) {
            a9.J(100);
        }
        a9.i();
    }

    public final void i(String str) {
        this.f15565e = str;
    }

    public final void j(String str) {
        this.f15566f = str;
    }

    public final void k(String str) {
        this.f15564d = str;
    }

    public final void l(String str) {
        this.f15562b = str;
    }

    public final void m(String str) {
        this.f15563c = str;
    }

    public String toString() {
        return "NotificationRegistry(\nid=" + this.f15561a + ",\ntimestamp=" + this.f15562b + ", \ntitle=" + this.f15563c + ", \nmsg=" + this.f15564d + ", \nactions=" + this.f15565e + ", \nextraInfo=" + this.f15566f + "\n)";
    }
}
