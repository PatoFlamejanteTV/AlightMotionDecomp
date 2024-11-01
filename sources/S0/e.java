package S0;

import java.util.Stack;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f9368a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9369b;

    /* renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f9370c;

    /* renamed from: d, reason: collision with root package name */
    public final e f9371d;

    private e(String str, String str2, StackTraceElement[] stackTraceElementArr, e eVar) {
        this.f9368a = str;
        this.f9369b = str2;
        this.f9370c = stackTraceElementArr;
        this.f9371d = eVar;
    }

    public static e a(Throwable th, d dVar) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            eVar = new e(th2.getLocalizedMessage(), th2.getClass().getName(), dVar.a(th2.getStackTrace()), eVar);
        }
        return eVar;
    }
}
