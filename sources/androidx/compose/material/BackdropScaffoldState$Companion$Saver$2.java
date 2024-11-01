package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BackdropScaffoldState$Companion$Saver$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1 $confirmStateChange;
    final /* synthetic */ SnackbarHostState $snackbarHostState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldState$Companion$Saver$2(AnimationSpec<Float> animationSpec, Function1 function1, SnackbarHostState snackbarHostState) {
        super(1);
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = function1;
        this.$snackbarHostState = snackbarHostState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final BackdropScaffoldState invoke(BackdropValue it) {
        AbstractC3292y.i(it, "it");
        return new BackdropScaffoldState(it, this.$animationSpec, this.$confirmStateChange, this.$snackbarHostState);
    }
}
