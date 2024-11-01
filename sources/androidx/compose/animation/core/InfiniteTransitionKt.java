package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class InfiniteTransitionKt {
    @Composable
    public static final State<Float> animateFloat(InfiniteTransition infiniteTransition, float f8, float f9, InfiniteRepeatableSpec<Float> animationSpec, String str, Composer composer, int i8, int i9) {
        AbstractC3292y.i(infiniteTransition, "<this>");
        AbstractC3292y.i(animationSpec, "animationSpec");
        composer.startReplaceableGroup(-644770905);
        String str2 = (i9 & 8) != 0 ? "FloatAnimation" : str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-644770905, i8, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:310)");
        }
        int i10 = i8 << 3;
        State<Float> animateValue = animateValue(infiniteTransition, Float.valueOf(f8), Float.valueOf(f9), VectorConvertersKt.getVectorConverter(r.f34602a), animationSpec, str2, composer, (i8 & 112) | 8 | (i8 & 896) | (57344 & i10) | (i10 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValue;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v0 ??, still in use, count: 1, list:
          (r10v0 ?? I:java.lang.Object) from 0x004f: INVOKE (r17v0 ?? I:androidx.compose.runtime.Composer), (r10v0 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:7)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    @androidx.compose.runtime.Composable
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> androidx.compose.runtime.State<T> animateValue(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v0 ??, still in use, count: 1, list:
          (r10v0 ?? I:java.lang.Object) from 0x004f: INVOKE (r17v0 ?? I:androidx.compose.runtime.Composer), (r10v0 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:7)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
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
    public static final InfiniteTransition rememberInfiniteTransition(String str, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(1013651573);
        if ((i9 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1013651573, i8, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new InfiniteTransition(str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        InfiniteTransition infiniteTransition = (InfiniteTransition) rememberedValue;
        infiniteTransition.run$animation_core_release(composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return infiniteTransition;
    }

    @Composable
    public static final /* synthetic */ State animateFloat(InfiniteTransition infiniteTransition, float f8, float f9, InfiniteRepeatableSpec animationSpec, Composer composer, int i8) {
        AbstractC3292y.i(infiniteTransition, "<this>");
        AbstractC3292y.i(animationSpec, "animationSpec");
        composer.startReplaceableGroup(469472752);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(469472752, i8, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:352)");
        }
        State<Float> animateFloat = animateFloat(infiniteTransition, f8, f9, animationSpec, "FloatAnimation", composer, (i8 & 112) | 24584 | (i8 & 896) | (i8 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateFloat;
    }

    @Composable
    public static final /* synthetic */ InfiniteTransition rememberInfiniteTransition(Composer composer, int i8) {
        composer.startReplaceableGroup(-840193660);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-840193660, i8, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:323)");
        }
        InfiniteTransition rememberInfiniteTransition = rememberInfiniteTransition("InfiniteTransition", composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberInfiniteTransition;
    }

    @Composable
    public static final /* synthetic */ State animateValue(InfiniteTransition infiniteTransition, Object obj, Object obj2, TwoWayConverter typeConverter, InfiniteRepeatableSpec animationSpec, Composer composer, int i8) {
        AbstractC3292y.i(infiniteTransition, "<this>");
        AbstractC3292y.i(typeConverter, "typeConverter");
        AbstractC3292y.i(animationSpec, "animationSpec");
        composer.startReplaceableGroup(-1695411770);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1695411770, i8, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:332)");
        }
        int i9 = (i8 >> 3) & 8;
        State animateValue = animateValue(infiniteTransition, obj, obj2, typeConverter, animationSpec, "ValueAnimation", composer, (i9 << 6) | (i9 << 3) | 196616 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (i8 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValue;
    }
}
