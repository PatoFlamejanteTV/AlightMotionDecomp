package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class TransitionData {
    private final ChangeSize changeSize;
    private final Fade fade;
    private final Scale scale;
    private final Slide slide;

    public TransitionData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TransitionData copy$default(TransitionData transitionData, Fade fade, Slide slide, ChangeSize changeSize, Scale scale, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            fade = transitionData.fade;
        }
        if ((i8 & 2) != 0) {
            slide = transitionData.slide;
        }
        if ((i8 & 4) != 0) {
            changeSize = transitionData.changeSize;
        }
        if ((i8 & 8) != 0) {
            scale = transitionData.scale;
        }
        return transitionData.copy(fade, slide, changeSize, scale);
    }

    public final Fade component1() {
        return this.fade;
    }

    public final Slide component2() {
        return this.slide;
    }

    public final ChangeSize component3() {
        return this.changeSize;
    }

    public final Scale component4() {
        return this.scale;
    }

    public final TransitionData copy(Fade fade, Slide slide, ChangeSize changeSize, Scale scale) {
        return new TransitionData(fade, slide, changeSize, scale);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) obj;
        return AbstractC3292y.d(this.fade, transitionData.fade) && AbstractC3292y.d(this.slide, transitionData.slide) && AbstractC3292y.d(this.changeSize, transitionData.changeSize) && AbstractC3292y.d(this.scale, transitionData.scale);
    }

    public final ChangeSize getChangeSize() {
        return this.changeSize;
    }

    public final Fade getFade() {
        return this.fade;
    }

    public final Scale getScale() {
        return this.scale;
    }

    public final Slide getSlide() {
        return this.slide;
    }

    public int hashCode() {
        Fade fade = this.fade;
        int hashCode = (fade == null ? 0 : fade.hashCode()) * 31;
        Slide slide = this.slide;
        int hashCode2 = (hashCode + (slide == null ? 0 : slide.hashCode())) * 31;
        ChangeSize changeSize = this.changeSize;
        int hashCode3 = (hashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        Scale scale = this.scale;
        return hashCode3 + (scale != null ? scale.hashCode() : 0);
    }

    public String toString() {
        return "TransitionData(fade=" + this.fade + ", slide=" + this.slide + ", changeSize=" + this.changeSize + ", scale=" + this.scale + ')';
    }

    public TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale) {
        this.fade = fade;
        this.slide = slide;
        this.changeSize = changeSize;
        this.scale = scale;
    }

    public /* synthetic */ TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : fade, (i8 & 2) != 0 ? null : slide, (i8 & 4) != 0 ? null : changeSize, (i8 & 8) != 0 ? null : scale);
    }
}
