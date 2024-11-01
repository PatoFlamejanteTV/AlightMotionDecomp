package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import c6.InterfaceC2072n;
import k6.AbstractC3257i;
import k6.InterfaceC3255g;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {409, 411}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ViewKt$allViews$1 extends kotlin.coroutines.jvm.internal.k implements InterfaceC2072n {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, U5.d dVar) {
        super(2, dVar);
        this.$this_allViews = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, dVar);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbstractC3257i abstractC3257i;
        Object e8 = V5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    Q5.t.b(obj);
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC3257i = (AbstractC3257i) this.L$0;
            Q5.t.b(obj);
        } else {
            Q5.t.b(obj);
            abstractC3257i = (AbstractC3257i) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = abstractC3257i;
            this.label = 1;
            if (abstractC3257i.a(view, this) == e8) {
                return e8;
            }
        }
        View view2 = this.$this_allViews;
        if (view2 instanceof ViewGroup) {
            InterfaceC3255g descendants = ViewGroupKt.getDescendants((ViewGroup) view2);
            this.L$0 = null;
            this.label = 2;
            if (abstractC3257i.g(descendants, this) == e8) {
                return e8;
            }
        }
        return Q5.I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(AbstractC3257i abstractC3257i, U5.d dVar) {
        return ((ViewKt$allViews$1) create(abstractC3257i, dVar)).invokeSuspend(Q5.I.f8786a);
    }
}
