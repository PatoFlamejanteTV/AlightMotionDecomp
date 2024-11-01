package W1;

import c2.C2013D;
import c2.s;
import c2.u;
import java.lang.reflect.Field;
import java.util.HashMap;

/* loaded from: classes4.dex */
public abstract class a {
    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(u uVar, C2013D c2013d) {
        switch (c2013d.l()) {
            case 1:
                uVar.v(184, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
                return;
            case 2:
                uVar.v(184, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
                return;
            case 3:
                uVar.v(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;", false);
                return;
            case 4:
                uVar.v(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;", false);
                return;
            case 5:
                uVar.v(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
                return;
            case 6:
                uVar.v(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;", false);
                return;
            case 7:
                uVar.v(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
                return;
            case 8:
                uVar.v(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;", false);
                return;
            default:
                return;
        }
    }

    public static b[] b(Class cls, j jVar) {
        HashMap hashMap = new HashMap();
        if (jVar == null) {
            jVar = c.f10717a;
        }
        while (cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                String name = field.getName();
                if (!hashMap.containsKey(name)) {
                    b bVar = new b(cls, field, jVar);
                    if (bVar.f()) {
                        hashMap.put(name, bVar);
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return (b[]) hashMap.values().toArray(new b[hashMap.size()]);
    }

    public static String c(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 'g';
        cArr[1] = 'e';
        cArr[2] = 't';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[3] = charAt;
        for (int i8 = 1; i8 < length; i8++) {
            cArr[i8 + 3] = str.charAt(i8);
        }
        return new String(cArr);
    }

    public static String d(String str) {
        int length = str.length();
        char[] cArr = new char[length + 2];
        cArr[0] = 'i';
        cArr[1] = 's';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[2] = charAt;
        for (int i8 = 1; i8 < length; i8++) {
            cArr[i8 + 2] = str.charAt(i8);
        }
        return new String(cArr);
    }

    public static String e(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 's';
        cArr[1] = 'e';
        cArr[2] = 't';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[3] = charAt;
        for (int i8 = 1; i8 < length; i8++) {
            cArr[i8 + 3] = str.charAt(i8);
        }
        return new String(cArr);
    }

    public static s[] f(int i8) {
        s[] sVarArr = new s[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            sVarArr[i9] = new s();
        }
        return sVarArr;
    }
}
