package p3;

import B2.m;
import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import p3.InterfaceC3574d;

/* renamed from: p3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3572b {

    /* renamed from: p3.b$a */
    /* loaded from: classes4.dex */
    private static final class a implements InterfaceC3574d.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f36188a;

        /* renamed from: b, reason: collision with root package name */
        private Set f36189b;

        private a() {
        }

        @Override // p3.InterfaceC3574d.a
        public InterfaceC3574d build() {
            z5.h.a(this.f36188a, Context.class);
            z5.h.a(this.f36189b, Set.class);
            return new C0823b(this.f36188a, this.f36189b);
        }

        @Override // p3.InterfaceC3574d.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f36188a = (Context) z5.h.b(context);
            return this;
        }

        @Override // p3.InterfaceC3574d.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f36189b = (Set) z5.h.b(set);
            return this;
        }
    }

    /* renamed from: p3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0823b implements InterfaceC3574d {

        /* renamed from: a, reason: collision with root package name */
        private final Context f36190a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f36191b;

        /* renamed from: c, reason: collision with root package name */
        private final C0823b f36192c;

        private m b() {
            return new m(g.a(), f.a());
        }

        private Function0 c() {
            return h.a(this.f36190a);
        }

        private PaymentAnalyticsRequestFactory d() {
            return new PaymentAnalyticsRequestFactory(this.f36190a, c(), this.f36191b);
        }

        private j e() {
            return new j(b(), d());
        }

        @Override // p3.InterfaceC3574d
        public i a() {
            return e();
        }

        private C0823b(Context context, Set set) {
            this.f36192c = this;
            this.f36190a = context;
            this.f36191b = set;
        }
    }

    public static InterfaceC3574d.a a() {
        return new a();
    }
}
