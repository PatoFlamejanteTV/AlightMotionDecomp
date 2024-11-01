package k7;

import J7.h;
import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* renamed from: k7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3268b extends BasicPermission {

    /* renamed from: a, reason: collision with root package name */
    private final String f34557a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34558b;

    public C3268b(String str, String str2) {
        super(str, str2);
        this.f34557a = str2;
        this.f34558b = a(str2);
    }

    private int a(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(h.e(str), " ,");
        int i8 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                i8 |= 1;
            } else if (nextToken.equals("ecimplicitlyca")) {
                i8 |= 2;
            } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                i8 |= 4;
            } else if (nextToken.equals("dhdefaultparams")) {
                i8 |= 8;
            } else if (nextToken.equals("acceptableeccurves")) {
                i8 |= 16;
            } else if (nextToken.equals("additionalecparameters")) {
                i8 |= 32;
            } else if (nextToken.equals("all")) {
                i8 = 63;
            }
        }
        if (i8 != 0) {
            return i8;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3268b)) {
            return false;
        }
        C3268b c3268b = (C3268b) obj;
        if (this.f34558b == c3268b.f34558b && getName().equals(c3268b.getName())) {
            return true;
        }
        return false;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public String getActions() {
        return this.f34557a;
    }

    public int hashCode() {
        return getName().hashCode() + this.f34558b;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public boolean implies(Permission permission) {
        if (!(permission instanceof C3268b) || !getName().equals(permission.getName())) {
            return false;
        }
        int i8 = this.f34558b;
        int i9 = ((C3268b) permission).f34558b;
        if ((i8 & i9) != i9) {
            return false;
        }
        return true;
    }
}
