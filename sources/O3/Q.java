package O3;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import c6.InterfaceC2072n;
import com.stripe.android.model.o;
import j4.I0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.AbstractC3394E;
import v3.C4127g;
import y4.AbstractC4246a;

/* loaded from: classes4.dex */
public abstract class Q {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4127g f7251a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f7252b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f7253c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7254d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C4127g c4127g, Function0 function0, Function0 function02, int i8) {
            super(2);
            this.f7251a = c4127g;
            this.f7252b = function0;
            this.f7253c = function02;
            this.f7254d = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            Q.a(this.f7251a, this.f7252b, this.f7253c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7254d | 1));
        }
    }

    public static final void a(C4127g paymentMethod, Function0 onConfirmListener, Function0 onDismissListener, Composer composer, int i8) {
        String str;
        AbstractC3292y.i(paymentMethod, "paymentMethod");
        AbstractC3292y.i(onConfirmListener, "onConfirmListener");
        AbstractC3292y.i(onDismissListener, "onDismissListener");
        Composer startRestartGroup = composer.startRestartGroup(-404084240);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-404084240, i8, -1, "com.stripe.android.paymentsheet.ui.RemovePaymentMethodDialogUI (RemovePaymentMethodDialogUI.kt:17)");
        }
        Resources resources = ((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        String stringResource = StringResources_androidKt.stringResource(v3.w.f40601Y, new Object[]{AbstractC4246a.a(paymentMethod.b(), startRestartGroup, 8)}, startRestartGroup, 64);
        o.p pVar = paymentMethod.d().f25635e;
        startRestartGroup.startReplaceableGroup(1201397555);
        if (pVar == o.p.f25755i) {
            str = AbstractC4246a.a(paymentMethod.a(), startRestartGroup, 8);
        } else {
            String str2 = null;
            if (pVar == o.p.f25745O) {
                int i9 = v3.w.f40616g0;
                o.r rVar = paymentMethod.d().f25648r;
                if (rVar != null) {
                    str2 = rVar.f25783e;
                }
                str = resources.getString(i9, str2);
                AbstractC3292y.h(str, "getString(...)");
            } else if (pVar == o.p.f25759m) {
                int i10 = v3.w.f40616g0;
                o.n nVar = paymentMethod.d().f25642l;
                if (nVar != null) {
                    str2 = nVar.f25729e;
                }
                str = resources.getString(i10, str2);
                AbstractC3292y.h(str, "getString(...)");
            } else {
                str = "";
            }
        }
        String str3 = str;
        startRestartGroup.endReplaceableGroup();
        int i11 = i8 << 12;
        I0.a(stringResource, str3, StringResources_androidKt.stringResource(AbstractC3394E.f35191F0, startRestartGroup, 0), StringResources_androidKt.stringResource(AbstractC3394E.f35215V, startRestartGroup, 0), true, onConfirmListener, onDismissListener, startRestartGroup, (458752 & i11) | 24576 | (i11 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(paymentMethod, onConfirmListener, onDismissListener, i8));
        }
    }
}
