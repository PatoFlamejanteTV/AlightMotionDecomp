package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ComposableLambdaKt {
    private static final int BITS_PER_SLOT = 3;
    public static final int SLOTS_PER_INT = 10;

    public static final int bitsForSlot(int i8, int i9) {
        return i8 << (((i9 % 10) * 3) + 1);
    }

    @ComposeCompilerApi
    public static final ComposableLambda composableLambda(Composer composer, int i8, boolean z8, Object obj) {
        ComposableLambdaImpl composableLambdaImpl;
        composer.startReplaceableGroup(Integer.rotateLeft(i8, 1));
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            composableLambdaImpl = new ComposableLambdaImpl(i8, z8, obj);
            composer.updateRememberedValue(composableLambdaImpl);
        } else {
            AbstractC3292y.g(rememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambdaImpl = (ComposableLambdaImpl) rememberedValue;
            composableLambdaImpl.update(obj);
        }
        composer.endReplaceableGroup();
        return composableLambdaImpl;
    }

    @ComposeCompilerApi
    public static final ComposableLambda composableLambdaInstance(int i8, boolean z8, Object obj) {
        return new ComposableLambdaImpl(i8, z8, obj);
    }

    public static final int differentBits(int i8) {
        return bitsForSlot(2, i8);
    }

    public static final boolean replacableWith(RecomposeScope recomposeScope, RecomposeScope recomposeScope2) {
        if (recomposeScope != null) {
            if ((recomposeScope instanceof RecomposeScopeImpl) && (recomposeScope2 instanceof RecomposeScopeImpl)) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) recomposeScope;
                if (!recomposeScopeImpl.getValid() || AbstractC3292y.d(recomposeScope, recomposeScope2) || AbstractC3292y.d(recomposeScopeImpl.getAnchor(), ((RecomposeScopeImpl) recomposeScope2).getAnchor())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final int sameBits(int i8) {
        return bitsForSlot(1, i8);
    }
}
