package s4;

import Q5.I;
import Q5.t;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.input.TextInputService;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.AbstractC3823h;

/* renamed from: s4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3960b {

    /* renamed from: c, reason: collision with root package name */
    public static final int f39070c = TextInputService.$stable;

    /* renamed from: a, reason: collision with root package name */
    private final TextInputService f39071a;

    /* renamed from: b, reason: collision with root package name */
    private final State f39072b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return (Boolean) C3960b.this.f39072b.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0884b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f39074a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f39075b;

        C0884b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            C0884b c0884b = new C0884b(dVar);
            c0884b.f39075b = ((Boolean) obj).booleanValue();
            return c0884b;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (U5.d) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f39074a == 0) {
                t.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(!this.f39075b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(boolean z8, U5.d dVar) {
            return ((C0884b) create(Boolean.valueOf(z8), dVar)).invokeSuspend(I.f8786a);
        }
    }

    public C3960b(TextInputService textInputService, State isKeyboardVisible) {
        AbstractC3292y.i(isKeyboardVisible, "isKeyboardVisible");
        this.f39071a = textInputService;
        this.f39072b = isKeyboardVisible;
    }

    private final Object b(U5.d dVar) {
        Object x8 = AbstractC3823h.x(SnapshotStateKt.snapshotFlow(new a()), new C0884b(null), dVar);
        if (x8 == V5.b.e()) {
            return x8;
        }
        return I.f8786a;
    }

    public final Object c(U5.d dVar) {
        if (((Boolean) this.f39072b.getValue()).booleanValue()) {
            TextInputService textInputService = this.f39071a;
            if (textInputService != null) {
                textInputService.hideSoftwareKeyboard();
            }
            Object b9 = b(dVar);
            if (b9 == V5.b.e()) {
                return b9;
            }
            return I.f8786a;
        }
        return I.f8786a;
    }
}
