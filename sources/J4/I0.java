package j4;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public abstract class I0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f33831a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f33832b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f33833c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f33834d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f33835e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f33836f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f33837g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j4.I0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0777a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f33838a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0777a(String str) {
                super(2);
                this.f33838a = str;
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
                    ComposerKt.traceEventStart(1346550194, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:45)");
                }
                r4.F.a(this.f33838a, null, composer, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f33839a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Function0 function0) {
                super(0);
                this.f33839a = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5550invoke();
                return Q5.I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5550invoke() {
                this.f33839a.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f33840a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f33841b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f33842c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: j4.I0$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0778a extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function0 f33843a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0778a(Function0 function0) {
                    super(0);
                    this.f33843a = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5551invoke();
                    return Q5.I.f8786a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5551invoke() {
                    this.f33843a.invoke();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC3293z implements InterfaceC2073o {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f33844a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f33845b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(String str, boolean z8) {
                    super(3);
                    this.f33844a = str;
                    this.f33845b = z8;
                }

                @Override // c6.InterfaceC2073o
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Q5.I.f8786a;
                }

                public final void invoke(RowScope TextButton, Composer composer, int i8) {
                    long m2984getUnspecified0d7_KjU;
                    AbstractC3292y.i(TextButton, "$this$TextButton");
                    if ((i8 & 81) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1956887564, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:55)");
                    }
                    String str = this.f33844a;
                    composer.startReplaceableGroup(399781910);
                    if (this.f33845b) {
                        m2984getUnspecified0d7_KjU = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1149getError0d7_KjU();
                    } else {
                        m2984getUnspecified0d7_KjU = Color.Companion.m2984getUnspecified0d7_KjU();
                    }
                    long j8 = m2984getUnspecified0d7_KjU;
                    composer.endReplaceableGroup();
                    TextKt.m1391Text4IGK_g(str, (Modifier) null, j8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Function0 function0, String str, boolean z8) {
                super(2);
                this.f33840a = function0;
                this.f33841b = str;
                this.f33842c = z8;
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
                    ComposerKt.traceEventStart(707616169, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:49)");
                }
                Modifier testTag = TestTagKt.testTag(Modifier.Companion, "simple_dialog_confirm_button");
                composer.startReplaceableGroup(-1803938456);
                boolean changed = composer.changed(this.f33840a);
                Function0 function0 = this.f33840a;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new C0778a(function0);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                ButtonKt.TextButton((Function0) rememberedValue, testTag, false, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer, 1956887564, true, new b(this.f33841b, this.f33842c)), composer, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f33846a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f33847b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: j4.I0$a$d$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0779a extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function0 f33848a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0779a(Function0 function0) {
                    super(0);
                    this.f33848a = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5552invoke();
                    return Q5.I.f8786a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5552invoke() {
                    this.f33848a.invoke();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC3293z implements InterfaceC2073o {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f33849a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(String str) {
                    super(3);
                    this.f33849a = str;
                }

                @Override // c6.InterfaceC2073o
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Q5.I.f8786a;
                }

                public final void invoke(RowScope TextButton, Composer composer, int i8) {
                    AbstractC3292y.i(TextButton, "$this$TextButton");
                    if ((i8 & 81) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180812490, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:72)");
                    }
                    TextKt.m1391Text4IGK_g(this.f33849a, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Function0 function0, String str) {
                super(2);
                this.f33846a = function0;
                this.f33847b = str;
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
                    ComposerKt.traceEventStart(-1068458905, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:66)");
                }
                Modifier testTag = TestTagKt.testTag(Modifier.Companion, "simple_dialog_dismiss_button");
                composer.startReplaceableGroup(-1803919448);
                boolean changed = composer.changed(this.f33846a);
                Function0 function0 = this.f33846a;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new C0779a(function0);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                ButtonKt.TextButton((Function0) rememberedValue, testTag, false, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer, 180812490, true, new b(this.f33847b)), composer, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class e extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f33850a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(String str) {
                super(2);
                this.f33850a = str;
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
                    ComposerKt.traceEventStart(-1956496442, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:41)");
                }
                AbstractC3183h0.a(this.f33850a, null, composer, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Function0 function0, Function0 function02, String str2, boolean z8, String str3, String str4) {
            super(2);
            this.f33831a = str;
            this.f33832b = function0;
            this.f33833c = function02;
            this.f33834d = str2;
            this.f33835e = z8;
            this.f33836f = str3;
            this.f33837g = str4;
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
                ComposerKt.traceEventStart(-1799194383, i8, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous> (SimpleDialogElementUI.kt:35)");
            }
            Modifier testTag = TestTagKt.testTag(Modifier.Companion, "simple_dialog");
            String str = this.f33831a;
            ComposableLambda composableLambda = str != null ? ComposableLambdaKt.composableLambda(composer, 1346550194, true, new C0777a(str)) : null;
            composer.startReplaceableGroup(-1105766663);
            boolean changed = composer.changed(this.f33832b);
            Function0 function0 = this.f33832b;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new b(function0);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            AndroidAlertDialog_androidKt.m1075AlertDialog6oU6zVQ((Function0) rememberedValue, ComposableLambdaKt.composableLambda(composer, 707616169, true, new c(this.f33833c, this.f33834d, this.f33835e)), testTag, ComposableLambdaKt.composableLambda(composer, -1068458905, true, new d(this.f33832b, this.f33836f)), ComposableLambdaKt.composableLambda(composer, -1956496442, true, new e(this.f33837g)), composableLambda, null, 0L, 0L, null, composer, 28080, 960);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f33851a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f33852b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f33853c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f33854d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f33855e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f33856f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0 f33857g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f33858h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f33859i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, String str3, String str4, boolean z8, Function0 function0, Function0 function02, int i8, int i9) {
            super(2);
            this.f33851a = str;
            this.f33852b = str2;
            this.f33853c = str3;
            this.f33854d = str4;
            this.f33855e = z8;
            this.f33856f = function0;
            this.f33857g = function02;
            this.f33858h = i8;
            this.f33859i = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            I0.a(this.f33851a, this.f33852b, this.f33853c, this.f33854d, this.f33855e, this.f33856f, this.f33857g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f33858h | 1), this.f33859i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, kotlin.jvm.functions.Function0 r22, kotlin.jvm.functions.Function0 r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.I0.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }
}
