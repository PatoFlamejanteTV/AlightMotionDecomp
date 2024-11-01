package androidx.compose.foundation.lazy.staggeredgrid;

import Q5.p;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasurePolicyKt {

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float afterPadding(PaddingValues paddingValues, Orientation orientation, boolean z8, LayoutDirection layoutDirection) {
        int i8 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                if (z8) {
                    return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
                }
                return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            }
            throw new p();
        }
        if (z8) {
            return paddingValues.mo530calculateTopPaddingD9Ej5fM();
        }
        return paddingValues.mo527calculateBottomPaddingD9Ej5fM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float beforePadding(PaddingValues paddingValues, Orientation orientation, boolean z8, LayoutDirection layoutDirection) {
        int i8 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                if (z8) {
                    return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
                }
                return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            }
            throw new p();
        }
        if (z8) {
            return paddingValues.mo527calculateBottomPaddingD9Ej5fM();
        }
        return paddingValues.mo530calculateTopPaddingD9Ej5fM();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v14 ??, still in use, count: 1, list:
          (r9v14 ?? I:java.lang.Object) from 0x0091: INVOKE (r22v0 ?? I:androidx.compose.runtime.Composer), (r9v14 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:146)
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
    /* renamed from: rememberStaggeredGridMeasurePolicy-nbWgWpA, reason: not valid java name */
    public static final c6.InterfaceC2072n m760rememberStaggeredGridMeasurePolicynbWgWpA(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v14 ??, still in use, count: 1, list:
          (r9v14 ?? I:java.lang.Object) from 0x0091: INVOKE (r22v0 ?? I:androidx.compose.runtime.Composer), (r9v14 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:146)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r14v0 ??
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final float startPadding(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        int i8 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return paddingValues.mo530calculateTopPaddingD9Ej5fM();
            }
            throw new p();
        }
        return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
    }
}
