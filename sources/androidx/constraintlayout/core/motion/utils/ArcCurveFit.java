package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes.dex */
public class ArcCurveFit extends CurveFit {
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private static final int START_HORIZONTAL = 2;
    private static final int START_LINEAR = 3;
    private static final int START_VERTICAL = 1;
    Arc[] mArcs;
    private boolean mExtrapolate = true;
    private final double[] mTime;

    /* loaded from: classes.dex */
    private static class Arc {
        private static final double EPSILON = 0.001d;
        private static final String TAG = "Arc";
        private static double[] ourPercent = new double[91];
        boolean linear;
        double mArcDistance;
        double mArcVelocity;
        double mEllipseA;
        double mEllipseB;
        double mEllipseCenterX;
        double mEllipseCenterY;
        double[] mLut;
        double mOneOverDeltaTime;
        double mTime1;
        double mTime2;
        double mTmpCosAngle;
        double mTmpSinAngle;
        boolean mVertical;
        double mX1;
        double mX2;
        double mY1;
        double mY2;

        Arc(int i8, double d8, double d9, double d10, double d11, double d12, double d13) {
            int i9;
            double d14;
            double d15;
            this.linear = false;
            this.mVertical = i8 == 1;
            this.mTime1 = d8;
            this.mTime2 = d9;
            this.mOneOverDeltaTime = 1.0d / (d9 - d8);
            if (3 == i8) {
                this.linear = true;
            }
            double d16 = d12 - d10;
            double d17 = d13 - d11;
            if (!this.linear && Math.abs(d16) >= EPSILON && Math.abs(d17) >= EPSILON) {
                this.mLut = new double[101];
                boolean z8 = this.mVertical;
                if (z8) {
                    i9 = -1;
                } else {
                    i9 = 1;
                }
                this.mEllipseA = d16 * i9;
                this.mEllipseB = d17 * (z8 ? 1 : -1);
                if (z8) {
                    d14 = d12;
                } else {
                    d14 = d10;
                }
                this.mEllipseCenterX = d14;
                if (z8) {
                    d15 = d11;
                } else {
                    d15 = d13;
                }
                this.mEllipseCenterY = d15;
                buildTable(d10, d11, d12, d13);
                this.mArcVelocity = this.mArcDistance * this.mOneOverDeltaTime;
                return;
            }
            this.linear = true;
            this.mX1 = d10;
            this.mX2 = d12;
            this.mY1 = d11;
            this.mY2 = d13;
            double hypot = Math.hypot(d17, d16);
            this.mArcDistance = hypot;
            this.mArcVelocity = hypot * this.mOneOverDeltaTime;
            double d18 = this.mTime2;
            double d19 = this.mTime1;
            this.mEllipseCenterX = d16 / (d18 - d19);
            this.mEllipseCenterY = d17 / (d18 - d19);
        }

        private void buildTable(double d8, double d9, double d10, double d11) {
            double d12;
            double d13 = d10 - d8;
            double d14 = d9 - d11;
            int i8 = 0;
            double d15 = 0.0d;
            double d16 = 0.0d;
            double d17 = 0.0d;
            while (true) {
                if (i8 >= ourPercent.length) {
                    break;
                }
                double d18 = d15;
                double radians = Math.toRadians((i8 * 90.0d) / (r15.length - 1));
                double sin = Math.sin(radians) * d13;
                double cos = Math.cos(radians) * d14;
                if (i8 > 0) {
                    d12 = Math.hypot(sin - d16, cos - d17) + d18;
                    ourPercent[i8] = d12;
                } else {
                    d12 = d18;
                }
                i8++;
                d17 = cos;
                d15 = d12;
                d16 = sin;
            }
            double d19 = d15;
            this.mArcDistance = d19;
            int i9 = 0;
            while (true) {
                double[] dArr = ourPercent;
                if (i9 >= dArr.length) {
                    break;
                }
                dArr[i9] = dArr[i9] / d19;
                i9++;
            }
            int i10 = 0;
            while (true) {
                if (i10 < this.mLut.length) {
                    double length = i10 / (r1.length - 1);
                    int binarySearch = Arrays.binarySearch(ourPercent, length);
                    if (binarySearch >= 0) {
                        this.mLut[i10] = binarySearch / (ourPercent.length - 1);
                    } else if (binarySearch == -1) {
                        this.mLut[i10] = 0.0d;
                    } else {
                        int i11 = -binarySearch;
                        int i12 = i11 - 2;
                        double[] dArr2 = ourPercent;
                        double d20 = dArr2[i12];
                        this.mLut[i10] = (i12 + ((length - d20) / (dArr2[i11 - 1] - d20))) / (dArr2.length - 1);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }

        double getDX() {
            double d8 = this.mEllipseA * this.mTmpCosAngle;
            double hypot = this.mArcVelocity / Math.hypot(d8, (-this.mEllipseB) * this.mTmpSinAngle);
            if (this.mVertical) {
                d8 = -d8;
            }
            return d8 * hypot;
        }

        double getDY() {
            double d8 = this.mEllipseA * this.mTmpCosAngle;
            double d9 = (-this.mEllipseB) * this.mTmpSinAngle;
            double hypot = this.mArcVelocity / Math.hypot(d8, d9);
            if (this.mVertical) {
                return (-d9) * hypot;
            }
            return d9 * hypot;
        }

        public double getLinearDX(double d8) {
            return this.mEllipseCenterX;
        }

        public double getLinearDY(double d8) {
            return this.mEllipseCenterY;
        }

        public double getLinearX(double d8) {
            double d9 = (d8 - this.mTime1) * this.mOneOverDeltaTime;
            double d10 = this.mX1;
            return d10 + (d9 * (this.mX2 - d10));
        }

        public double getLinearY(double d8) {
            double d9 = (d8 - this.mTime1) * this.mOneOverDeltaTime;
            double d10 = this.mY1;
            return d10 + (d9 * (this.mY2 - d10));
        }

        double getX() {
            return this.mEllipseCenterX + (this.mEllipseA * this.mTmpSinAngle);
        }

        double getY() {
            return this.mEllipseCenterY + (this.mEllipseB * this.mTmpCosAngle);
        }

        double lookup(double d8) {
            if (d8 <= 0.0d) {
                return 0.0d;
            }
            if (d8 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.mLut;
            double length = d8 * (dArr.length - 1);
            int i8 = (int) length;
            double d9 = length - i8;
            double d10 = dArr[i8];
            return d10 + (d9 * (dArr[i8 + 1] - d10));
        }

        void setPoint(double d8) {
            double d9;
            if (this.mVertical) {
                d9 = this.mTime2 - d8;
            } else {
                d9 = d8 - this.mTime1;
            }
            double lookup = lookup(d9 * this.mOneOverDeltaTime) * 1.5707963267948966d;
            this.mTmpSinAngle = Math.sin(lookup);
            this.mTmpCosAngle = Math.cos(lookup);
        }
    }

    public ArcCurveFit(int[] iArr, double[] dArr, double[][] dArr2) {
        this.mTime = dArr;
        this.mArcs = new Arc[dArr.length - 1];
        int i8 = 0;
        int i9 = 1;
        int i10 = 1;
        while (true) {
            Arc[] arcArr = this.mArcs;
            if (i8 < arcArr.length) {
                int i11 = iArr[i8];
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                if (i9 == 1) {
                                    i9 = 2;
                                } else {
                                    i9 = 1;
                                }
                                i10 = i9;
                            }
                        } else {
                            i9 = 2;
                            i10 = 2;
                        }
                    } else {
                        i9 = 1;
                        i10 = 1;
                    }
                } else {
                    i10 = 3;
                }
                double d8 = dArr[i8];
                int i12 = i8 + 1;
                double d9 = dArr[i12];
                double[] dArr3 = dArr2[i8];
                double d10 = dArr3[0];
                double d11 = dArr3[1];
                double[] dArr4 = dArr2[i12];
                arcArr[i8] = new Arc(i10, d8, d9, d10, d11, dArr4[0], dArr4[1]);
                i8 = i12;
            } else {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d8, double[] dArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d9 = arc.mTime1;
            if (d8 < d9) {
                double d10 = d8 - d9;
                if (arc.linear) {
                    dArr[0] = arc.getLinearX(d9) + (this.mArcs[0].getLinearDX(d9) * d10);
                    dArr[1] = this.mArcs[0].getLinearY(d9) + (d10 * this.mArcs[0].getLinearDY(d9));
                    return;
                } else {
                    arc.setPoint(d9);
                    dArr[0] = this.mArcs[0].getX() + (this.mArcs[0].getDX() * d10);
                    dArr[1] = this.mArcs[0].getY() + (d10 * this.mArcs[0].getDY());
                    return;
                }
            }
            if (d8 > arcArr[arcArr.length - 1].mTime2) {
                double d11 = arcArr[arcArr.length - 1].mTime2;
                double d12 = d8 - d11;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.linear) {
                    dArr[0] = arc2.getLinearX(d11) + (this.mArcs[length].getLinearDX(d11) * d12);
                    dArr[1] = this.mArcs[length].getLinearY(d11) + (d12 * this.mArcs[length].getLinearDY(d11));
                    return;
                } else {
                    arc2.setPoint(d8);
                    dArr[0] = this.mArcs[length].getX() + (this.mArcs[length].getDX() * d12);
                    dArr[1] = this.mArcs[length].getY() + (d12 * this.mArcs[length].getDY());
                    return;
                }
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d13 = arcArr2[0].mTime1;
            if (d8 < d13) {
                d8 = d13;
            }
            if (d8 > arcArr2[arcArr2.length - 1].mTime2) {
                d8 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i8 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i8 >= arcArr3.length) {
                return;
            }
            Arc arc3 = arcArr3[i8];
            if (d8 <= arc3.mTime2) {
                if (arc3.linear) {
                    dArr[0] = arc3.getLinearX(d8);
                    dArr[1] = this.mArcs[i8].getLinearY(d8);
                    return;
                } else {
                    arc3.setPoint(d8);
                    dArr[0] = this.mArcs[i8].getX();
                    dArr[1] = this.mArcs[i8].getY();
                    return;
                }
            }
            i8++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d8, double[] dArr) {
        Arc[] arcArr = this.mArcs;
        double d9 = arcArr[0].mTime1;
        if (d8 < d9) {
            d8 = d9;
        } else if (d8 > arcArr[arcArr.length - 1].mTime2) {
            d8 = arcArr[arcArr.length - 1].mTime2;
        }
        int i8 = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i8 >= arcArr2.length) {
                return;
            }
            Arc arc = arcArr2[i8];
            if (d8 <= arc.mTime2) {
                if (arc.linear) {
                    dArr[0] = arc.getLinearDX(d8);
                    dArr[1] = this.mArcs[i8].getLinearDY(d8);
                    return;
                } else {
                    arc.setPoint(d8);
                    dArr[0] = this.mArcs[i8].getDX();
                    dArr[1] = this.mArcs[i8].getDY();
                    return;
                }
            }
            i8++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mTime;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d8, int i8) {
        Arc[] arcArr = this.mArcs;
        int i9 = 0;
        double d9 = arcArr[0].mTime1;
        if (d8 < d9) {
            d8 = d9;
        }
        if (d8 > arcArr[arcArr.length - 1].mTime2) {
            d8 = arcArr[arcArr.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i9 >= arcArr2.length) {
                return Double.NaN;
            }
            Arc arc = arcArr2[i9];
            if (d8 <= arc.mTime2) {
                if (arc.linear) {
                    if (i8 == 0) {
                        return arc.getLinearDX(d8);
                    }
                    return arc.getLinearDY(d8);
                }
                arc.setPoint(d8);
                if (i8 == 0) {
                    return this.mArcs[i9].getDX();
                }
                return this.mArcs[i9].getDY();
            }
            i9++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d8, float[] fArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d9 = arc.mTime1;
            if (d8 < d9) {
                double d10 = d8 - d9;
                if (arc.linear) {
                    fArr[0] = (float) (arc.getLinearX(d9) + (this.mArcs[0].getLinearDX(d9) * d10));
                    fArr[1] = (float) (this.mArcs[0].getLinearY(d9) + (d10 * this.mArcs[0].getLinearDY(d9)));
                    return;
                } else {
                    arc.setPoint(d9);
                    fArr[0] = (float) (this.mArcs[0].getX() + (this.mArcs[0].getDX() * d10));
                    fArr[1] = (float) (this.mArcs[0].getY() + (d10 * this.mArcs[0].getDY()));
                    return;
                }
            }
            if (d8 > arcArr[arcArr.length - 1].mTime2) {
                double d11 = arcArr[arcArr.length - 1].mTime2;
                double d12 = d8 - d11;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.linear) {
                    fArr[0] = (float) (arc2.getLinearX(d11) + (this.mArcs[length].getLinearDX(d11) * d12));
                    fArr[1] = (float) (this.mArcs[length].getLinearY(d11) + (d12 * this.mArcs[length].getLinearDY(d11)));
                    return;
                } else {
                    arc2.setPoint(d8);
                    fArr[0] = (float) this.mArcs[length].getX();
                    fArr[1] = (float) this.mArcs[length].getY();
                    return;
                }
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d13 = arcArr2[0].mTime1;
            if (d8 < d13) {
                d8 = d13;
            } else if (d8 > arcArr2[arcArr2.length - 1].mTime2) {
                d8 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i8 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i8 >= arcArr3.length) {
                return;
            }
            Arc arc3 = arcArr3[i8];
            if (d8 <= arc3.mTime2) {
                if (arc3.linear) {
                    fArr[0] = (float) arc3.getLinearX(d8);
                    fArr[1] = (float) this.mArcs[i8].getLinearY(d8);
                    return;
                } else {
                    arc3.setPoint(d8);
                    fArr[0] = (float) this.mArcs[i8].getX();
                    fArr[1] = (float) this.mArcs[i8].getY();
                    return;
                }
            }
            i8++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d8, int i8) {
        double linearY;
        double linearDY;
        double y8;
        double dy;
        double linearY2;
        double linearDY2;
        int i9 = 0;
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d9 = arc.mTime1;
            if (d8 < d9) {
                double d10 = d8 - d9;
                if (arc.linear) {
                    if (i8 == 0) {
                        linearY2 = arc.getLinearX(d9);
                        linearDY2 = this.mArcs[0].getLinearDX(d9);
                    } else {
                        linearY2 = arc.getLinearY(d9);
                        linearDY2 = this.mArcs[0].getLinearDY(d9);
                    }
                    return linearY2 + (d10 * linearDY2);
                }
                arc.setPoint(d9);
                if (i8 == 0) {
                    y8 = this.mArcs[0].getX();
                    dy = this.mArcs[0].getDX();
                } else {
                    y8 = this.mArcs[0].getY();
                    dy = this.mArcs[0].getDY();
                }
                return y8 + (d10 * dy);
            }
            if (d8 > arcArr[arcArr.length - 1].mTime2) {
                double d11 = arcArr[arcArr.length - 1].mTime2;
                double d12 = d8 - d11;
                int length = arcArr.length - 1;
                if (i8 == 0) {
                    linearY = arcArr[length].getLinearX(d11);
                    linearDY = this.mArcs[length].getLinearDX(d11);
                } else {
                    linearY = arcArr[length].getLinearY(d11);
                    linearDY = this.mArcs[length].getLinearDY(d11);
                }
                return linearY + (d12 * linearDY);
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d13 = arcArr2[0].mTime1;
            if (d8 < d13) {
                d8 = d13;
            } else if (d8 > arcArr2[arcArr2.length - 1].mTime2) {
                d8 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i9 >= arcArr3.length) {
                return Double.NaN;
            }
            Arc arc2 = arcArr3[i9];
            if (d8 <= arc2.mTime2) {
                if (arc2.linear) {
                    if (i8 == 0) {
                        return arc2.getLinearX(d8);
                    }
                    return arc2.getLinearY(d8);
                }
                arc2.setPoint(d8);
                if (i8 == 0) {
                    return this.mArcs[i9].getX();
                }
                return this.mArcs[i9].getY();
            }
            i9++;
        }
    }
}
