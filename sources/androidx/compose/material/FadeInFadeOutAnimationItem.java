package androidx.compose.material;

import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class FadeInFadeOutAnimationItem<T> {
    private final T key;
    private final InterfaceC2073o transition;

    public FadeInFadeOutAnimationItem(T t8, InterfaceC2073o transition) {
        AbstractC3292y.i(transition, "transition");
        this.key = t8;
        this.transition = transition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FadeInFadeOutAnimationItem copy$default(FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem, Object obj, InterfaceC2073o interfaceC2073o, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            obj = fadeInFadeOutAnimationItem.key;
        }
        if ((i8 & 2) != 0) {
            interfaceC2073o = fadeInFadeOutAnimationItem.transition;
        }
        return fadeInFadeOutAnimationItem.copy(obj, interfaceC2073o);
    }

    public final T component1() {
        return this.key;
    }

    public final InterfaceC2073o component2() {
        return this.transition;
    }

    public final FadeInFadeOutAnimationItem<T> copy(T t8, InterfaceC2073o transition) {
        AbstractC3292y.i(transition, "transition");
        return new FadeInFadeOutAnimationItem<>(t8, transition);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) obj;
        return AbstractC3292y.d(this.key, fadeInFadeOutAnimationItem.key) && AbstractC3292y.d(this.transition, fadeInFadeOutAnimationItem.transition);
    }

    public final T getKey() {
        return this.key;
    }

    public final InterfaceC2073o getTransition() {
        return this.transition;
    }

    public int hashCode() {
        T t8 = this.key;
        return ((t8 == null ? 0 : t8.hashCode()) * 31) + this.transition.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.key + ", transition=" + this.transition + ')';
    }
}
