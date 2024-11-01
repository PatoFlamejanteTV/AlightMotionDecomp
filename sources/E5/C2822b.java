package e5;

import Q5.I;
import Q5.t;
import android.content.Context;
import c6.InterfaceC2072n;
import f5.InterfaceC2867a;
import h5.C2953d;
import i5.C2972a;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

/* renamed from: e5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2822b extends l implements InterfaceC2072n {

    /* renamed from: a, reason: collision with root package name */
    public int f31710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2821a f31711b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f31712c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2867a f31713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2822b(C2821a c2821a, String str, InterfaceC2867a interfaceC2867a, U5.d dVar) {
        super(2, dVar);
        this.f31711b = c2821a;
        this.f31712c = str;
        this.f31713d = interfaceC2867a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new C2822b(this.f31711b, this.f31712c, this.f31713d, dVar);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2822b) create((M) obj, (U5.d) obj2)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        Object e8 = V5.b.e();
        int i8 = this.f31710a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            context = this.f31711b.f31709a;
            C2953d b9 = new C2972a(context).b(this.f31712c);
            C2821a c2821a = this.f31711b;
            InterfaceC2867a interfaceC2867a = this.f31713d;
            this.f31710a = 1;
            if (C2821a.b(c2821a, b9, interfaceC2867a, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
