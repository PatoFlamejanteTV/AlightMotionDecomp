package A5;

import com.inmobi.cmp.model.ChoiceError;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final ChoiceError f237a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ChoiceError error) {
        super(error.getMessage());
        AbstractC3292y.i(error, "error");
        this.f237a = error;
    }
}
