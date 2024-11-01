package b;

import com.inmobi.cmp.ChoiceCmp;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1946a extends kotlin.coroutines.jvm.internal.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f14853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChoiceCmp f14854b;

    /* renamed from: c, reason: collision with root package name */
    public int f14855c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1946a(ChoiceCmp choiceCmp, U5.d dVar) {
        super(dVar);
        this.f14854b = choiceCmp;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f14853a = obj;
        this.f14855c |= Integer.MIN_VALUE;
        return ChoiceCmp.access$loadCmpInfo(this.f14854b, this);
    }
}
