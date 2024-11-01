package androidx.datastore.core;

/* loaded from: classes3.dex */
public final class Data<T> extends State<T> {
    private final int hashCode;
    private final T value;

    public Data(T t8, int i8, int i9) {
        super(i9, null);
        this.value = t8;
        this.hashCode = i8;
    }

    public final void checkHashCode() {
        int i8;
        T t8 = this.value;
        if (t8 != null) {
            i8 = t8.hashCode();
        } else {
            i8 = 0;
        }
        if (i8 == this.hashCode) {
        } else {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }

    public final int getHashCode() {
        return this.hashCode;
    }

    public final T getValue() {
        return this.value;
    }
}
