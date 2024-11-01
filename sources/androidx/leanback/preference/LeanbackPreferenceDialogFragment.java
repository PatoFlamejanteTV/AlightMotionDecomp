package androidx.leanback.preference;

import android.app.Fragment;
import android.os.Bundle;
import androidx.preference.DialogPreference;

/* loaded from: classes3.dex */
public class LeanbackPreferenceDialogFragment extends Fragment {
    public static final String ARG_KEY = "key";
    private DialogPreference mPreference;

    public LeanbackPreferenceDialogFragment() {
        LeanbackPreferenceFragmentTransitionHelperApi21.addTransitions(this);
    }

    public DialogPreference getPreference() {
        if (this.mPreference == null) {
            this.mPreference = (DialogPreference) ((DialogPreference.TargetFragment) getTargetFragment()).findPreference(getArguments().getString(ARG_KEY));
        }
        return this.mPreference;
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof DialogPreference.TargetFragment) {
            return;
        }
        throw new IllegalStateException("Target fragment " + targetFragment + " must implement TargetFragment interface");
    }
}
