package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    static {
        String str = TypedValues.CycleType.NAME;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c8;
        str.hashCode();
        switch (str.hashCode()) {
            case -1310311125:
                if (str.equals("easing")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c8 = 6;
                    break;
                }
                c8 = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c8 = 7;
                    break;
                }
                c8 = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c8 = '\b';
                    break;
                }
                c8 = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c8 = '\t';
                    break;
                }
                c8 = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c8 = '\n';
                    break;
                }
                c8 = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c8 = 11;
                    break;
                }
                c8 = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c8 = '\f';
                    break;
                }
                c8 = 65535;
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c8 = '\r';
                    break;
                }
                c8 = 65535;
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    c8 = 14;
                    break;
                }
                c8 = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c8 = 15;
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        switch (c8) {
            case 0:
                return TypedValues.CycleType.TYPE_EASING;
            case 1:
                return 308;
            case 2:
                return 309;
            case 3:
                return 310;
            case 4:
                return 304;
            case 5:
                return 305;
            case 6:
                return 306;
            case 7:
                return 315;
            case '\b':
                return 313;
            case '\t':
                return 314;
            case '\n':
                return 311;
            case 11:
                return 312;
            case '\f':
                return 403;
            case '\r':
                return 401;
            case 14:
                return TypedValues.CycleType.TYPE_PATH_ROTATE;
            case 15:
                return 402;
            default:
                return -1;
        }
    }

    public static int b(int i8) {
        if (i8 != 100) {
            if (i8 != 101) {
                if (i8 != 416) {
                    if (i8 != 420 && i8 != 421) {
                        switch (i8) {
                            case 304:
                            case 305:
                            case 306:
                            case 307:
                            case 308:
                            case 309:
                            case 310:
                            case 311:
                            case 312:
                            case 313:
                            case 314:
                            case 315:
                                return 4;
                            default:
                                switch (i8) {
                                    case 401:
                                    case 402:
                                        return 2;
                                    case 403:
                                        return 4;
                                    default:
                                        switch (i8) {
                                            case TypedValues.CycleType.TYPE_WAVE_PERIOD /* 423 */:
                                            case TypedValues.CycleType.TYPE_WAVE_OFFSET /* 424 */:
                                            case TypedValues.CycleType.TYPE_WAVE_PHASE /* 425 */:
                                                return 4;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                    }
                    return 8;
                }
                return 4;
            }
            return 8;
        }
        return 2;
    }
}
