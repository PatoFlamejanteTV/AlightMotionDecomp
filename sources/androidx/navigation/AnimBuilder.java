package androidx.navigation;

import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;

@NavOptionsDsl
/* loaded from: classes3.dex */
public final class AnimBuilder {

    @AnimRes
    @AnimatorRes
    private int enter = -1;

    @AnimRes
    @AnimatorRes
    private int exit = -1;

    @AnimRes
    @AnimatorRes
    private int popEnter = -1;

    @AnimRes
    @AnimatorRes
    private int popExit = -1;

    public final int getEnter() {
        return this.enter;
    }

    public final int getExit() {
        return this.exit;
    }

    public final int getPopEnter() {
        return this.popEnter;
    }

    public final int getPopExit() {
        return this.popExit;
    }

    public final void setEnter(int i8) {
        this.enter = i8;
    }

    public final void setExit(int i8) {
        this.exit = i8;
    }

    public final void setPopEnter(int i8) {
        this.popEnter = i8;
    }

    public final void setPopExit(int i8) {
        this.popExit = i8;
    }
}
