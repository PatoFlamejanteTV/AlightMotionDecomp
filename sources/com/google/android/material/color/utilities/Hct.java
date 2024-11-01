package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class Hct {
    private int argb;
    private double chroma;
    private double hue;
    private double tone;

    private Hct(int i8) {
        setInternalState(i8);
    }

    public static Hct from(double d8, double d9, double d10) {
        return new Hct(HctSolver.solveToInt(d8, d9, d10));
    }

    public static Hct fromInt(int i8) {
        return new Hct(i8);
    }

    private void setInternalState(int i8) {
        this.argb = i8;
        Cam16 fromInt = Cam16.fromInt(i8);
        this.hue = fromInt.getHue();
        this.chroma = fromInt.getChroma();
        this.tone = ColorUtils.lstarFromArgb(i8);
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }

    public double getTone() {
        return this.tone;
    }

    public Hct inViewingConditions(ViewingConditions viewingConditions) {
        double[] xyzInViewingConditions = Cam16.fromInt(toInt()).xyzInViewingConditions(viewingConditions, null);
        Cam16 fromXyzInViewingConditions = Cam16.fromXyzInViewingConditions(xyzInViewingConditions[0], xyzInViewingConditions[1], xyzInViewingConditions[2], ViewingConditions.DEFAULT);
        return from(fromXyzInViewingConditions.getHue(), fromXyzInViewingConditions.getChroma(), ColorUtils.lstarFromY(xyzInViewingConditions[1]));
    }

    public void setChroma(double d8) {
        setInternalState(HctSolver.solveToInt(this.hue, d8, this.tone));
    }

    public void setHue(double d8) {
        setInternalState(HctSolver.solveToInt(d8, this.chroma, this.tone));
    }

    public void setTone(double d8) {
        setInternalState(HctSolver.solveToInt(this.hue, this.chroma, d8));
    }

    public int toInt() {
        return this.argb;
    }
}
