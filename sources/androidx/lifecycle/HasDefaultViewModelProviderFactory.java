package androidx.lifecycle;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;

/* loaded from: classes3.dex */
public interface HasDefaultViewModelProviderFactory {
    CreationExtras getDefaultViewModelCreationExtras();

    ViewModelProvider.Factory getDefaultViewModelProviderFactory();
}
