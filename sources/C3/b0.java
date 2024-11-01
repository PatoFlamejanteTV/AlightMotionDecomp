package C3;

import com.stripe.android.paymentsheet.analytics.EventReporter;

/* loaded from: classes4.dex */
public final class b0 implements z5.e {

    /* loaded from: classes4.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b0 f798a = new b0();
    }

    public static b0 a() {
        return a.f798a;
    }

    public static EventReporter.Mode c() {
        return (EventReporter.Mode) z5.h.d(a0.f797a.a());
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public EventReporter.Mode get() {
        return c();
    }
}
