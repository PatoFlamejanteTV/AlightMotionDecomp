package x0;

/* renamed from: x0.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4173B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(InterfaceC4172A interfaceC4172A, Object obj) {
        if (obj == interfaceC4172A) {
            return true;
        }
        if (obj instanceof InterfaceC4172A) {
            return interfaceC4172A.a().equals(((InterfaceC4172A) obj).a());
        }
        return false;
    }
}
