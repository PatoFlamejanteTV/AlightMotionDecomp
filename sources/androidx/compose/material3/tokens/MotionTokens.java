package androidx.compose.material3.tokens;

import androidx.compose.animation.core.CubicBezierEasing;

/* loaded from: classes.dex */
public final class MotionTokens {
    public static final double DurationExtraLong1 = 700.0d;
    public static final double DurationExtraLong2 = 800.0d;
    public static final double DurationExtraLong3 = 900.0d;
    public static final double DurationExtraLong4 = 1000.0d;
    public static final double DurationLong1 = 450.0d;
    public static final double DurationLong2 = 500.0d;
    public static final double DurationLong3 = 550.0d;
    public static final double DurationLong4 = 600.0d;
    public static final double DurationMedium1 = 250.0d;
    public static final double DurationMedium2 = 300.0d;
    public static final double DurationMedium3 = 350.0d;
    public static final double DurationMedium4 = 400.0d;
    public static final double DurationShort1 = 50.0d;
    public static final double DurationShort2 = 100.0d;
    public static final double DurationShort3 = 150.0d;
    public static final double DurationShort4 = 200.0d;
    public static final MotionTokens INSTANCE = new MotionTokens();
    private static final CubicBezierEasing EasingEmphasizedCubicBezier = new CubicBezierEasing(0.2f, 0.0f, 0.0f, 1.0f);
    private static final CubicBezierEasing EasingEmphasizedAccelerateCubicBezier = new CubicBezierEasing(0.3f, 0.0f, 0.8f, 0.15f);
    private static final CubicBezierEasing EasingEmphasizedDecelerateCubicBezier = new CubicBezierEasing(0.05f, 0.7f, 0.1f, 1.0f);
    private static final CubicBezierEasing EasingLegacyCubicBezier = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    private static final CubicBezierEasing EasingLegacyAccelerateCubicBezier = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final CubicBezierEasing EasingLegacyDecelerateCubicBezier = new CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);
    private static final CubicBezierEasing EasingLinearCubicBezier = new CubicBezierEasing(0.0f, 0.0f, 1.0f, 1.0f);
    private static final CubicBezierEasing EasingStandardCubicBezier = new CubicBezierEasing(0.2f, 0.0f, 0.0f, 1.0f);
    private static final CubicBezierEasing EasingStandardAccelerateCubicBezier = new CubicBezierEasing(0.3f, 0.0f, 1.0f, 1.0f);
    private static final CubicBezierEasing EasingStandardDecelerateCubicBezier = new CubicBezierEasing(0.0f, 0.0f, 0.0f, 1.0f);

    private MotionTokens() {
    }

    public final CubicBezierEasing getEasingEmphasizedAccelerateCubicBezier() {
        return EasingEmphasizedAccelerateCubicBezier;
    }

    public final CubicBezierEasing getEasingEmphasizedCubicBezier() {
        return EasingEmphasizedCubicBezier;
    }

    public final CubicBezierEasing getEasingEmphasizedDecelerateCubicBezier() {
        return EasingEmphasizedDecelerateCubicBezier;
    }

    public final CubicBezierEasing getEasingLegacyAccelerateCubicBezier() {
        return EasingLegacyAccelerateCubicBezier;
    }

    public final CubicBezierEasing getEasingLegacyCubicBezier() {
        return EasingLegacyCubicBezier;
    }

    public final CubicBezierEasing getEasingLegacyDecelerateCubicBezier() {
        return EasingLegacyDecelerateCubicBezier;
    }

    public final CubicBezierEasing getEasingLinearCubicBezier() {
        return EasingLinearCubicBezier;
    }

    public final CubicBezierEasing getEasingStandardAccelerateCubicBezier() {
        return EasingStandardAccelerateCubicBezier;
    }

    public final CubicBezierEasing getEasingStandardCubicBezier() {
        return EasingStandardCubicBezier;
    }

    public final CubicBezierEasing getEasingStandardDecelerateCubicBezier() {
        return EasingStandardDecelerateCubicBezier;
    }
}
