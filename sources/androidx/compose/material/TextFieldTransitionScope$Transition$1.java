package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2076r;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldTransitionScope$Transition$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC2076r $content;
    final /* synthetic */ InterfaceC2073o $contentColor;
    final /* synthetic */ long $focusedTextStyleColor;
    final /* synthetic */ InputPhase $inputState;
    final /* synthetic */ boolean $showLabel;
    final /* synthetic */ TextFieldTransitionScope $tmp0_rcvr;
    final /* synthetic */ long $unfocusedTextStyleColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldTransitionScope$Transition$1(TextFieldTransitionScope textFieldTransitionScope, InputPhase inputPhase, long j8, long j9, InterfaceC2073o interfaceC2073o, boolean z8, InterfaceC2076r interfaceC2076r, int i8) {
        super(2);
        this.$tmp0_rcvr = textFieldTransitionScope;
        this.$inputState = inputPhase;
        this.$focusedTextStyleColor = j8;
        this.$unfocusedTextStyleColor = j9;
        this.$contentColor = interfaceC2073o;
        this.$showLabel = z8;
        this.$content = interfaceC2076r;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        this.$tmp0_rcvr.m1389TransitionDTcfvLk(this.$inputState, this.$focusedTextStyleColor, this.$unfocusedTextStyleColor, this.$contentColor, this.$showLabel, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
