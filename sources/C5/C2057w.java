package c5;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3791p;

/* renamed from: c5.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2057w {

    /* renamed from: e, reason: collision with root package name */
    public static final a f15957e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private int f15958a = -1;

    /* renamed from: b, reason: collision with root package name */
    private String f15959b;

    /* renamed from: c, reason: collision with root package name */
    private String f15960c;

    /* renamed from: d, reason: collision with root package name */
    private int f15961d;

    /* renamed from: c5.w$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(Context context) {
            AbstractC3292y.i(context, "context");
            C3791p a9 = C3791p.f37286s.a(context);
            a9.a();
            Iterator it = a9.g0().iterator();
            AbstractC3292y.h(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                C2057w c2057w = (C2057w) next;
                if (c2057w.i()) {
                    a9.G(c2057w.c());
                }
            }
            a9.i();
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public final int a() {
        return this.f15961d;
    }

    public final String b() {
        return this.f15960c;
    }

    public final int c() {
        return this.f15958a;
    }

    public final String d() {
        return this.f15959b;
    }

    public final void e(int i8) {
        this.f15961d = i8;
    }

    public final void f(String str) {
        this.f15960c = str;
    }

    public final void g(int i8) {
        this.f15958a = i8;
    }

    public final void h(String str) {
        this.f15959b = str;
    }

    public final boolean i() {
        boolean z8;
        if (this.f15959b == null || this.f15960c == null) {
            return true;
        }
        if (this.f15961d >= 3) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str = this.f15959b;
        AbstractC3292y.f(str);
        if (currentTimeMillis - Long.parseLong(str) > 5184000000L) {
            z8 = true;
        } else {
            z8 = false;
        }
        String str2 = this.f15960c;
        AbstractC3292y.f(str2);
        boolean exists = new File(str2).exists();
        if (z8 && !exists) {
            return true;
        }
        return false;
    }
}
