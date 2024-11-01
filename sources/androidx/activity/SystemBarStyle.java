package androidx.activity;

import androidx.annotation.ColorInt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SystemBarStyle {
    public static final Companion Companion = new Companion(null);
    private final int darkScrim;
    private final Function1 detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i8, int i9, Function1 function1, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                function1 = SystemBarStyle$Companion$auto$1.INSTANCE;
            }
            return companion.auto(i8, i9, function1);
        }

        public final SystemBarStyle auto(@ColorInt int i8, @ColorInt int i9) {
            return auto$default(this, i8, i9, null, 4, null);
        }

        public final SystemBarStyle dark(@ColorInt int i8) {
            return new SystemBarStyle(i8, i8, 2, SystemBarStyle$Companion$dark$1.INSTANCE, null);
        }

        public final SystemBarStyle light(@ColorInt int i8, @ColorInt int i9) {
            return new SystemBarStyle(i8, i9, 1, SystemBarStyle$Companion$light$1.INSTANCE, null);
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }

        public final SystemBarStyle auto(@ColorInt int i8, @ColorInt int i9, Function1 detectDarkMode) {
            AbstractC3292y.i(detectDarkMode, "detectDarkMode");
            return new SystemBarStyle(i8, i9, 0, detectDarkMode, null);
        }
    }

    public /* synthetic */ SystemBarStyle(int i8, int i9, int i10, Function1 function1, AbstractC3284p abstractC3284p) {
        this(i8, i9, i10, function1);
    }

    public static final SystemBarStyle auto(@ColorInt int i8, @ColorInt int i9) {
        return Companion.auto(i8, i9);
    }

    public static final SystemBarStyle dark(@ColorInt int i8) {
        return Companion.dark(i8);
    }

    public static final SystemBarStyle light(@ColorInt int i8, @ColorInt int i9) {
        return Companion.light(i8, i9);
    }

    public final int getDarkScrim$activity_release() {
        return this.darkScrim;
    }

    public final Function1 getDetectDarkMode$activity_release() {
        return this.detectDarkMode;
    }

    public final int getNightMode$activity_release() {
        return this.nightMode;
    }

    public final int getScrim$activity_release(boolean z8) {
        if (z8) {
            return this.darkScrim;
        }
        return this.lightScrim;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean z8) {
        if (this.nightMode == 0) {
            return 0;
        }
        if (z8) {
            return this.darkScrim;
        }
        return this.lightScrim;
    }

    private SystemBarStyle(int i8, int i9, int i10, Function1 function1) {
        this.lightScrim = i8;
        this.darkScrim = i9;
        this.nightMode = i10;
        this.detectDarkMode = function1;
    }

    public static final SystemBarStyle auto(@ColorInt int i8, @ColorInt int i9, Function1 function1) {
        return Companion.auto(i8, i9, function1);
    }
}
