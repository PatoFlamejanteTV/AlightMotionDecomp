package r4;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.ImeAction;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: r4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3909h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.h$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3907f f38424a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3907f c3907f) {
            super(0);
            this.f38424a = c3907f;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5572invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5572invoke() {
            this.f38424a.z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.h$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f38425a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0) {
            super(0);
            this.f38425a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5573invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5573invoke() {
            this.f38425a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.h$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3907f f38426a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f38427b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f38428c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f38429d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C3907f c3907f, Function0 function0, int i8, int i9) {
            super(2);
            this.f38426a = c3907f;
            this.f38427b = function0;
            this.f38428c = i8;
            this.f38429d = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3909h.a(this.f38426a, this.f38427b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38428c | 1), this.f38429d);
        }
    }

    public static final void a(C3907f controller, Function0 function0, Composer composer, int i8, int i9) {
        Function0 function02;
        int i10;
        boolean z8;
        AbstractC3292y.i(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(-2118013992);
        if ((i9 & 2) != 0) {
            i10 = i8 & (-113);
            function02 = new a(controller);
        } else {
            function02 = function0;
            i10 = i8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2118013992, i10, -1, "com.stripe.android.uicore.elements.AddressTextFieldUI (AddressTextFieldUI.kt:15)");
        }
        int m4847getNexteUduSuo = ImeAction.Companion.m4847getNexteUduSuo();
        Modifier.Companion companion = Modifier.Companion;
        startRestartGroup.startReplaceableGroup(-814672579);
        if ((((i8 & 112) ^ 48) > 32 && startRestartGroup.changed(function02)) || (i8 & 48) == 32) {
            z8 = true;
        } else {
            z8 = false;
        }
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new b(function02);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        C0.c(controller, false, m4847getNexteUduSuo, ClickableKt.m292clickableXHw0xAI$default(companion, false, null, null, (Function0) rememberedValue, 7, null), null, 0, 0, null, startRestartGroup, 440, PsExtractor.VIDEO_STREAM_MASK);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(controller, function02, i8, i9));
        }
    }
}
