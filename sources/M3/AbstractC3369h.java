package m3;

import B2.m;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import kotlin.jvm.functions.Function0;
import m3.InterfaceC3362a;
import n3.C3410a;
import n3.C3411b;
import n3.C3412c;
import q6.v;
import y2.C4237a;
import y2.C4239c;
import y2.C4240d;
import y2.C4242f;

/* renamed from: m3.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3369h {

    /* renamed from: m3.h$a */
    /* loaded from: classes4.dex */
    private static final class a implements InterfaceC3362a.InterfaceC0803a {

        /* renamed from: a, reason: collision with root package name */
        private Application f35013a;

        /* renamed from: b, reason: collision with root package name */
        private v f35014b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f35015c;

        /* renamed from: d, reason: collision with root package name */
        private CollectBankAccountContract.a f35016d;

        private a() {
        }

        @Override // m3.InterfaceC3362a.InterfaceC0803a
        public InterfaceC3362a build() {
            z5.h.a(this.f35013a, Application.class);
            z5.h.a(this.f35014b, v.class);
            z5.h.a(this.f35015c, SavedStateHandle.class);
            z5.h.a(this.f35016d, CollectBankAccountContract.a.class);
            return new b(new C4240d(), new C4237a(), this.f35013a, this.f35014b, this.f35015c, this.f35016d);
        }

        @Override // m3.InterfaceC3362a.InterfaceC0803a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(Application application) {
            this.f35013a = (Application) z5.h.b(application);
            return this;
        }

        @Override // m3.InterfaceC3362a.InterfaceC0803a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(CollectBankAccountContract.a aVar) {
            this.f35016d = (CollectBankAccountContract.a) z5.h.b(aVar);
            return this;
        }

        @Override // m3.InterfaceC3362a.InterfaceC0803a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(SavedStateHandle savedStateHandle) {
            this.f35015c = (SavedStateHandle) z5.h.b(savedStateHandle);
            return this;
        }

        @Override // m3.InterfaceC3362a.InterfaceC0803a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d(v vVar) {
            this.f35014b = (v) z5.h.b(vVar);
            return this;
        }
    }

    /* renamed from: m3.h$b */
    /* loaded from: classes4.dex */
    private static final class b implements InterfaceC3362a {

        /* renamed from: a, reason: collision with root package name */
        private final CollectBankAccountContract.a f35017a;

        /* renamed from: b, reason: collision with root package name */
        private final v f35018b;

        /* renamed from: c, reason: collision with root package name */
        private final Application f35019c;

        /* renamed from: d, reason: collision with root package name */
        private final SavedStateHandle f35020d;

        /* renamed from: e, reason: collision with root package name */
        private final b f35021e;

        /* renamed from: f, reason: collision with root package name */
        private z5.i f35022f;

        /* renamed from: g, reason: collision with root package name */
        private z5.i f35023g;

        private C3410a b() {
            return new C3410a(j());
        }

        private Context c() {
            return AbstractC3365d.a(this.f35019c);
        }

        private C3411b d() {
            return new C3411b(j());
        }

        private m e() {
            return new m((v2.d) this.f35023g.get(), (U5.g) this.f35022f.get());
        }

        private void f(C4240d c4240d, C4237a c4237a, Application application, v vVar, SavedStateHandle savedStateHandle, CollectBankAccountContract.a aVar) {
            this.f35022f = z5.d.c(C4242f.a(c4240d));
            this.f35023g = z5.d.c(C4239c.a(c4237a, C3366e.a()));
        }

        private Function0 g() {
            return AbstractC3364c.a(this.f35017a);
        }

        private PaymentAnalyticsRequestFactory h() {
            return new PaymentAnalyticsRequestFactory(c(), g(), AbstractC3367f.a());
        }

        private C3412c i() {
            return new C3412c(j());
        }

        private com.stripe.android.networking.a j() {
            return new com.stripe.android.networking.a(c(), g(), (U5.g) this.f35022f.get(), AbstractC3367f.a(), h(), e(), (v2.d) this.f35023g.get());
        }

        @Override // m3.InterfaceC3362a
        public com.stripe.android.payments.bankaccount.ui.b a() {
            return new com.stripe.android.payments.bankaccount.ui.b(this.f35017a, this.f35018b, d(), b(), i(), this.f35020d, (v2.d) this.f35023g.get());
        }

        private b(C4240d c4240d, C4237a c4237a, Application application, v vVar, SavedStateHandle savedStateHandle, CollectBankAccountContract.a aVar) {
            this.f35021e = this;
            this.f35017a = aVar;
            this.f35018b = vVar;
            this.f35019c = application;
            this.f35020d = savedStateHandle;
            f(c4240d, c4237a, application, vVar, savedStateHandle, aVar);
        }
    }

    public static InterfaceC3362a.InterfaceC0803a a() {
        return new a();
    }
}
