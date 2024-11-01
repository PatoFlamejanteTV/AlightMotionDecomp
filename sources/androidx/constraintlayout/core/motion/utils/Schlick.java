package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class Schlick extends Easing {
    private static final boolean DEBUG = false;
    double eps;
    double mS;
    double mT;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Schlick(String str) {
        this.str = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.mS = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i8 = indexOf2 + 1;
        this.mT = Double.parseDouble(str.substring(i8, str.indexOf(44, i8)).trim());
    }

    private double dfunc(double d8) {
        double d9 = this.mT;
        if (d8 < d9) {
            double d10 = this.mS;
            return ((d10 * d9) * d9) / ((((d9 - d8) * d10) + d8) * ((d10 * (d9 - d8)) + d8));
        }
        double d11 = this.mS;
        return (((d9 - 1.0d) * d11) * (d9 - 1.0d)) / (((((-d11) * (d9 - d8)) - d8) + 1.0d) * ((((-d11) * (d9 - d8)) - d8) + 1.0d));
    }

    private double func(double d8) {
        double d9 = this.mT;
        if (d8 < d9) {
            return (d9 * d8) / (d8 + (this.mS * (d9 - d8)));
        }
        return ((1.0d - d9) * (d8 - 1.0d)) / ((1.0d - d8) - (this.mS * (d9 - d8)));
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d8) {
        return func(d8);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d8) {
        return dfunc(d8);
    }
}
