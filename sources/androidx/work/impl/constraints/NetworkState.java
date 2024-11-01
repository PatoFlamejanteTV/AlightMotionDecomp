package androidx.work.impl.constraints;

/* loaded from: classes3.dex */
public final class NetworkState {
    private final boolean isConnected;
    private final boolean isMetered;
    private final boolean isNotRoaming;
    private final boolean isValidated;

    public NetworkState(boolean z8, boolean z9, boolean z10, boolean z11) {
        this.isConnected = z8;
        this.isValidated = z9;
        this.isMetered = z10;
        this.isNotRoaming = z11;
    }

    public static /* synthetic */ NetworkState copy$default(NetworkState networkState, boolean z8, boolean z9, boolean z10, boolean z11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = networkState.isConnected;
        }
        if ((i8 & 2) != 0) {
            z9 = networkState.isValidated;
        }
        if ((i8 & 4) != 0) {
            z10 = networkState.isMetered;
        }
        if ((i8 & 8) != 0) {
            z11 = networkState.isNotRoaming;
        }
        return networkState.copy(z8, z9, z10, z11);
    }

    public final boolean component1() {
        return this.isConnected;
    }

    public final boolean component2() {
        return this.isValidated;
    }

    public final boolean component3() {
        return this.isMetered;
    }

    public final boolean component4() {
        return this.isNotRoaming;
    }

    public final NetworkState copy(boolean z8, boolean z9, boolean z10, boolean z11) {
        return new NetworkState(z8, z9, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.isConnected == networkState.isConnected && this.isValidated == networkState.isValidated && this.isMetered == networkState.isMetered && this.isNotRoaming == networkState.isNotRoaming;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z8 = this.isConnected;
        ?? r02 = z8;
        if (z8) {
            r02 = 1;
        }
        int i8 = r02 * 31;
        ?? r22 = this.isValidated;
        int i9 = r22;
        if (r22 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        ?? r23 = this.isMetered;
        int i11 = r23;
        if (r23 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z9 = this.isNotRoaming;
        return i12 + (z9 ? 1 : z9 ? 1 : 0);
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public final boolean isMetered() {
        return this.isMetered;
    }

    public final boolean isNotRoaming() {
        return this.isNotRoaming;
    }

    public final boolean isValidated() {
        return this.isValidated;
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.isConnected + ", isValidated=" + this.isValidated + ", isMetered=" + this.isMetered + ", isNotRoaming=" + this.isNotRoaming + ')';
    }
}
