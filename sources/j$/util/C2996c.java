package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* renamed from: j$.util.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2996c implements Comparator, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f33081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33082c;

    public /* synthetic */ C2996c(Comparator comparator, Object obj, int i8) {
        this.f33080a = i8;
        this.f33081b = comparator;
        this.f33082c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f33080a) {
            case 0:
                int compare = this.f33081b.compare(obj, obj2);
                return compare != 0 ? compare : ((Comparator) this.f33082c).compare(obj, obj2);
            default:
                Function function = (Function) this.f33082c;
                return this.f33081b.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
