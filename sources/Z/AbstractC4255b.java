package z;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4255b {
    public static Object a(int i8, Object obj, InterfaceC4254a interfaceC4254a, InterfaceC4256c interfaceC4256c) {
        Object apply;
        if (i8 < 1) {
            return interfaceC4254a.apply(obj);
        }
        do {
            apply = interfaceC4254a.apply(obj);
            obj = interfaceC4256c.a(obj, apply);
            if (obj == null) {
                break;
            }
            i8--;
        } while (i8 >= 1);
        return apply;
    }
}
