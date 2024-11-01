package androidx.compose.ui.autofill;

import androidx.compose.ui.ExperimentalComposeUiApi;

@ExperimentalComposeUiApi
/* loaded from: classes.dex */
public interface Autofill {
    void cancelAutofillForNode(AutofillNode autofillNode);

    void requestAutofillForNode(AutofillNode autofillNode);
}
