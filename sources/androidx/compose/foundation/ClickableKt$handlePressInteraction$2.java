package androidx.compose.foundation;

import Q5.I;
import U5.d;
import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", l = {299, 301, 308, 309, TypedValues.AttributesType.TYPE_PIVOT_TARGET}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ClickableKt$handlePressInteraction$2 extends l implements InterfaceC2072n {
    final /* synthetic */ Function0 $delayPressInteraction;
    final /* synthetic */ AbstractClickableNode.InteractionData $interactionData;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $pressPoint;
    final /* synthetic */ PressGestureScope $this_handlePressInteraction;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$handlePressInteraction$2(PressGestureScope pressGestureScope, long j8, MutableInteractionSource mutableInteractionSource, AbstractClickableNode.InteractionData interactionData, Function0 function0, d dVar) {
        super(2, dVar);
        this.$this_handlePressInteraction = pressGestureScope;
        this.$pressPoint = j8;
        this.$interactionSource = mutableInteractionSource;
        this.$interactionData = interactionData;
        this.$delayPressInteraction = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        ClickableKt$handlePressInteraction$2 clickableKt$handlePressInteraction$2 = new ClickableKt$handlePressInteraction$2(this.$this_handlePressInteraction, this.$pressPoint, this.$interactionSource, this.$interactionData, this.$delayPressInteraction, dVar);
        clickableKt$handlePressInteraction$2.L$0 = obj;
        return clickableKt$handlePressInteraction$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt$handlePressInteraction$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((ClickableKt$handlePressInteraction$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
