package v3;

import D3.f;
import R5.AbstractC1435t;
import androidx.lifecycle.SavedStateHandle;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.InterfaceC3813L;

/* renamed from: v3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4122b {

    /* renamed from: f, reason: collision with root package name */
    public static final a f40456f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f40457g = 8;

    /* renamed from: a, reason: collision with root package name */
    private final SavedStateHandle f40458a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f40459b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3813L f40460c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f40461d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f40462e;

    /* renamed from: v3.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final C4122b a(R3.a viewModel) {
            AbstractC3292y.i(viewModel, "viewModel");
            return new C4122b(viewModel.x(), viewModel.y());
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: v3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0910b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0910b f40463a = new C0910b();

        C0910b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(N3.a aVar) {
            List h8;
            if (aVar == null || (h8 = aVar.h()) == null) {
                return AbstractC1435t.m();
            }
            return h8;
        }
    }

    public C4122b(SavedStateHandle savedStateHandle, InterfaceC3813L selection) {
        f.C0023f c0023f;
        AbstractC3292y.i(savedStateHandle, "savedStateHandle");
        AbstractC3292y.i(selection, "selection");
        this.f40458a = savedStateHandle;
        this.f40459b = selection;
        InterfaceC3813L stateFlow = savedStateHandle.getStateFlow("customer_info", null);
        this.f40460c = stateFlow;
        this.f40461d = A4.g.m(stateFlow, C0910b.f40463a);
        Object value = selection.getValue();
        if (value instanceof f.C0023f) {
            c0023f = (f.C0023f) value;
        } else {
            c0023f = null;
        }
        this.f40462e = savedStateHandle.getStateFlow("saved_selection", c0023f != null ? c0023f.r() : null);
    }

    public final InterfaceC3813L a() {
        return this.f40460c;
    }

    public final InterfaceC3813L b() {
        return this.f40462e;
    }

    public final InterfaceC3813L c() {
        return this.f40461d;
    }

    public final void d(N3.a aVar) {
        this.f40458a.set("customer_info", aVar);
    }

    public final void e(com.stripe.android.model.o oVar) {
        this.f40458a.set("saved_selection", oVar);
    }
}
