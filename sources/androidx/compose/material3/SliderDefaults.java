package androidx.compose.material3;

import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final SliderDefaults INSTANCE = new SliderDefaults();

    private SliderDefaults() {
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0069  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /* renamed from: Thumb-9LiSoMs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1734Thumb9LiSoMs(androidx.compose.foundation.interaction.MutableInteractionSource r38, androidx.compose.ui.Modifier r39, androidx.compose.material3.SliderColors r40, boolean r41, long r42, androidx.compose.runtime.Composer r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.m1734Thumb9LiSoMs(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v4 ??, still in use, count: 1, list:
          (r8v4 ?? I:java.lang.Object) from 0x018c: INVOKE (r10v22 ?? I:androidx.compose.runtime.Composer), (r8v4 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:397)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    public final void Track(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v4 ??, still in use, count: 1, list:
          (r8v4 ?? I:java.lang.Object) from 0x018c: INVOKE (r10v22 ?? I:androidx.compose.runtime.Composer), (r8v4 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:397)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r36v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */

    @Composable
    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m1735colorsq0g_0yA(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, Composer composer, int i8, int i9, int i10) {
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        composer.startReplaceableGroup(885588574);
        if ((i10 & 1) != 0) {
            j18 = ColorSchemeKt.toColor(SliderTokens.INSTANCE.getHandleColor(), composer, 6);
        } else {
            j18 = j8;
        }
        if ((i10 & 2) != 0) {
            j19 = ColorSchemeKt.toColor(SliderTokens.INSTANCE.getActiveTrackColor(), composer, 6);
        } else {
            j19 = j9;
        }
        if ((i10 & 4) != 0) {
            j20 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksActiveContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j20 = j10;
        }
        if ((i10 & 8) != 0) {
            j21 = ColorSchemeKt.toColor(SliderTokens.INSTANCE.getInactiveTrackColor(), composer, 6);
        } else {
            j21 = j11;
        }
        if ((i10 & 16) != 0) {
            j22 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksInactiveContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j22 = j12;
        }
        if ((i10 & 32) != 0) {
            j23 = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getDisabledHandleColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1508getSurface0d7_KjU());
        } else {
            j23 = j13;
        }
        if ((i10 & 64) != 0) {
            j24 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getDisabledActiveTrackColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j24 = j14;
        }
        if ((i10 & 128) != 0) {
            j25 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksDisabledContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j25 = j15;
        }
        if ((i10 & 256) != 0) {
            j26 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getDisabledInactiveTrackColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j26 = j16;
        }
        if ((i10 & 512) != 0) {
            j27 = Color.m2947copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksDisabledContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j27 = j17;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(885588574, i8, i9, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:618)");
        }
        SliderColors sliderColors = new SliderColors(j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sliderColors;
    }
}
