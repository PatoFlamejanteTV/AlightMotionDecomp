package M3;

import R5.AbstractC1435t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class d extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final List f6145a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6146b;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f6147a;

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f6148b;

        public a(String paymentMethodId, Throwable exception) {
            AbstractC3292y.i(paymentMethodId, "paymentMethodId");
            AbstractC3292y.i(exception, "exception");
            this.f6147a = paymentMethodId;
            this.f6148b = exception;
        }

        public final Throwable a() {
            return this.f6148b;
        }

        public final String b() {
            return this.f6147a;
        }
    }

    public d(List failures) {
        AbstractC3292y.i(failures, "failures");
        this.f6145a = failures;
        List<a> list = failures;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
        for (a aVar : list) {
            String b9 = aVar.b();
            String message = aVar.a().getMessage();
            if (message == null) {
                message = "Unknown reason";
            }
            arrayList.add("\n - (paymentMethodId: " + b9 + ", reason: " + message + ")");
        }
        this.f6146b = "Failed to detach the following duplicates:" + arrayList;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f6146b;
    }
}
