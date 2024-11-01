package androidx.transition;

import androidx.transition.Transition;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class e {
    public static void a(Transition.TransitionListener transitionListener, Transition transition, boolean z8) {
        transitionListener.onTransitionEnd(transition);
    }

    public static void b(Transition.TransitionListener transitionListener, Transition transition, boolean z8) {
        transitionListener.onTransitionStart(transition);
    }
}
