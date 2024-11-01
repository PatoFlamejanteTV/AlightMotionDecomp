package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Invalidation {
    private IdentityArraySet<Object> instances;
    private final int location;
    private final RecomposeScopeImpl scope;

    public Invalidation(RecomposeScopeImpl recomposeScopeImpl, int i8, IdentityArraySet<Object> identityArraySet) {
        this.scope = recomposeScopeImpl;
        this.location = i8;
        this.instances = identityArraySet;
    }

    public final IdentityArraySet<Object> getInstances() {
        return this.instances;
    }

    public final int getLocation() {
        return this.location;
    }

    public final RecomposeScopeImpl getScope() {
        return this.scope;
    }

    public final boolean isInvalid() {
        return this.scope.isInvalidFor(this.instances);
    }

    public final void setInstances(IdentityArraySet<Object> identityArraySet) {
        this.instances = identityArraySet;
    }
}
