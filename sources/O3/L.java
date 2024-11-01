package O3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3539m;
import o4.C3529c;
import o4.C3537k;

/* loaded from: classes4.dex */
public abstract class L {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f7228a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f7229b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Integer num, String str) {
            super(2);
            this.f7228a = num;
            this.f7229b = str;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100448978, i8, -1, "com.stripe.android.paymentsheet.ui.LabelUI.<anonymous> (PrimaryButton.kt:287)");
            }
            int m5059getCentere0LSkKk = TextAlign.Companion.m5059getCentere0LSkKk();
            Integer num = this.f7228a;
            float f8 = 4;
            TextKt.m1391Text4IGK_g(this.f7229b, PaddingKt.m580paddingqDBjuR0(Modifier.Companion, Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(5)), num != null ? ColorKt.Color(num.intValue()) : Color.Companion.m2984getUnspecified0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5052boximpl(m5059getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1) null, AbstractC3539m.i(C3537k.f35998a.b(), composer, C3529c.f35936e), composer, 0, 0, 65016);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7230a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f7231b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7232c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Integer num, int i8) {
            super(2);
            this.f7230a = str;
            this.f7231b = num;
            this.f7232c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            L.a(this.f7230a, this.f7231b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7232c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(String str, Integer num, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(606920128);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(str)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(num)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(606920128, i9, -1, "com.stripe.android.paymentsheet.ui.LabelUI (PrimaryButton.kt:285)");
            }
            AbstractC3539m.a(null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 2100448978, true, new a(num, str)), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(str, num, i8));
        }
    }
}
