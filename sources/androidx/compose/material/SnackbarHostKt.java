package androidx.compose.material;

import Q5.p;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.core.view.PointerIconCompat;
import androidx.work.WorkRequest;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SnackbarHostKt {
    private static final int SnackbarFadeInMillis = 150;
    private static final int SnackbarFadeOutMillis = 75;
    private static final int SnackbarInBetweenDelayMillis = 0;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackbarDuration.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackbarDuration.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c9 A[LOOP:2: B:57:0x01c7->B:58:0x01c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FadeInFadeOutWithScale(androidx.compose.material.SnackbarData r16, androidx.compose.ui.Modifier r17, c6.InterfaceC2073o r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt.FadeInFadeOutWithScale(androidx.compose.material.SnackbarData, androidx.compose.ui.Modifier, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SnackbarHost(SnackbarHostState hostState, Modifier modifier, InterfaceC2073o interfaceC2073o, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC3292y.i(hostState, "hostState");
        Composer startRestartGroup = composer.startRestartGroup(431012348);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(hostState)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        int i14 = i9 & 2;
        if (i14 != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        int i15 = i9 & 4;
        if (i15 != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2073o)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        if ((i10 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            if (i15 != 0) {
                interfaceC2073o = ComposableSingletons$SnackbarHostKt.INSTANCE.m1185getLambda1$material_release();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(431012348, i10, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:150)");
            }
            SnackbarData currentSnackbarData = hostState.getCurrentSnackbarData();
            EffectsKt.LaunchedEffect(currentSnackbarData, new SnackbarHostKt$SnackbarHost$1(currentSnackbarData, (AccessibilityManager) startRestartGroup.consume(CompositionLocalsKt.getLocalAccessibilityManager()), null), startRestartGroup, 64);
            FadeInFadeOutWithScale(hostState.getCurrentSnackbarData(), modifier, interfaceC2073o, startRestartGroup, i10 & PointerIconCompat.TYPE_TEXT, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        InterfaceC2073o interfaceC2073o2 = interfaceC2073o;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SnackbarHostKt$SnackbarHost$2(hostState, modifier2, interfaceC2073o2, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Float> animatedOpacity(AnimationSpec<Float> animationSpec, boolean z8, Function0 function0, Composer composer, int i8, int i9) {
        float f8;
        composer.startReplaceableGroup(1016418159);
        if ((i9 & 4) != 0) {
            function0 = SnackbarHostKt$animatedOpacity$1.INSTANCE;
        }
        Function0 function02 = function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1016418159, i8, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:342)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            if (!z8) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            rememberedValue = AnimatableKt.Animatable$default(f8, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z8), new SnackbarHostKt$animatedOpacity$2(animatable, z8, animationSpec, function02, null), composer, ((i8 >> 3) & 14) | 64);
        State<Float> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Float> animatedScale(AnimationSpec<Float> animationSpec, boolean z8, Composer composer, int i8) {
        float f8;
        composer.startReplaceableGroup(2003504988);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2003504988, i8, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:359)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            if (!z8) {
                f8 = 1.0f;
            } else {
                f8 = 0.8f;
            }
            rememberedValue = AnimatableKt.Animatable$default(f8, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z8), new SnackbarHostKt$animatedScale$1(animatable, z8, animationSpec, null), composer, ((i8 >> 3) & 14) | 64);
        State<Float> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    public static final long toMillis(SnackbarDuration snackbarDuration, boolean z8, AccessibilityManager accessibilityManager) {
        long j8;
        AbstractC3292y.i(snackbarDuration, "<this>");
        int i8 = WhenMappings.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    j8 = 4000;
                } else {
                    throw new p();
                }
            } else {
                j8 = WorkRequest.MIN_BACKOFF_MILLIS;
            }
        } else {
            j8 = Long.MAX_VALUE;
        }
        long j9 = j8;
        if (accessibilityManager == null) {
            return j9;
        }
        return accessibilityManager.calculateRecommendedTimeoutMillis(j9, true, true, z8);
    }
}
