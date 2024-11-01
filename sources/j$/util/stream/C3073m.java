package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3073m implements BiConsumer, Supplier, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33536b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33537c;

    public /* synthetic */ C3073m(int i8, Object obj, Object obj2) {
        this.f33535a = i8;
        this.f33536b = obj;
        this.f33537c = obj2;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f33535a) {
            case 2:
                ((C3082n3) this.f33536b).b((Consumer) this.f33537c, obj);
                return;
            case 3:
                if (obj == null) {
                    ((AtomicBoolean) this.f33536b).set(true);
                    return;
                } else {
                    ((ConcurrentHashMap) this.f33537c).putIfAbsent(obj, Boolean.TRUE);
                    return;
                }
            default:
                ((BiConsumer) this.f33536b).accept(this.f33537c, obj);
                return;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        Collectors.a((Function) this.f33536b, (Function) this.f33537c, (Map) obj, obj2);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return j$.com.android.tools.r8.a.a(this, biConsumer);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f33535a) {
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new C3098r0((EnumC3122w0) this.f33536b, (Predicate) this.f33537c);
    }
}
