package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ComposableLambdaN_jvmKt {
    @ComposeCompilerApi
    public static final ComposableLambdaN composableLambdaN(Composer composer, int i8, boolean z8, int i9, Object obj) {
        ComposableLambdaNImpl composableLambdaNImpl;
        composer.startReplaceableGroup(i8);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            composableLambdaNImpl = new ComposableLambdaNImpl(i8, z8, i9);
            composer.updateRememberedValue(composableLambdaNImpl);
        } else {
            AbstractC3292y.g(rememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaNImpl");
            composableLambdaNImpl = (ComposableLambdaNImpl) rememberedValue;
        }
        composableLambdaNImpl.update(obj);
        composer.endReplaceableGroup();
        return composableLambdaNImpl;
    }

    @ComposeCompilerApi
    public static final ComposableLambdaN composableLambdaNInstance(int i8, boolean z8, int i9, Object obj) {
        ComposableLambdaNImpl composableLambdaNImpl = new ComposableLambdaNImpl(i8, z8, i9);
        composableLambdaNImpl.update(obj);
        return composableLambdaNImpl;
    }
}
