package androidx.compose.material3;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SwipeableKt$rememberSwipeableStateFor$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ MutableState<Boolean> $forceAnimationCheck;
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ SwipeableState<T> $swipeableState;
    final /* synthetic */ T $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableKt$rememberSwipeableStateFor$2(T t8, SwipeableState<T> swipeableState, Function1 function1, MutableState<Boolean> mutableState) {
        super(1);
        this.$value = t8;
        this.$swipeableState = swipeableState;
        this.$onValueChange = function1;
        this.$forceAnimationCheck = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
        AbstractC3292y.i(DisposableEffect, "$this$DisposableEffect");
        if (!AbstractC3292y.d(this.$value, this.$swipeableState.getCurrentValue())) {
            this.$onValueChange.invoke(this.$swipeableState.getCurrentValue());
            this.$forceAnimationCheck.setValue(Boolean.valueOf(!r2.getValue().booleanValue()));
        }
        return new DisposableEffectResult() { // from class: androidx.compose.material3.SwipeableKt$rememberSwipeableStateFor$2$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }
}
