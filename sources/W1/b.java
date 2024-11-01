package W1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    protected Field f10711a;

    /* renamed from: b, reason: collision with root package name */
    protected Method f10712b;

    /* renamed from: c, reason: collision with root package name */
    protected Method f10713c;

    /* renamed from: d, reason: collision with root package name */
    protected Class f10714d;

    /* renamed from: e, reason: collision with root package name */
    protected Type f10715e;

    /* renamed from: f, reason: collision with root package name */
    protected String f10716f;

    public b(Class cls, Field field, j jVar) {
        String c8;
        this.f10716f = field.getName();
        int modifiers = field.getModifiers();
        if ((modifiers & 136) > 0) {
            return;
        }
        if ((modifiers & 1) > 0) {
            this.f10711a = field;
        }
        try {
            this.f10712b = cls.getDeclaredMethod(a.e(field.getName()), field.getType());
        } catch (Exception unused) {
        }
        boolean equals = field.getType().equals(Boolean.TYPE);
        if (equals) {
            c8 = a.d(field.getName());
        } else {
            c8 = a.c(field.getName());
        }
        try {
            this.f10713c = cls.getDeclaredMethod(c8, null);
        } catch (Exception unused2) {
        }
        if (this.f10713c == null && equals) {
            try {
                this.f10713c = cls.getDeclaredMethod(a.c(field.getName()), null);
            } catch (Exception unused3) {
            }
        }
        if (this.f10711a == null && this.f10713c == null && this.f10712b == null) {
            return;
        }
        Method method = this.f10713c;
        if (method != null && !jVar.a(field, method)) {
            this.f10713c = null;
        }
        Method method2 = this.f10712b;
        if (method2 != null && !jVar.a(field, method2)) {
            this.f10712b = null;
        }
        if (this.f10713c == null && this.f10712b == null && this.f10711a == null) {
            return;
        }
        this.f10714d = field.getType();
        this.f10715e = field.getGenericType();
    }

    public String a() {
        return this.f10716f;
    }

    public Class b() {
        return this.f10714d;
    }

    public boolean c() {
        return this.f10714d.isEnum();
    }

    public boolean d() {
        if (this.f10712b == null && this.f10713c == null) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (this.f10711a == null && this.f10713c == null) {
            return false;
        }
        return true;
    }

    public boolean f() {
        if (this.f10711a == null && this.f10713c == null && this.f10712b == null) {
            return false;
        }
        return true;
    }

    public boolean g() {
        if (this.f10711a == null && this.f10713c == null) {
            return false;
        }
        return true;
    }
}
