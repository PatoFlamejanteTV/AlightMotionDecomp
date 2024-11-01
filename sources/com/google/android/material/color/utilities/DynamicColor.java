package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.function.Function;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class DynamicColor {
    public final Function<DynamicScheme, DynamicColor> background;
    public final ContrastCurve contrastCurve;
    private final HashMap<DynamicScheme, Hct> hctCache;
    public final boolean isBackground;
    public final String name;
    public final Function<DynamicScheme, Double> opacity;
    public final Function<DynamicScheme, TonalPalette> palette;
    public final Function<DynamicScheme, DynamicColor> secondBackground;
    public final Function<DynamicScheme, Double> tone;
    public final Function<DynamicScheme, ToneDeltaPair> toneDeltaPair;

    public DynamicColor(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z8, @Nullable Function<DynamicScheme, DynamicColor> function3, @Nullable Function<DynamicScheme, DynamicColor> function4, @Nullable ContrastCurve contrastCurve, @Nullable Function<DynamicScheme, ToneDeltaPair> function5) {
        this.hctCache = new HashMap<>();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z8;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = null;
    }

    public static double enableLightForeground(double d8) {
        if (tonePrefersLightForeground(d8) && !toneAllowsLightForeground(d8)) {
            return 49.0d;
        }
        return d8;
    }

    public static double foregroundTone(double d8, double d9) {
        boolean z8;
        double lighterUnsafe = Contrast.lighterUnsafe(d8, d9);
        double darkerUnsafe = Contrast.darkerUnsafe(d8, d9);
        double ratioOfTones = Contrast.ratioOfTones(lighterUnsafe, d8);
        double ratioOfTones2 = Contrast.ratioOfTones(darkerUnsafe, d8);
        if (tonePrefersLightForeground(d8)) {
            if (Math.abs(ratioOfTones - ratioOfTones2) < 0.1d && ratioOfTones < d9 && ratioOfTones2 < d9) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (ratioOfTones < d9 && ratioOfTones < ratioOfTones2 && !z8) {
                return darkerUnsafe;
            }
            return lighterUnsafe;
        }
        if (ratioOfTones2 >= d9 || ratioOfTones2 >= ratioOfTones) {
            return darkerUnsafe;
        }
        return lighterUnsafe;
    }

    @NonNull
    public static DynamicColor fromArgb(@NonNull String str, int i8) {
        final Hct fromInt = Hct.fromInt(i8);
        final TonalPalette fromInt2 = TonalPalette.fromInt(i8);
        return fromPalette(str, new Function() { // from class: com.google.android.material.color.utilities.a
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette lambda$fromArgb$0;
                lambda$fromArgb$0 = DynamicColor.lambda$fromArgb$0(TonalPalette.this, (DynamicScheme) obj);
                return lambda$fromArgb$0;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.b
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$fromArgb$1;
                lambda$fromArgb$1 = DynamicColor.lambda$fromArgb$1(Hct.this, (DynamicScheme) obj);
                return lambda$fromArgb$1;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @NonNull
    public static DynamicColor fromPalette(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2) {
        return new DynamicColor(str, function, function2, false, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TonalPalette lambda$fromArgb$0(TonalPalette tonalPalette, DynamicScheme dynamicScheme) {
        return tonalPalette;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromArgb$1(Hct hct, DynamicScheme dynamicScheme) {
        return Double.valueOf(hct.getTone());
    }

    public static boolean toneAllowsLightForeground(double d8) {
        if (Math.round(d8) <= 49) {
            return true;
        }
        return false;
    }

    public static boolean tonePrefersLightForeground(double d8) {
        if (Math.round(d8) < 60) {
            return true;
        }
        return false;
    }

    public int getArgb(@NonNull DynamicScheme dynamicScheme) {
        int i8 = getHct(dynamicScheme).toInt();
        Function<DynamicScheme, Double> function = this.opacity;
        if (function == null) {
            return i8;
        }
        return (MathUtils.clampInt(0, 255, (int) Math.round(function.apply(dynamicScheme).doubleValue() * 255.0d)) << 24) | (i8 & ViewCompat.MEASURED_SIZE_MASK);
    }

    @NonNull
    public Hct getHct(@NonNull DynamicScheme dynamicScheme) {
        Hct hct = this.hctCache.get(dynamicScheme);
        if (hct != null) {
            return hct;
        }
        Hct hct2 = this.palette.apply(dynamicScheme).getHct(getTone(dynamicScheme));
        if (this.hctCache.size() > 4) {
            this.hctCache.clear();
        }
        this.hctCache.put(dynamicScheme, hct2);
        return hct2;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x022b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double getTone(@androidx.annotation.NonNull com.google.android.material.color.utilities.DynamicScheme r31) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.DynamicColor.getTone(com.google.android.material.color.utilities.DynamicScheme):double");
    }

    @NonNull
    public static DynamicColor fromPalette(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z8) {
        return new DynamicColor(str, function, function2, z8, null, null, null, null);
    }

    public DynamicColor(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z8, @Nullable Function<DynamicScheme, DynamicColor> function3, @Nullable Function<DynamicScheme, DynamicColor> function4, @Nullable ContrastCurve contrastCurve, @Nullable Function<DynamicScheme, ToneDeltaPair> function5, @Nullable Function<DynamicScheme, Double> function6) {
        this.hctCache = new HashMap<>();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z8;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = function6;
    }
}
