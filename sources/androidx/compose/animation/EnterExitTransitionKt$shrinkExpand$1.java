package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$shrinkExpand$1 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ State<ChangeSize> $expand;
    final /* synthetic */ String $labelPrefix;
    final /* synthetic */ State<ChangeSize> $shrink;
    final /* synthetic */ Transition<EnterExitState> $transition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$shrinkExpand$1(Transition<EnterExitState> transition, State<ChangeSize> state, State<ChangeSize> state2, String str) {
        super(3);
        this.$transition = transition;
        this.$expand = state;
        this.$shrink = state2;
        this.$labelPrefix = str;
    }

    private static final boolean invoke$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void invoke$lambda$2(MutableState<Boolean> mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a4  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier r21, androidx.compose.runtime.Composer r22, int r23) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt$shrinkExpand$1.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }
}
