package t4;

import Q5.I;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.Typography;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2076r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2076r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39479a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39480b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f39481c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextFieldColors f39482d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f39483e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f39484f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39485g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39486h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39487i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f39488j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ PaddingValues f39489k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f39490l;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: t4.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0890a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f39491a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f39492b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC2072n f39493c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f39494d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f39495e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0890a(float f8, long j8, InterfaceC2072n interfaceC2072n, boolean z8, long j9) {
                super(2);
                this.f39491a = f8;
                this.f39492b = j8;
                this.f39493c = interfaceC2072n;
                this.f39494d = z8;
                this.f39495e = j9;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8786a;
            }

            public final void invoke(Composer composer, int i8) {
                TextStyle textStyle;
                TextStyle m4696copyv2rsoow;
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-753626064, i8, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (CompatTextField.kt:270)");
                }
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i9 = MaterialTheme.$stable;
                TextStyle lerp = TextStyleKt.lerp(materialTheme.getTypography(composer, i9).getSubtitle1(), materialTheme.getTypography(composer, i9).getCaption(), this.f39491a);
                boolean z8 = this.f39494d;
                long j8 = this.f39495e;
                if (z8) {
                    m4696copyv2rsoow = lerp.m4696copyv2rsoow((r48 & 1) != 0 ? lerp.spanStyle.m4628getColor0d7_KjU() : j8, (r48 & 2) != 0 ? lerp.spanStyle.m4629getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? lerp.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? lerp.spanStyle.m4630getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? lerp.spanStyle.m4631getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? lerp.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? lerp.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? lerp.spanStyle.m4632getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? lerp.spanStyle.m4627getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? lerp.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? lerp.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? lerp.spanStyle.m4626getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? lerp.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? lerp.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? lerp.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5052boximpl(lerp.paragraphStyle.m4584getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5066boximpl(lerp.paragraphStyle.m4586getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? lerp.paragraphStyle.m4582getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? lerp.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? lerp.platformStyle : null, (r48 & 1048576) != 0 ? lerp.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4972boximpl(lerp.paragraphStyle.m4581getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4962boximpl(lerp.paragraphStyle.m4579getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? lerp.paragraphStyle.getTextMotion() : null);
                    textStyle = m4696copyv2rsoow;
                } else {
                    textStyle = lerp;
                }
                b.c(this.f39492b, textStyle, null, this.f39493c, composer, 384, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: t4.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0891b extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f39496a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC2072n f39497b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0891b(long j8, InterfaceC2072n interfaceC2072n) {
                super(2);
                this.f39496a = j8;
                this.f39497b = interfaceC2072n;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8786a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-816802558, i8, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (CompatTextField.kt:301)");
                }
                b.c(this.f39496a, null, null, this.f39497b, composer, 0, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3293z implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f39498a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TextFieldColors f39499b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f39500c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC2072n f39501d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(float f8, TextFieldColors textFieldColors, boolean z8, InterfaceC2072n interfaceC2072n) {
                super(3);
                this.f39498a = f8;
                this.f39499b = textFieldColors;
                this.f39500c = z8;
                this.f39501d = interfaceC2072n;
            }

            @Override // c6.InterfaceC2073o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f8786a;
            }

            public final void invoke(Modifier modifier, Composer composer, int i8) {
                AbstractC3292y.i(modifier, "modifier");
                if ((i8 & 14) == 0) {
                    i8 |= composer.changed(modifier) ? 4 : 2;
                }
                if ((i8 & 91) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-848031908, i8, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous>.<anonymous> (CompatTextField.kt:286)");
                }
                Modifier alpha = AlphaKt.alpha(modifier, this.f39498a);
                TextFieldColors textFieldColors = this.f39499b;
                boolean z8 = this.f39500c;
                InterfaceC2072n interfaceC2072n = this.f39501d;
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Function0 constructor = companion.getConstructor();
                InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(alpha);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m2473constructorimpl = Updater.m2473constructorimpl(composer);
                Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                b.c(textFieldColors.placeholderColor(z8, composer, 0).getValue().m2958unboximpl(), MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getSubtitle1(), null, interfaceC2072n, composer, 0, 4);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f39502a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC2072n f39503b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(long j8, InterfaceC2072n interfaceC2072n) {
                super(2);
                this.f39502a = j8;
                this.f39503b = interfaceC2072n;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8786a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2104269322, i8, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (CompatTextField.kt:308)");
                }
                b.c(this.f39502a, null, null, this.f39503b, composer, 0, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, String str, TextFieldColors textFieldColors, boolean z8, boolean z9, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, InterfaceC2072n interfaceC2072n5, boolean z10, PaddingValues paddingValues, boolean z11) {
            super(6);
            this.f39479a = interfaceC2072n;
            this.f39480b = interfaceC2072n2;
            this.f39481c = str;
            this.f39482d = textFieldColors;
            this.f39483e = z8;
            this.f39484f = z9;
            this.f39485g = interfaceC2072n3;
            this.f39486h = interfaceC2072n4;
            this.f39487i = interfaceC2072n5;
            this.f39488j = z10;
            this.f39489k = paddingValues;
            this.f39490l = z11;
        }

        @Override // c6.InterfaceC2076r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            m5582invokeRIQooxk(((Number) obj).floatValue(), ((Color) obj2).m2958unboximpl(), ((Color) obj3).m2958unboximpl(), ((Number) obj4).floatValue(), (Composer) obj5, ((Number) obj6).intValue());
            return I.f8786a;
        }

        /* renamed from: invoke-RIQooxk, reason: not valid java name */
        public final void m5582invokeRIQooxk(float f8, long j8, long j9, float f9, Composer composer, int i8) {
            int i9;
            ComposableLambda composableLambda;
            ComposableLambda composableLambda2;
            ComposableLambda composableLambda3;
            ComposableLambda composableLambda4;
            int i10;
            int i11;
            int i12;
            int i13;
            if ((i8 & 14) == 0) {
                if (composer.changed(f8)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                i9 = i13 | i8;
            } else {
                i9 = i8;
            }
            if ((i8 & 112) == 0) {
                if (composer.changed(j8)) {
                    i12 = 32;
                } else {
                    i12 = 16;
                }
                i9 |= i12;
            }
            if ((i8 & 896) == 0) {
                if (composer.changed(j9)) {
                    i11 = 256;
                } else {
                    i11 = 128;
                }
                i9 |= i11;
            }
            if ((i8 & 7168) == 0) {
                if (composer.changed(f9)) {
                    i10 = 2048;
                } else {
                    i10 = 1024;
                }
                i9 |= i10;
            }
            if ((46811 & i9) == 9362 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1648140010, i9, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous> (CompatTextField.kt:268)");
            }
            InterfaceC2072n interfaceC2072n = this.f39479a;
            if (interfaceC2072n != null) {
                composableLambda = ComposableLambdaKt.composableLambda(composer, -753626064, true, new C0890a(f8, j9, interfaceC2072n, this.f39490l, j8));
            } else {
                composableLambda = null;
            }
            if (this.f39480b != null && this.f39481c.length() == 0 && f9 > 0.0f) {
                composableLambda2 = ComposableLambdaKt.composableLambda(composer, -848031908, true, new c(f9, this.f39482d, this.f39483e, this.f39480b));
            } else {
                composableLambda2 = null;
            }
            long m2958unboximpl = this.f39482d.leadingIconColor(this.f39483e, this.f39484f, composer, 0).getValue().m2958unboximpl();
            InterfaceC2072n interfaceC2072n2 = this.f39485g;
            if (interfaceC2072n2 != null) {
                composableLambda3 = ComposableLambdaKt.composableLambda(composer, -816802558, true, new C0891b(m2958unboximpl, interfaceC2072n2));
            } else {
                composableLambda3 = null;
            }
            long m2958unboximpl2 = this.f39482d.trailingIconColor(this.f39483e, this.f39484f, composer, 0).getValue().m2958unboximpl();
            InterfaceC2072n interfaceC2072n3 = this.f39486h;
            if (interfaceC2072n3 != null) {
                composableLambda4 = ComposableLambdaKt.composableLambda(composer, -2104269322, true, new d(m2958unboximpl2, interfaceC2072n3));
            } else {
                composableLambda4 = null;
            }
            int i14 = ((i9 << 21) & 29360128) | 6;
            t4.d.a(Modifier.Companion, this.f39487i, composableLambda, composableLambda2, composableLambda3, composableLambda4, this.f39488j, f8, this.f39489k, composer, i14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0892b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f39504a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39505b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VisualTransformation f39506c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39507d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39508e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39509f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39510g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f39511h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f39512i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f39513j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InteractionSource f39514k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ PaddingValues f39515l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ TextFieldColors f39516m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f39517n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f39518o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f39519p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0892b(String str, InterfaceC2072n interfaceC2072n, VisualTransformation visualTransformation, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, InterfaceC2072n interfaceC2072n5, boolean z8, boolean z9, boolean z10, InteractionSource interactionSource, PaddingValues paddingValues, TextFieldColors textFieldColors, int i8, int i9, int i10) {
            super(2);
            this.f39504a = str;
            this.f39505b = interfaceC2072n;
            this.f39506c = visualTransformation;
            this.f39507d = interfaceC2072n2;
            this.f39508e = interfaceC2072n3;
            this.f39509f = interfaceC2072n4;
            this.f39510g = interfaceC2072n5;
            this.f39511h = z8;
            this.f39512i = z9;
            this.f39513j = z10;
            this.f39514k = interactionSource;
            this.f39515l = paddingValues;
            this.f39516m = textFieldColors;
            this.f39517n = i8;
            this.f39518o = i9;
            this.f39519p = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.a(this.f39504a, this.f39505b, this.f39506c, this.f39507d, this.f39508e, this.f39509f, this.f39510g, this.f39511h, this.f39512i, this.f39513j, this.f39514k, this.f39515l, this.f39516m, composer, RecomposeScopeImplKt.updateChangedFlags(this.f39517n | 1), RecomposeScopeImplKt.updateChangedFlags(this.f39518o), this.f39519p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextFieldColors f39520a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f39521b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f39522c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InteractionSource f39523d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(TextFieldColors textFieldColors, boolean z8, boolean z9, InteractionSource interactionSource) {
            super(3);
            this.f39520a = textFieldColors;
            this.f39521b = z8;
            this.f39522c = z9;
            this.f39523d = interactionSource;
        }

        public final long a(t4.c it, Composer composer, int i8) {
            boolean z8;
            AbstractC3292y.i(it, "it");
            composer.startReplaceableGroup(348982872);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(348982872, i8, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous> (CompatTextField.kt:240)");
            }
            TextFieldColors textFieldColors = this.f39520a;
            boolean z9 = this.f39521b;
            if (it == t4.c.f39572b) {
                z8 = false;
            } else {
                z8 = this.f39522c;
            }
            long m2958unboximpl = textFieldColors.labelColor(z9, z8, this.f39523d, composer, 0).getValue().m2958unboximpl();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return m2958unboximpl;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return Color.m2938boximpl(a((t4.c) obj, (Composer) obj2, ((Number) obj3).intValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f39524a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39525b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VisualTransformation f39526c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39527d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39528e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39529f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f39530g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f39531h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f39532i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ MutableInteractionSource f39533j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ TextFieldColors f39534k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(TextFieldValue textFieldValue, InterfaceC2072n interfaceC2072n, VisualTransformation visualTransformation, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, boolean z8, boolean z9, boolean z10, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors) {
            super(3);
            this.f39524a = textFieldValue;
            this.f39525b = interfaceC2072n;
            this.f39526c = visualTransformation;
            this.f39527d = interfaceC2072n2;
            this.f39528e = interfaceC2072n3;
            this.f39529f = interfaceC2072n4;
            this.f39530g = z8;
            this.f39531h = z9;
            this.f39532i = z10;
            this.f39533j = mutableInteractionSource;
            this.f39534k = textFieldColors;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC2072n) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        public final void invoke(InterfaceC2072n innerTextField, Composer composer, int i8) {
            int i9;
            PaddingValues m1366textFieldWithLabelPaddinga9UjIt4$default;
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
                ComposerKt.traceEventStart(1540251746, i9, -1, "com.stripe.android.uicore.elements.compat.CompatTextField.<anonymous> (CompatTextField.kt:185)");
            }
            String text = this.f39524a.getText();
            if (this.f39525b == null) {
                m1366textFieldWithLabelPaddinga9UjIt4$default = TextFieldDefaults.m1367textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
            } else {
                m1366textFieldWithLabelPaddinga9UjIt4$default = TextFieldDefaults.m1366textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
            }
            b.a(text, innerTextField, this.f39526c, this.f39525b, this.f39527d, this.f39528e, this.f39529f, this.f39530g, this.f39531h, this.f39532i, this.f39533j, m1366textFieldWithLabelPaddinga9UjIt4$default, this.f39534k, composer, (i9 << 3) & 112, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f39535a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f39536b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f39537c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f39538d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f39539e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextStyle f39540f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39541g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39542h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39543i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39544j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f39545k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ VisualTransformation f39546l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f39547m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ KeyboardActions f39548n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f39549o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f39550p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f39551q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ MutableInteractionSource f39552r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Shape f39553s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ TextFieldColors f39554t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f39555u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f39556v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f39557w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, boolean z8, boolean z9, TextStyle textStyle, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, boolean z10, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z11, int i8, int i9, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i10, int i11, int i12) {
            super(2);
            this.f39535a = textFieldValue;
            this.f39536b = function1;
            this.f39537c = modifier;
            this.f39538d = z8;
            this.f39539e = z9;
            this.f39540f = textStyle;
            this.f39541g = interfaceC2072n;
            this.f39542h = interfaceC2072n2;
            this.f39543i = interfaceC2072n3;
            this.f39544j = interfaceC2072n4;
            this.f39545k = z10;
            this.f39546l = visualTransformation;
            this.f39547m = keyboardOptions;
            this.f39548n = keyboardActions;
            this.f39549o = z11;
            this.f39550p = i8;
            this.f39551q = i9;
            this.f39552r = mutableInteractionSource;
            this.f39553s = shape;
            this.f39554t = textFieldColors;
            this.f39555u = i10;
            this.f39556v = i11;
            this.f39557w = i12;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.b(this.f39535a, this.f39536b, this.f39537c, this.f39538d, this.f39539e, this.f39540f, this.f39541g, this.f39542h, this.f39543i, this.f39544j, this.f39545k, this.f39546l, this.f39547m, this.f39548n, this.f39549o, this.f39550p, this.f39551q, this.f39552r, this.f39553s, this.f39554t, composer, RecomposeScopeImplKt.updateChangedFlags(this.f39555u | 1), RecomposeScopeImplKt.updateChangedFlags(this.f39556v), this.f39557w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f39558a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextStyle f39559b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Float f39560c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39561d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f39562e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f39563f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j8, TextStyle textStyle, Float f8, InterfaceC2072n interfaceC2072n, int i8, int i9) {
            super(2);
            this.f39558a = j8;
            this.f39559b = textStyle;
            this.f39560c = f8;
            this.f39561d = interfaceC2072n;
            this.f39562e = i8;
            this.f39563f = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.c(this.f39558a, this.f39559b, this.f39560c, this.f39561d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f39562e | 1), this.f39563f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f39564a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Float f39565b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39566c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Float f39567a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC2072n f39568b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f39569c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Float f8, InterfaceC2072n interfaceC2072n, long j8) {
                super(2);
                this.f39567a = f8;
                this.f39568b = interfaceC2072n;
                this.f39569c = j8;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8786a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1070796295, i8, -1, "com.stripe.android.uicore.elements.compat.Decoration.<anonymous>.<anonymous> (CompatTextField.kt:341)");
                }
                if (this.f39567a != null) {
                    composer.startReplaceableGroup(-979697943);
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(this.f39567a)}, this.f39568b, composer, 8);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-979519197);
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2950getAlphaimpl(this.f39569c)))}, this.f39568b, composer, 8);
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j8, Float f8, InterfaceC2072n interfaceC2072n) {
            super(2);
            this.f39564a = j8;
            this.f39565b = f8;
            this.f39566c = interfaceC2072n;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1247846727, i8, -1, "com.stripe.android.uicore.elements.compat.Decoration.<anonymous> (CompatTextField.kt:340)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(this.f39564a))}, ComposableLambdaKt.composableLambda(composer, -1070796295, true, new a(this.f39565b, this.f39566c, this.f39564a)), composer, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f39570a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str) {
            super(1);
            this.f39570a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f8786a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.error(semantics, this.f39570a);
        }
    }

    public static final void a(String value, InterfaceC2072n innerTextField, VisualTransformation visualTransformation, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, boolean z8, boolean z9, boolean z10, InteractionSource interactionSource, PaddingValues contentPadding, TextFieldColors colors, Composer composer, int i8, int i9, int i10) {
        int i11;
        int i12;
        t4.c cVar;
        Composer composer2;
        boolean z11;
        InterfaceC2072n interfaceC2072n5;
        InterfaceC2072n interfaceC2072n6;
        InterfaceC2072n interfaceC2072n7;
        boolean z12;
        boolean z13;
        AbstractC3292y.i(value, "value");
        AbstractC3292y.i(innerTextField, "innerTextField");
        AbstractC3292y.i(visualTransformation, "visualTransformation");
        AbstractC3292y.i(interactionSource, "interactionSource");
        AbstractC3292y.i(contentPadding, "contentPadding");
        AbstractC3292y.i(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(-1341778867);
        if ((i10 & 1) != 0) {
            i11 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i11 = (startRestartGroup.changed(value) ? 4 : 2) | i8;
        } else {
            i11 = i8;
        }
        if ((i10 & 2) != 0) {
            i11 |= 48;
        } else if ((i8 & 112) == 0) {
            i11 |= startRestartGroup.changedInstance(innerTextField) ? 32 : 16;
        }
        if ((i10 & 4) != 0) {
            i11 |= 384;
        } else if ((i8 & 896) == 0) {
            i11 |= startRestartGroup.changed(visualTransformation) ? 256 : 128;
        }
        if ((i10 & 8) != 0) {
            i11 |= 3072;
        } else if ((i8 & 7168) == 0) {
            i11 |= startRestartGroup.changedInstance(interfaceC2072n) ? 2048 : 1024;
        }
        int i13 = i10 & 16;
        if (i13 != 0) {
            i11 |= 24576;
        } else if ((i8 & 57344) == 0) {
            i11 |= startRestartGroup.changedInstance(interfaceC2072n2) ? 16384 : 8192;
        }
        int i14 = i10 & 32;
        if (i14 != 0) {
            i11 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i8 & 458752) == 0) {
            i11 |= startRestartGroup.changedInstance(interfaceC2072n3) ? 131072 : 65536;
        }
        int i15 = i10 & 64;
        if (i15 != 0) {
            i11 |= 1572864;
        } else if ((i8 & 3670016) == 0) {
            i11 |= startRestartGroup.changedInstance(interfaceC2072n4) ? 1048576 : 524288;
        }
        int i16 = i10 & 128;
        if (i16 != 0) {
            i11 |= 12582912;
        } else if ((i8 & 29360128) == 0) {
            i11 |= startRestartGroup.changed(z8) ? 8388608 : 4194304;
        }
        int i17 = i10 & 256;
        if (i17 != 0) {
            i11 |= 100663296;
        } else if ((i8 & 234881024) == 0) {
            i11 |= startRestartGroup.changed(z9) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i18 = i10 & 512;
        if (i18 != 0) {
            i11 |= 805306368;
        } else if ((i8 & 1879048192) == 0) {
            i11 |= startRestartGroup.changed(z10) ? 536870912 : 268435456;
        }
        if ((i10 & 1024) != 0) {
            i12 = i9 | 6;
        } else if ((i9 & 14) == 0) {
            i12 = (startRestartGroup.changed(interactionSource) ? 4 : 2) | i9;
        } else {
            i12 = i9;
        }
        if ((i10 & 2048) != 0) {
            i12 |= 48;
        } else if ((i9 & 112) == 0) {
            i12 |= startRestartGroup.changed(contentPadding) ? 32 : 16;
        }
        if ((i10 & 4096) != 0) {
            i12 |= 384;
        } else if ((i9 & 896) == 0) {
            i12 |= startRestartGroup.changed(colors) ? 256 : 128;
        }
        if ((1533916891 & i11) == 306783378 && (i12 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            interfaceC2072n5 = interfaceC2072n2;
            interfaceC2072n6 = interfaceC2072n3;
            z11 = z8;
            z13 = z9;
            z12 = z10;
            composer2 = startRestartGroup;
            interfaceC2072n7 = interfaceC2072n4;
        } else {
            InterfaceC2072n interfaceC2072n8 = i13 != 0 ? null : interfaceC2072n2;
            InterfaceC2072n interfaceC2072n9 = i14 != 0 ? null : interfaceC2072n3;
            InterfaceC2072n interfaceC2072n10 = i15 != 0 ? null : interfaceC2072n4;
            boolean z14 = i16 != 0 ? false : z8;
            boolean z15 = i17 != 0 ? true : z9;
            boolean z16 = i18 != 0 ? false : z10;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1341778867, i11, i12, "com.stripe.android.uicore.elements.compat.CommonDecorationBox (CompatTextField.kt:227)");
            }
            startRestartGroup.startReplaceableGroup(1391159388);
            boolean z17 = ((i11 & 14) == 4) | ((i11 & 896) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z17 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            String text = ((TransformedText) rememberedValue).getText().getText();
            if (FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, i12 & 14).getValue().booleanValue()) {
                cVar = t4.c.f39571a;
            } else {
                cVar = text.length() == 0 ? t4.c.f39572b : t4.c.f39573c;
            }
            t4.c cVar2 = cVar;
            c cVar3 = new c(colors, z15, z16, interactionSource);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i19 = MaterialTheme.$stable;
            Typography typography = materialTheme.getTypography(startRestartGroup, i19);
            TextStyle subtitle1 = typography.getSubtitle1();
            TextStyle caption = typography.getCaption();
            long m4699getColor0d7_KjU = subtitle1.m4699getColor0d7_KjU();
            Color.Companion companion = Color.Companion;
            boolean z18 = z14;
            boolean z19 = (Color.m2949equalsimpl0(m4699getColor0d7_KjU, companion.m2984getUnspecified0d7_KjU()) && !Color.m2949equalsimpl0(caption.m4699getColor0d7_KjU(), companion.m2984getUnspecified0d7_KjU())) || (!Color.m2949equalsimpl0(subtitle1.m4699getColor0d7_KjU(), companion.m2984getUnspecified0d7_KjU()) && Color.m2949equalsimpl0(caption.m4699getColor0d7_KjU(), companion.m2984getUnspecified0d7_KjU()));
            t4.f fVar = t4.f.f39607a;
            startRestartGroup.startReplaceableGroup(1391197102);
            long m4699getColor0d7_KjU2 = materialTheme.getTypography(startRestartGroup, i19).getCaption().m4699getColor0d7_KjU();
            boolean z20 = z16;
            startRestartGroup.startReplaceableGroup(1391198921);
            if (z19 && m4699getColor0d7_KjU2 == companion.m2984getUnspecified0d7_KjU()) {
                m4699getColor0d7_KjU2 = ((Color) cVar3.invoke(cVar2, startRestartGroup, 0)).m2958unboximpl();
            }
            long j8 = m4699getColor0d7_KjU2;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1391203216);
            long m4699getColor0d7_KjU3 = materialTheme.getTypography(startRestartGroup, i19).getSubtitle1().m4699getColor0d7_KjU();
            startRestartGroup.startReplaceableGroup(1391205097);
            if (z19 && m4699getColor0d7_KjU3 == companion.m2984getUnspecified0d7_KjU()) {
                m4699getColor0d7_KjU3 = ((Color) cVar3.invoke(cVar2, startRestartGroup, 0)).m2958unboximpl();
            }
            long j9 = m4699getColor0d7_KjU3;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            boolean z21 = z15;
            composer2 = startRestartGroup;
            fVar.a(cVar2, j8, j9, cVar3, interfaceC2072n != null, ComposableLambdaKt.composableLambda(composer2, 1648140010, true, new a(interfaceC2072n, interfaceC2072n8, text, colors, z15, z20, interfaceC2072n9, interfaceC2072n10, innerTextField, z18, contentPadding, z19)), composer2, 1769472);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z11 = z18;
            interfaceC2072n5 = interfaceC2072n8;
            interfaceC2072n6 = interfaceC2072n9;
            interfaceC2072n7 = interfaceC2072n10;
            z12 = z20;
            z13 = z21;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C0892b(value, innerTextField, visualTransformation, interfaceC2072n, interfaceC2072n5, interfaceC2072n6, interfaceC2072n7, z11, z13, z12, interactionSource, contentPadding, colors, i8, i9, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0654  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.text.input.TextFieldValue r73, kotlin.jvm.functions.Function1 r74, androidx.compose.ui.Modifier r75, boolean r76, boolean r77, androidx.compose.ui.text.TextStyle r78, c6.InterfaceC2072n r79, c6.InterfaceC2072n r80, c6.InterfaceC2072n r81, c6.InterfaceC2072n r82, boolean r83, androidx.compose.ui.text.input.VisualTransformation r84, androidx.compose.foundation.text.KeyboardOptions r85, androidx.compose.foundation.text.KeyboardActions r86, boolean r87, int r88, int r89, androidx.compose.foundation.interaction.MutableInteractionSource r90, androidx.compose.ui.graphics.Shape r91, androidx.compose.material.TextFieldColors r92, androidx.compose.runtime.Composer r93, int r94, int r95, int r96) {
        /*
            Method dump skipped, instructions count: 1648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.b.b(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, c6.n, c6.n, c6.n, c6.n, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(long r13, androidx.compose.ui.text.TextStyle r15, java.lang.Float r16, c6.InterfaceC2072n r17, androidx.compose.runtime.Composer r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.b.c(long, androidx.compose.ui.text.TextStyle, java.lang.Float, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Modifier d(Modifier modifier, boolean z8, String str) {
        if (z8) {
            return SemanticsModifierKt.semantics$default(modifier, false, new h(str), 1, null);
        }
        return modifier;
    }
}
