package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    static {
        String str = TypedValues.Custom.NAME;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c8;
        str.hashCode();
        switch (str.hashCode()) {
            case -1095013018:
                if (str.equals(TypedValues.Custom.S_DIMENSION)) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case -891985903:
                if (str.equals(TypedValues.Custom.S_STRING)) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case -710953590:
                if (str.equals(TypedValues.Custom.S_REFERENCE)) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case 64711720:
                if (str.equals(TypedValues.Custom.S_BOOLEAN)) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case 94842723:
                if (str.equals("color")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case 97526364:
                if (str.equals(TypedValues.Custom.S_FLOAT)) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            case 1958052158:
                if (str.equals(TypedValues.Custom.S_INT)) {
                    c8 = 6;
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
                return TypedValues.Custom.TYPE_DIMENSION;
            case 1:
                return TypedValues.Custom.TYPE_STRING;
            case 2:
                return TypedValues.Custom.TYPE_REFERENCE;
            case 3:
                return TypedValues.Custom.TYPE_BOOLEAN;
            case 4:
                return TypedValues.Custom.TYPE_COLOR;
            case 5:
                return TypedValues.Custom.TYPE_FLOAT;
            case 6:
                return TypedValues.Custom.TYPE_INT;
            default:
                return -1;
        }
    }
}
