package j4;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import j4.C3178f;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3539m;
import z4.AbstractC4270b;
import z4.AbstractC4271c;

/* renamed from: j4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3176e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j4.e$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3178f f34107a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f34108b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3178f c3178f, Context context) {
            super(0);
            this.f34107a = c3178f;
            this.f34108b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5553invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5553invoke() {
            this.f34108b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f34107a.f())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j4.e$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f34109a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3178f f34110b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f34111c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, C3178f c3178f, int i8) {
            super(2);
            this.f34109a = z8;
            this.f34110b = c3178f;
            this.f34111c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3176e.a(this.f34109a, this.f34110b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f34111c | 1));
        }
    }

    public static final void a(boolean z8, C3178f element, Composer composer, int i8) {
        int i9;
        int i10;
        ColorFilter m2989tintxETnrds$default;
        AbstractC3292y.i(element, "element");
        Composer startRestartGroup = composer.startRestartGroup(1959271317);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1959271317, i8, -1, "com.stripe.android.ui.core.elements.AfterpayClearpayElementUI (AfterpayClearpayElementUI.kt:27)");
        }
        Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = context.getResources();
        AbstractC3292y.h(resources, "getResources(...)");
        String z9 = l6.n.z(element.g(resources), "<img/>", "<img src=\"afterpay\"/>", false, 4, null);
        C3178f.a aVar = C3178f.f34116e;
        if (aVar.a()) {
            i9 = g4.k.f32334c;
        } else {
            i9 = g4.k.f32333b;
        }
        if (aVar.a()) {
            i10 = g4.n.f32388Y;
        } else {
            i10 = g4.n.f32376M;
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i11 = MaterialTheme.$stable;
        if (AbstractC3539m.s(materialTheme.getColors(startRestartGroup, i11).m1159getSurface0d7_KjU())) {
            m2989tintxETnrds$default = null;
        } else {
            m2989tintxETnrds$default = ColorFilter.Companion.m2989tintxETnrds$default(ColorFilter.Companion, Color.Companion.m2985getWhite0d7_KjU(), 0, 2, null);
        }
        Map e8 = R5.Q.e(Q5.x.a("afterpay", new AbstractC4270b.a(i9, i10, m2989tintxETnrds$default)));
        float f8 = 4;
        AbstractC4271c.b(z9, PaddingKt.m580paddingqDBjuR0(Modifier.Companion, Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(8), Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(f8)), e8, AbstractC3539m.n(materialTheme, startRestartGroup, i11).j(), materialTheme.getTypography(startRestartGroup, i11).getH6(), z8, new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65535, (AbstractC3284p) null), PlaceholderVerticalAlign.Companion.m4601getBottomJ6kI3mc(), new a(element, context), startRestartGroup, (AbstractC4270b.a.f41481d << 6) | 1572912 | ((i8 << 15) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(z8, element, i8));
        }
    }
}
