package V7;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0228a f10704a = new C0228a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final ArrayList f10705b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private static volatile b[] f10706c = new b[0];

    /* renamed from: V7.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0228a extends b {
        public /* synthetic */ C0228a(AbstractC3284p abstractC3284p) {
            this();
        }

        @Override // V7.a.b
        public void a(String str, Object... args) {
            AbstractC3292y.i(args, "args");
            for (b bVar : a.f10706c) {
                bVar.a(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // V7.a.b
        public void b(Throwable th, String str, Object... args) {
            AbstractC3292y.i(args, "args");
            for (b bVar : a.f10706c) {
                bVar.b(th, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // V7.a.b
        public void c(String str, Object... args) {
            AbstractC3292y.i(args, "args");
            for (b bVar : a.f10706c) {
                bVar.c(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // V7.a.b
        public void d(Throwable th) {
            for (b bVar : a.f10706c) {
                bVar.d(th);
            }
        }

        @Override // V7.a.b
        public void e(Throwable th, String str, Object... args) {
            AbstractC3292y.i(args, "args");
            for (b bVar : a.f10706c) {
                bVar.e(th, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // V7.a.b
        public void g(String str, Object... args) {
            AbstractC3292y.i(args, "args");
            for (b bVar : a.f10706c) {
                bVar.g(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // V7.a.b
        public void h(String str, Object... args) {
            AbstractC3292y.i(args, "args");
            for (b bVar : a.f10706c) {
                bVar.h(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // V7.a.b
        public void i(Throwable th, String str, Object... args) {
            AbstractC3292y.i(args, "args");
            for (b bVar : a.f10706c) {
                bVar.i(th, str, Arrays.copyOf(args, args.length));
            }
        }

        public final b j(String tag) {
            AbstractC3292y.i(tag, "tag");
            b[] bVarArr = a.f10706c;
            int length = bVarArr.length;
            int i8 = 0;
            while (i8 < length) {
                b bVar = bVarArr[i8];
                i8++;
                bVar.f().set(tag);
            }
            return this;
        }

        private C0228a() {
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadLocal f10707a = new ThreadLocal();

        public abstract void a(String str, Object... objArr);

        public abstract void b(Throwable th, String str, Object... objArr);

        public abstract void c(String str, Object... objArr);

        public abstract void d(Throwable th);

        public abstract void e(Throwable th, String str, Object... objArr);

        public final /* synthetic */ ThreadLocal f() {
            return this.f10707a;
        }

        public abstract void g(String str, Object... objArr);

        public abstract void h(String str, Object... objArr);

        public abstract void i(Throwable th, String str, Object... objArr);
    }

    public static final b b(String str) {
        return f10704a.j(str);
    }
}
