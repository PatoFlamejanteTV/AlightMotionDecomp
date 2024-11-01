package androidx.leanback.preference;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* loaded from: classes3.dex */
public abstract class LeanbackPreferenceFragment extends BaseLeanbackPreferenceFragment {
    public LeanbackPreferenceFragment() {
        LeanbackPreferenceFragmentTransitionHelperApi21.addTransitions(this);
    }

    @Override // androidx.preference.PreferenceFragment, android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.leanback_preference_fragment, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.main_frame);
        View onCreateView = super.onCreateView(layoutInflater, viewGroup2, bundle);
        if (onCreateView != null) {
            viewGroup2.addView(onCreateView);
        }
        return inflate;
    }

    @Override // androidx.preference.PreferenceFragment, android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        setTitle(getPreferenceScreen().getTitle());
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        View view = getView();
        if (view == null) {
            textView = null;
        } else {
            textView = (TextView) view.findViewById(R.id.decor_title);
        }
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
