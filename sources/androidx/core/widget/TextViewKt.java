package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import c6.InterfaceC2074p;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class TextViewKt {
    public static final TextWatcher addTextChangedListener(TextView textView, InterfaceC2074p interfaceC2074p, InterfaceC2074p interfaceC2074p2, Function1 function1) {
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(function1, interfaceC2074p, interfaceC2074p2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static /* synthetic */ TextWatcher addTextChangedListener$default(TextView textView, InterfaceC2074p interfaceC2074p, InterfaceC2074p interfaceC2074p2, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC2074p = TextViewKt$addTextChangedListener$1.INSTANCE;
        }
        if ((i8 & 2) != 0) {
            interfaceC2074p2 = TextViewKt$addTextChangedListener$2.INSTANCE;
        }
        if ((i8 & 4) != 0) {
            function1 = TextViewKt$addTextChangedListener$3.INSTANCE;
        }
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(function1, interfaceC2074p, interfaceC2074p2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final TextWatcher doAfterTextChanged(TextView textView, final Function1 function1) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                Function1.this.invoke(editable);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doBeforeTextChanged(TextView textView, final InterfaceC2074p interfaceC2074p) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
                InterfaceC2074p.this.invoke(charSequence, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doOnTextChanged(TextView textView, final InterfaceC2074p interfaceC2074p) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
                InterfaceC2074p.this.invoke(charSequence, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }
}
