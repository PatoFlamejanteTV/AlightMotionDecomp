package e5;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import f5.InterfaceC2867a;
import kotlin.coroutines.jvm.internal.l;
import org.json.JSONException;

/* loaded from: classes5.dex */
public final class i extends l implements InterfaceC2072n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2867a f31724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONException f31725b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC2867a interfaceC2867a, JSONException jSONException, U5.d dVar) {
        super(2, dVar);
        this.f31724a = interfaceC2867a;
        this.f31725b = jSONException;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new i(this.f31724a, this.f31725b, dVar);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(Object obj, Object obj2) {
        return new i(this.f31724a, this.f31725b, (U5.d) obj2).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V5.b.e();
        t.b(obj);
        this.f31724a.a(this.f31725b.getMessage());
        return I.f8786a;
    }
}
