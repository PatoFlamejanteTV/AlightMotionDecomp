package com.stripe.android.view;

import android.widget.AutoCompleteTextView;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import z2.C4266a;

/* loaded from: classes4.dex */
public final class S implements AutoCompleteTextView.Validator {

    /* renamed from: a, reason: collision with root package name */
    private final Q f28822a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f28823b;

    public S(Q countryAdapter, Function1 onCountrySelected) {
        AbstractC3292y.i(countryAdapter, "countryAdapter");
        AbstractC3292y.i(onCountrySelected, "onCountrySelected");
        this.f28822a = countryAdapter;
        this.f28823b = onCountrySelected;
    }

    @Override // android.widget.AutoCompleteTextView.Validator
    public CharSequence fixText(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        return charSequence;
    }

    @Override // android.widget.AutoCompleteTextView.Validator
    public boolean isValid(CharSequence charSequence) {
        Object obj;
        Iterator it = this.f28822a.e().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3292y.d(((C4266a) obj).f(), String.valueOf(charSequence))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f28823b.invoke(obj);
        if (((C4266a) obj) != null) {
            return true;
        }
        return false;
    }
}
