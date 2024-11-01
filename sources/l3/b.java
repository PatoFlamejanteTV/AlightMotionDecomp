package L3;

import L3.f;
import L3.m;
import S3.c;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.b;
import kotlin.jvm.functions.Function0;
import n6.I;
import y2.C4237a;
import y2.C4239c;
import y2.C4240d;
import y2.C4242f;

/* loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements f.a {

        /* renamed from: a, reason: collision with root package name */
        private Application f5372a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f5373b;

        /* renamed from: c, reason: collision with root package name */
        private I f5374c;

        private a() {
        }

        @Override // L3.f.a
        public f build() {
            z5.h.a(this.f5372a, Application.class);
            z5.h.a(this.f5373b, c.a.class);
            z5.h.a(this.f5374c, I.class);
            return new C0088b(new C4240d(), new C4237a(), this.f5372a, this.f5373b, this.f5374c);
        }

        @Override // L3.f.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Application application) {
            this.f5372a = (Application) z5.h.b(application);
            return this;
        }

        @Override // L3.f.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a c(c.a aVar) {
            this.f5373b = (c.a) z5.h.b(aVar);
            return this;
        }

        @Override // L3.f.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(I i8) {
            this.f5374c = (I) z5.h.b(i8);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0088b implements f {

        /* renamed from: a, reason: collision with root package name */
        private final Application f5375a;

        /* renamed from: b, reason: collision with root package name */
        private final c.a f5376b;

        /* renamed from: c, reason: collision with root package name */
        private final I f5377c;

        /* renamed from: d, reason: collision with root package name */
        private final C0088b f5378d;

        /* renamed from: e, reason: collision with root package name */
        private z5.i f5379e;

        /* renamed from: f, reason: collision with root package name */
        private z5.i f5380f;

        /* renamed from: g, reason: collision with root package name */
        private z5.i f5381g;

        /* renamed from: h, reason: collision with root package name */
        private z5.i f5382h;

        /* renamed from: i, reason: collision with root package name */
        private z5.i f5383i;

        private Context d() {
            return j.c(this.f5375a);
        }

        private B2.m e() {
            return new B2.m((v2.d) this.f5380f.get(), (U5.g) this.f5379e.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public S3.a f() {
            return new S3.a(j(), this.f5383i, this.f5376b, this.f5377c);
        }

        private void g(C4240d c4240d, C4237a c4237a, Application application, c.a aVar, I i8) {
            this.f5379e = z5.d.c(C4242f.a(c4240d));
            this.f5380f = z5.d.c(C4239c.a(c4237a, k.a()));
            z5.e a9 = z5.f.a(application);
            this.f5381g = a9;
            j a10 = j.a(a9);
            this.f5382h = a10;
            this.f5383i = h.a(a10);
        }

        private Function0 h() {
            return i.a(d());
        }

        private PaymentAnalyticsRequestFactory i() {
            return new PaymentAnalyticsRequestFactory(d(), h(), l.a());
        }

        private com.stripe.android.networking.a j() {
            return new com.stripe.android.networking.a(d(), h(), (U5.g) this.f5379e.get(), l.a(), i(), e(), (v2.d) this.f5380f.get());
        }

        @Override // L3.f
        public m.a a() {
            return new c(this.f5378d);
        }

        private C0088b(C4240d c4240d, C4237a c4237a, Application application, c.a aVar, I i8) {
            this.f5378d = this;
            this.f5375a = application;
            this.f5376b = aVar;
            this.f5377c = i8;
            g(c4240d, c4237a, application, aVar, i8);
        }
    }

    /* loaded from: classes4.dex */
    private static final class c implements m.a {

        /* renamed from: a, reason: collision with root package name */
        private final C0088b f5384a;

        /* renamed from: b, reason: collision with root package name */
        private SavedStateHandle f5385b;

        /* renamed from: c, reason: collision with root package name */
        private b.e f5386c;

        @Override // L3.m.a
        public m build() {
            z5.h.a(this.f5385b, SavedStateHandle.class);
            z5.h.a(this.f5386c, b.e.class);
            return new d(this.f5384a, this.f5385b, this.f5386c);
        }

        @Override // L3.m.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c b(b.e eVar) {
            this.f5386c = (b.e) z5.h.b(eVar);
            return this;
        }

        @Override // L3.m.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c a(SavedStateHandle savedStateHandle) {
            this.f5385b = (SavedStateHandle) z5.h.b(savedStateHandle);
            return this;
        }

        private c(C0088b c0088b) {
            this.f5384a = c0088b;
        }
    }

    /* loaded from: classes4.dex */
    private static final class d implements m {

        /* renamed from: a, reason: collision with root package name */
        private final b.e f5387a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f5388b;

        /* renamed from: c, reason: collision with root package name */
        private final C0088b f5389c;

        /* renamed from: d, reason: collision with root package name */
        private final d f5390d;

        @Override // L3.m
        public com.stripe.android.paymentsheet.paymentdatacollection.polling.b a() {
            return new com.stripe.android.paymentsheet.paymentdatacollection.polling.b(this.f5387a, this.f5389c.f(), new K3.b(), this.f5389c.f5377c, this.f5388b);
        }

        private d(C0088b c0088b, SavedStateHandle savedStateHandle, b.e eVar) {
            this.f5390d = this;
            this.f5389c = c0088b;
            this.f5387a = eVar;
            this.f5388b = savedStateHandle;
        }
    }

    public static f.a a() {
        return new a();
    }
}
