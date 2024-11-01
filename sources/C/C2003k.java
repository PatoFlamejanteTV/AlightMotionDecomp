package c;

import Q5.I;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.O;

/* renamed from: c.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2003k extends AbstractC3293z implements InterfaceC2072n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f15177a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2003k(O o8) {
        super(2);
        this.f15177a = o8;
    }

    @Override // c6.InterfaceC2072n
    public Object invoke(Object obj, Object obj2) {
        ((Number) obj).intValue();
        if (((Boolean) obj2).booleanValue()) {
            this.f15177a.f34569a = false;
        }
        return I.f8786a;
    }
}
