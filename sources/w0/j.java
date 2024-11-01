package w0;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class j {
    public static String a(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i8 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i9 = 0; i9 < objArr.length; i9++) {
                objArr[i9] = b(objArr[i9]);
            }
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i10 = 0;
        while (i8 < objArr.length && (indexOf = valueOf.indexOf("%s", i10)) != -1) {
            sb.append((CharSequence) valueOf, i10, indexOf);
            sb.append(objArr[i8]);
            i10 = indexOf + 2;
            i8++;
        }
        sb.append((CharSequence) valueOf, i10, valueOf.length());
        if (i8 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i8]);
            for (int i11 = i8 + 1; i11 < objArr.length; i11++) {
                sb.append(", ");
                sb.append(objArr[i11]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String b(Object obj) {
        String str;
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e8) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append('@');
            sb.append(hexString);
            String sb2 = sb.toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            String valueOf = String.valueOf(sb2);
            if (valueOf.length() != 0) {
                str = "Exception during lenientFormat for ".concat(valueOf);
            } else {
                str = new String("Exception during lenientFormat for ");
            }
            logger.log(level, str, (Throwable) e8);
            String name2 = e8.getClass().getName();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 9 + name2.length());
            sb3.append("<");
            sb3.append(sb2);
            sb3.append(" threw ");
            sb3.append(name2);
            sb3.append(">");
            return sb3.toString();
        }
    }
}
