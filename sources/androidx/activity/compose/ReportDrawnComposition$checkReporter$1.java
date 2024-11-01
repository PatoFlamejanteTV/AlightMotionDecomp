package androidx.activity.compose;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C3289v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public /* synthetic */ class ReportDrawnComposition$checkReporter$1 extends C3289v implements Function1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ReportDrawnComposition$checkReporter$1(Object obj) {
        super(1, obj, ReportDrawnComposition.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Function0) obj);
        return I.f8786a;
    }

    public final void invoke(Function0 function0) {
        ((ReportDrawnComposition) this.receiver).observeReporter(function0);
    }
}
