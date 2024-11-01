package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class LazyStringArrayList extends AbstractProtobufList<String> implements LazyStringList, RandomAccess {

    @Deprecated
    public static final LazyStringList EMPTY;
    private static final LazyStringArrayList EMPTY_LIST;
    private final List<Object> list;

    /* loaded from: classes3.dex */
    private static class ByteArrayListView extends AbstractList<byte[]> implements RandomAccess {
        private final LazyStringArrayList list;

        ByteArrayListView(LazyStringArrayList lazyStringArrayList) {
            this.list = lazyStringArrayList;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i8, byte[] bArr) {
            this.list.add(i8, bArr);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] get(int i8) {
            return this.list.getByteArray(i8);
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] remove(int i8) {
            String remove = this.list.remove(i8);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteArray(remove);
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] set(int i8, byte[] bArr) {
            Object andReturn = this.list.setAndReturn(i8, bArr);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteArray(andReturn);
        }
    }

    /* loaded from: classes3.dex */
    private static class ByteStringListView extends AbstractList<ByteString> implements RandomAccess {
        private final LazyStringArrayList list;

        ByteStringListView(LazyStringArrayList lazyStringArrayList) {
            this.list = lazyStringArrayList;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i8, ByteString byteString) {
            this.list.add(i8, byteString);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public ByteString get(int i8) {
            return this.list.getByteString(i8);
        }

        @Override // java.util.AbstractList, java.util.List
        public ByteString remove(int i8) {
            String remove = this.list.remove(i8);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteString(remove);
        }

        @Override // java.util.AbstractList, java.util.List
        public ByteString set(int i8, ByteString byteString) {
            Object andReturn = this.list.setAndReturn(i8, byteString);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteString(andReturn);
        }
    }

    static {
        LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
        EMPTY_LIST = lazyStringArrayList;
        lazyStringArrayList.makeImmutable();
        EMPTY = lazyStringArrayList;
    }

    public LazyStringArrayList() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] asByteArray(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return Internal.toByteArray((String) obj);
        }
        return ((ByteString) obj).toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ByteString asByteString(Object obj) {
        if (obj instanceof ByteString) {
            return (ByteString) obj;
        }
        if (obj instanceof String) {
            return ByteString.copyFromUtf8((String) obj);
        }
        return ByteString.copyFrom((byte[]) obj);
    }

    private static String asString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            return ((ByteString) obj).toStringUtf8();
        }
        return Internal.toStringUtf8((byte[]) obj);
    }

    public static LazyStringArrayList emptyList() {
        return EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int i8, ByteString byteString) {
        ensureIsMutable();
        return this.list.set(i8, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteArray(Collection<byte[]> collection) {
        ensureIsMutable();
        boolean addAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteString(Collection<? extends ByteString> collection) {
        ensureIsMutable();
        boolean addAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public List<byte[]> asByteArrayList() {
        return new ByteArrayListView(this);
    }

    @Override // androidx.datastore.preferences.protobuf.ProtocolStringList
    public List<ByteString> asByteStringList() {
        return new ByteStringListView(this);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        this.list.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public byte[] getByteArray(int i8) {
        Object obj = this.list.get(i8);
        byte[] asByteArray = asByteArray(obj);
        if (asByteArray != obj) {
            this.list.set(i8, asByteArray);
        }
        return asByteArray;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public ByteString getByteString(int i8) {
        Object obj = this.list.get(i8);
        ByteString asByteString = asByteString(obj);
        if (asByteString != obj) {
            this.list.set(i8, asByteString);
        }
        return asByteString;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public Object getRaw(int i8) {
        return this.list.get(i8);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return DesugarCollections.unmodifiableList(this.list);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        if (isModifiable()) {
            return new UnmodifiableLazyStringList(this);
        }
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void mergeFrom(LazyStringList lazyStringList) {
        ensureIsMutable();
        for (Object obj : lazyStringList.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.list.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.list.add(obj);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    public LazyStringArrayList(int i8) {
        this((ArrayList<Object>) new ArrayList(i8));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add((LazyStringArrayList) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection<? extends String> collection) {
        ensureIsMutable();
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).getUnderlyingElements();
        }
        boolean addAll = this.list.addAll(i8, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i8) {
        Object obj = this.list.get(i8);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.list.set(i8, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf82 = Internal.toStringUtf8(bArr);
        if (Internal.isValidUtf8(bArr)) {
            this.list.set(i8, stringUtf82);
        }
        return stringUtf82;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public LazyStringArrayList mutableCopyWithCapacity2(int i8) {
        if (i8 >= size()) {
            ArrayList arrayList = new ArrayList(i8);
            arrayList.addAll(this.list);
            return new LazyStringArrayList((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public String set(int i8, String str) {
        ensureIsMutable();
        return asString(this.list.set(i8, str));
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.list = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int i8, byte[] bArr) {
        ensureIsMutable();
        return this.list.set(i8, bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i8, String str) {
        ensureIsMutable();
        this.list.add(i8, str);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public String remove(int i8) {
        ensureIsMutable();
        Object remove = this.list.remove(i8);
        ((AbstractList) this).modCount++;
        return asString(remove);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int i8, ByteString byteString) {
        setAndReturn(i8, byteString);
    }

    public LazyStringArrayList(List<String> list) {
        this((ArrayList<Object>) new ArrayList(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int i8, ByteString byteString) {
        ensureIsMutable();
        this.list.add(i8, byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int i8, byte[] bArr) {
        setAndReturn(i8, bArr);
    }

    private LazyStringArrayList(ArrayList<Object> arrayList) {
        this.list = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int i8, byte[] bArr) {
        ensureIsMutable();
        this.list.add(i8, bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(ByteString byteString) {
        ensureIsMutable();
        this.list.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(byte[] bArr) {
        ensureIsMutable();
        this.list.add(bArr);
        ((AbstractList) this).modCount++;
    }
}
