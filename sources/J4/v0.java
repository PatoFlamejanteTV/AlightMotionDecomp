package j4;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3539m;

/* loaded from: classes4.dex */
public abstract class v0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34299a = new a();

        a() {
            super(1);
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f34300a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f34301b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t0 t0Var, int i8) {
            super(2);
            this.f34300a = t0Var;
            this.f34301b = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            v0.a(this.f34300a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f34301b | 1));
        }
    }

    public static final void a(t0 element, Composer composer, int i8) {
        TextStyle m4696copyv2rsoow;
        AbstractC3292y.i(element, "element");
        Composer startRestartGroup = composer.startRestartGroup(1140239160);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1140239160, i8, -1, "com.stripe.android.ui.core.elements.MandateTextUI (MandateTextUI.kt:23)");
        }
        int g8 = element.g();
        String[] strArr = (String[]) element.f().toArray(new String[0]);
        String stringResource = StringResources_androidKt.stringResource(g8, Arrays.copyOf(strArr, strArr.length), startRestartGroup, 64);
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i9 = MaterialTheme.$stable;
        m4696copyv2rsoow = r16.m4696copyv2rsoow((r48 & 1) != 0 ? r16.spanStyle.m4628getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r16.spanStyle.m4629getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r16.spanStyle.getFontWeight() : FontWeight.Companion.getNormal(), (r48 & 8) != 0 ? r16.spanStyle.m4630getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r16.spanStyle.m4631getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r16.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r16.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r16.spanStyle.m4632getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r16.spanStyle.m4627getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r16.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r16.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r16.spanStyle.m4626getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r16.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r16.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r16.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5052boximpl(r16.paragraphStyle.m4584getTextAligne0LSkKk()) : TextAlign.m5052boximpl(TextAlign.Companion.m5064getStarte0LSkKk()), (r48 & 65536) != 0 ? TextDirection.m5066boximpl(r16.paragraphStyle.m4586getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? r16.paragraphStyle.m4582getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r16.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r16.platformStyle : null, (r48 & 1048576) != 0 ? r16.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4972boximpl(r16.paragraphStyle.m4581getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4962boximpl(r16.paragraphStyle.m4579getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? materialTheme.getTypography(startRestartGroup, i9).getCaption().paragraphStyle.getTextMotion() : null);
        TextKt.m1391Text4IGK_g(stringResource, TestTagKt.testTag(SemanticsModifierKt.semantics(PaddingKt.m581paddingqDBjuR0$default(Modifier.Companion, 0.0f, element.h(), 0.0f, Dp.m5155constructorimpl(8), 5, null), true, a.f34299a), "mandate_test_tag"), AbstractC3539m.n(materialTheme, startRestartGroup, i9).i(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, m4696copyv2rsoow, startRestartGroup, 0, 0, 65528);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(element, i8));
        }
    }
}
