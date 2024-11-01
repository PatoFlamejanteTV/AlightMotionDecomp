package androidx.navigation;

import androidx.navigation.NavType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ NavType a(NavType.Companion companion, String str, String str2) {
        if (str == null || !str.startsWith("java")) {
            return companion.fromArgType(str, str2);
        }
        try {
            return companion.fromArgType("j$" + str.substring(4), str2);
        } catch (RuntimeException e8) {
            if (e8.getCause() instanceof ClassNotFoundException) {
                return companion.fromArgType(str, str2);
            }
            throw e8;
        }
    }
}
