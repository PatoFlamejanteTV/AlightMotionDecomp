package o2;

import B2.C0953e;
import Q5.I;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import java.io.Closeable;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o2.InterfaceC3523e;

/* renamed from: o2.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3525g {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f35926b;

    /* renamed from: a, reason: collision with root package name */
    public static final C3525g f35925a = new C3525g();

    /* renamed from: c, reason: collision with root package name */
    public static final int f35927c = 8;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o2.g$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SavedStateHandle f35928a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SavedStateHandle savedStateHandle) {
            super(0);
            this.f35928a = savedStateHandle;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5564invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5564invoke() {
            C3525g.f35925a.f(this.f35928a);
        }
    }

    private C3525g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SavedStateHandle savedStateHandle) {
        AbstractC3292y.i(savedStateHandle, "$savedStateHandle");
        f35925a.e(savedStateHandle);
    }

    private final void e(SavedStateHandle savedStateHandle) {
        InterfaceC3523e interfaceC3523e = (InterfaceC3523e) savedStateHandle.get("STRIPE_ANALYTICS_LOCAL_SESSION");
        if (interfaceC3523e != null) {
            if (interfaceC3523e instanceof InterfaceC3523e.b) {
                f35926b = false;
            } else {
                boolean z8 = interfaceC3523e instanceof InterfaceC3523e.a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(SavedStateHandle savedStateHandle) {
        InterfaceC3523e interfaceC3523e = (InterfaceC3523e) savedStateHandle.get("STRIPE_ANALYTICS_LOCAL_SESSION");
        if (interfaceC3523e != null) {
            if (interfaceC3523e instanceof InterfaceC3523e.b) {
                UUID randomUUID = UUID.randomUUID();
                C0953e.a aVar = C0953e.f420g;
                AbstractC3292y.f(randomUUID);
                aVar.b(randomUUID);
                String uuid = randomUUID.toString();
                AbstractC3292y.h(uuid, "toString(...)");
                savedStateHandle.set("STRIPE_ANALYTICS_LOCAL_SESSION", new InterfaceC3523e.b(uuid));
                return;
            }
            boolean z8 = interfaceC3523e instanceof InterfaceC3523e.a;
        }
    }

    private final void g(SavedStateHandle savedStateHandle) {
        Parcelable parcelable;
        InterfaceC3523e interfaceC3523e = (InterfaceC3523e) savedStateHandle.get("STRIPE_ANALYTICS_LOCAL_SESSION");
        if (interfaceC3523e != null) {
            if (interfaceC3523e instanceof InterfaceC3523e.b) {
                C0953e.a aVar = C0953e.f420g;
                UUID fromString = UUID.fromString(((InterfaceC3523e.b) interfaceC3523e).getId());
                AbstractC3292y.h(fromString, "fromString(...)");
                aVar.b(fromString);
                f35926b = true;
                return;
            }
            boolean z8 = interfaceC3523e instanceof InterfaceC3523e.a;
            return;
        }
        if (!f35926b) {
            f35926b = true;
            UUID randomUUID = UUID.randomUUID();
            C0953e.a aVar2 = C0953e.f420g;
            AbstractC3292y.f(randomUUID);
            aVar2.b(randomUUID);
            String uuid = randomUUID.toString();
            AbstractC3292y.h(uuid, "toString(...)");
            parcelable = new InterfaceC3523e.b(uuid);
        } else {
            parcelable = InterfaceC3523e.a.f35922a;
        }
        savedStateHandle.set("STRIPE_ANALYTICS_LOCAL_SESSION", parcelable);
    }

    public final Function0 c(ViewModel viewModel, final SavedStateHandle savedStateHandle) {
        AbstractC3292y.i(viewModel, "viewModel");
        AbstractC3292y.i(savedStateHandle, "savedStateHandle");
        g(savedStateHandle);
        viewModel.addCloseable(new Closeable() { // from class: o2.f
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                C3525g.d(SavedStateHandle.this);
            }
        });
        return new a(savedStateHandle);
    }
}
