package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    static {
        String str = TypedValues.TriggerType.NAME;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c8;
        str.hashCode();
        switch (str.hashCode()) {
            case -1594793529:
                if (str.equals("positiveCross")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case -966421266:
                if (str.equals("viewTransitionOnPositiveCross")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case -786670827:
                if (str.equals("triggerCollisionId")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case -648752941:
                if (str.equals("triggerID")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case -638126837:
                if (str.equals("negativeCross")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case -76025313:
                if (str.equals("triggerCollisionView")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            case -9754574:
                if (str.equals("viewTransitionOnNegativeCross")) {
                    c8 = 6;
                    break;
                }
                c8 = 65535;
                break;
            case 64397344:
                if (str.equals("CROSS")) {
                    c8 = 7;
                    break;
                }
                c8 = 65535;
                break;
            case 364489912:
                if (str.equals("triggerSlack")) {
                    c8 = '\b';
                    break;
                }
                c8 = 65535;
                break;
            case 1301930599:
                if (str.equals("viewTransitionOnCross")) {
                    c8 = '\t';
                    break;
                }
                c8 = 65535;
                break;
            case 1401391082:
                if (str.equals("postLayout")) {
                    c8 = '\n';
                    break;
                }
                c8 = 65535;
                break;
            case 1535404999:
                if (str.equals("triggerReceiver")) {
                    c8 = 11;
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
                return 309;
            case 1:
                return 302;
            case 2:
                return 307;
            case 3:
                return 308;
            case 4:
                return 310;
            case 5:
                return 306;
            case 6:
                return 303;
            case 7:
                return 312;
            case '\b':
                return 305;
            case '\t':
                return 301;
            case '\n':
                return 304;
            case 11:
                return 311;
            default:
                return -1;
        }
    }
}
