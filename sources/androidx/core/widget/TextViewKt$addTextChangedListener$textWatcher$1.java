package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import c6.InterfaceC2074p;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ Function1 $afterTextChanged;
    final /* synthetic */ InterfaceC2074p $beforeTextChanged;
    final /* synthetic */ InterfaceC2074p $onTextChanged;

    public TextViewKt$addTextChangedListener$textWatcher$1(Function1 function1, InterfaceC2074p interfaceC2074p, InterfaceC2074p interfaceC2074p2) {
        this.$afterTextChanged = function1;
        this.$beforeTextChanged = interfaceC2074p;
        this.$onTextChanged = interfaceC2074p2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
    }
}
