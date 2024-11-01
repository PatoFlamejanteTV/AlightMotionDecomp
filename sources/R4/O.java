package r4;

import R5.AbstractC1435t;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import o4.AbstractC3539m;
import q6.InterfaceC3813L;
import z4.AbstractC4269a;

/* loaded from: classes4.dex */
public abstract class O {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L f38050a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f38051b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f38052c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ FocusRequester f38053d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f38054e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FocusManager f38055f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f38056g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ M f38057h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f38058i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ MutableIntState f38059j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r4.O$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0844a extends C3289v implements Function1 {
            C0844a(Object obj) {
                super(1, obj, K.class, "onAutofillDigit", "onAutofillDigit(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3292y.i(p02, "p0");
                ((K) this.receiver).z(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return Q5.I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f38060a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f38061b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ MutableIntState f38062c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(int i8, boolean z8, MutableIntState mutableIntState) {
                super(1);
                this.f38060a = i8;
                this.f38061b = z8;
                this.f38062c = mutableIntState;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusState) obj);
                return Q5.I.f8786a;
            }

            public final void invoke(FocusState focusState) {
                AbstractC3292y.i(focusState, "focusState");
                if (focusState.isFocused()) {
                    O.c(this.f38062c, this.f38060a);
                } else {
                    if (focusState.isFocused() || !this.f38061b) {
                        return;
                    }
                    O.c(this.f38062c, -1);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f38063a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FocusManager f38064b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ L f38065c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ State f38066d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(int i8, FocusManager focusManager, L l8, State state) {
                super(1);
                this.f38063a = i8;
                this.f38064b = focusManager;
                this.f38065c = l8;
                this.f38066d = state;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m5569invokeZmokQxo(((KeyEvent) obj).m3865unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m5569invokeZmokQxo(android.view.KeyEvent event) {
                AbstractC3292y.i(event, "event");
                if (this.f38063a != 0 && KeyEventType.m3869equalsimpl0(KeyEvent_androidKt.m3877getTypeZmokQxo(event), KeyEventType.Companion.m3873getKeyDownCS__XNY()) && event.getKeyCode() == 67 && a.b(this.f38066d).length() == 0) {
                    this.f38064b.mo2644moveFocus3ESFkO8(FocusDirection.Companion.m2640getPreviousdhqQ8s());
                    this.f38065c.f().A(this.f38063a - 1, "");
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final d f38067a = new d();

            d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return Q5.I.f8786a;
            }

            public final void invoke(SemanticsPropertyReceiver semantics) {
                AbstractC3292y.i(semantics, "$this$semantics");
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(L l8, int i8, boolean z8, FocusRequester focusRequester, TextStyle textStyle, FocusManager focusManager, boolean z9, M m8, String str, MutableIntState mutableIntState) {
            super(2);
            this.f38050a = l8;
            this.f38051b = i8;
            this.f38052c = z8;
            this.f38053d = focusRequester;
            this.f38054e = textStyle;
            this.f38055f = focusManager;
            this.f38056g = z9;
            this.f38057h = m8;
            this.f38058i = str;
            this.f38059j = mutableIntState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String b(State state) {
            return (String) state.getValue();
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
                ComposerKt.traceEventStart(-2113339167, i8, -1, "com.stripe.android.uicore.elements.OTPElementUI.<anonymous>.<anonymous>.<anonymous> (OTPElementUI.kt:139)");
            }
            State a9 = A4.f.a((InterfaceC3813L) this.f38050a.f().w().get(this.f38051b), composer, 8);
            Modifier a10 = AbstractC4269a.a(SizeKt.m610height3ABfNKs(Modifier.Companion, Dp.m5155constructorimpl(56)), AbstractC1435t.e(AutofillType.SmsOtpCode), new C0844a(this.f38050a.f()), composer, 54);
            composer.startReplaceableGroup(448324923);
            boolean changed = composer.changed(this.f38051b) | composer.changed(this.f38052c);
            int i9 = this.f38051b;
            boolean z8 = this.f38052c;
            MutableIntState mutableIntState = this.f38059j;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new b(i9, z8, mutableIntState);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier semantics$default = SemanticsModifierKt.semantics$default(TestTagKt.testTag(KeyInputModifierKt.onPreviewKeyEvent(FocusChangedModifierKt.onFocusChanged(a10, (Function1) rememberedValue), new c(this.f38051b, this.f38055f, this.f38050a, a9)), "OTP-" + this.f38051b), false, d.f38067a, 1, null);
            if (this.f38051b == 0) {
                semantics$default = FocusRequesterModifierKt.focusRequester(semantics$default, this.f38053d);
            }
            O.d(b(a9), this.f38052c, this.f38054e, this.f38050a, this.f38051b, this.f38055f, semantics$default, this.f38056g, this.f38057h, this.f38058i, composer, 266240);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f38068a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L f38069b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f38070c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Shape f38071d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f38072e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f38073f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f38074g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f38075h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ M f38076i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ FocusRequester f38077j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f38078k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f38079l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, L l8, Modifier modifier, Shape shape, TextStyle textStyle, float f8, float f9, String str, M m8, FocusRequester focusRequester, int i8, int i9) {
            super(2);
            this.f38068a = z8;
            this.f38069b = l8;
            this.f38070c = modifier;
            this.f38071d = shape;
            this.f38072e = textStyle;
            this.f38073f = f8;
            this.f38074g = f9;
            this.f38075h = str;
            this.f38076i = m8;
            this.f38077j = focusRequester;
            this.f38078k = i8;
            this.f38079l = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            O.a(this.f38068a, this.f38069b, this.f38070c, this.f38071d, this.f38072e, this.f38073f, this.f38074g, this.f38075h, this.f38076i, this.f38077j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38078k | 1), this.f38079l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusManager f38080a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FocusManager focusManager) {
            super(1);
            this.f38080a = focusManager;
        }

        public final void a(KeyboardActionScope $receiver) {
            AbstractC3292y.i($receiver, "$this$$receiver");
            this.f38080a.clearFocus(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((KeyboardActionScope) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusManager f38081a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(FocusManager focusManager) {
            super(1);
            this.f38081a = focusManager;
        }

        public final void a(KeyboardActionScope $receiver) {
            AbstractC3292y.i($receiver, "$this$$receiver");
            this.f38081a.mo2644moveFocus3ESFkO8(FocusDirection.Companion.m2639getNextdhqQ8s());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((KeyboardActionScope) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38082a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L f38083b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f38084c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ FocusManager f38085d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, L l8, int i8, FocusManager focusManager) {
            super(1);
            this.f38082a = str;
            this.f38083b = l8;
            this.f38084c = i8;
            this.f38085d = focusManager;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TextFieldValue) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(TextFieldValue it) {
            String text;
            AbstractC3292y.i(it, "it");
            if ((!l6.n.T(this.f38082a)) && (!l6.n.T(it.getText()))) {
                text = it.getText().substring(1);
                AbstractC3292y.h(text, "substring(...)");
            } else {
                text = it.getText();
            }
            i6.i s8 = i6.m.s(0, this.f38083b.f().A(this.f38084c, text));
            FocusManager focusManager = this.f38085d;
            Iterator it2 = s8.iterator();
            while (it2.hasNext()) {
                ((R5.N) it2).nextInt();
                focusManager.mo2644moveFocus3ESFkO8(FocusDirection.Companion.m2639getNextdhqQ8s());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38086a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f38087b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextStyle f38088c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ L f38089d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f38090e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FocusManager f38091f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f38092g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f38093h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ M f38094i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f38095j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f38096k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, boolean z8, TextStyle textStyle, L l8, int i8, FocusManager focusManager, Modifier modifier, boolean z9, M m8, String str2, int i9) {
            super(2);
            this.f38086a = str;
            this.f38087b = z8;
            this.f38088c = textStyle;
            this.f38089d = l8;
            this.f38090e = i8;
            this.f38091f = focusManager;
            this.f38092g = modifier;
            this.f38093h = z9;
            this.f38094i = m8;
            this.f38095j = str2;
            this.f38096k = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            O.d(this.f38086a, this.f38087b, this.f38088c, this.f38089d, this.f38090e, this.f38091f, this.f38092g, this.f38093h, this.f38094i, this.f38095j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38096k | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M f38097a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38098b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f38099c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f38100d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f38101e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f38102a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f38103b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z8, String str) {
                super(2);
                this.f38102a = z8;
                this.f38103b = str;
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
                    ComposerKt.traceEventStart(1652073966, i8, -1, "com.stripe.android.uicore.elements.OTPInputDecorationBox.<anonymous>.<anonymous> (OTPElementUI.kt:257)");
                }
                TextKt.m1391Text4IGK_g(!this.f38102a ? this.f38103b : "", SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5052boximpl(TextAlign.Companion.m5059getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 48, 0, 130556);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(M m8, String str, boolean z8, boolean z9, String str2) {
            super(3);
            this.f38097a = m8;
            this.f38098b = str;
            this.f38099c = z8;
            this.f38100d = z9;
            this.f38101e = str2;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC2072n) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(InterfaceC2072n innerTextField, Composer composer, int i8) {
            int i9;
            AbstractC3292y.i(innerTextField, "innerTextField");
            if ((i8 & 14) == 0) {
                i9 = i8 | (composer.changedInstance(innerTextField) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1095196779, i9, -1, "com.stripe.android.uicore.elements.OTPInputDecorationBox.<anonymous> (OTPElementUI.kt:252)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            VisualTransformation none = VisualTransformation.Companion.getNone();
            composer.startReplaceableGroup(-1549852397);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
            composer.endReplaceableGroup();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i10 = MaterialTheme.$stable;
            long h8 = AbstractC3539m.n(materialTheme, composer, i10).h();
            Color.Companion companion = Color.Companion;
            textFieldDefaults.TextFieldDecorationBox(this.f38098b, innerTextField, this.f38099c, true, none, mutableInteractionSource, false, null, ComposableLambdaKt.composableLambda(composer, 1652073966, true, new a(this.f38100d, this.f38101e)), null, null, textFieldDefaults.m1376textFieldColorsdx8h9Zs(h8, 0L, companion.m2983getTransparent0d7_KjU(), AbstractC3539m.n(materialTheme, composer, i10).k(), 0L, companion.m2983getTransparent0d7_KjU(), companion.m2983getTransparent0d7_KjU(), companion.m2983getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, this.f38097a.a(), this.f38097a.a(), composer, 14352768, 0, 48, 524050), PaddingKt.m572PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null), composer, ((i9 << 3) & 112) | 100887552, 3456, 1728);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void a(boolean z8, L element, Modifier modifier, Shape shape, TextStyle textStyle, float f8, float f9, String str, M m8, FocusRequester focusRequester, Composer composer, int i8, int i9) {
        Modifier modifier2;
        Shape shape2;
        int i10;
        TextStyle textStyle2;
        float f10;
        float f11;
        String str2;
        M m9;
        FocusRequester focusRequester2;
        boolean z9;
        float disabled;
        long e8;
        AbstractC3292y.i(element, "element");
        Composer startRestartGroup = composer.startRestartGroup(1579313268);
        if ((i9 & 4) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 8) != 0) {
            i10 = i8 & (-7169);
            shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, MaterialTheme.$stable).getMedium();
        } else {
            shape2 = shape;
            i10 = i8;
        }
        if ((i9 & 16) != 0) {
            i10 &= -57345;
            textStyle2 = N.f38049a.a(startRestartGroup, 6);
        } else {
            textStyle2 = textStyle;
        }
        if ((i9 & 32) != 0) {
            f10 = Dp.m5155constructorimpl(8);
        } else {
            f10 = f8;
        }
        if ((i9 & 64) != 0) {
            f11 = Dp.m5155constructorimpl(20);
        } else {
            f11 = f9;
        }
        if ((i9 & 128) != 0) {
            str2 = "●";
        } else {
            str2 = str;
        }
        if ((i9 & 256) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i11 = MaterialTheme.$stable;
            i10 &= -234881025;
            m9 = new M(materialTheme.getColors(startRestartGroup, i11).m1155getPrimary0d7_KjU(), AbstractC3539m.n(materialTheme, startRestartGroup, i11).i(), null);
        } else {
            m9 = m8;
        }
        int i12 = i10;
        if ((i9 & 512) != 0) {
            startRestartGroup.startReplaceableGroup(1737565169);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            focusRequester2 = (FocusRequester) rememberedValue;
        } else {
            focusRequester2 = focusRequester;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1579313268, i12, -1, "com.stripe.android.uicore.elements.OTPElementUI (OTPElementUI.kt:108)");
        }
        FocusManager focusManager = (FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(693286680);
        int i13 = 0;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2473constructorimpl = Updater.m2473constructorimpl(startRestartGroup);
        Updater.m2480setimpl(m2473constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-538968491);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(-1);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        MutableIntState mutableIntState = (MutableIntState) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-538962785);
        i6.i s8 = i6.m.s(0, element.f().y());
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(s8, 10));
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            int nextInt = ((R5.N) it).nextInt();
            if (b(mutableIntState) == nextInt) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (nextInt == 0) {
                startRestartGroup.startReplaceableGroup(-1247423146);
                startRestartGroup.endReplaceableGroup();
            } else if (nextInt == element.f().y() / 2) {
                startRestartGroup.startReplaceableGroup(-1247421278);
                SpacerKt.Spacer(SizeKt.m629width3ABfNKs(Modifier.Companion, f11), startRestartGroup, i13);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-1247418945);
                SpacerKt.Spacer(SizeKt.m629width3ABfNKs(Modifier.Companion, f10), startRestartGroup, i13);
                startRestartGroup.endReplaceableGroup();
            }
            Modifier.Companion companion2 = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(-538952995);
            if (z8) {
                disabled = 1.0f;
            } else {
                disabled = ContentAlpha.INSTANCE.getDisabled(startRestartGroup, ContentAlpha.$stable);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier a9 = androidx.compose.foundation.layout.e.a(rowScopeInstance, AlphaKt.alpha(companion2, disabled), 1.0f, false, 2, null);
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            int i14 = MaterialTheme.$stable;
            long d8 = AbstractC3539m.n(materialTheme2, startRestartGroup, i14).d();
            float h8 = AbstractC3539m.h(materialTheme2, z9, startRestartGroup, i14);
            startRestartGroup.startReplaceableGroup(-538942424);
            if (z9) {
                e8 = m9.b();
            } else {
                e8 = AbstractC3539m.n(materialTheme2, startRestartGroup, i14).e();
            }
            startRestartGroup.endReplaceableGroup();
            int i15 = i12;
            ArrayList arrayList2 = arrayList;
            p0.b(a9, shape2, false, d8, BorderStrokeKt.m286BorderStrokecXLIe8U(h8, e8), ComposableLambdaKt.composableLambda(startRestartGroup, -2113339167, true, new a(element, nextInt, z9, focusRequester2, textStyle2, focusManager, z8, m9, str2, mutableIntState)), startRestartGroup, ((i15 >> 6) & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4);
            arrayList2.add(Q5.I.f8786a);
            arrayList = arrayList2;
            i12 = i15;
            f11 = f11;
            f10 = f10;
            i13 = 0;
        }
        float f12 = f11;
        float f13 = f10;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(z8, element, modifier2, shape2, textStyle2, f13, f12, str2, m9, focusRequester2, i8, i9));
        }
    }

    private static final int b(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MutableIntState mutableIntState, int i8) {
        mutableIntState.setIntValue(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, boolean z8, TextStyle textStyle, L l8, int i8, FocusManager focusManager, Modifier modifier, boolean z9, M m8, String str2, Composer composer, int i9) {
        long m4674getZerod9O1mEE;
        Composer startRestartGroup = composer.startRestartGroup(-1791721297);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1791721297, i9, -1, "com.stripe.android.uicore.elements.OTPInputBox (OTPElementUI.kt:203)");
        }
        if (z8) {
            m4674getZerod9O1mEE = TextRangeKt.TextRange(str.length());
        } else {
            m4674getZerod9O1mEE = TextRange.Companion.m4674getZerod9O1mEE();
        }
        TextFieldValue textFieldValue = new TextFieldValue(str, m4674getZerod9O1mEE, (TextRange) null, 4, (AbstractC3284p) null);
        SolidColor solidColor = new SolidColor(AbstractC3539m.n(MaterialTheme.INSTANCE, startRestartGroup, MaterialTheme.$stable).k(), null);
        int i10 = i9 >> 12;
        int i11 = i10 & 7168;
        BasicTextFieldKt.BasicTextField(textFieldValue, (Function1) new e(str, l8, i8, focusManager), modifier, z9, false, textStyle, new KeyboardOptions(0, false, l8.f().x(), 0, 11, null), new KeyboardActions(new c(focusManager), null, new d(focusManager), null, null, null, 58, null), true, 0, 0, (VisualTransformation) null, (Function1) null, (MutableInteractionSource) null, (Brush) solidColor, e(str, z8, str2, z9, m8, startRestartGroup, (i9 & 126) | ((i9 >> 21) & 896) | i11 | (57344 & i10)), startRestartGroup, 100663296 | (i10 & 896) | i11 | ((i9 << 9) & 458752), 0, 15888);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f(str, z8, textStyle, l8, i8, focusManager, modifier, z9, m8, str2, i9));
        }
    }

    private static final InterfaceC2073o e(String str, boolean z8, String str2, boolean z9, M m8, Composer composer, int i8) {
        composer.startReplaceableGroup(1943015148);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1943015148, i8, -1, "com.stripe.android.uicore.elements.OTPInputDecorationBox (OTPElementUI.kt:251)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 1095196779, true, new g(m8, str, z9, z8, str2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }
}
