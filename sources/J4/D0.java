package j4;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import r4.AbstractC3913l;

/* loaded from: classes4.dex */
public abstract class D0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ B0 f33779a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f33780b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B0 b02, State state) {
            super(1);
            this.f33779a = b02;
            this.f33780b = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Q5.I.f8786a;
        }

        public final void invoke(boolean z8) {
            this.f33779a.x(!D0.b(this.f33780b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f33781a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0 f33782b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f33783c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f33784d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f33785e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, C0 c02, Modifier modifier, int i8, int i9) {
            super(2);
            this.f33781a = z8;
            this.f33782b = c02;
            this.f33783c = modifier;
            this.f33784d = i8;
            this.f33785e = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            D0.a(this.f33781a, this.f33782b, this.f33783c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f33784d | 1), this.f33785e);
        }
    }

    public static final void a(boolean z8, C0 element, Modifier modifier, Composer composer, int i8, int i9) {
        AbstractC3292y.i(element, "element");
        Composer startRestartGroup = composer.startRestartGroup(1061070076);
        if ((i9 & 4) != 0) {
            modifier = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1061070076, i8, -1, "com.stripe.android.ui.core.elements.SaveForFutureUseElementUI (SaveForFutureUseElementUI.kt:18)");
        }
        B0 f8 = element.f();
        State a9 = A4.f.a(f8.w(), startRestartGroup, 8);
        State a10 = A4.f.a(f8.b(), startRestartGroup, 8);
        AbstractC3913l.a(modifier, "SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG", b(a9), ((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getString(c(a10), element.g()), z8, new a(f8, a9), startRestartGroup, ((i8 >> 6) & 14) | 48 | ((i8 << 12) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(z8, element, modifier, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final int c(State state) {
        return ((Number) state.getValue()).intValue();
    }
}
