package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public abstract class ExitTransition {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ExitTransition None = new ExitTransitionImpl(new TransitionData(null, null, null, null, 15, null));

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final ExitTransition getNone() {
            return ExitTransition.None;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ ExitTransition(AbstractC3284p abstractC3284p) {
        this();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof ExitTransition) && AbstractC3292y.d(((ExitTransition) obj).getData$animation_release(), getData$animation_release())) {
            return true;
        }
        return false;
    }

    public abstract TransitionData getData$animation_release();

    public int hashCode() {
        return getData$animation_release().hashCode();
    }

    @Stable
    public final ExitTransition plus(ExitTransition exit) {
        AbstractC3292y.i(exit, "exit");
        Fade fade = getData$animation_release().getFade();
        if (fade == null) {
            fade = exit.getData$animation_release().getFade();
        }
        Slide slide = getData$animation_release().getSlide();
        if (slide == null) {
            slide = exit.getData$animation_release().getSlide();
        }
        ChangeSize changeSize = getData$animation_release().getChangeSize();
        if (changeSize == null) {
            changeSize = exit.getData$animation_release().getChangeSize();
        }
        Scale scale = getData$animation_release().getScale();
        if (scale == null) {
            scale = exit.getData$animation_release().getScale();
        }
        return new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale));
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        if (AbstractC3292y.d(this, None)) {
            return "ExitTransition.None";
        }
        TransitionData data$animation_release = getData$animation_release();
        StringBuilder sb = new StringBuilder();
        sb.append("ExitTransition: \nFade - ");
        Fade fade = data$animation_release.getFade();
        String str4 = null;
        if (fade != null) {
            str = fade.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",\nSlide - ");
        Slide slide = data$animation_release.getSlide();
        if (slide != null) {
            str2 = slide.toString();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(",\nShrink - ");
        ChangeSize changeSize = data$animation_release.getChangeSize();
        if (changeSize != null) {
            str3 = changeSize.toString();
        } else {
            str3 = null;
        }
        sb.append(str3);
        sb.append(",\nScale - ");
        Scale scale = data$animation_release.getScale();
        if (scale != null) {
            str4 = scale.toString();
        }
        sb.append(str4);
        return sb.toString();
    }

    private ExitTransition() {
    }
}
