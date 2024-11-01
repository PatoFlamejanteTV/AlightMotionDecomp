package androidx.compose.foundation.text;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2", f = "CoreTextField.kt", l = {336}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$2 extends l implements InterfaceC2072n {
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextInputService $textInputService;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ State<Boolean> $writeable$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        final /* synthetic */ State<Boolean> $writeable$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(State<Boolean> state) {
            super(0);
            this.$writeable$delegate = state;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean CoreTextField$lambda$8;
            CoreTextField$lambda$8 = CoreTextFieldKt.CoreTextField$lambda$8(this.$writeable$delegate);
            return Boolean.valueOf(CoreTextField$lambda$8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$2(TextFieldState textFieldState, State<Boolean> state, TextInputService textInputService, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping, d dVar) {
        super(2, dVar);
        this.$state = textFieldState;
        this.$writeable$delegate = state;
        this.$textInputService = textInputService;
        this.$value = textFieldValue;
        this.$imeOptions = imeOptions;
        this.$offsetMapping = offsetMapping;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new CoreTextFieldKt$CoreTextField$2(this.$state, this.$writeable$delegate, this.$textInputService, this.$value, this.$imeOptions, this.$offsetMapping, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = b.e();
        int i8 = this.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3821f snapshotFlow = SnapshotStateKt.snapshotFlow(new AnonymousClass1(this.$writeable$delegate));
                final TextFieldState textFieldState = this.$state;
                final TextInputService textInputService = this.$textInputService;
                final TextFieldValue textFieldValue = this.$value;
                final ImeOptions imeOptions = this.$imeOptions;
                final OffsetMapping offsetMapping = this.$offsetMapping;
                InterfaceC3822g interfaceC3822g = new InterfaceC3822g() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2.2
                    @Override // q6.InterfaceC3822g
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit(((Boolean) obj2).booleanValue(), dVar);
                    }

                    public final Object emit(boolean z8, d dVar) {
                        if (!z8 || !TextFieldState.this.getHasFocus()) {
                            CoreTextFieldKt.endInputSession(TextFieldState.this);
                        } else {
                            CoreTextFieldKt.startInputSession(textInputService, TextFieldState.this, textFieldValue, imeOptions, offsetMapping);
                        }
                        return I.f8786a;
                    }
                };
                this.label = 1;
                if (snapshotFlow.collect(interfaceC3822g, this) == e8) {
                    return e8;
                }
            }
            CoreTextFieldKt.endInputSession(this.$state);
            return I.f8786a;
        } catch (Throwable th) {
            CoreTextFieldKt.endInputSession(this.$state);
            throw th;
        }
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((CoreTextFieldKt$CoreTextField$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
