package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public interface AnimatedVisibilityScope {

    /* renamed from: androidx.compose.animation.AnimatedVisibilityScope$-CC, reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract /* synthetic */ class CC {
        public static Modifier a(AnimatedVisibilityScope animatedVisibilityScope, Modifier modifier, EnterTransition enter, ExitTransition exit, String label) {
            Function1 noInspectorInfo;
            AbstractC3292y.i(modifier, "<this>");
            AbstractC3292y.i(enter, "enter");
            AbstractC3292y.i(exit, "exit");
            AbstractC3292y.i(label, "label");
            if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                noInspectorInfo = new AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1(enter, exit, label);
            } else {
                noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
            }
            return ComposedModifierKt.composed(modifier, noInspectorInfo, new AnimatedVisibilityScope$animateEnterExit$2(animatedVisibilityScope, enter, exit, label));
        }

        public static /* synthetic */ Modifier c(AnimatedVisibilityScope animatedVisibilityScope, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 1) != 0) {
                    enterTransition = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                }
                if ((i8 & 2) != 0) {
                    exitTransition = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                }
                if ((i8 & 4) != 0) {
                    str = "animateEnterExit";
                }
                return animatedVisibilityScope.animateEnterExit(modifier, enterTransition, exitTransition, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
        }
    }

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @ExperimentalAnimationApi
        @Deprecated
        public static Modifier animateEnterExit(AnimatedVisibilityScope animatedVisibilityScope, Modifier receiver, EnterTransition enter, ExitTransition exit, String label) {
            AbstractC3292y.i(receiver, "$receiver");
            AbstractC3292y.i(enter, "enter");
            AbstractC3292y.i(exit, "exit");
            AbstractC3292y.i(label, "label");
            return CC.a(animatedVisibilityScope, receiver, enter, exit, label);
        }

        @ExperimentalAnimationApi
        public static /* synthetic */ void getTransition$annotations() {
        }
    }

    @ExperimentalAnimationApi
    Modifier animateEnterExit(Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str);

    @ExperimentalAnimationApi
    Transition<EnterExitState> getTransition();
}
