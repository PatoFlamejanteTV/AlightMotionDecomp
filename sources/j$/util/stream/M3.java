package j$.util.stream;

import java.security.PrivilegedAction;

/* loaded from: classes2.dex */
public final /* synthetic */ class M3 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
    }
}
