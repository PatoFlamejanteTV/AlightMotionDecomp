package j$.sun.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f32795b;

    /* renamed from: a, reason: collision with root package name */
    private final Unsafe f32796a;

    static {
        Field i8 = i();
        i8.setAccessible(true);
        try {
            f32795b = new a((Unsafe) i8.get(null));
        } catch (IllegalAccessException e8) {
            throw new AssertionError("Couldn't get the Unsafe", e8);
        }
    }

    a(Unsafe unsafe) {
        this.f32796a = unsafe;
    }

    public static a h() {
        return f32795b;
    }

    private static Field i() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e8) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e8);
        }
    }

    public final int a(Class cls) {
        return this.f32796a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f32796a.arrayIndexScale(cls);
    }

    public final boolean c(Object obj, long j8, int i8, int i9) {
        return this.f32796a.compareAndSwapInt(obj, j8, i8, i9);
    }

    public final boolean d(Object obj, long j8, long j9, long j10) {
        return this.f32796a.compareAndSwapLong(obj, j8, j9, j10);
    }

    public final boolean e(Object obj, long j8, Object obj2) {
        return j$.com.android.tools.r8.a.i(this.f32796a, obj, j8, obj2);
    }

    public final int f(Object obj, long j8) {
        int intVolatile;
        do {
            intVolatile = this.f32796a.getIntVolatile(obj, j8);
        } while (!this.f32796a.compareAndSwapInt(obj, j8, intVolatile, intVolatile - 4));
        return intVolatile;
    }

    public final Object g(Object obj, long j8) {
        return this.f32796a.getObjectVolatile(obj, j8);
    }

    public final long j(Class cls, String str) {
        try {
            return k(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e8) {
            throw new AssertionError("Cannot find field:", e8);
        }
    }

    public final long k(Field field) {
        return this.f32796a.objectFieldOffset(field);
    }

    public final void l(Object obj, long j8, Object obj2) {
        this.f32796a.putObjectVolatile(obj, j8, obj2);
    }
}
