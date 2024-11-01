package F1;

import android.view.View;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final L1.a f2113a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2114b;

    /* renamed from: c, reason: collision with root package name */
    private final C1.h f2115c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2116d;

    public e(View view, C1.h hVar, String str) {
        this.f2113a = new L1.a(view);
        this.f2114b = view.getClass().getCanonicalName();
        this.f2115c = hVar;
        this.f2116d = str;
    }

    public String a() {
        return this.f2116d;
    }

    public C1.h b() {
        return this.f2115c;
    }

    public L1.a c() {
        return this.f2113a;
    }

    public String d() {
        return this.f2114b;
    }
}
