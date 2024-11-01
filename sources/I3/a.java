package I3;

import Q5.I;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import u2.AbstractC4076c;

/* loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0068a extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3391a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0068a(String str) {
            super(3);
            this.f3391a = str;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i8) {
            AbstractC3292y.i(TextButton, "$this$TextButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-336976269, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateButton.<anonymous> (BacsMandateButton.kt:29)");
            }
            TextKt.m1391Text4IGK_g(this.f3391a, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ I3.b f3392a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f3393b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f3394c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f3395d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(I3.b bVar, String str, Function0 function0, int i8) {
            super(2);
            this.f3392a = bVar;
            this.f3393b = str;
            this.f3394c = function0;
            this.f3395d = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            a.a(this.f3392a, this.f3393b, this.f3394c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f3395d | 1));
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3396a;

        static {
            int[] iArr = new int[I3.b.values().length];
            try {
                iArr[I3.b.f3397a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I3.b.f3398b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3396a = iArr;
        }
    }

    public static final void a(I3.b type, String label, Function0 onClick, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        Function0 function0;
        int i11;
        int i12;
        int i13;
        AbstractC3292y.i(type, "type");
        AbstractC3292y.i(label, "label");
        AbstractC3292y.i(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1081806703);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(type)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(label)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(onClick)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i9 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
            i10 = i8;
            function0 = onClick;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1081806703, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateButton (BacsMandateButton.kt:13)");
            }
            int i14 = c.f3396a[type.ordinal()];
            if (i14 != 1) {
                if (i14 != 2) {
                    startRestartGroup.startReplaceableGroup(-2144979468);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    startRestartGroup.startReplaceableGroup(-2145339068);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i15 = MaterialTheme.$stable;
                    ButtonKt.TextButton(onClick, fillMaxWidth$default, false, null, null, materialTheme.getShapes(startRestartGroup, i15).getSmall(), null, ButtonDefaults.INSTANCE.m1119buttonColorsro_MJ88(Color.Companion.m2983getTransparent0d7_KjU(), materialTheme.getColors(startRestartGroup, i15).m1155getPrimary0d7_KjU(), 0L, 0L, startRestartGroup, (ButtonDefaults.$stable << 12) | 6, 12), null, ComposableLambdaKt.composableLambda(startRestartGroup, -336976269, true, new C0068a(label)), startRestartGroup, ((i9 >> 6) & 14) | 805306416, 348);
                    startRestartGroup.endReplaceableGroup();
                }
                composer2 = startRestartGroup;
                i10 = i8;
                function0 = onClick;
            } else {
                startRestartGroup.startReplaceableGroup(69337443);
                composer2 = startRestartGroup;
                i10 = i8;
                function0 = onClick;
                AbstractC4076c.a(label, true, onClick, null, false, false, startRestartGroup, ((i9 >> 3) & 14) | 48 | (i9 & 896), 56);
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(type, label, function0, i10));
        }
    }
}
